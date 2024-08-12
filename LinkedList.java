import java.util.*;
class DSA{
        
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public Node head;
    public void InsertFirst(int val){
           if(head==null){
            Node newNode=new Node(val);
            head=newNode;
            head.next=null;
           }
           else {
            Node newNode=new Node(val);
            newNode.next=head;
            head=newNode;
           }        
    }        

    public void traversal(){
        if(head==null) {
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
    public void InsertionEnd(int val){
        Node newNode=new Node(val);
        if(head==null) head=newNode;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=newNode;
    }
    public void InsertionAtKth(int val,int k){
        Node newNode=new Node(val);
        if(head==null) head=newNode;
        Node temp=head;
        for (int i=0; i<k; i++){
            if(temp!=null) temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void DeleteFromFront(int val){
         if(head==null) return;
         if(head.data==val){
             Node newNode=head;
             head=head.next;
         }
         Node temp=head;
         while(temp.next!=null){
             if(temp.next.data==val){
                 temp.next=temp.next.next;
             }
         }

    }
    public void DeleteFromEnd(int val){
        if(head==null) return;
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        Node newNode=temp;
        temp.next=null;
    }

}
    
    class LinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int val=sc.nextInt();
        DSA s=new DSA();
        s.InsertFirst(1);
        s.InsertFirst(2);
        s.InsertFirst(3);  
        s.traversal();
    }
}