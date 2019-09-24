package americanexpress;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int m;
		int count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		for(int i=0;i<n;i++) {
			Integer[] a=new Integer[m];
			for(int k=0;k<m;k++) {
				a[k]=sc.nextInt();
			}
		}
		//if(n==2) System.out.println("0");
		if(n%2==0) {
			while(n!=2) {
				n=n/2;
				count+=n;
			}
			System.out.println(count);
		}
		else{
			n=n-1;
			while(n!=2) {
				n=n/2;
				count+=n;
				}
			System.out.println(count+1);
				
		}
	}

}
