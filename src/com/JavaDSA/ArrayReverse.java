package com.JavaDSA;
import java.util.Scanner;
public class ArrayReverse {
    Scanner sc = new Scanner(System.in);
    int size;
    {
        System.out.println("Enter The number of Element");
        size = sc.nextInt();
    }
    int arr[] = new int[size];
    void insert(){
        System.out.println("Enter Element");
        for(int i =0 ;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
    }
    void reverse(){
        System.out.println("Reversed Array is ");
        for(int i = arr.length - 1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        ArrayReverse a = new ArrayReverse();
        a.insert();
        a.reverse();
    }





}
