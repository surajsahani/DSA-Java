import java.util.*;
public class letsReview {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        in.nextInt();

        for(int i=0; i< N; i++){
            String string = in.next();

            // char[] charArray = string.toCharArray();

            for(int j = 0; j < string.length(); j++)
            {
                if(j % 2 ==0)
                {
                    System.out.print(string);
                }
            }
            System.out.print(" ");

            for(int j = 0; j < string.length(); j++)
            {
                if(j % 2== 1)
                {
                    System.out.print(string.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
