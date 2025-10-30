package org.example.java17.chapter7.innnerClass;

import javafx.application.Application;
import javafx.event.EventHandler;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ClassAnonymExample extends Application {

    @Override
    public void start(final Stage stage) {
        var buttonAnon = new Button("Classe Anonyme");
        buttonAnon.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.out.println("Bouton classe anonyme cliqué !");
            }
        });

        var buttonLambda = new Button("Lambda");
        buttonLambda.setOnAction(e -> System.out.println("Bouton lambda cliqué !"));

        var root = new StackPane(buttonAnon, buttonLambda);
        //root.setSpacing(20);

        stage.setScene(new Scene(root, 300, 200));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
