package javafxuicomponents;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        //A label with the text element and graphical icon
        Label label1 = new Label("Search");
        Image image = new Image(getClass().getResourceAsStream("labels.jpg"));
        label1.setGraphic(new ImageView(image));
        label1.setTextFill(Color.web("#0076a3"));
        //A label with the text element
        Label label2 = new Label("Search");

        //Use a constructor of the Font class
        label1.setFont(new Font("Arial", 30));
        //Use the font method of the Font class
        label2.setFont(Font.font("Cambria", 32));
        //A label with text to be wrapped
        Label label3 = new Label("A label with text that really needs to be wrapped to fit in the window");
        label3.setWrapText(true);
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
//
        StackPane root = new StackPane();
        root.getChildren().add(label1);
        root.getChildren().add(label2);
        root.getChildren().add(label3);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("JavaFX UI Components");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}