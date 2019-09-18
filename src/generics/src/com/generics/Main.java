package com.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

static List<List<? extends Shape>> object = new ArrayList<List<? extends Shape>>();

public void drawShapeList(List <? extends  Shape> Shapes){
    object.add(Shapes);
    for(Shape s:Shapes){
        s.draw(new Canvas());
    }
}
    public static void main(String[] args) {
    List<Circle> circleList = new ArrayList<Circle>();
        circleList.add(new Circle(3,0,5));
        circleList.add(new Circle(3,3,3));
     List<Ractangle> ractangleList = new ArrayList<Ractangle>();
     ractangleList.add(new Ractangle(3,3,3,3));
     ractangleList.add(new Ractangle(4,4,4,4));
        Main app = new Main();
        app.drawShapeList(circleList);
        app.drawShapeList((ractangleList));
    }
}

