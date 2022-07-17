package com.JavaDSA;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        // Dynamic Array in Compile Time
        int[] a ={ 10,20,30,40,50};
//        System.out.println(a[4]);

        // static Array
        int b[] = new int [5];
        b[0]=10;
        b[1]=20;
        b[2]=30;
        b[3]=40;
        b[4]=50;
        // Printing Array
        for(int i = 0;i<5;i++){
//            System.out.println(a[i]);
        }

        // Creating a Dynamic Array
        int size , i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of Array ");
        size = sc.nextInt();

        int c[] = new int[size];
        System.out.println("Enter The Element of Array");
        for(i=0;i<size;i++){  // For Inputting the element in Array
            c[i] = sc.nextInt();
        }
        System.out.println("Printing Array Element");
        for(i = 0;i<size ;i++){
            System.out.println(c[i]);
            System.out.println("THE END");
        }
        System.out.println("This Is Made By Durgesh");

    }


}
