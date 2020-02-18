import java.util.*;

class SmallestNonRepeatingSubstring{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String S=new String();
        S=scan.nextLine();
        
        // Write your code here
        int i,j,n=S.length();
        
        int distCount=0;
        
        Boolean visited[]=new Boolean[256];
        
        Arrays.fill(visited,false);
        for(i=0;i<n;i++){
            if(visited[S.charAt(i)]==false){
                visited[S.charAt(i)]=true;
                distCount++;
            }
        }
        
        int start=0, startIndex=-1;
        int minLen=Integer.MAX_VALUE;
        
        int count=0;
        int[] currCount=new int[256];
        
        for(j=0;j<n;j++){
            currCount[S.charAt(j)]++;
            
            if(currCount[S.charAt(j)]==1)   count++;
            
            if(count==distCount){
                while(currCount[S.charAt(start)]>1){
                    if(currCount[S.charAt(start)]>1)    currCount[S.charAt(start)]--;
                    start++;
                }
                
            int winLen=j-start+1;
            if(minLen>winLen){
                minLen=winLen;
                startIndex=start;
            }
            }
        }
        
        System.out.println(S.substring(startIndex,startIndex+minLen).length());
    }
}