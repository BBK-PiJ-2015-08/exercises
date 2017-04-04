package javafxuicomponents;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Buttons extends Application {

    @Override
    public void start(Stage primaryStage) {
        //A button with an empty text caption.
        Button button1 = new Button();
        StackPane.setAlignment(button1, Pos.TOP_CENTER);
        //A button with the specified text caption.
        Button button2 = new Button("Accept");
        button2.setOnAction((ActionEvent e) -> {
            button2.setText("Accepted");
        });

        //A button with the specified text caption and icon.
        Image imageOk = new Image(getClass().getResourceAsStream("ok.png"));
        Button button3 = new Button("Accept", new ImageView(imageOk));
        DropShadow shadow = new DropShadow();
        //Adding the shadow when the mouse cursor is on
        button3.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
            button3.setEffect(shadow);
        });

        //Removing the shadow when the mouse cursor is off
        button3.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
            button3.setEffect(null);
        });
        StackPane.setAlignment(button3, Pos.BOTTOM_LEFT);

        Image imageDecline = new Image(getClass().getResourceAsStream("not.png"));
        Button button4 = new Button();
        button4.setGraphic(new ImageView(imageDecline));
        StackPane.setAlignment(button4, Pos.BOTTOM_RIGHT);

        StackPane root = new StackPane();
        root.getChildren().add(button1);
        root.getChildren().add(button2);
        root.getChildren().add(button3);
        root.getChildren().add(button4);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Buttons");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
