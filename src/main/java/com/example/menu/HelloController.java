package com.example.menu;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HelloController {

    public Button exitButton;

    @FXML
    void GamabrKlik() {
        try {
            Platform.exit();
            TicTacToe.Jframe1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void klikMouse() {
        try {
            Platform.exit();
            TicTacToe.Jframe1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void printHelloWorld() {
        Platform.exit();
    }
}
