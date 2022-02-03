import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
public class LVBT {

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

    static void printInorder(Node root)
    {
        if(root == null)
        return;
        printInorder(root.left);
        System.out.print(root.data+" ");
        printInorder(root.right);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while(t >0) {
            String s = br.readLine();
            Node root = buildTree(s);
            LVBTSol g = new LVBTSol();
            ArrayList<Integer> result = g.leftView(root);
            for(int value: result) {
                System.out.print(value + "");
            }
            System.out.println();
            t--;
        }

    }
}
class LVBTSol {

    ArrayList<Integer> leftView(Node root){
        if(root == null)
        return new ArrayList<>();
        ArrayList<Integer> ans =  new ArrayList<>();
        LinkedList<Node> queue = new LinkedList<>();
        queue.addLast(root);

        while(queue.size() > 0){
            int size = queue.size();
            ans.add(queue.getFirst().data);
            while(size-->0 ){
                Node rnode = queue.removeFirst();
                if(rnode.left !=null)
                queue.addLast(rnode.left);
                if(rnode.right!=null)
                queue.addLast(rnode.right);
            }
        }
        return ans;
    }
}