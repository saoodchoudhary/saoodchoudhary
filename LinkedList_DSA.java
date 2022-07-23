package com.company;

public class LLPractice {
    public Node head;
    public int size=0;
    //Create Node..............
    class Node{
        int data;
        Node next;
            public Node(int data){
                this.data = data;
                this.next =null;
            }
    }
//begning insertNode
    public void insertFirst(int data){
        Node newNode = new Node(data);
        size++;
        if (head==null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
//Last inserted..
    public void insertLast(int data){
        Node newNode = new Node(data);
        Node currentNode = head;
        size++;
        if (head==null){
            head = newNode;
            return;
        }
        while(currentNode.next !=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
        newNode.next=null;
    }
    //insertofindex
    public void insertOfIndex(int Ind, int data){
        Node newNode = new Node(data);
        int n=1;
         size++;
        if (head==null||Ind ==0){
            newNode.next=head;
            head=newNode;
            return;
        }else if(Ind>size){
            System.out.println("total index of LinkedList is = "+size+" --and your index is = "+Ind+" So it is not inserted");
            return;
        }
       
        Node currentNode = head;
        Node ultraNextNode= head.next;
       
        while(n!=Ind){
            currentNode=currentNode.next;
            ultraNextNode=ultraNextNode.next;
            n++;
        }


        currentNode.next = newNode;
        newNode.next=ultraNextNode;
    }
 //remove fist node-----------
    public void firstRemove(){
        if(head==null){
            System.out.println("LinkedList is null");
            return;
        }
        size--;
        head= head.next;
    }
//remove last node----------------
    public void lastRemove(){
        if (head==null){
            System.out.println("LinkedList is Empty");
            return;
        }else if (head.next==null){
            size--;

            head=null;
            System.out.println("removed node");
            return;
        }
        size--;
        Node lastNode= head.next;
        Node secondLastNode = head;

        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLastNode=secondLastNode.next;
        }
        secondLastNode.next=null;
    }
//remove indexof Node-------------------------
    public void removeOfIndex(int Ind){
        if (head==null){
            System.out.println("LinkedList is Empty");
            return;
        }
        else if(Ind>size){
            System.out.println("total index of LinkedList is = "+size+" --and your index is = "+Ind+" So it is not deleted");
            return;
        }
        size--;
        Node currentNode = head;
        Node futureNode= head.next;
        int n=1;
        while(n!=Ind){
            currentNode = currentNode.next;
            futureNode= futureNode.next;
            n++;
        }
        currentNode.next=futureNode.next;

    }
//print Linked List-----------    
    public void printlist(){
        if (head==null){
            return;
        }
        Node currentNode = head;
        while(currentNode!=null){
            System.out.print(currentNode.data+" -> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
        System.out.println(" Total size = "+ size);
    }
    public static void main(String[] args) {

        LLPractice l = new LLPractice();
        l.insertFirst(45);
        l.insertFirst(4587);
        l.insertFirst(888);
        l.insertLast(980);
        l.insertOfIndex(4,1000);
        l.printlist();
        l.removeOfIndex(2);
//        l.firstRemove();
//        l.lastRemove();
        System.out.println("------------------------------------------------");
        l.printlist();


    }
}
