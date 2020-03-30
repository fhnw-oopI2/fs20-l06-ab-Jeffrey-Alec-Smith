package main.java.ch.fhnw.module06.ab3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application{
	
	@Override
	public void start(Stage stage) throws Exception {
		Scene scene = new Scene(new ApplicationUI(stage), 320, 400);
		stage.setScene(scene);
		stage.setResizable(true);
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
