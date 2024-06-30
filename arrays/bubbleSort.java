package arrays;

// Bubble sort using java
import java.io.*;
import java.util.Scanner;

public class bubbleSort {

    public static void main(String args[]){

        Scanner scr = new Scanner(System.in);
        int n,i,j,temp;
        int[] arr;
        System.out.println("Enter number of elements : ");
        n = scr.nextInt();
        arr = new int[n];
        System.out.println("Enter numbers one by one : ");
        for (i = 0;i<n ; i++){
            arr[i] = scr.nextInt();
        }
        for (i = 0;i<n; i++){
            for (j=0 ;j<n-1; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Sorted array :\t");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }



    }
}

