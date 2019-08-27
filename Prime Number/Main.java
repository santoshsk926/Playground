#include<stdio.h>
int prime(int n,int i)
    {
    if(i==1)
    {
        return 1;
    }else
    if(n%i==0)
    {
       return 0; 
    }else
    {
      return  prime(n,i-1);
    }
    }
int main()
    {
        int n,check;
        scanf("%d",&n);
        check=prime(n,n/2);
        if(check==1)
        {
            printf("%d is a prime number",n);
        }else
        {
            printf("%d is Not a prime number",n);
        }
        return 0;
    }