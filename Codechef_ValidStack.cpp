// CODECHEF
// Valid Stack Operations
// VALIDSTK


#include<iostream>
using namespace std;
int main(){
	int t;
	cin>>t;
	while(t--){
		int n,flag=0;
		cin>>n;
		int arr[n];
		for(int i=0;i<n;i++)
		cin>>arr[i];
		int top=0;
		for(int i=0;i<n;i++){
			
			if(arr[i]==1){
				top++;
			}
			else if(arr[i]==0)
				top--;
				if(top<0){
					cout<<"Invalid\n";
					break;
				}		
		}
		if(top>=0)
		cout<<"Valid\n";
	}
}
