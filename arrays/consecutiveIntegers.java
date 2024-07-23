/*
 * Input:
     An integer array nums
    Output:
     The length of the longest consecutive sequence present in the array nums.
    Example:
    Input: nums = [100, 4, 200, 1, 3, 2]
    Output: 4 (Explanation: The longest consecutive sequence is [1, 2, 3, 4].)
 */


package arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;



public class consecutiveIntegers {

    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        int n,i,j,temp,count = 1;
        int[] arr;
        System.out.println("Enter number of elements : ");
        n = scr.nextInt();
        arr = new int[n];
        System.out.println("Enter numbers one by one : ");
        for (i = 0;i<n ; i++){
            arr[i] = scr.nextInt();
        }
        
        // Sorting the array
        for (i = 0;i<n; i++){
            for (j=0 ;j<n-1; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        ArrayList<ArrayList<Integer>> numList = new ArrayList<>();
        ArrayList<Integer> tempList = new ArrayList<>();
        ArrayList<Integer> len = new ArrayList<>();

        for(i = 0; i < n-1; i++)
        {
            if(arr[i+1] - arr[i] == 1)
            {
                count++;
            }
            else
            {
                for(int k = i-count+1; k <= i; k++)
                {
                    tempList.add(arr[k]);
                }
                //System.out.println(tempList);
                numList.add(new ArrayList<>(tempList));
                len.add(count);
                count = 1;
                tempList.clear();
            }
        }
        if(count > 1)
        {
            for(int k = n-count ; k < n; k++)
                {
                    tempList.add(arr[k]);
                }
                //System.out.println(tempList);
                numList.add(new ArrayList<>(tempList));
                len.add(count);
        }
        //System.out.println(numList);
        //System.out.println(len);
        
        System.out.println(Collections.max(len));

    }
    
}
