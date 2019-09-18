package com.generics;

public class Ractangle extends Shape {
 private int x, y, height, width;

 public Ractangle(int x ,int y,int height,int width){
     this.x= x;
     this.y = y;
     this.height = height;
     this.width = width;

 }
    @Override
    public void draw(Canvas c) {
        System.out.println("In draw Method of Ractangle x = " + x + " y = " + y + " height = " + height + " width = " + width );
    }
}
