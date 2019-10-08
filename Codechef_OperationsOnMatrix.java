import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
public class Codechef_OperationsOnMatrix {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int t=0;
		t=scan.nextInt();
		while(t>0) {
			int n,m,q;
			int x,y;
			int i,j,k;
			int count=0;
			
		    
		    n=scan.nextInt();
		    m=scan.nextInt();
		    q=scan.nextInt();
		    
		    Integer arr[][]=new Integer[n][m];
		    
		    for(i=0;i<n;i++) {
		    	for(j=0;j<m;j++) {
		    		arr[i][j]=0;
		    	}
		    }
		    
		    for(i=0;i<q;i++) {
		    	x=scan.nextInt();
		    	y=scan.nextInt();
		    	

		    	for(j=0;j<m;j++) {
		    		arr[x-1][j]++;
		    	}

		    	
		    	for(k=0;k<n;k++) {
		    		arr[k][y-1]++;
		    	}
			}
		    
		    for(j=0;j<n;j++) {
		    	for(k=0;k<m;k++) {
		    		if(arr[j][k]%2!=0)	count++;
		    		else continue;
		    	}
		    }
		    System.out.println(count);
			
		    
		}
	}

}
