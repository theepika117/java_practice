/*
 *  Kth Largest Element in Array
    Input:
     An integer array nums
     An integer k representing the kth largest element
    Output:
     The kth largest element in the array nums.
    Example:
    Input:
     nums = [5,3,1,6,2]
     k = 3
    Output: 3 (The third largest element is 3.)
 */


package arrays;
import java.util.Scanner;

public class kthLargestNum {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n,i,j,temp,k;
        int[] arr;
        System.out.println("Enter number of elements : ");
        n = scr.nextInt();
        arr = new int[n];
        System.out.println("Enter numbers one by one : ");
        for (i = 0;i<n ; i++){
            arr[i] = scr.nextInt();
        }
        System.out.println("Enter K : ");
        k = scr.nextInt();
        for (i = 0;i<n; i++){
            for (j=0 ;j<n-1; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[n-k]);


    }
    
}



/*
 * Output
 * Enter number of elements :
    6
    Enter numbers one by one : 
    6 7 9 5 3 2
    Enter K : 
    2
    7
 */
