#include<stdio.h>
#include<stdlib.h>
int Sum(int** a,int j,int r)
{
    int i,sum=0;
    for(i=0;i<r;i++)
    {
        sum=sum+*(*(a+i)+j);
    }
    return sum;
}
int main()
{
    int r,c,i,j,**a;
    scanf("%d%d",&r,&c);
    int m[c];
    a=(int**)malloc(r*sizeof(int));
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
    for(j=0;j<c;j++)
    {
        m[j]=Sum(a,j,r);
    }
    for(i=0;i<c;i++)
    {
        printf("The sum of column %d: %d\n",i+1,m[i]);
    }
    return 0;
}