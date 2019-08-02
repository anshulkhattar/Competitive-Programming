// Codechef
// Football
//  MSNSADM1


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Codechef_Football {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t;
		t=scan.nextInt();
		while(t--!=0) {
			int n,i,j=0,score=0;
			n=scan.nextInt();
			Integer a[]=new Integer[n];
			Integer b[]=new Integer[n];
			List<Integer> score_list=new ArrayList<Integer>();
			for(i=0;i<n;i++) {
				a[i]=scan.nextInt();
				
				}
			for(i=0;i<n;i++) {
				b[i]=scan.nextInt();
				
				}
			while(j<n) {
				score=(a[j]*20)-(b[j]*10);
				if(score<0)	score=0;
				score_list.add(score);
				j++;
			}
			System.out.println(Collections.max(score_list));
		}
	}

}
