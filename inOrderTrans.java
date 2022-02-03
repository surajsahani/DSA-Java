import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
class Node {
    int data;
    Node left;
    Node right;
    Node(int item){
        data = item;
        left = right = null;
    }
}

private class Pair {
    boolean visited;
    TreeNode node;

    Pair(TreeNode node, boolean visited) {
        this.node = node;
        this.visited = visited;
    }
}


public class inOrderTrans {

    public static void main(String[] args) throws IOException{
        
        BufferedReader  br = new BufferedReader(System.in)
    }
    
}
class inOrderTransSol {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<Pair> stack = new Stack();
        stack.push(new Pair(root, false));
        List<Integer> res = new ArrayList();
        while (!stack.isEmpty()) {
            Pair curr = stack.pop();
            if (curr.node == null)
                continue;
            if (curr.visited) {
                res.add(curr.node.val);
            } else {
                stack.push(new Pair(curr.node.right, false));     
                stack.push(new Pair(curr.node.left, false));      
                stack.push(new Pair(curr.node, true));            
            }
        }
        return res;
    }
}
