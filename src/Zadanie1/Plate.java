package Zadanie1;

public class Plate extends Dish
{
    protected int area;

    Plate(int a,int s)
    {
        area=a;
        stock=s;
    }

    @Override
    void setProperty(int p)
    {
        this.area = p;
    }

    @Override
    int getProperty()
    {
        return area;
    }
    @Override
    public String toString()
    {
        return "area = " + area + ", stock = " + stock;
    }
}
