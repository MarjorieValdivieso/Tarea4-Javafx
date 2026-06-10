package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("Administrador.fxml")
        );

        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Panel Administrador");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
