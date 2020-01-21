package oefententamen;

import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class FilePane extends BorderPane{
	private ButtonPane buttonPane;
	private TextArea textArea;
	
	public FilePane(MyScene scene) {
		super();
		setHeight(300);
		setWidth(300);
		buttonPane = new ButtonPane(scene);
		textArea = new TextArea();
		textArea.setMinHeight(this.getHeight()-buttonPane.getHeight()-100);
		this.setBottom(buttonPane);
		this.setCenter(textArea);
		textArea.setWrapText(true);

	}
	
	@Override
	public void resize(double width, double height) {
		// TODO Auto-generated method stub
		super.resize(width, height);
		textArea.setPrefHeight(height);
		textArea.setPrefWidth(width);
	}
}
