import java.util.LinkedList;

public class ReverseLinkedList {
    static Node head;

    static class Node{
        int data ;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }

 Node reverseNode(Node node){
        Node current=node;
        Node previous=null;
        Node next=null;

        while (current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        node=previous;
        return node;
 }

   public void printNodeList(Node node){
        while (node!=null){
            System.out.println(node.data+" ");
            node = node.next;
        }
   }

    public static void main(String [] args){
        ReverseLinkedList obj = new ReverseLinkedList();
        obj.head = new Node(5);
//        obj.head.next = new Node(40);
//        obj.head.next.next = new Node(30);
//        obj.head.next.next.next = new Node(20);
//        obj.head.next.next.next.next = new Node(10);

        System.out.println("Given node :::");
        obj.printNodeList(head);
        head=obj.reverseNode(head);
        System.out.println("Reverse node :::");
        obj.printNodeList(head);

    }
}
