package com.JavaDSA;
import java.util.Scanner;
public class LLmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linklist a = new Linklist();
        boolean flag = true;
        int pos,val;



        while (flag){
            System.out.println();
            System.out.println("_________________Welcome To The Program of Linked List____________________");
            System.out.println("1.Enter The Element In The First");
            System.out.println("2.Enter The Element In the Last");
            System.out.println("3.Enter The Element in the Position");
            System.out.println("4.Delete The Element In the First");
            System.out.println("5.Delete The Element In the Last");
            System.out.println("6.Delete The Element In the position");
            System.out.println("7.View List");
            System.out.println("8.Exit");
            System.out.println("9.count List");
            System.out.println("Enter Your Choice");

            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    val = sc.nextInt();
                    a.insertAtFirst(val);
                }
                case 2 -> {
                    val = sc.nextInt();
                    a.insertAtLast(val);
                }
                case 3 -> {
                    System.out.println("Enter The Position");
                    pos = sc.nextInt();
                    System.out.println("Enter The Value");
                    val = sc.nextInt();
                    a.insertAtPosi(val, pos);
                }
                case 4 -> a.deleteAtFirstt();
                case 5 -> a.deleteAtLast();
                case 6 -> {
                    System.out.println("Enter The Position");
                    pos = sc.nextInt();
                    a.deleteAtPos(pos);
                }
                case 7 -> a.viewList();
                case 8 -> flag = false;
                case 9 -> a.count();
                default -> System.out.println("Invalid Choice ");
            }
        }
    }
}
