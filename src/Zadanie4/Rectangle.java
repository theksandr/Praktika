package Zadanie4;

public class Rectangle extends Shape
{
    protected double length, width;
    Rectangle()
    {
        width=0;
        length=0;
    }
    Rectangle(double width, double length)
    {
        this.width=width;
        this.length=length;
    }
    Rectangle(double width, double length, String color, boolean filled)
    {
        this.width=width;
        this.length=length;
        this.color=color;
        this.filled=filled;
    }

    protected double getWidth() {
        return width;
    }

    protected void setWidth(double width) {
        this.width = width;
    }

    protected double getLength() {
        return length;
    }

    protected void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return width*length;
    }

    @Override
    double getPerimeter() {
        return (width*2)+(length*2);
    }

    @Override
    public String toString() {
        return "length " + this. length +
                ", width " + this.width +
                ", area " + this.getArea() +
                ", perimeter " + this.getPerimeter() +
                ", color " + this.color +
                ", filled " + this.filled;
    }
}
