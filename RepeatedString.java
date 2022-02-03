import java.util.*;
public class RepeatedString {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long numberOfReps = n/s.length();
        long remoinder = n%s.length();
        long total = 0;
        for(int a = 0; a < s.length(); a++){
            if(s.charAt(a) == 'a'){
                total++;
            }
        }
        total = total * numberOfReps;
        for(int a = 0; a< remoinder; a++){
            if(s.charAt(a) == 'a'){
                total++;
            }
        }
        System.out.println(total);
    }
}
