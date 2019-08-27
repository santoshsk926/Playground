#include<stdio.h>
#define SIZE 100
int sum(int arr[],int n)
{
    int i=0,s=0;
    if(n<0)
    {
       return 0;
    }else
    {
        return arr[n]+sum(arr,n-1);
    }
}
int main()
{
    int arr[SIZE];
    int i,n,res;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    res=sum(arr,n-1);
    printf("%d",res);
    return 0;
}