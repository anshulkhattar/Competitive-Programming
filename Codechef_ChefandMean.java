// CODECHEF
// Chef and Mean
// CHFM


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Codechef_ChefandMean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int t;
		t=scan.nextInt();
		for(int i=0;i<t;i++) {
			int n,j;
			float sum=0,mean=0;
			float x;
			n=scan.nextInt();
			Long a[]=new Long[n];
			List<Long> list=new ArrayList<Long>();
			
			for(j=0;j<n;j++) {
				a[j]=scan.nextLong();
			}
			
			for(j=0;j<n;j++) {
				sum=sum+a[j];
			}
			mean=sum/n;
			
			if(mean==a[0]) {
				System.out.println("1");
			}
			
			for(j=0;j<n;j++) {
				x=sum-a[j];
				
				if(x/(n-1)==mean) {
					list.add(a[j]);
				}
				else
					continue;
			}
			
			if(list.size()!=0) {
				Collections.sort(list);
				Long[] arr = new Long[list.size()]; 
		        arr = list.toArray(arr);
		        
		        System.out.println(arr[0]);
			}
			else
				System.out.println("Impossible");	
		}
	}

}
