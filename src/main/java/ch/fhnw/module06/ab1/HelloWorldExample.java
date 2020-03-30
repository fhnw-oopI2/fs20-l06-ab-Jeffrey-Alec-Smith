package main.java.ch.fhnw.module06.ab1;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

final public class HelloWorldExample extends StackPane {

	public HelloWorldExample(Stage stage) {
		getChildren().add(new Button("Hello World"));
		stage.setTitle("Hello World!");
		stage.setWidth(500);
		stage.setHeight(500);
		stage.show();
	}
}
