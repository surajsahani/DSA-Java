// import java.util.*;
// public class GenerateIp {

//     public static ArrayList<String>
//     restoreIpAddress(String A)
//     {
//         if(A.length() <3 || A.length() > 12)
//             return new ArrayList<>();
//         return convert(A);
//     }

//     private static ArrayList<String>
//     //convert(String s)
//     {
//         ArrayList<String> l = new ArrayList<>();
//         int size = s.length();

//         String snew = s;

//         for(int i=1; i<size -2; i++) {
//             for(int j= i +1; j<size -1; j++){
//                 for(int k= j +1; k< size; k++){
//                     snew = snew.substring(0,k) + "." + snew.substring(k);

//                     snew = snew.substring(0,j) + "." + snew.substring(j);

//                     snew = snew.substring(0,i) + "." + snew.substring(i);

//                     if(isValid(snew)) {
//                         l.add(snew);
//                     }
//                     snew =s;
//                 }
//             }
//         }
//     }
//     private static boolean isValid(String ip)
//     {
//         String a[] = ip.split("[.]");
//         for(String s:a){
//             int i = Integer.parseInt(s);
//             if(s.length() >3 || i< 0 || i> 255){
//                 return false;
//             }
//             if(s.length() > 1 && i==0)
//             return false;
//             if(s.length() >1 && i !=0
//              && s.charAt(0) =='0')
//              return false;
//         }
//     }
//     public static void main(String[] args) {
//         System.out.println(
//             restoreIpAddress("25525511135")
//             .toString());
//     }
// }