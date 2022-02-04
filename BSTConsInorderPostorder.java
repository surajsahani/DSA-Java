import java.util.*;
public class BSTConsInorderPostorder {
    
}
class BSTConsInorderPostorderSol {
    int postIndex;
    HashMap<Integer, Integer> inorderMap;
    public TreeNode buildTree(int[] inorder, int[] postorder){
        inorderMap = new HashMap<>();
        postIndex = postorder.length-1;
        for(int i=0; i<inorder.length; i++)
        inorderMap.put(inorder[i],i);
        return createTree(postorder,0,postorder.length-1);
    }
    public TreeNode createTree(int[] postorder, int left,int right)
    {
        if(left>right)
        return null;
        int val=postorder[postIndex--];
        TreeNode root = new TreeNode(val);
        root.right = createTree(postorder,inorderMap.get(val)+1, right);
        root.left = createTree(postorder, left, inorderMap.get(val)-1);
        return root;
    }
}