package com.example.helloworld;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        FlowPane pane = new FlowPane(Orientation.VERTICAL);
        pane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(pane, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);

        Label label = new Label("Hello World");
        pane.getChildren().add(label);


        System.out.println("third master commit");

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}