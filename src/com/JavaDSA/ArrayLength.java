package com.JavaDSA;
import java.util.Scanner;
public class ArrayLength {
    public static void main(String[] args) {
        System.out.println("Enter The Size of Array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[]= new int [size];

        // Inserting Element in Array
        System.out.println("Enter The Element");
        for(int i = 0; i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("The Length of Array is ");
        System.out.println(a.length);
        for(int i = 0 ; i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
