package online_shopping_store;
import java.util.HashMap;


public class Inventory {

    private static Inventory obj;  //1. private instance of the class 

    private HashMap<String, ProductInfo> products;  // <productId , productInfo>

    private Inventory()     //2. creating a private constructor
    {
        products = new HashMap<> ();
    }

    public static Inventory getInventory()      // 3. public method to access the object
    {
        if (obj == null)
        {
            obj = new Inventory();
        }
        return obj;
    }

    public int length()
    {
        return products.size();
    }

    public void addProduct(String id, String name, String category, int quantity, double price)
    {
        ProductInfo p = new ProductInfo(name, category, quantity, price);
        products.put(id, p);
    }

    public void updateStock(String id, int n)       //product id and quantity sold
    {
        ProductInfo fetched = products.get(id);
        int existing_quantity = fetched.getQuantity();
        int new_quantity = existing_quantity - n;
        fetched.setQuantity(new_quantity);
    }

    public void listProducts()
    {
        System.out.println("Products in stock :");
        System.out.println();
        for(String i : products.keySet())
        {
            ProductInfo fetched = products.get(i);
            if (fetched.isAvalable()) {
                System.out.println("Product ID    : "+i);
                fetched.info();
                System.out.println();
            }
        }
    }

    public void listById(String id)
    {
        ProductInfo fetched = products.get(id);
        System.out.println("Product ID    : "+id);
        fetched.info();
        System.out.println(); 
            
    }

    public ProductInfo getInfo(String id)
    {
        return products.get(id);
    }

    public void SearchByCategory(String category)
    {
        for(String id : products.keySet())
        {
            ProductInfo fetched = products.get(id);
            if(fetched.getCategory().equals(category))
            {
                if (fetched.isAvalable()) {
                    System.out.println("Product ID    : "+id);
                    fetched.info();
                    System.out.println();
                }
            }
        }
    }



    public void searchByName(String name)
    {
        for(String id : products.keySet())
        {
            ProductInfo fetched = products.get(id);
            if(fetched.getName().equals(name))
            {
                if (fetched.isAvalable()) {
                    System.out.println("Product ID    : "+id);
                    fetched.info();
                    System.out.println();
                }
                else{
                    System.out.println("Product out of stock!");
                }
            }
        }
    }

  

}
