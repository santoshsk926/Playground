#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    int x[n],y[n];
    int i,j,t,pro,sum=0;
    for(i=0;i<n;i++)
    {
        scanf("%d",&x[i]);
    }
    for(i=0;i<n;i++)
    {
        scanf("%d",&y[i]);
    }
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(x[i]>x[j])
            {
               t=x[j];
               x[j]=x[i];
               x[i]=t;
            }
        }
    }
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(y[i]>y[j])
            {
               t=y[j];
               y[j]=y[i];
               y[i]=t;
            }
        }
    }
    for(i=0;i<n;i++)
    {
        pro=x[i]*y[i];
        sum=sum+pro;
    }
    printf("%d",sum);
    return 0;
}