package Ds.IPE;

public class SimpleQueue
{
    int rear,front,size;
    int a[];

    public SimpleQueue(int size) {
        this.size = size;
        a=new int[size];
        rear=-1;
        front=-1;
    }

    void enqueue(int data){
        if(rear==size-1){
            System.out.println("overflow");
            return;
        }
        if(front==-1){
            front=0;
        }
        rear++;
        a[rear]=data;
    }

    void dequeue(){
        if(front==-1){
            System.out.println("underflow");
            return;
        }
        int temp=a[front];
        if(front==rear){
            front=-1;
            rear=-1;
        }
        else{
            front++;
        }
        System.out.println("data deleted = "+temp);
    }

    void display(){
        if (front==-1){
            System.out.println("underflow");
            return;
        }
        for (int i=front;i<=rear;i++){
            System.out.print(a[i]+"-->");
        }
    }

    static void main(String[] args) {
        SimpleQueue simpleQueue=new SimpleQueue(3);
        simpleQueue.enqueue(1);
        simpleQueue.enqueue(2);
        simpleQueue.enqueue(3);
        simpleQueue.display();
        simpleQueue.dequeue();
        simpleQueue.display();
        simpleQueue.dequeue();
        simpleQueue.display();
    }
}
