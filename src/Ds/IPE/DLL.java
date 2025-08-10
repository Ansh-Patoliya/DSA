package Ds.IPE;

public class DLL {
    class Node{
        Node next;
        Node prev;
        int data;

        public Node(int data) {
            this.data = data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head=null;

    void insertFirst(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            return;
        }
        head.prev=n;
        n.next=head;
        head=n;
    }

    void insertLast(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            return;
        }
        Node temp=head;
        while (temp.next!=null)
            temp=temp.next;
        n.prev=temp;
        temp.next=n;
    }

    void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;
        if(head!=null)
            head.prev=null;
    }

    void deleteLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while (temp.next!=null)
            temp=temp.next;
        if(temp.prev!=null)
            temp.prev.next=null;
    }

    void insertBeforeValue(int value,int data){
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        Node temp=head;
        boolean found=false;
        while (temp!=null){
            if(temp.data==value){
                found=true;
                break;

            }
            temp=temp.next;
        }
        if (found){
            Node n=new Node(data);
            n.prev=temp.prev;
            if (temp.prev!=null) {
                n.next=temp.prev.next;
                temp.prev.next = n;
            }
            else {
                n.next=head;
                head = n;
            }
            temp.prev=n;

        }
    }

    void insertAfterValue(int value,int data){
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        Node temp=head;
        boolean found=false;
        while (temp!=null){
            if(temp.data==value){
                found=true;
                break;

            }
            temp=temp.next;
        }
        if (found){
            Node n=new Node(data);
            n.next=temp.next;
            n.prev=temp;
            if (temp.next!=null)
                temp.next.prev=n;
            temp.next=n;
        }
    }

    void deleteValue(int value) {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.data == value) {
                found = true;
                break;

            }
            temp = temp.next;
        }
        if (found) {
            if (temp.prev != null)
                temp.prev.next = temp.next;
            else
                head = temp.next;
            if (temp.next != null)
                temp.next.prev = temp.prev;
        }
    }

    void insertInOrder(int data) {

        Node n = new Node(data);
        if (head == null) {
            head = n;
            return;
        }
        if (head.data > data) {
            n.next = head;
            head.prev = n;
            head = n;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data < data) {
            temp = temp.next;
        }
        n.next = temp.next;
        n.prev = temp;
        if (temp.next != null) {
            temp.next.prev = n;
        }
        temp.next = n;
    }

    void display(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println();
    }

    static void main(String[] args) {
        DLL dll=new DLL();
        dll.insertFirst(1);
        dll.display();
        dll.deleteLast();
        dll.display();
        dll.insertFirst(2);
        dll.insertFirst(3);
        dll.display();
        dll.deleteFirst();
        dll.display();
        dll.deleteFirst();
        dll.display();
        dll.insertLast(2);
        dll.insertLast(3);
        dll.display();
        dll.insertFirst(0);
        dll.deleteLast();
        dll.insertLast(4);
        dll.display();
//        dll.insertAfterValue(0,1);
//        dll.insertAfterValue(2,3);
//        dll.insertAfterValue(4,5);
        dll.insertBeforeValue(4,3);
        dll.insertBeforeValue(2,1);
        dll.insertBeforeValue(0,-1);
        dll.display();
    }
}
