package com.JavaDSA;
import java.util.Scanner;
public class DescendArray {
    int size,temp;
    Scanner sc = new Scanner(System.in);
    {
        System.out.println("Enter The Size of Array");
        size = sc.nextInt();
    }
    int arr[] = new int[size];
    void descending(){
        System.out.println("Enter The Array Element");
        for(int i= 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Printed Array is");
        for(int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Descending Array");
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Descending Array is");
        for(int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        DescendArray a = new DescendArray();
        a.descending();
    }
}
