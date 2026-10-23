package com.nearcart.view;

import com.nearcart.view.user.UserLoginPage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SplashPage extends Application {
    
    public static Stage primaryStage;
    public Scene splashScene;
    
    public void start(Stage arg0){

        primaryStage = arg0;

        Text tx = new Text("Splash Page");
        tx.setStyle("-fx-font-size : 50px;-fx-font-weight:bold;");

        Button loginButton = new Button("Login Page");
        loginButton.setStyle(
                "-fx-background-color:black;-fx-text-fill:white;-fx-padding:10px 20px 10px 20px;-fx-font-size:16px;-fx-font-weight:bold;-fx-border-radius:20px;");

        loginButton.setOnAction(e -> {
            Runnable obj = new Runnable() {
                @Override
                public void run() {
                    primaryStage.setScene(splashScene);
                }
            };

            UserLoginPage ab = new UserLoginPage();
            primaryStage.setScene(ab.getLoginScene(obj));
        });

        VBox vb = new VBox(30,tx,loginButton);
        vb.setStyle("-fx-alignment:center;");
        Scene spalshSc = new Scene(vb,1550,850);
        splashScene = spalshSc;
        primaryStage.setScene(spalshSc);
        primaryStage.show();
    }
}
