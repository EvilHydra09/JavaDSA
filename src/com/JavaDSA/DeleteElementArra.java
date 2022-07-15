package com.JavaDSA;
import java.util.Scanner;
public class DeleteElementArra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size ,loc;
        System.out.println("Enter The Size of Array");
        size = sc.nextInt();
        int a[] = new int[size];
        // Input Element in Array
        for(int i = 0 ;i<a.length;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("Enter THe Location to Delete");
        loc = sc.nextInt();
        // Logic of Delete Element in Array
        for(int i = loc;i<size-1;i++){
            a[i] = a[i+1];
        }
//        size --;
        // Printing array
        for(int i = 0;i<size;i++){
            System.out.print(a[i]+" ");
        }

    }
}
