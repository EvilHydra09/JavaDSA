package com.JavaDSA;
import java.util.Scanner;
public class InsertArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size , loc, item;
        System.out.println("Enter The Size of Array");
        size = sc.nextInt();
        int a[] = new int[size+1];
        // insert element in array
        System.out.println("Enter The Element in Array");
        for (int i = 0;i<size;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter The Location");
        loc = sc.nextInt();
        System.out.println("Enter The Item");
        item = sc.nextInt();

        // Logic For Inserting Element in Middle
        for(int i = size; i>loc ;i--){
            a[i] = a[i - 1];
        }
        a[loc] = item;
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
