package com.example.projet_informatique;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;

import java.io.File;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
    @FXML
    private imageChange(){

     FileChooser newFile = new FileChooser();

     File file = newFile.showOpenDialog(null);

     Image img = new Image(file.toURI().toString());
     ImageView.setImage(img);

    }