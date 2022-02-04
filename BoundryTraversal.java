import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
public class BoundryTraversal {
    
}
class  BoundryTraversalSol {

    ArrayList <Integer> printBoundary(Node node)
    {
        ArrayList<Integer> ret=new ArrayList<Integer>();
	    if(node==null){
	     return ret;   
	    }
        ret.add(node.data);
        printleft(node.left,ret);
        Stack<Integer> s=new Stack<Integer>();
        printright(node.right,s);
        while(!s.isEmpty()){
	        ret.add(s.pop());
	    }
	    return ret;
    }
    void printright(Node root,Stack<Integer> s){
	    if(root==null){
	        return;
	    }
	    if(root.left!=null || root.right!=null)
	    {
	    s.push(root.data);
	    }
	    if(root.right!=null){
	        printright(root.right,s);
	    }
	    else{
	        printright(root.left,s);
	    }
	}
    void printleft(Node root,ArrayList<Integer> al){
	    if(root==null){
	        return;
	    }
	    if(root.left!=null || root.right!=null)
	    {
	    al.add(root.data);    
	    }
	    if(root.left!=null){
	        printleft(root.left,al);
	    }
	    else{
	        printleft(root.right,al);
	    }
	}
    void printbottom(Node root,ArrayList<Integer> al){
	    if(root==null){
	        return;
	    }
	    printbottom(root.left,al);
	    if(root.left==null && root.right==null){
	        al.add(root.data);
	    }
	    printbottom(root.right,al);
	}
}