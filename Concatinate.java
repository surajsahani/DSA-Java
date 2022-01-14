import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Concatinate {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        String[] arr_ch = br.readLine().split("");
        char[] ch = new char[N];
        for(int i_ch = 0; i_ch < arr_ch.length; i_ch++)
        {
            ch[i_ch] = arr_ch[i_ch].charAt(0);
        }

        String out_ = solveconcatinate(N, ch);
        System.out.println(out_);

        wr.close();
        br.close();
    }
    static String solveconcatinate(int N, char[] ch){
        String result = "";
        if(result.length() == 0){
            result = ch[0] + "";
        }
        StringBuilder s = new StringBuilder(ch.length);
        for(char c : ch){
            s.append(c);
        }
        return s.toString();

    }
}
