import java.util.ArrayList;
import java.util.Scanner;

class Node 
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}
public class CheckIfLinkedList {
    Node head;
    Node tail;

    void printList(Node node)
    {
        Node temp = head;
        while(temp !=null)
        {
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void addToTheLast(Node node)
    {
        if(head == null)
        {
            head = node;
            tail = node;
        } else{
            tail.next = node;
            tail = node;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
        CheckIfLinkedList llist = new CheckIfLinkedList();
        int a1=sc.nextInt();
        Node head = new Node(a1);
        Node tail = head;
        for(int i=1; i<n; i++)
        {
            int a = sc.nextInt();
            tail.next = new Node(a);
            tail = tail.next;
        }

        Solution g = new Solution();
        if(g.isPalindrome(head)== true)
        System.out.println(1);
        else
        System.out.println(0);
        t--;
        }
        
    }
}

class Solution 
{
    boolean isPalindrome(Node head)
    {
        if(head==null)
        return true;
        ArrayList<Integer> arr = new ArrayList<>();
        while(head!=null){
            arr.add(head.data);
            head = head.
            next;
        }
        for(int i=0, j=arr.size()-1; i<j; i++, j--){
            if(arr.get(i)!=arr.get(j))
            return false;
        }
        return true;
    }
}
