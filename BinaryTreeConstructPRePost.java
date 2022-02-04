import java.util.Arrays;

class Node{
    int data;
    Node left;
    Node right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
public class BinaryTreeConstructPRePost {
    public static void main(String[] args) {
        
    }
}
class  BinaryTreeConstructPRePostSol {

    public Node buildTree(int[] preorder, int[] inorder){
        int n = preorder.length;
        if(preorder==null || preorder.length==0)
        return null;

        Node root = new Node(preorder[0]);

        int leftCnt = getLeftCnt(preorder[0], inorder);
        root.left = leftCnt == 0?null:buildTree(Arrays.copyOfRange(preorder, 1+leftCnt), 
        Arrays.copyOfRange(inorder,0, leftCnt));
        
        root.right = buildTree(Arrays.copyOfRange(preorder,1+leftCnt, n), 
        Arrays.copyOfRange(inorder, leftCnt+1, n));

        return root;
    }

    public int getLeftCnt(int root, int[] inorder){
        for(int i=0; i<inorder.length; i++){
            if(inorder[i]==root)
            return i;
        }
        return 0;
    }
}
