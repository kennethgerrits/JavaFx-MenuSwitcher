package oefententamen;

import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

public class BackPane extends BorderPane {
	private TextField textField;
	private String input;

	public BackPane() {
		super();
		this.setPrefHeight(1000);

		textField = new TextField();
		textField.setMaxSize(100, 30);

		setCenter(textField);

		textField.setOnAction(e -> handleCommand());

	}

	private void handleCommand() {
		textField.setStyle("-fx-border-color: black");

		input = textField.getText();
		try {
			Color newcolor = Color.valueOf(input);
			setBackground(new Background(new BackgroundFill(newcolor, null, null)));

		} catch (Exception e) {
			textField.setStyle("-fx-border-color: red");
		}

	}

}
