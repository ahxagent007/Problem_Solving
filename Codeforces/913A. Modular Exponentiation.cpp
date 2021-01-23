#include<bits/stdc++.h>

using namespace std;

int main(){

    int n, m;
    int p, q;
    cin>>n>>m;
    if(n>26){
        cout<<m<<endl;
    }else{
          p = pow(2, n);
          q = m % p;
          cout<<q<<endl;
    }

    return 0;

}
