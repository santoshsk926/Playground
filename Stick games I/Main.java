#include<stdio.h>
int main()
{
    int  n,m,x;
    scanf("%d %d",&n,&m);
    if(n<m)
    {
        x=n;
    }
    else
    {
        x=m;
    }
    if(x%2==0)
    {
        printf("Mani Iyer");
    }
    else
    {
        printf("Arun Gupta");
    }
    return 0;
}