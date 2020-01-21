package oefententamen;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class ButtonPane extends FlowPane{
	private Button button;
	private FileChooser chooser;
	private MyScene scene;
	
	public ButtonPane(MyScene scene) {
		super();
		this.scene = scene;
		button = new Button("load");
		this.setMinHeight(50);
		getChildren().add(button);
		setAlignment(Pos.CENTER);
		button.setPrefHeight(30);
		button.setPrefWidth(80);
		button.setOnAction(e -> openFile());
		
		// FileChooser
		File path = new File("./textfiles");
		chooser = new FileChooser();
		chooser
			.getExtensionFilters()
			.add(new ExtensionFilter("Text Files", "*.txt"));
		chooser.initialDirectoryProperty().set(path);
	}
	
	private void openFile() {
		File file = chooser.showOpenDialog(scene.getWindow());

		if (file == null)
			return;

		try {
			StringBuilder content = new StringBuilder();

			for (String s : Files
				.readAllLines(file.toPath(), StandardCharsets.UTF_8)) {
				content.append(s).append("\n");
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
	
	
}
