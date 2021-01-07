/**
 * Created by surviz on 2020/02/26.
 */

class TreeNode{
    int data;
    TreeNode left, right;
    TreeNode(int item){
        data=item;
        left = right =null;
    }
}
public class MinimumDeptTree {
    TreeNode node;

    int minDepth(){
        return minimumDepth(node, 0);
    }

    int minimumDepth(TreeNode node, int level){
        if(node == null)
            return level;
        level++;

        return Math.min(minimumDepth(node.left, level), minimumDepth( node.right, level));
    }

    public static void main(String [] args){
        MinimumDeptTree minimumDeptTree = new MinimumDeptTree();
        minimumDeptTree.node = new TreeNode(1);
        minimumDeptTree.node.left = new TreeNode(2);
        minimumDeptTree.node.left.right = new TreeNode(3);
        minimumDeptTree.node.left.left= new TreeNode(4);

        System.out.println("minimum depth of tree is :: "+minimumDeptTree.minDepth());
    }
}
