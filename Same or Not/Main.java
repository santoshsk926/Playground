#include<stdio.h>
#include<stdlib.h>
int main()
{
    int *a1,*a2;
    int n1,n2,i,sum1=0,sum2=0;
    scanf("%d%d",&n1,&n2);
    a1=(int*)malloc(n1*sizeof(int));
    a2=(int*)malloc(n1*sizeof(int));
    for(i=0;i<n1;i++)
    {
       scanf("%d",a1+i); 
    }
    for(i=0;i<n2;i++)
    {
        scanf("%d",a2+i);
    }
    for(i=0;i<n1;i++)
    {
        sum1=sum1+(*(a1+i));
    }
    for(i=0;i<n2;i++)
    {
        sum2=sum2+(*(a2+i));
    }
    if(sum1==sum2)
    {
        printf("Same");
    }else
    {
        printf("Not Same");
    }
    return 0;
}