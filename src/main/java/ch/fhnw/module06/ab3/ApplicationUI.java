package main.java.ch.fhnw.module06.ab3;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ApplicationUI extends BorderPane{
	
	public ApplicationUI(Stage stage) {
		stage.setTitle("AB-3");
		setPadding(new Insets(10));
		
		// Create UI Elements
		Button top = new Button("top");
		Button left = new Button("left");
		Button right = new Button("right");
		Button bottom = new Button("bottom");
		TextArea center = new TextArea();
		
		// Modify buttons
		formatButton(top);
		formatButton(left);
		formatButton(right);
		formatButton(bottom);
		
		// Add Elements to UI
		setTop(top);
		setLeft(left);
		setRight(right);
		setBottom(bottom);
		setCenter(center);
	}
	
	void formatButton(Button button) {
		button.setMaxHeight(1000000);
		button.setMaxWidth(1000000);
		setMargin(button, new Insets(2));
	}
}
