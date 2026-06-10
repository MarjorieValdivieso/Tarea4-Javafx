package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class CuestionarioController {

    @FXML
    private ComboBox<String> cmb1;

    @FXML
    private ComboBox<String> cmb2;

    @FXML
    private ComboBox<String> cmb3;

    @FXML
    private ComboBox<String> cmb4;

    @FXML
    private Label lblResultado;

    @FXML
    public void initialize() {

        cmb1.getItems().add("Java");
        cmb1.getItems().add("Python");
        cmb1.getItems().add("HTML");
        cmb1.getItems().add("CSS");

        cmb2.getItems().add("for");
        cmb2.getItems().add("if");
        cmb2.getItems().add("switch");
        cmb2.getItems().add("case");

        cmb3.getItems().add(";");
        cmb3.getItems().add(":");
        cmb3.getItems().add(",");
        cmb3.getItems().add(".");

        cmb4.getItems().add("main");
        cmb4.getItems().add("start");
        cmb4.getItems().add("run");
        cmb4.getItems().add("execute");

    }

    @FXML
    public void calcular() {

        int correctas = 0;
        int incorrectas = 0;
        int puntaje = 0;

        if ("Java".equals(cmb1.getValue())) {
            correctas++;
            puntaje += 5;
        } else {
            incorrectas++;
        }

        if ("for".equals(cmb2.getValue())) {
            correctas++;
            puntaje += 5;
        } else {
            incorrectas++;
        }

        if (";".equals(cmb3.getValue())) {
            correctas++;
            puntaje += 5;
        } else {
            incorrectas++;
        }

        if ("main".equals(cmb4.getValue())) {
            correctas++;
            puntaje += 5;
        } else {
            incorrectas++;
        }

        lblResultado.setText(
                "Puntaje Total: " + puntaje +
                        "\nRespuestas Correctas: " + correctas +
                        "\nRespuestas Incorrectas: " + incorrectas
        );
    }
}