import java.util.*;
public class BishuandSoldiers {

    static int bs(int[] arr, int n, int k) {
        if(arr[n-1]<=k)
        return n;

        if(arr[0]>k)
        return 0;

        int lo=0;
        int hi=n-1;
        int mid;
        while(lo<=hi){
            mid=(lo+hi)/2;
            if(arr[mid] == k && arr[mid+1]>k) return mid+1;

            if(arr[mid]<=k)
            lo=mid+1;
            else hi=mid-1;
        }
        return 0;

    }
public static void main(String args[]) throws Exception {

    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] arr= new int[n];
    int[] res = new int[n+1];
    for(int i=0; i<n; i++){
        arr[i] = s.nextInt();
    }
    Arrays.sort(arr);

    for(int i=1; i<=n; i++){
        res[i]+=res[i-1]+arr[i-1];
        int p=s.nextInt();
        int k=s.nextInt();
        int ans=bs(arr,n,p);
        int r = ans>=0?res[ans]:0;
        System.out.println(ans+" "+r);
    }
    }
}