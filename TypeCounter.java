import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class ResultCounter {
    public static void typeCounter(String sentence) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(count + 1);
    }
}

public class TypeCounter {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String sentence = bufferedReader.readLine();

        ResultCounter.typeCounter(sentence);

        bufferedReader.close();
    }
}
