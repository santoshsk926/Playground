#include<stdio.h>
#include<stdlib.h>
int main()
{
    int nm,vc,*a,i,sum=0;
    scanf("%d",&nm);
    scanf("%d",&vc);
    a=(int*)malloc(nm*sizeof(int));
    for(i=0;i<nm;i++)
    {
        scanf("%d",(a+i));
    }
    for(i=0;i<nm;i++)
    {
        sum+=*(a+i);
    }
    if(sum<=vc)
    {
        printf("YES");
    }
    else
    {
        printf("NO");
    }
    return 0;
}