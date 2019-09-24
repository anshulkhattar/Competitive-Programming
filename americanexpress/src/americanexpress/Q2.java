package americanexpress;

import java.util.Scanner;

public class Q2 {
	
	 static int gcd(int a, int b) 
	    { 
	        // Everything divides 0  
	        if (a == 0) 
	          return b; 
	        if (b == 0) 
	          return a; 
	       
	        // base case 
	        if (a == b) 
	            return a; 
	       
	        // a is greater 
	        if (a > b) 
	            return gcd(a-b, b); 
	        return gcd(a, b-a); 
	    } 
	 static boolean isPrime(int n) 
	    { 
	        // Corner case 
	        if (n <= 1) 
	            return false; 
	  
	        // Check from 2 to n-1 
	        for (int i = 2; i < n; i++) 
	            if (n % i == 0) 
	                return false; 
	  
	        return true; 
	    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=0;
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int L, R;
			L=sc.nextInt();
			R=sc.nextInt();
			for (int X=L;X<= R;X++ ) {
				int sum=0;
				
				for (int j=1;j<=X;j++) {
				if(gcd(j,X)==j) {sum++;
				}
				else continue;
				
				if(isPrime(sum)) {count++;}
				
				
				}
			}
			System.out.println(count);
		}
	}

}
