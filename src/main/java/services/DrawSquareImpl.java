package services;

import annotations.ColorValue;
import annotations.EdgeValue;

import javax.inject.Inject;

public class DrawSquareImpl implements DrawShape {

    private String color;
    private Integer edge;

    @Inject
    public DrawSquareImpl(@ColorValue String color, @EdgeValue Integer edge) {
        super();
        this.color = color;
        this.edge = edge;
    }

    public void draw() {
        System.out.println("a square is created with : " + color + "and edge :" + edge);
    }


}
