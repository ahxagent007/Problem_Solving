#include<stdio.h>
 
int main()
 
{
    int a,b,n,T,Time;
 
    scanf(" %d",&T);
 
    for(n=1;n<=T;n++){
 
        scanf(" %d %d",&b,&a);
 
        if(a>b){
 
        Time = (a - b)*4 + 11 + b*4 + 8;
        }
        else if(b>a){
 
        Time = (b - a)*4 + 11 + b*4 + 8;
        }
        else{
 
            Time = 11 + b*4 + 8;
        }
        printf("Case %d: %d\n",n,Time);
        }
    return 0;
}
