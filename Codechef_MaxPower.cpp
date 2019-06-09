// CODECHEF 
// Max Power 
// MAX2 


#include<iostream>
using namespace std;
int main(){
	int n,count=0;
	cin>>n;
	char s[n];
	cin>>s;
	while(n--){
		if(s[n]!='1'){
			count++;
		}
		else
		break;
		
		
	}
	cout<<count;
	
}
