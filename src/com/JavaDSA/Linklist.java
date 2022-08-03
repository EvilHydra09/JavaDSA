package com.JavaDSA;

public class Linklist{
    Node head;
    int size;

    public void insertAtFirst(int val){
        Node newnode = new Node();
        newnode.setData(val);
        newnode.setNext(head);
        head = newnode;
        size++;
    }

    public void insertAtLast(int val){
        Node newnode, lastnode;
        newnode = new Node();
        newnode.setData(val);
        lastnode = head;
        if(lastnode==null){
            head = newnode;
        }
        else {
            while (lastnode.getNext()!=null){
                lastnode = lastnode.getNext();
            }
            lastnode.setNext(newnode);
            size++;
        }
    }
    public void insertAtPosi(int val,int pos){
        if(pos == 1)
            insertAtFirst(val);
        else if(pos ==size+1){
            insertAtLast(val);
        }
        else if(pos>1&&pos<=size){
            Node newnode,dummy;
            newnode = new Node(val,null);
            dummy = head;
            for (int i = 1;i<pos-1;i++){
                dummy = dummy.getNext();
            }
            newnode.setNext(dummy.getNext());
            dummy.setNext(newnode);
            size++;

        }
        else {
            System.out.println("Invaild Position "+pos);
        }
    }
    public void deleteAtFirstt(){
        if(isEmpty())
            System.out.println("The List is Empty .We Can't Delete");
        else {
            head = head.next;
        }
    }
    public void deleteAtLast(){
        Node dummy;
        dummy = head;
        if(isEmpty())
            System.out.println("The List is Empty .We Can't Delete");
        else if(size == 1){
            head = null;
            size--;
        }
        else{
            for(int i =1;i<size-1;i++){
                dummy = dummy.getNext();
            }
            dummy.setNext(null);
            size--;
        }
    }
    public void deleteAtPos(int pos){
        if(isEmpty())
            System.out.println("The List is Empty. We Can't Delete Node");
        else if(pos<1||pos>size)
            System.out.println("Invalid Position");
        else if(pos==1)
            deleteAtFirstt();
        else if (pos == size) {
            deleteAtLast();
        }
        else {
            Node dummy,delnode;
            dummy = head;
            for(int i =1;i<pos-1;i++){
                dummy = dummy.getNext();
            }
            delnode = dummy.getNext();
            dummy.setNext(delnode.getNext());
            size--;
        }


    }

    public Boolean isEmpty(){
        if(head==null){
            return true;
        }else {
            return false;
        }
    }
    public void getListSize() {
        System.out.println(size);
    }

    public void viewList(){
        Node t;
        if(isEmpty())
            System.out.println("The Linked List is Empty");
        else {
            t = head;

            for (int i = 1;i<=size;i++){
                System.out.print(t.getData()+"--->");
                t = t.getNext();
            }
            System.out.print("null");
        }
    }
    public void count(){
        int count = 0;
        Node ptr;
        ptr = head;
        while(ptr!=null){
            ptr = ptr.getNext();
            count++;
        }
        System.out.println("The Size of Linked List is"+count);
    }

    class Node{
        private int data;
        private Node next;
        Node(){
            data = 0;
            next = null;
        }
        Node(int d,Node n){
            data = d;
            next = n;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
}



}