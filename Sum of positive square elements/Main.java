#include<stdio.h>
#include<stdlib.h>
#include<math.h>
int sumPositive(int* x,int y)
{
    int i,j,sum=0;
    for(i=0;i<y;i++)
    {
        for(j=1;j<=sqrt(*(x+i));j++)
        {
            if(j*j==*(x+i))
            {
                sum=sum+*(x+i);
            }
        }
    }
    return sum;
}
int main()
{
    int *a,i;
    int n,sum=0;
    scanf("%d",&n);
    a=(int*)malloc(n*sizeof(int));
    for(i=0;i<n;i++)
    {
        scanf("%d",a+i);
    }
   sum=sumPositive(a,n);
   printf("%d",sum);
    return 0;
}