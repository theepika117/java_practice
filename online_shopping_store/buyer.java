package online_shopping_store;

import java.util.HashMap;
import java.util.Scanner;

public class buyer {
    
    private Inventory shop ;
    public HashMap<String,Integer> cart = new HashMap<>();

    public buyer()
    {
        shop = Inventory.getInventory();
    }

    // adding products to cart
    public void addToCart(String id,int quantity)
    {
        this.cart.put(id, quantity);
    }

    //removing products from cart
    public void removeFromCart(String id)
    {
        this.cart.remove(id);
    }

    //modifying quantity in the cart
    public void changeQuantity(String id, int newQuantity)
    {
        this.cart.put(id, newQuantity);
    }

    //empty the cart
    public void emptyCart()
    {
        this.cart.clear();
    }

    //view cart
    public void viewCart()
    {
        if(cart.isEmpty())
        {
            System.out.println("Your cart is empty !");
        }
        //System.out.println("\t\tYOUR CART");
        else
        {
            for(String id : cart.keySet())
            {
                System.out.println("Product ID      : "+id);
                ProductInfo fetchedInfo = shop.getInfo(id);
                System.out.println("Product Name    : "+fetchedInfo.getName());
                System.out.println("Quantity        : "+cart.get(id));
                System.out.println("Price           : "+fetchedInfo.getPrice());
                System.out.println();

            }
        }
    }

    //calculating bill
    public double calculateBill()
    {
        double amt = 0;
        for(String id : cart.keySet())
        {
            ProductInfo fetchedInfo = shop.getInfo(id);
            double price = fetchedInfo.getPrice();
            int quantity = cart.get(id);
            amt += (price * quantity);
        }

        return amt;
    }


    public void placeOrder()
    {
        String buyerName, address, ph;
        System.out.println("Your name : ");
        Scanner scr = new Scanner(System.in);
        buyerName = scr.nextLine();
        System.out.println("Enter complete address : ");
        address = scr.nextLine();
        System.out.println("Enter contact number : ");
        ph = scr.nextLine();
        System.out.println("Your order Summary : ");
        viewCart();
        System.out.println("Total Amount to be paid : "+calculateBill());
        System.out.println("Your order placed successfully");
        for(String id : cart.keySet())
        {
            shop.updateStock(id, cart.get(id));
        }
        emptyCart();

    }

}
