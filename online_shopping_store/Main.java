package online_shopping_store;

public class Main {

    public static void main(String[] args) {
        
        Inventory inv = Inventory.getInventory();
        inv.addProduct("P1","HP Laptops","Electronics",20,45000);
        inv.addProduct("P2","Redmi note 11T","Electronics",10,17000);
        inv.addProduct("P3","Lakme CC creme","Cosmetics",50,200);
        inv.addProduct("P4","Non Stick cookware set","Kitchen",20,2999);
        inv.addProduct("P5","Lakme lipstick","Cosmetics",5,200);
        inv.addProduct("P6","Dazzler eyeliner","Cosmetics",50,150);
        inv.addProduct("P7","Dosa tawa","Kitchen",20,899);
        inv.addProduct("P8","Rice cooker","Kitchen",12,3999);
        inv.addProduct("P9","Storage containers","Kitchen",20,299);
        inv.addProduct("P10","Aprons","Kitchen",20,399);
        inv.addProduct("P11","Smart watch","Electronics",10,1700);
        inv.addProduct("P12","Bluetooth Headset","Electronics",10,3599);
        inv.addProduct("P13","Kurtha set","Women clothing",10,499);
        inv.addProduct("P14","Kurtha set","Women clothing",10,799);
        inv.addProduct("P15","Saree","Women clothing",10,999);


        //System.out.println(inv.length());

        // Seller s1 = new Seller();
        // s1.addMyProducts("wallet","Men Accessories",20,300);
        // s1.listMyProducts();
        // s1.updateMyStock("P16", 15);
        // inv.listProducts();
        //inv.listProducts();
        //inv.updateStock("P3",30);
        //inv.SearchByCategory("Electronics");
        //inv.searchByName("Non Stick cookware set");

        buyer b1 = new buyer();
        b1.addToCart("P3", 5);
        b1.addToCart("P5", 5);
        b1.placeOrder();
        b1.viewCart();
        //inv.listProducts();
        //System.out.println(b1.calculateBill());
    }
}
