#include<stdio.h>
int main()
{
    int m,n,i,s,ct=0;
    scanf("%d%d",&m,&n);
    int a[m];
    for(i=0;i<m;i++)
    {
        scanf("%d",(a+i));
    }
    for(i=0;i<m;i++)
    {
        s=a[i];
        while(s<n)
        {
            if(s+a[i+1]<=n)
            {    
                s+=a[i+1];
                i=i+1;
            }
            else
            {
                break;
            }
        }
        ct++;
    }
    printf("%d",ct);
    return 0;
}