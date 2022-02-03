import java.util.ArrayList;
import java.util.*;

public class ZigZagTT {
    public static void main(String[] args) {
        
    }
}
class ZigZagTTSol {
    ArrayList<Integer> zigZagTraversal(Node root)
	{
	    //Add your code here.
	    ArrayDeque<Node> q = new ArrayDeque<Node>();
	    ArrayList<Integer> arr = new ArrayList<Integer>();
	    q.offer(root);
	    int j= 0;
	    while(q.isEmpty()==false){
	        int n= q.size();
	        for(int i=0; i<n; i++){
	            if(j%2==0){
	                Node node = q.pollFirst();
	                arr.add(node.data);
	                if(node.left!=null)
	                q.offerLast(node.left);
	                if(node.right!=null)
	                q.offerLast(node.right);
	            } else {
	                Node node = q.pollLast();
	                arr.add(node.data);
                if(node.right!=null)
                q.offerFirst(node.right);
                if(node.left!=null)
                q.offerFirst(node.left);
	            }
	        }
	        j+=1;
	    }
	    return arr;
	}
}