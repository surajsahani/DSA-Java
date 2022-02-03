class Node{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right= null;
    }
}
class PreOrder {

    public static void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data +" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
 
        preorder(root);
    }
}