/**
 * Created by surviz on 2020/02/26.
 */

 class Node{
    int data;
    Node left, right    ;
    Node(int item){
        data=item;
        left = right = null;
    }


}
public class MaxDepthOfNode {
    Node root;

    int maxDepth(Node node){
        if(node==null){
            return 0;
        }
        else{
            int leftDepth= maxDepth(node.left);
            int rightDepth=maxDepth(node.right);

            if(leftDepth>rightDepth)
                return (leftDepth+1);
            else
                return (rightDepth+1);
        }
    }

    public static void main(String [] args){
        MaxDepthOfNode maxDepthOfNode=new MaxDepthOfNode();
        maxDepthOfNode.root = new Node(1);
        maxDepthOfNode.root.left = new Node(2);
        maxDepthOfNode.root.right = new Node(3);
        maxDepthOfNode.root.left.left= new Node(4);
        maxDepthOfNode.root.left.right = new Node(5);
        maxDepthOfNode.root.left.right.right = new Node(11);
        maxDepthOfNode.root.left.right.right.left = new Node(10);


        System.out.println("Maximum height of tree is "+maxDepthOfNode.maxDepth(maxDepthOfNode.root));
    }

}
