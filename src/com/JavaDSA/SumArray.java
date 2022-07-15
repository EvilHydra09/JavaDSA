package com.JavaDSA;
import java.util.Scanner;
public class SumArray {
    Scanner sc  = new Scanner(System.in);
    int arr[] = new int[5];
    int sum =0;
    void insert(){
        System.out.println("Enter the Element");
        for(int i = 0 ;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
    }
    void print(){
        System.out.println("The Printed Array is :");
        for(int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The Sum of Array is");
        for(int i = 0;i<arr.length;i++){
            sum = arr[i]+ sum;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        SumArray a = new SumArray();
        a.insert();
        a.print();
    }
}
