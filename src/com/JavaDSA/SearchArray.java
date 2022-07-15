package com.JavaDSA;
import java.util.Scanner;
public class SearchArray {
    Scanner sc = new Scanner(System.in);
    int n, count;
    int arr[] = new int[5];

    void search() {
        System.out.println("Enter THe in Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the Element to search");
        n = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("Item Found at " + i + " location");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Item not Found");
        }
    }
        public static void main(String[] args){
            SearchArray a = new SearchArray();
            a.search();
        }
    }

