package PR3.Zadanie1;

public class Spoon extends Dish
{
    protected int volume;
    Spoon(int v, int s)
    {
        volume=v;
        stock=s;
    }
    @Override
    void setProperty(int p)
    {
        this.volume = p;
    }

    @Override
    int getProperty()
    {
        return volume;
    }

    @Override
    public String toString()
    {
        return "volume = " + volume + ", stock = " + stock ;
    }
}
