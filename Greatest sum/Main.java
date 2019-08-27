#include<stdio.h>
#include<stdlib.h>
int sumr(int **a,int r,int c)
{
    int sum=0,j;
    for(j=0;j<c;j++)
    {
        sum+=*(*(a+r)+j);
    }
    return sum;
}
int sumc(int **a,int r,int c)
{
    int sum=0,i;
    for(i=0;i<r;i++)
    {
        sum+=*(*(a+i)+c);
    }
    return sum;
}
int main()
{
    int r,c,i,j,**a,max1,max2,d=0,e=0;
    scanf("%d%d",&r,&c);
    int m[r],mc[c];
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
    
    for(i=0;i<r;i++)
    {
        m[i]=sumr(a,i,c);
    }
    printf("Sum of rows is ");
    for(i=0;i<r;i++)
    {
        printf("%d ",m[i]);
    }
    max1=m[0];
    for(i=0;i<r;i++)
    {
        if(max1<m[i])
        {
            d=i;
            max1=m[i];
        }
    }
    printf("\nRow %d has maximum sum",d+1);
    printf("\nSum of columns is ");
    for(j=0;j<c;j++)
    {
        mc[j]=sumc(a,r,j);
    }
    for(j=0;j<c;j++)
    {
       
        printf("%d ",mc[j]);
    }
     max2=mc[0];
    for(j=0;j<c;j++)
    {
        if(max2<mc[j])
        {
            e=j;
            max2=mc[j];

        }
    }
     printf("\nColumn %d has maximum sum",e+1);
    return 0;
}