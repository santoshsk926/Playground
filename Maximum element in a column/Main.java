#include<stdio.h>
#include<stdlib.h>
int maxi(int **a,int r,int c)
{
    int max=*(*(a+0)+c),i;
    for(i=0;i<r;i++)
    {
        if(max<*(*(a+i)+c))
        {
            max=*(*(a+i)+c);
        }
    }
    return max;
}
int main()
{
    int r,c,i,j,**a;
    scanf("%d%d",&r,&c);
    int m[r];
    a=(int**)malloc(r*sizeof(int));
    for(i=0;i<r;i++)
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
    for(i=0;i<c;i++)
    {
        m[i]=maxi(a,r,i);
    }
    for(i=0;i<c;i++)
    {
        printf("%d\n",m[i]);
    }

    return 0;
}