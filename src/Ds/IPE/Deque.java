package Ds.IPE;

public class Deque {
    int rear, front, size;
    int[] a;

    public Deque(int size) {
        this.size = size;
        a = new int[size];
        rear = -1;
        front = -1;
    }

    void insertAtFront(int data) {
        if (front == (rear + 1) % size) {
            System.out.println("overflow");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = size - 1;
        } else {
            front -= 1;
        }
        a[front] = data;
    }

    void insertAtRear(int data) {
        if (front == (rear + 1) % size) {
            System.out.println("overflow");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;
        a[rear] = data;
    }

    void deleteAtFront() {
        if (front == -1) {
            System.out.println("underflow");
            return;
        }
        int temp = a[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
        System.out.println("data deleted = " + temp);
    }

    void deleteAtRear() {
        if (front == -1) {
            System.out.println("underflow");
            return;
        }
        int temp = a[rear];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            rear = size - 1;
        } else {
            rear -= 1;
        }
        System.out.println("data deleted = " + temp);
    }

    void display() {
        if (front == -1) {
            System.out.println("underflow");
            return;
        }
        for (int i = front; i != rear; i = (i + 1) % size) {
            System.out.print(a[i] + "-->");
        }
        System.out.println(a[rear]);
    }


}
