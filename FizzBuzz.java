import java.io.*;

class FizzBuzzResult{

    static void fizz(int n) {
        for(int i=0; i<=n; i++){
            boolean divBy3 = n%3 == 0;
            boolean divBy5 = n%5 == 0;

            if(divBy3 && divBy5){
                System.out.print("FizzBuzz");
            } if(divBy5){
                System.out.print("Buzz");
            } if(divBy3){
                System.out.print("Fizz");
            } if(!divBy3 && !divBy5){
                System.out.print(n);
            }
        }
    }
}
public class FizzBuzz {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        FizzBuzzResult.fizz(n);    
        br.close();
    }
}
