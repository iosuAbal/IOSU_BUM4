package com.example.application;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import domain.Competition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class UIController {
    @FXML
    private TextField areaField;

    @FXML
    private TextField areaNameField;

    @FXML
    private TextField compIdField;

    @FXML
    private TextField compNameField;

    @FXML
    private TextField codeField;

    @FXML
    private Button prevBtn;

    @FXML
    private Button nextBtn;

    List<Competition> competitons;

    int currentIndex;
    static int maximumMatches;


    @FXML
    public void initialize(){
        Manager manager=new Manager();
        String body =manager.request("competitions");

        Gson gson=new Gson();
        JsonObject jsonObject;

        jsonObject=gson.fromJson(body,JsonObject.class);
        Type competitionListType =new TypeToken<ArrayList<Competition>>(){}.getType();
        competitons=gson.fromJson((jsonObject.get("competitions")),competitionListType);
        maximumMatches= competitons.size();
        currentIndex=0;
        writeValues(currentIndex);
    }

    @FXML
    void getNext(MouseEvent event) {
        currentIndex++;
        writeValues(currentIndex);
    }



    @FXML
    void getPrevious(MouseEvent event) {

        currentIndex--;
        writeValues(currentIndex);

    }

    public void writeValues(int i){
        prevBtn.setDisable(false);
        nextBtn.setDisable(false);
        if(i==0){//the first one available
            prevBtn.setDisable(true);
        }
        else if(i==maximumMatches-1){//the last one

            nextBtn.setDisable(true);
        }

        compIdField.setText(String.valueOf(competitons.get(i).getId()));
        compNameField.setText(competitons.get(i).getName());
        areaField.setText(String.valueOf(competitons.get(i).getArea().getId()));
        areaNameField.setText(competitons.get(i).getArea().getName());
        if (competitons.get(i).getCode() == null) codeField.setText("");
        else codeField.setText(String.valueOf(competitons.get(i).getCode()));

    }


}
