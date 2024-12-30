package online_shopping_store;

public class ProductInfo {

    private String name;
    private String category;
    private int quantity;
    private double price;

    //constructor
    public ProductInfo(String name, String category, int quantity,double price)
    {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }

    //updating stock
    public void setQuantity (int newQuantity)
    {
        this.quantity = newQuantity;
    }

    //checking availability
    public boolean isAvalable()
    {
        if (this.quantity > 0)
            return true;
        else   
            return false;
    }

    //getting product name
    public String getName()
    {
        return this.name;
    }

    //getting available quantity
    public int getQuantity()
    {
        return this.quantity;
    }

    //getting price
    public double getPrice()
    {
        return this.price;
    }

    //updating price
    public void setPrice(double newPrice)
    {
        this.price = newPrice;
    }

    //knowing the category
    public String getCategory()
    {
        return this.category;
    }

    //printing detail
    public void info()
    {
        System.out.println("Name          : "+this.name);
        System.out.println("Category      : "+this.category);
        System.out.println("Price         : "+this.price);
        System.out.println("Quantity left : "+this.quantity);
        
    }
}
