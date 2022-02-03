import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int item){
        left = null;
        right = null;
    }
}
public class TVBT {
    
    public Node buildTree(String str){
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }

        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int i= 1;
        while(queue.size()>0 && i < ip.length){
            Node currNode = queue.peek();
            queue.remove();

            String currVal = ip[i];
            if(!currVal.equals("N")){
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if(i>=ip.length)
            break;
            currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    } 
    static void printInorder(Node root)
    {
        if(root == null)
        return ;

        printInorder(root.left);
        System.out.print(root.data+" ");
        printInorder(root.right);
    }        
        public static void main(String[] args) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());

            while(t >0) {
                String s = br.readLine();
                Node root = buildTree(s);


                TVBTSol ob = new TVBTSol();
                ArrayList<Integer> vec = ob.topView(root);
                for(int x: vec)
                System.out.print(x + " ");
                System.out.println();
                t--;
            }
        }
    }
    class Pair{
        int q;
        Node node;
        public Pair(int q, Node node){
            this.q = q;
            this.node=node;
        }
    }
class TVBTSol {

    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<Pair>();
        queue.add(new Pair(0, root));
        while(queue.isEmpty()==false){
            Pair p = queue.remove();
            if(p.node.left!=null)
            queue.add(new Pair(p.q-1,p.node.left));
            if(p.node.right!=null)
            queue.add(new Pair(p.q+1, p.node.right));
            if(map.containsKey(p.q)==false){
                map.put(p.q,p.node.data);
            }
        }
        return new ArrayList<Integer> (map.values());
    }
}
