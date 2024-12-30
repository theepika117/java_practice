package online_shopping_store;

import java.util.HashMap;

public class User {

    private String userName;
    private String passWord;

    private HashMap<String,String> sellerID = new HashMap<>();
    private HashMap<String,String> buyerID = new HashMap<>();

    public User(String userName, String password)
    {
        this.userName = userName;
        this.passWord = password;
    }


    public void addSeller(String userName , String password)
    {
        sellerID.put(userName, password);
    }


    public void addBuyer(String userName , String password)
    {
       buyerID.put(userName, password);
    }

    public boolean checkSeller(String userName)
    {
        for(String str : sellerID.keySet())
        {
            if(str.equals(userName))
                return true;
        }
        return false;
    }


    public boolean checkBuyer(String userName)
    {
        for(String str : buyerID.keySet())
        {
            if(str.equals(userName))
                return true;
        }
        return false;
    }

}
