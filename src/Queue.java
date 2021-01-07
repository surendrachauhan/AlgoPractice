/**
 * Created by surviz on 2019/07/29.
 */
public final class Queue <T> {

    int queue [];
    int size ;
    int front ;
    int rear;


    public  Queue( int size){
         queue = new int[size];
    }

    public void enQueue(int data) {
        if(!isFull())
        {
            queue[rear] = data;
            rear = (rear+1) %queue.length;
            size = size +1;
        }
        else
            System.out.println("Queue is Full");
    }

    public int dequeue(){
        int data = queue[front];
        if(!isEmpty()) {
            front = (front + 1) % queue.length;
            size = size - 1;
        }
        else
            System.out.println("Queue is Empty");

        return data;
    }

    public void show(){
        System.out.println("Queue is : ");

        for(int i=0;i<size; i++){
            System.out.print(queue[(front+i)%queue.length]+ " ");
        }

    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public boolean isFull(){

        return size == queue.length;
    }



}
