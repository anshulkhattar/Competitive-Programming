// Geeks For Geeks
// Java Collection | Set 3 (HashMap) Part-1
// Company Tags - Paytm

import java.util.*;
import java.lang.*;
import java.io.*;

public class Gfg_set3_Hashmap {
	public static void main (String[] args) {
		//code
		Scanner scan=new Scanner(System.in);
		int t;
		t=scan.nextInt();
		for(int i=0;i<t;i++){
		    int n,v;
		    String k,key;
		    n=scan.nextInt();
		    HashMap<String,Integer> map=new HashMap<String,Integer>();
		    for(int j=0;j<n;j++){
		       k=scan.next();
		       v=scan.nextInt();
		       map.put(k,v);
		    }
		    key=scan.next();
		    if(map.containsKey(key)){
		        System.out.println(map.get(key));
		    }
		    else
		        System.out.println("-1");
		}
	}
}

