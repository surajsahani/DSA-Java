import java.util.*;
public class Ireland {
        
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		long c = scanner.nextLong();
		int a[] = new int[n];
		int b[] = new int[n];

		for(int i=0; i<n; i++)
			a[i] = scanner.nextInt();

		for(int i=0; i< n; i++)
			b[i] = scanner.nextInt();

			int city = 0;
			long fuel = 0;

			for(int i=0; i< n; i++){

				int j=0;
				while(j < n)  {

					    fuel +=a[i%n];
						fuel = Math.min(fuel, c);

						if(fuel >= b[i %n])
					    	fuel -=b[i %n];
						else {
							fuel = 0;
							break;
						}
						i++;
						j++;
					}

					if(j == n)
				     	city = i % n;
					else city = -1;
				}

				int res = 0;
				if(city >=0){
					res = 1;
					long ans[] = new long[n];
					ans[city] = 0;
					for(int j = 0; j < n-1; j++)
					{
						int i = (city - j - 1 + n) % n;

						if(Math.min(a[i],c) - b[i] >=ans[(i+1)%n]){
							ans[i] = 0;
							res++;
						} else {
							ans[i] = ans[(i +1) % n] - (Math.min(a[i], c) -  b[i]);
						}
					}
		}
        System.out.println(res);
	}
}
