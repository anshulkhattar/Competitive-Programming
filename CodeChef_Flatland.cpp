
//	CODECHEF
//	FlatLand  
//	ICL1902  


#include<iostream>
#include<math.h>
using namespace std;
int main(){
	int t;
	cin>>t;
	while(t--){
		int n,count=0;
		cin>>n;
		while(n>0){
			n=n-(int(sqrt(n))*int(sqrt(n)));
			count++;
		}
		cout<<count<<"\n";
	}
	return 0;
}
