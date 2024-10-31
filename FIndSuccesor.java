import java.util.*;
public class FIndSuccesor {
    public static void main(String[] args) {
        
    }
    
    public class TreeNode {
        
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

       TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
     }
    }
    public TreeNode findSuccessor(TreeNode root,int key){
        if(root == null)
        return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            TreeNode currNode = queue.poll();
            if(currNode.left != null){
                 queue.offer(currNode.left);
                      
            }
            if(currNode.right != null){
                queue.offer(currNode.right);
            }
            if(currNode.val == key){
                break;
            }
        }
        return queue.peek();
    }
}
