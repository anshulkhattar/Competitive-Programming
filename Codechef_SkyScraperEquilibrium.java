import java.util.Scanner;
public class Codechef_SkyScraperEquilibrium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int t;
		t=scan.nextInt();
		while(t>0) {
			long m,n;
			m=scan.nextLong();
			n=scan.nextLong();
			if(m==n) System.out.println(0);
			else if(m>n) System.out.println(m-n);
			else System.out.println(n-m);
			t--;
		}

	}

}
