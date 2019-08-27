#include<stdio.h>
#include<stdlib.h>
int main()
{
    int r,c,i,j,**a;
    int sum=0;
    scanf("%d%d",&r,&c);
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
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            if(i==0)
            {
                sum=sum+a[i][j];
            }else
            if(i==r-1)
            {
                sum=sum+a[i][j];
            }else
            if(j==0)
            {
                sum=sum+a[i][j];
            }else
            if(j==c-1)
            {
                sum=sum+a[i][j];
            }
        }
    }
    printf("Sum of boundaries is %d",sum);
    return 0;
}