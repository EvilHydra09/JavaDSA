package com.JavaDSA;

public class Linklist {
    Node head;
    public class Node{
        String data;
        Node next ;

        Node(String data){
            this.data = data;
            this.next = null;
        }
        }
        public void addfirst(String data){
        Node newnode = new Node(data);
        if(head == null){
            newnode.next = head;
            head = newnode;
        }
        }
    public static void main(String[] args) {
    }
}
