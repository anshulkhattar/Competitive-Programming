// CODECHEF
// Testing Robot
// TSTROBOT


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Codechef_Robot {
	public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int t;
        t=scan.nextInt();
        while(t-->=0){
            int n,x;
            n=scan.nextInt();
            x=scan.nextInt();
            String s=scan.next();
            
            Set<Integer> pos=new HashSet<Integer>();
            pos.add(x);
            for(int j=0;j<n;j++){
                
                if(s.charAt(j)=='L')
                {x--;
                pos.add(x);
                }
                if(s.charAt(j)=='R')
                {x++;
                pos.add(x);
                }
                    
            
    }
            System.out.println(pos.size());
}
    }
}
