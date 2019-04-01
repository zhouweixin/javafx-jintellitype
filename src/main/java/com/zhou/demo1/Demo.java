package com.zhou.demo1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Demo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // 4-2
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);

        // 4-3
        Text scenetitle = new Text("Welcome");
        // 5-4
        scenetitle.setId("welcome-text");
//        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        // 4-4
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

        // 4-5
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        // 4-6
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                // 5-4
                actiontarget.setId("actiontarget");
//                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Sign in button pressed");
            }
        });

        // 5-1
        scene.getStylesheets().add
                (Demo.class.getResource("Login.css").toExternalForm());

        // 4-1
        primaryStage.setTitle("JavaFX Welcome");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch();
    }
}
