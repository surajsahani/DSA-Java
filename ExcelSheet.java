import java.io.BufferedReader;
import java.io.*;
import java.util.*;

public class ExcelSheet  {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
    
        while(t >0) {
            int n = Integer.parseInt(br.readLine());
    
            while(t >0){
                int N = Integer.parseInt(br.readLine());
                ExcelSheetSol T = new ExcelSheetSol();
    
                System.out.println(T.excelColumn(N));
    
                t--;
            }
        }    
    }
    
}

class ExcelSheetSol {
    public String excelColumn(int N){
        String ans = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer s = new StringBuffer();
        while(N!=0)
        {
            int k=N%26;
            if(k==0)
            {
                s.append("Z");
                N=(N/26)-1;
            }
            if(k!=0)
            {
                s.append(String.valueOf(ans.charAt(k-1)));
                N=N/26;
            }
        }
        String col=String.valueOf(s.reverse());
        return col;
    }
}
    
   
