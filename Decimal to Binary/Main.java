#include<stdio.h>
int dec(int n)
{
    int res;
    if(n==0)
    {
        return 0;
    }else
    {
       return res=n%2+(10*dec(n/2));
    }
}
int main()
{
    int n,res;
    scanf("%d",&n);
    res=dec(n);
    printf("%d",res);
    return 0;
}