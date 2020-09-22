package Zadanie4;

public class Square extends Rectangle
{
    protected double side;
    Square(double side)
    {
        this.side = side;
    }
    Square(double side, String color, boolean filled)
    {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    protected double getSide() {
        return side;
    }

    protected void setSide(double side) {
         this.side = side;
    }

    @Override
    protected void setWidth(double side) {
        this.side = side;
    }

    @Override
    protected void setLength(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "side " + this.side +
                ", area " + this.getArea() +
                ", perimeter " + this.getPerimeter() +
                ", color " + this.color +
                ", filled " + this.filled;
    }
}
