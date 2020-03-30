package main.java.ch.fhnw.module06.ab2;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ApplicationUI extends VBox{
	
	public ApplicationUI(Stage stage) {
		stage.setTitle("AB-2");
		setPadding(new Insets(10));
		
		// Create UI Elements
		Label label = new Label("Ein Label");
		TextField textField = new TextField("Ein TextFeld");
		TextArea textArea = new TextArea("Ein TextArea");
		Button button = new Button("Ein Button");
		
		// Add Elements to UI
		getChildren().add(label);
		getChildren().add(textField);
		getChildren().add(textArea);
		getChildren().add(button);
	}
}
