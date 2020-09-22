package Zadanie4;

public class Circle extends Shape
{
    protected double radius;
    Circle()
    {
        radius=0;
        color="c";
        filled=false;
    }
    Circle(double radius)
    {
        this.radius=radius;
        color="c";
        filled=false;
    }
    Circle(double radius, String color, boolean filled)
    {
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }

    protected double getRadius() {
        return radius;
    }
    protected void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "radius " + this.radius +
                ", area " + this.getArea() +
                ", perimeter " + this.getPerimeter() +
                ", color " + this.color +
                ", filled " + this.filled;
    }
}
