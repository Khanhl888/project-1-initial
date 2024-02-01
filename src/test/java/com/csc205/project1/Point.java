package com.csc205.project1;

public class Point {

    private double x;
    private double y;

    public Point(){
        this(0,0);
    }
    public Point(double x, double y) {
      this.x = x;
      this.y = y;

    }

    public double getX(){
        return x;
    }
    public void setX(double x) {
        this.x = x;

    }
    public double getY(){
        return y;
    }
   public void setY(double y) {
        this.y=y;
    }

    public void setPoint(double x, double y) {
        setX(x);
        setY(y);
    }
    public void shiftX(double n){
        x+=n;
    }
    public void shiftY(double n){
        y+=n;
    }
    public double distance(Point p2){
        double dx = this.x - p2.getX();
        double dy = this.y - p2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    public void rotate(double angle){
        double newX = x * Math.cos(angle) - y * Math.sin(angle);
        double newY = x * Math.sin(angle) + y * Math.cos(angle);
        x= newX;
        y= newY;

    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }




}
