package Ds.IPE;

public class SLL {
    Node head = null;

    static void main(String[] args) {
        SLL sll = new SLL();
        sll.insertInOrder(10);
        sll.insertInOrder(1);
        sll.insertInOrder(20);
        sll.insertInOrder(12);
        sll.insertInOrder(2);
        sll.display();
    }

    void insertFirst(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            return;
        }
        n.next = head;
        head = n;
    }

    void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }

    void insertLast(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
    }

    void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;
        temp.next = null;
    }

    void insertBeforeValue(int value, int data) {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (head.data == value) {
            Node n = new Node(data);
            n.next = head;
            head = n;
            return;
        }
        Node temp = head;
        boolean found = false;
        while (temp.next != null) {
            if (temp.next.data == value) {
                found = true;
                break;
            }
            temp = temp.next;
        }
        if (found) {
            Node n = new Node(data);
            n.next = temp.next;
            temp.next = n;
        }
    }

    void insertAfterValue(int value, int data) {
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
            Node n = new Node(data);
            n.next = temp.next;
            temp.next = n;
        }
    }

    void deleteValue(int value) {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (head.data == value) {
            head = head.next;
            return;
        }
        Node temp = head;
        boolean found = false;
        while (temp.next != null) {
            if (temp.next.data == value) {
                found = true;
                break;
            }
            temp = temp.next;
        }
        if (found) {
            temp.next = temp.next.next;
        }
    }

    void insertInOrder(int data) {
        Node n=new Node(data);
        if (head==null){
            head=n;
            return;
        }
        if(head.data>data){
            n.next=head;
            head=n;
            return;
        }
        Node temp=head;
        while (temp.next!=null && temp.next.data<data){
            temp=temp.next;
        }
        n.next=temp.next;
        temp.next=n;
    }

    void deleteDuplicate(SLL sll) {
        if (head == null || head.next == null) {
            return; // No duplicates if list is empty or has only one element
        }

        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    void deleteOddNode() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        head = head.next; // Delete the 1st node

        Node current = head;
        int position = 1;
        while (current != null && current.next != null) {
            if (position % 2 != 0) { // If the next node is at an odd position
                current.next = current.next.next; // Delete the next node
            } else {
                current = current.next; // Move to the next node
            }
            position++;
        }
    }

        void deleteEvenValues() {
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        while (head!=null && head.data%2==0){
            head=head.next;
        }
        Node temp=head;
        while (temp!=null&&temp.next!=null){
            if(temp.next.data%2==0)
                temp.next=temp.next.next;
            else
                temp=temp.next;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println();
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
