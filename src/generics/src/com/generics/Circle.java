package com.generics;

public class Circle extends  Shape {

    private int  x,y,radius ;
    public Circle(int x ,int y ,int radius){
      this.x = x;
      this.y = y;
      this.radius = radius;
    }

    @Override
    public void draw(Canvas c) {
        System.out.println("In draw Method of circle x = " + x + " y = " + y + " radius = " + radius );
    }
}
