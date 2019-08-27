#include<stdio.h>
#include<stdlib.h>
int main()
{
    int n,**a;
    scanf("%d",&n);
    int i,j;
    a=(int**)malloc(n*(sizeof(int)));
    for(i=0;i<n;i++)
    {
        *(a+i)=(int*)malloc(n*sizeof(int));
    }
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            scanf("%d",*(a+i)+j);
        }
    }
    if(*(*(a+1)+0)==0&&*(*(a+2)+0)==0&&*(*(a+2)+1)==0||*(*(a+1)+2)==0&&*(*(a+2)+1)==0&&*(*(a+2)+2)==0)
    {
        printf("Upper triangular matrix");
    }else
    {
        printf("Not a upper triangular matrix");
    }
    return 0;
}