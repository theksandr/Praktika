package Zadanie1;

public abstract class Dish
{
    abstract void setProperty(int p);
    abstract int getProperty();
    protected int stock;
    protected void setStock(int stock)
    {
        this.stock = stock;
    }

    protected int getStock()
    {
        return stock;
    }
}
