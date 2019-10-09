#include<iostream>
using namespace std;
int main(){
    long long t;
    cin>>t;
    while(t--){
        long long p,n;
        long long k;
        cin>>n>>p;

        k=n/p;
     
        if(p<=2) cout<<"impossible\n";
        else{
            string str;
            string str1;

            str.push_back('a');
            
            for(long long i=0;i<p-2;i++){
                str.push_back('b');
            }
            
            str.push_back('a');

            for(long long i=0;i<k;i++){
            str1+=str;
            }
            cout<<str1<<"\n";
        }

    }
    return 0;
}