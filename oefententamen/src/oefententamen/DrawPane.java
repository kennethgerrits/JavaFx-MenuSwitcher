package oefententamen;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class DrawPane extends Pane {
	private Rectangle hemel;
	private Rectangle grond;
	private Rectangle boomstam;
	private Circle boomtop;
	private final static int STROKEWIDTH = 2;

	public DrawPane() {
		super();
		hemel = new Rectangle(0, 0, 300,125);
		hemel.setFill(Color.LIGHTBLUE);
		
		grond = new Rectangle(0,125, 300, 175);
		grond.setFill(Color.LIGHTCORAL);
		
		boomstam = new Rectangle(135,210, 30, 50);
		boomstam.setFill(Color.SADDLEBROWN);
		boomstam.setStrokeWidth(STROKEWIDTH);
		boomstam.setStroke(Color.BLACK);
		
		boomtop = new Circle(150, 130, 90);
		boomtop.setFill(Color.GREEN);
		boomtop.setStrokeWidth(STROKEWIDTH);
		boomtop.setStroke(Color.BLACK);

		this.getChildren().addAll(hemel, grond, boomstam, boomtop);
	}
	
	@Override
	public void resize(double width, double height) {
		super.resize(width, height);
		hemel.setWidth(width);
		grond.setWidth(width);
		grond.setHeight(height);
	}
}
