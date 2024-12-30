package online_shopping_store;

import java.util.Scanner;

public class SellerInfo {

    private String sellerName;
    private String shopName;
    private String address;
    private String contactNo;
    private String gstId;

    public SellerInfo()
    {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter your name : ");
        this.sellerName = scr.nextLine();
        System.out.println("Enter your shop name : ");
        this.shopName = scr.nextLine();
        System.out.println("Enter your shop address : ");
        this.address = scr.nextLine();
        System.out.println("Enter your contact number : ");
        this.contactNo = scr.nextLine();
        System.out.println("Enter your GSTID : ");
        this.gstId = scr.nextLine();
    }

    public String getSellerName()
    {
        return this.sellerName;
    }

    public String getShopName()
    {
        return this.shopName;
    }

    public String getAddress()
    {
        return this.address;
    }

    public String getContactNo()
    {
        return this.contactNo;
    }

    public String getGSTID()
    {
        return this.gstId;
    }

}
