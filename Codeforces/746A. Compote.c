
// http://codeforces.com/problemset/problem/746/A
#include<stdio.h>

int main(){

    int lemon,apple,pears,n=0;

    scanf("%d",&lemon);
    scanf("%d",&apple);
    scanf("%d",&pears);

    int l,a,p;

    l = lemon/1;
    a = apple/2;
    p = pears/4;

    if(l<=a && l<=p) n=l;
        else if(a<=l && a<=p) n=a;
            else n = p;

    printf("%d",1*n+2*n+4*n);


    return 0;
}
