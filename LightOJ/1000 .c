#include<stdio.h>
 
int main(void)
{
    int i,j,sum,a,k,l,h;
 
    scanf("%d",&a);
 
    for(i=1;i<=a;i++)
        {
            scanf("%d %d",&k,&l);
 
            sum = k + l;
            printf("Case %d: %d\n",i,sum);
        }
    return 0;
}
 
