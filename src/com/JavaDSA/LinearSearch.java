package com.JavaDSA;
import java.util.Scanner;
public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = {10,20,30,40,50};
        int i;
        System.out.println("Enter the Key");
        int key = sc.nextInt();
        for(i=0;i<A.length;i++){
            if(A[i] == key){
                System.out.println("Item found at "+i);
            }
        }
        if(key != A[i]){
            System.out.println("Key not found");
        }


    }
}
