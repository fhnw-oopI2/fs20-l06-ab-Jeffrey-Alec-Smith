package main.java.ch.fhnw.module06.ab1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Starter extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Scene scene = new Scene(new HelloWorldExample(stage), 320, 400);
		stage.setScene(scene);
		stage.setResizable(true);
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
