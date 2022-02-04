import javax.swing.tree.TreeNode;

class Node{
    int data;
    Node left;
    Node right;
    Node(int item){
        left = right = null;
    }
}
public class ConstructBinaryTree {
    
    public static void main(String[] args) {
        
    }
}
class ConstructBinaryTreeSol {
    String s="";
    int c=0;
    TreeNode r=null;
    public String tree2str(TreeNode root){
        if(root!=null)
        {
            s=s+root.val;
            r=root;
        }
        tree(root);
        return s;
    }
   void tree(TreeNode root)
    {
       if(root.left==null && root.right!=null)
           s=s+'('+')';
        if(root.left!=null)
        {
            s=s+'('+root.left.val;
            tree(root.left);
        }
        if(root.right!=null)
        {
            s=s+'('+root.right.val;
            tree(root.right);
        }
       if(root!=r)
        s=s+')';
    }
   }
}
