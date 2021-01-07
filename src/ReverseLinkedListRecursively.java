import java.util.LinkedList;

public class ReverseLinkedListRecursively {
static Node head;
    public static class Node{
        Node next;
        int data;

        Node(int d){
            data=d;
            next=null;
        }
    }

    Node reverseUtil(Node current, Node previous){
        //if last node mark its head
        if(current.next==null){
            head=current;
            //update next node to previous node
            current.next=previous;
            return head;
        }

        //Save current next node for recursive call
        Node next1=current.next;

        //and update next
        current.next=previous;

        reverseUtil(next1,current);
        return head;

    }

    void printNode(Node node){
        //till node is not null
        while (node!=null){
            System.out.println("Node ::"+node.data);
            //move to next node
            node=node.next;
        }
    }

    public static void main(String[] args){
        ReverseLinkedListRecursively revObj=new ReverseLinkedListRecursively();
        revObj.head= new Node(40);
        revObj.head.next=new Node(60);
        revObj.head.next.next=new Node(10);
        revObj.printNode(head);
        revObj.reverseUtil(head,null);
        revObj.printNode(head);
    }


}
