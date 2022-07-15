               //   toString() asList() deepToString()  //
package com.JavaDSA;
import java.util.*;
public class ArraytoString {
    public static void main(String[] args) {
        String a[]={"Learn","Coding","Keypoints","Education"};
        System.out.println("toString() "+Arrays.toString(a));     //
        System.out.println("Aslist "+Arrays.asList(a));
        int arr[][]={{10,20},{30,40}};
        System.out.println("DeepToString() "+Arrays.deepToString(arr));
    }
}
