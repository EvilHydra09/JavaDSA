package com.JavaDSA;
import java.util.*;
public class BiggestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int max;
        System.out.println("Enter The Element in Array");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        // Logic for Printing Biggest Element
        max = a[0];
        for(int i = 1;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("The Biggest Element in array is "+max);
    }
}
