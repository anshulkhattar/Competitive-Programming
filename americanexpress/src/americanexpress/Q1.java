package americanexpress;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int ans=0;
		
		
		for(int i=0;i<t;i++)
		{
			int n,k;
			
			n= sc.nextInt();
			k=sc.nextInt();
			String[] arr=new String[k];
			
			for(int f=0;f<k;f++)
			{
				arr[f]=sc.next();
			}
			if(n==1) {
				System.out.println(k);}
			else if(n%2==0)
				{
				int odd=0,even=0;
				
				for(int j=1;j<=n;j++) {
					if(j%2==0)
					{
						even++;
						}
					else odd++;
				}
				even=even-1;
					 ans=(int) ((int) (Math.pow(k,odd))*25*(Math.pow(24,even)));
				System.out.println(ans% 1000000007);
			}
			else
			{
				int odd=0,even=0;
				
				for(int j=1;j<=n;j++) {
					if(j%2==0)
					{
						even++;
						}
					else odd++;
				}
			
					ans=((k)^odd)*((24)^even);
				System.out.println(ans%7);
			}
			
			}
		
	}

}
