package com.JavaDSA;

public class in {
    void display(){
        System.out.println("This is A");
    }
}
class B extends in{
    void display(){
        System.out.println("This is B");
    }
}
class C extends B{
    public static void main(String[] args) {
        C c = new C();
        c.display();
    }
}
