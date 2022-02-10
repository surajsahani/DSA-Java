import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
public class CheckLeafNotSame {
    
    static Node buildTree(String str) {

        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        String ip[] = str.split(" ");
        Node root  = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i= 1;

        while(queue.size()>0 && i < ip.length) {

            Node currNode = queue.peek();
            queue.remove();

            String currVal = ip[i];
        if(!currVal.equals("N")) {
            currNode.left = new Node(Integer.parseInt(currVal));
            queue.add(currNode.left);
             }

        i++;
        if(i >=ip.length)
        break;

        currVal = ip[i];
        if(!currVal.equals("N")){
            currNode.right = new Node(Integer.parseInt(currVal));
            queue.add(currNode.right);
        }
        i++;

        }
        
        return root;   
    }
    
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        int t = Integer.parseInt(br.readLine());
        while(t >0) {
            String  s = br.readLine();
            Node root = buildTree(s);
            CheckLeafNotSameSol  g = new CheckLeafNotSameSol();

            if(g.isSumTree(root) == true)
            System.out.println(1);
             else
            System.out.println(0);
            t--;
        }

    }
}

class CheckLeafNotSameSol {
    int val = 0;

    boolean isSumTree(Node root){
        if(root==null) return true;
        if(root.left==null && root.right==null) return true;
        int lsum = calcSum(root.left);
        val = 0;
        int rsum = calcSum(root.right);
        if(lsum+rsum==root.data) return true;
        return false;
    }
    public int calcSum(Node root){
        if(root==null) return 0;
        val +=root.data;
        calcSum(root.left);
        calcSum(root.right);
        return val;
    }
}