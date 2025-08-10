package Ds.IPE;

public class CLL {
    class Node{
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }
    Node head=null;

    void insertFirst(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            n.next=head;
            return;
        }
        Node temp=head;
        while (temp.next!=head)
            temp=temp.next;
        n.next=head;
        temp.next=n;
        head=n;
    }

    void insertLast(int data) {
        Node n=new Node(data);
        if(head==null){
            head=n;
            n.next=head;
            return;
        }
        Node temp=head;
        while (temp.next!=head)
            temp=temp.next;
        n.next=head;
        temp.next=n;


    }

    void deleteFirst(){
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        if (head.next==head){
            head=null;
            return;
        }
        Node temp=head;
        while (temp.next!=head)
            temp=temp.next;
        temp.next=head.next;
        head=head.next;

    }

    void deleteLast(){
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        if (head.next==head){
            head=null;
            return;
        }
        Node temp=head;
        while (temp.next.next!=head)
            temp=temp.next;
        temp.next=head;

    }

    void insertBeforeValue(int value,int data){
        Node n=new Node(data);
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        if (head.data==value){
            Node temp=head;
            while (temp.next!=head)
                temp=temp.next;
            n.next=head;
            temp.next=n;
            head=n;
            return;
        }
        Node temp=head;
        boolean found=false;
        while (temp.next!=head){
            if(temp.next.data==value){
                found=true;
                break;
            }
            temp=temp.next;
        }
        if (found){
            n.next=temp.next;
            temp.next=n;
        }else {
            System.out.println("value not found");
        }

    }

    void insertAfterValue(int value,int data){
        Node n=new Node(data);
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        Node temp=head;
        boolean found=false;
        while (temp.next!=head){
            if(temp.data==value){
                found=true;
                break;
            }
            temp=temp.next;
        }
        if (temp.data==value){ // For the last node if it matches the value
            found=true;
        }

        if (found){
            n.next=temp.next;
            temp.next=n;
        }else {
            System.out.println("value not found");
        }

    }

    void deleteValue(int value){
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        if (head.data==value){
            if (head.next==head){ // Only one node
                head=null;
            } else {
                Node temp=head;
                while (temp.next!=head)
                    temp=temp.next;
                temp.next=head.next;
                head=head.next;
            }
            return;
        }
        Node temp=head;
        boolean found=false;
        while (temp.next!=head){
            if(temp.next.data==value){
                found=true;
                break;
            }
            temp=temp.next;
        }
        if (found){
            temp.next=temp.next.next;
        }else {
            System.out.println("value not found");
        }

    }

    void insertInOrder(int data){
        Node n=new Node(data);
        if (head==null){
            head=n;
            n.next=head;
            return;
        }
        if(head.data>data){
            Node temp=head;
            while (temp.next!=head)
                temp=temp.next;
            n.next=head;
            temp.next=n;
            head=n;
            return;
        }
        Node temp=head;
        while (temp.next!=head && temp.next.data<data){
            temp=temp.next;
        }
        n.next=temp.next;
        temp.next=n;
    }
}
