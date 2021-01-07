public class ReverseNodeTest {
    static Node head;
    static class Node{
        int data;
        Node next;


        Node(int d){
            data=d;
            next=null;
        }

    }

    Node reverseNode(Node node){
        Node current=node;
        Node next=null;
        Node previous=null;

        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        node=previous;
        return node;
    }

    void printNode(Node node){

        while (node!=null){
            System.out.println("Node::"+node.data);
            node=node.next;
        }
    }

    public static void main(String[] args){
        ReverseNodeTest r = new ReverseNodeTest();
        r.head=new Node(40);
        r.head.next=new Node(50);
        r.printNode(head);
        System.out.println("After Reverse:::");
        head=r.reverseNode(head);
        r.printNode(head);
    }


}
