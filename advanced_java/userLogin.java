package advanced_java;

import java.util.HashMap;
import java.util.Scanner;

public class userLogin {
   
    public static void main(String[] args) {

        HashMap<String,String> userRecord = new HashMap<String,String>();
        Scanner scr = new Scanner(System.in);
        userRecord.put("Theepika","Welcome@123");
        userRecord.put("theeps","Welcome@123");
        userRecord.put("sunshine","Welcome@123");
        
        System.out.println("1.Sign up\n2.Login");
        int choice = scr.nextInt();
        scr.nextLine();
        switch (choice) {
            case 1:
            {
                System.out.println("Enter unique username : ");
                String name = scr.nextLine();
                if (userRecord.containsKey(name)) {
                    System.out.println("User name not available!");
                }
                else{
                    System.out.println("User name available");
                    System.out.println("Enter a password : ");
                    String password = scr.nextLine();
                    userRecord.put(name, password);  
                }
                break;
            }
            case 2:
            {
                System.out.println("Enter your username : ");
                String name = scr.nextLine();
                if (userRecord.containsKey(name))
                {
                    System.out.println("Enter a password : ");
                    String password = scr.nextLine();
                    if(password.equals(userRecord.get(name)))
                    {
                        System.out.println("Login Successfull");
                    }
                    else{
                        System.out.println("Invalid password");
                    }
                }
                else
                {
                    System.out.println("Invalid username");
                }
                break;
            }
                
        
            default:
                break;
        }
        System.out.println(userRecord);
    }
}
