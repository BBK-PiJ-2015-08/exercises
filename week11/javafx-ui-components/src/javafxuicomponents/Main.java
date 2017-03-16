package javafxuicomponents;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        //An empty label
        Label label1 = new Label();
        //A label with the text element
        Label label2 = new Label("Search");
        //A label with the text element and graphical icon
        Image image = new Image(getClass().getResourceAsStream("labels.jpg"));
        Label label3 = new Label("Search", new ImageView(image));
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
        root.getChildren().add(label2);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("JavaFX UI Components");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}