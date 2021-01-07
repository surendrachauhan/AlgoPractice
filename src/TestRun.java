/**
 * Created by surviz on 2019/07/29.
 */
public class TestRun {
    public static void main(String[] args){
        Queue q = new Queue(5);
        q.enQueue(5);
        q.enQueue(2);
        q.enQueue(7);
        q.enQueue(9);
        q.dequeue();

       q.show();
    }
}
