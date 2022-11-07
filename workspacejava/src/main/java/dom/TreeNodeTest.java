package dom;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNodeTest {
    public static int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int depth = 0;
        queue.offer(root);
        while(!queue.isEmpty()){
            for(int i=0;i<queue.size();i++){
                TreeNode nodes = queue.poll();
                if(nodes.left!=null){
                    queue.offer(nodes.left);
                }
                if(nodes.right!=null){
                    queue.offer(nodes.right);
                }
            }
            depth++;
        }
        return depth;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode();
        node.val = 1;

        node.left = new TreeNode();
        node.left.val = 2;
        node.right = new TreeNode();
        node.right.val = 3;
        node.left.left = new TreeNode();
        node.left.left.val = 4;

        System.out.println(maxDepth(node));
    }
}
