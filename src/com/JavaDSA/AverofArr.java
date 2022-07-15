package com.JavaDSA;
import java.util.Scanner;
public class AverofArr {
    Scanner sc = new Scanner(System.in);

    int n , sum , aver;
    {
        System.out.println("Enter The Size of Array");
        n = sc.nextInt();
    }
    int arr[] = new int[n];
    void average(){

        System.out.println("Enter The Element in Array");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Printed Array is ");
        for(int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int i = 0;i<arr.length;i++){
            sum += arr[i]; // sum = sum + arr[i]
        }
        System.out.println("The Sum of Array is "+ sum);
        aver = sum/arr.length;
        System.out.println("The Average of Array is "+aver);
    }

    public static void main(String[] args) {
        AverofArr a = new AverofArr();
        a.average();
    }
}
