#include<stdio.h>
#include<stdlib.h>
int Sum(int** a,int c,int i)
{
    int j,sum=0;
    for(j=0;j<c;j++)
    {
       sum=sum+*(*(a+i)+j); 
    }
    return sum;
}
int main()
{
    int r,c,i,j,**a;
    scanf("%d%d",&r,&c);
    a=(int**)malloc(r*sizeof(int));
    int sum[r];
    for(i=0;i<c;i++)
    {
        *(a+i)=(int*)malloc(c*sizeof(int));
    }
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            scanf("%d",*(a+i)+j);
        }
    }
    for(i=0;i<r;i++)
    {
        sum[i]=Sum(a,c,i);
    }
    for(i=0;i<r;i++)
    {
        printf("The sum of row %d: %d\n",i+1,sum[i]);
    }
    return 0;
}