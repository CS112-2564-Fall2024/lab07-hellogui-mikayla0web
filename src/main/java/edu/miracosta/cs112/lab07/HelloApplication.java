package edu.miracosta.cs112.lab07;//package name here depending on your IDE

import javafx.application.Application;  //abstract class used for JavaFX GUI's
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;              //class for GUI window
import javafx.scene.Scene;              //class for specific view in GUI window
import javafx.scene.layout.VBox;        //class for layout pane, organized top-to-bottom
import javafx.scene.control.Label;      //class for label component
import javafx.scene.control.Button;     //class for button component
import javafx.event.EventHandler;       //interface for handling events
import javafx.event.ActionEvent;        //class for type of event for action (like button or key pressed)

public class HelloApplication extends Application implements EventHandler<ActionEvent>  { //inheriting core functionality + this class will handle events
    /*** GUI COMPONENTS ***/
    private Label label1;
    private Label label2;
    private Button button1;
    private Button button2;
    private TextField textField;
    private int button2ClickCount = 0;

    /*** DRIVER main ***/
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello GUI: Your Name");

        StackPane layout = new StackPane();

        Scene scene = new Scene(layout, 300, 300);
        primaryStage.setScene(scene);

        label1 = new Label("Hello GUI World");

        AnchorPane anchorPane = new AnchorPane();
        AnchorPane.setBottomAnchor(label1, 0.0);
        AnchorPane.setRightAnchor(label1, 0.0);
        anchorPane.getChildren().add(label1);

        layout.getChildren().add(anchorPane);

        label2 = new Label("Button presses: 0");
        button1 = new Button("Update Label");
        button2 = new Button("Count Clicks");

        button1.setOnAction(this);
        button2.setOnAction(this);

        AnchorPane.setBottomAnchor(button1, 10.0);
        AnchorPane.setLeftAnchor(button1, 10.0);
        AnchorPane.setBottomAnchor(button2, 10.0);
        AnchorPane.setRightAnchor(button2, 10.0);
        AnchorPane.setTopAnchor(label2, 10.0);

        anchorPane.getChildren().addAll(button1, button2, label2);

        textField = new TextField();
        AnchorPane.setTopAnchor(textField, 50.0);
        AnchorPane.setLeftAnchor(textField, 50.0);
        AnchorPane.setRightAnchor(textField, 50.0);
        anchorPane.getChildren().add(textField);

        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if (actionEvent.getSource() == button1) {
            String inputText = textField.getText();
            label1.setText(inputText.isEmpty() ? "No Input Provided" : inputText);
        } else if (actionEvent.getSource() == button2) {
            button2ClickCount++;
            label2.setText("Button presses: " + button2ClickCount);
        }
    }
}