import java.io.*;
public  class CountVowels {
    public static void main(String[] args) throws IOException{
        String str = "GeeksForGeeks";
        str = str.toLowerCase();

        char[] chars = str.toCharArray();
        int count =0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' 
            || str.charAt(i) == 'i'
            || str.charAt(i) == 'o'
            || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        System.out.println("Total no of vowels in a string are:" + count);
    }
}