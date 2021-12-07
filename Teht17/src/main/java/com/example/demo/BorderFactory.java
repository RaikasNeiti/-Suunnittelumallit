package com.example.demo;

import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public enum BorderFactory {

	INSTANCE;
	
	private Border shareableRedBorder = new Border( new BorderStroke(Color.RED, 
            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)); 
	
	
	public Border getBorder() {
		return shareableRedBorder;
	}

	
}
