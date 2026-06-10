package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtContrasenia;

    @FXML
    private ComboBox<String> txtRol;

    @FXML
    private Button btnIngresar;

    @FXML
    private Button btnSalir;

    @FXML
    public void initialize() {

        txtRol.getItems().add("Administrador");
        txtRol.getItems().add("Cajero");

    }

    @FXML
    public void ingresar() {

        String usuario = txtUsuario.getText().trim();
        String contrasenia = txtContrasenia.getText().trim();
        String rol = txtRol.getValue();

        if (usuario.isEmpty() || contrasenia.isEmpty()) {

            welcomeText.setText("Complete todos los campos");
            return;

        }

        if (rol == null) {

            welcomeText.setText("Seleccione un rol");
            return;

        }

        try {

            if (usuario.equals("admin")
                    && contrasenia.equals("1234")
                    && rol.equals("Administrador")) {

                FXMLLoader loader = new FXMLLoader(
                        getClass().getResource("Administrador.fxml")
                );

                Stage stage =
                        (Stage) btnIngresar.getScene().getWindow();

                stage.setScene(new Scene(loader.load()));
                stage.show();

                return;
            }

            if (usuario.equals("cajero")
                    && contrasenia.equals("1234")
                    && rol.equals("Cajero")) {

                FXMLLoader loader = new FXMLLoader(
                        getClass().getResource("Cajero.fxml")
                );

                Stage stage =
                        (Stage) btnIngresar.getScene().getWindow();

                stage.setScene(new Scene(loader.load()));
                stage.show();

                return;
            }

            welcomeText.setText(
                    "Usuario, contraseña o rol incorrectos"
            );

        } catch (Exception e) {

            e.printStackTrace();

            welcomeText.setText(
                    "Error al abrir la ventana"
            );

        }
    }

    @FXML
    public void salir() {

        Stage stage =
                (Stage) btnSalir.getScene().getWindow();

        stage.close();

    }
}