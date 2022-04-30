package com.example.application;


import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.application.Application;

public class ClientApplication extends Application {
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ClientApplication.class.getResource("mainUI.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 540, 400);
        stage.setTitle("Football Matches");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[]){launch();}
}
