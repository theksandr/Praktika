package Zadanie1;

public class Fork extends Dish
{
    protected int prongs;

    Fork(int p,int s)
    {
        prongs=p;
        stock=s;
    }

    @Override
    void setProperty(int p)
    {
        this.prongs = p;
    }

    @Override
    int getProperty()
    {
        return prongs;
    }

    @Override
    public String toString()
    {
        return "prongs = " + prongs + ", stock = " + stock;
    }
}
