public class BinaryTreeSumTree {
    
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
