package com.example.demo;

import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class AdminController {

    @FXML
    private Label lblBienvenida;
    @FXML
    private Label lblCodigo;
    @FXML
    private Label lblNombre;
    @FXML
    private Label lblPrecio;
    @FXML
    private TextField txtCodigo;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtPrecio;
    @FXML
    private Button btnCuestionario;

    @FXML
    public void abrirCuestionario() {

        try {

            FXMLLoader loader =
                    new FXMLLoader(
                            getClass().getResource("Cuestionario.fxml")
                    );

            Stage stage =
                    (Stage) btnCuestionario.getScene().getWindow();

            stage.setScene(
                    new Scene(loader.load())
            );

            stage.show();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

}