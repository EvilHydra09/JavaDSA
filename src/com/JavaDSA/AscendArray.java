package com.JavaDSA;
import java.util.Scanner;
public class AscendArray {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];
    int temp;
    void ascending(){
        System.out.println("Enter The Element in Array");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Unsorted Array:");
        for(int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        // code for Sorting
        for(int i =0 ;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("The Sorted Array is:");
        for(int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        AscendArray a = new AscendArray();
        a.ascending();
    }
}
