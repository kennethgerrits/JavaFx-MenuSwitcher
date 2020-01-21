package oefententamen;

import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;

public class MyScene extends Scene {
	private DrawPane drawPane;
	private RootPane rootPane;
	private BackPane backPane;
	private FilePane filePane;
	private MenuBar menuBar;
	private MenuItem drawing;
	private MenuItem backgroundcolorchanger;
	private MenuItem tofiletext;
	
	public MyScene() {
		super(new Pane(), 300, 300);
		drawPane = new DrawPane();
		rootPane = new RootPane();
		backPane = new BackPane();
		filePane = new FilePane(this);
		createMenuBar();
		rootPane.getChildren().addAll(menuBar, drawPane);	
		setRoot(rootPane);
	}

	private void createMenuBar() {
		Menu fileMenu = new Menu("Change Pane");
		
		drawing = new MenuItem("Drawing");
		drawing.setOnAction(e -> toDrawing());
		
		backgroundcolorchanger = new MenuItem("Background color changer");
		backgroundcolorchanger.setOnAction(e -> toBackGround());
		
		tofiletext = new MenuItem("File textarea");
		tofiletext.setOnAction(e -> toFileText());
		
		fileMenu.getItems().addAll(drawing, backgroundcolorchanger, tofiletext);
		menuBar = new MenuBar(fileMenu);
		menuBar.setMinHeight(25);
	}
	
	private void toDrawing() {
		createMenuBar();
		rootPane.getChildren().clear();
		rootPane.getChildren().addAll(menuBar, drawPane);
		drawing.setDisable(true);
	}
	
	private void toBackGround() {
		createMenuBar();
		rootPane.getChildren().clear();
		rootPane.getChildren().addAll(menuBar, backPane);	
		backgroundcolorchanger.setDisable(true);
		
	}
	
	private void toFileText() {
		createMenuBar();
		rootPane.getChildren().clear();
		rootPane.getChildren().addAll(menuBar, filePane);	
		tofiletext.setDisable(true);
	}
}
