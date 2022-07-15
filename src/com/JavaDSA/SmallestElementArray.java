package com.JavaDSA;
import java.util.Scanner;
public class SmallestElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int min;
        // For loop for take input in array
        System.out.println("Enter The Element in Array");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        // Logic for Finding Smallest Element in Array
        // a[] = {10 , 20 ,30 ,40 ,50}
        min = a[0]; // min = 10
        for(int i = 1;i<a.length;i++){
            if(a[i]<min){
                min =a[i];
            }
        }
        System.out.println("The Smallest Element in Array is "+min);
    }


}
