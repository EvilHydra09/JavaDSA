package com.JavaDSA;
import java.util.Scanner;
public class ArrayCopy {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        System.out.println("Enter Five Element");
        for(int i = 0 ;i<a.length;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("Print Original Array");
        for(int i = 0;i<a.length ;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
        System.out.println("Printing Duplicate Array");
        for(int i = 0; i<a.length;i++){
            b[i]=a[i];
            System.out.print(b[i]+" ");
        }

    }

}
