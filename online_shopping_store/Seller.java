package online_shopping_store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.*;

public class Seller extends User {

    private Inventory myInventory;
    ArrayList<String> myProducts = new ArrayList<>();
    public static HashMap<String,SellerInfo> sellers = new HashMap<>();
    Scanner scr = new Scanner(System.in);

    public Seller(String userName,String password)
    {
        super(userName,password);
        super.addSeller(userName, password);
        myInventory = Inventory.getInventory();
    }


    public static void registerNewSeller()
    {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter unique user name : ");
        String str = scr.nextLine();

        while(sellers.containsKey(str))
        {
            System.out.println("User name exists! Try giving someother name");
            str = scr.nextLine();
        }

        System.out.println("Enter a strong password :\nThe password should contain a minimum of 8 characters in length");
        System.out.println("Password should have at-least one upper case letter, at-least one numerical and atleast one special character");
        String password = scr.nextLine();
        
        String regex = "^(?.=*[A-Z])(?.=*\\d)(?.=*[!@#$%&*])[A-Za-z\\d!@#$%&*]{8,}";
        Pattern.compile(regex);
        
        while(!(Pattern.matches(regex, password)))
        {
            System.out.println("Try again \nThe password should contain a minimum of 8 characters in length");
            System.out.println("Password should have at-least one upper case letter, at-least one numerical and atleast one special character");
            password = scr.nextLine();
        }
        
        Seller obj = new Seller(str,password);
        

    }
    public void login()
    {

    }


    //updating the stock
    public void updateMyStock(String id, int n)
    {
        if(myProducts.contains(id))
            this.myInventory.updateStock(id,n);
        else
            System.out.println("The producd id is not associated with your shop!");
    }

    //adding new products to the inventory
    public void addMyProducts(String name, String category, int quantity, double price)
    {
        int len = myInventory.length();
        String id = "P" + Integer.toString(len+1);
        this.myInventory.addProduct(id,name,category,quantity,price);
        myProducts.add(id);

    }
    
    //listing my products alone
    public void listMyProducts()
    {
        for(String id : myProducts)
        {
            this.myInventory.listById(id);
        }
    }


    // public static void main(String[] args) {
        
    //     Seller s1 = new Seller();
    //     s1.addMyProducts("wallet","Men Accessories",20,300);
    //     s1.listMyProducts();
    // }
}
