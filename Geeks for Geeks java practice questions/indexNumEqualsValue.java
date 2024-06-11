import java.util.ArrayList;
import java.util.Scanner;

class indexNumEqualsValue {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>(n);
        
        for (int i = 0; i < n; i++)
        {
            if ((i+1) == arr[i])
            {
                ans.add(arr[i]);
                
            }
        }
        return ans;
        
    }

    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        int arr[];
        int n;
        System.out.println();
        n = scr.nextInt();
        arr = new int[n];
        for(int i = 0; i < n;i++)
        {
            arr[i] = scr.nextInt();
        }
        ArrayList<Integer> ans = new ArrayList<Integer>(n);
        ans = valueEqualToIndex(arr, n);
        System.out.println(ans);
    }

}