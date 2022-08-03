package com.JavaDSA;


    import java.io.*;
import java.util.*;

    public class Solution {
        static void sumdigitfac(int n){
            int fac = 1;
            for(int i = n;i>0;i--){
                fac = fac * i;
            }
            int sum = 0,rem=0;
            while(fac>0){
                rem = fac%10;
                sum = sum + rem;
                fac = fac/10;
            }
            System.out.println(sum);
        }
        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
            Solution.sumdigitfac(3);
        }
    }


