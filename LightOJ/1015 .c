#include<stdio.h>
 
int main(){
 
    int T,c=1;
    scanf("%d",&T);
 
    while(T--){
        int dust,totalDust=0,N;
        scanf("%d",&N);
        while(N--){
            scanf("%d",&dust);
            if(dust>0) totalDust+=dust;
        }
        printf("Case %d: %d\n",c++,totalDust);
    }
 
    return 0;
}
