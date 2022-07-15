package com.JavaDSA;
import java.util.Objects;
import java.util.Scanner;
public class SearchArr_String {
    Scanner sc = new Scanner(System.in);
    String city[] = new String[5];
    String c ;
    int count;
    void search(){
        System.out.println("Enter The City Name");
        for(int i = 0 ;i<city.length;i++){
            city[i] = sc.next();
        }
        System.out.println("Printed City are :");
        for(int i =0 ;i < city.length;i++){
            System.out.println(city[i]);
        }
        System.out.println("Enter The City to Find");
        c = sc.next();
        for(int i =0 ;i<city.length;i++){
            if(Objects.equals(city[i], c)){
                System.out.println("City Found In Book at index "+i);
                count++;
            }
        }
        if(count == 0){
            System.out.println("City not Found");
        }
    }
    public static void main(String[] args){
        SearchArr_String a = new SearchArr_String();
        a.search();
    }
}
