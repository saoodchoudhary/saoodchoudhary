package com.company;

public class testing {
    int size =1;
     Node head;
   static class Node{
        String data;
        Node next;
            Node(String data)
            {
                this.data =data;
                this.next=null;
            }
    }
    public void insertFirst(String data){
        Node createNode = new Node(data);
        if (head == null){
            head = createNode;
            return;
        }

        createNode.next=head;
        head=createNode;
        size++;
    }
    public void insertIndex(int Ind, String data){
       Node createNode = new Node(data);
       Node currentNode= head;int i=1;
       while(i++!=Ind){
           currentNode=currentNode.next;
       }
       createNode.next=currentNode.next;
       currentNode.next=createNode;
       size++;


    }
    public void insertLast(String data){
       Node createNode = new Node(data);
       Node secondLast = head;
       Node currentNode= head;
       while(currentNode.next != null){
          currentNode = currentNode.next;
       }
       currentNode.next = createNode;
       createNode.next=null;
       size++;
    }
    public void firstRemove(){
        if (head== null) {
            System.out.println("Node is Empty");
            return;
        }
        head=head.next;
        size--;
    }
    public void lastRemove(){
        if (head== null) {
            System.out.println("Node is Empty");
            return;
        }
        if (head.next==null)
        {
            System.out.println("don't deleted.. it's first node.");
            return;
        }
        Node lastNode =head.next;
        Node currentNode =head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            currentNode=currentNode.next;
        }
        currentNode.next=null;
        size--;

    }
    public void printLL(){
       if (head==null){
           System.out.println("node is empty................");
           return;
       }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data+ " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
   }
   public void printSize(){
       System.out.println(size);
   }
    public static void main(String[] args) {
        testing t = new testing();
        t.insertFirst("saood");
        t.insertFirst("ood");
        t.insertFirst("ahmad");
        t.insertLast("B.C.A.");
        t.insertIndex(4,"choudhary");

        t.printLL();
        t.lastRemove();
        t.printLL();
        t.printSize();

    }
}
