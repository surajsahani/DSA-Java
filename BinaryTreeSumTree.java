class Node{
    int data;
    Node left;
    Node right;
    Node(int item){
        left = right = null;
    }
}
public class BinaryTreeSumTree {

    public static Node root;

    static int sum(Node node)
    {
        if(node == null)
        {
            return 0;
        }
        return (sum(node.left) + node.data+sum(node.right));
    }
    static int isSumTree(Node node)
    {
        int ls, rs;
        if(node == null || (node.left == null && node.right ==null))
        {
            return 1;
        }

        ls = sum(node.left);
        rs = sum(node.right);

        if((node.data  == ls + rs) && isSumTree(node.left) !=0 && isSumTree(node.right) !=0)
        {
            return 1;
        }
        return 0;
    }

    public void toSumTree(Node root){
        //add code here.\
        int x = summer(root);
   }
   public int summer(Node root){
       if(root == null)
       return 0;
       int lastVal = root.data;
       root.data = summer(root.left)+ summer(root.right);
       return lastVal + root.data;
   }
}
