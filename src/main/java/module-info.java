module com.example.bum_definitivo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires com.google.gson;
    requires okhttp3;
    requires javafx.swing;
    requires batik.transcoder;

    opens com.example.application to javafx.fxml;
    exports com.example.application;
    exports domain;

}