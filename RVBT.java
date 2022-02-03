import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node right, left;
    Node(int item){
        data = item;
        left = right = null;
    }
}
public class RVBT {

    static Node buildTree(String str){

        if(str.length()==0 || str.charAt(0) =='N'){
            return null;
        }

        String ip[] = str.split(" ");

        Node root = new Node(Integer.parseInt(ip[0]));

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        int i=1;
        while(queue.size()>0 && i< ip.length){
            Node currNode = queue.peek();
            queue.remove();

            String currVal = ip[i];
            if(!currVal.equals("N")) {

                currNode.left = new Node(Integer.parseInt(currVal));

                queue.add(currNode.left);
            }
            i++;
            if( i >=ip.length)
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
    void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.data + " ");
        inOrder(node.right);;
    }
    public static void main(String[] args)throws IOException {
        
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
          int t = Integer.parseInt(br.readLine());
          while(t-- > 0) {
              String s = br.readLine();
              Node root = buildTree(s);
              RVBTSol tree = new RVBTSol();
              ArrayList<Integer> arr = tree.rightView(root);
              for(int x: arr)
              System.out.println(x + " ");
              System.out.println();
          }
    }
}
class RVBTSol {
    ArrayList<Integer> rightView(Node node){
        if(node == null) 
        return new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        LinkedList<Node> queue = new LinkedList<>();
        queue.addLast(node);

        while(queue.size() > 0){
            int size = queue.size();
            ans.add(queue.getFirst().data);
            while(size-->0){
                Node rnode = queue.removeFirst();
                if(rnode.right !=null)
                queue.addLast(rnode.right);
                if(rnode.left!=null)
                queue.addLast(rnode.left);
            }
        }
        return ans;
    }
}