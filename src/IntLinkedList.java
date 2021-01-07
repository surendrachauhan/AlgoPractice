/**
 * Created by surviz on 2019/03/10.
 */
public class IntLinkedList {
    private Node head;

    public IntLinkedList(int item){
        head = new Node();
        head.value = item;
        head.link = null;

    }

    public boolean insertItem(int item){
        Node n = new Node();
        n.value = item;
        n.link = head;
        head = n;
        return true;
    }

    public void printList(){
        Node z = head;
        while (z!=null){
            System.out.println(z.value);
            z = z.link;
        }
    }

    class Node{
        private int value;
        private Node link;
    }
}
