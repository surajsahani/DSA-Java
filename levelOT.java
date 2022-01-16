import java.util.*;
import java.io.*;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right=null;
    }
}
class levelOT {

    static Node buildTree(String str){

        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }

        String ip[] = str.split(" ");

        Node root = new Node(Integer.parseInt(ip[0]));

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        int i = 1;
        while(queue.size() >0 && i < ip.length) {

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
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while(t>0){
            String s = br.readLine();
            Node root = buildTree(s);
            SolutionOT g = new SolutionOT();
            ArrayList <Integer> res = g.leveOrder(root);
            for(Integer num: res) System.out.println(num + " ");
            System.out.println();
            t--;
        }
        
    }
}
class SolutionOT 
{
    static ArrayList <Integer> leveOrder(Node node)
    {
        if(node==null) return  null;

        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);

        while(!q.isEmpty()) {
            Node curr = q.poll();
            list.add(curr.data);

            if(curr.left!=null)q.add(curr.left);
            if(curr.right!=null)q.add(curr.right);
        }
        return list;
    }
}