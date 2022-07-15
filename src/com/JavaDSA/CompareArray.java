package com.JavaDSA;
import java.util.Arrays;
import java.util.Scanner;
public class CompareArray {
   static int arr1[] = {10,20,30,40};
   static int arr2[] = {10,20,30,40};

    public static void main(String[] args) {
      // if(arr1 == arr2){   // It will not Work because it will compare with reference variable
           if(Arrays.equals(arr1,arr2)){
           System.out.println("The array is Same");
       }
       else{
           System.out.println("The Array is Not Same");
        }
    }
}
