package PR3.Zadanie3;

public abstract class Furniture
{
    protected int price, stock, owned;
    String name;
    Furniture()
    {
        name="n";
        price=0;
        stock=0;
        owned = 0;
    }
    protected void setStock(int stock)
    {
        this.stock = stock;
    }
    protected int getStock()
    {
        return stock;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
    public int getPrice()
    {
        return price;
    }
    public void setOwned(int owned)
    {
        this.owned = owned;
    }
    public int getOwned()
    {
        return owned;
    }

    protected void buyFurniture(int quantity)
    {
        int q = quantity;
        if(this.stock==0) System.out.println("Out of stock.");
        else if (q>this.stock) System.out.println("Not enough items in stock.");
        else {
            this.stock = this.stock - q;
            this.owned = this.owned + q;
            System.out.println("Thank you for your purchase");
        }
    }
    protected void sellFurniture(int quantity)
    {
        int q = quantity;
        if(this.owned==0) System.out.println("No such item in cart.");
        else if(q>this.owned) System.out.println("You don't own this many items.");
        else {
            this.stock = this.stock + q;
            this.owned = this.owned - q;
            System.out.println("Purchase cancelled successfully");
        }
    }

    @Override
    public String toString() {
        return "Furniture: " + name +
                ", Price = " + price +
                ", Stock = " + stock +
                ", Owned = " + owned;
    }
}
