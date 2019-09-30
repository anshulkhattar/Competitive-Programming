import java.util.*;
class Codechef_ReduceToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int t=0;
		if(scan.hasNextInt()){
		    t=scan.nextInt();}
		for(int i=1;i<=t;i++) {
			int n,x,y;
			n=scan.nextInt();
			List<Integer> arr=new ArrayList<Integer>();
			
			for(int j=1;j<=n;j++)
			arr.add(j);
			
			
			while(arr.size()!=1) {
				x=arr.get(0);
			y=arr.get(arr.size()-1);
			
			arr.remove(0);
			arr.remove(arr.size()-1);
			
			int z=x+y+x*y;
			arr.add(z);
			}
			
			System.out.println(arr.toString());
		}
	}

}
