//  CODECHEF
//  Life Limited
//  LIFELTD

#include<iostream>
using namespace std;
int main(){
	int t;
	cin>>t;
	while(t--){
		char s[3][3];
		int i,j,count=0;
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				cin>>s[i][j];
			}
		}
		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
				if(s[i][j]=='l' && s[i+1][j]=='l' && s[i+1][j+1]=='l'){
					count=1;
				}
			}
		}
		if(count==1)
		cout<<"yes\n";
		else
		cout<<"no\n";
	}
}
