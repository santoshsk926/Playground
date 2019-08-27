#include<stdio.h>
#include<stdlib.h>
int main()
{
    int r,c,i,j;
    scanf("%d%d",&r,&c);
    int a[r][c];
    int sum=0;
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            scanf("%d",&a[i][j]);
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
            if(i+j==r-1)
            {
                sum=sum+a[i][j];
            }
        }
    }
    printf("Sum of Zig-Zag pattern is %d",sum);
    return 0;
}