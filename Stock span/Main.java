#include<stdio.h>
int main()
{
    int a,c,i,j;
    scanf("%d",&a);
    int d[a];
    for(i=0;i<a;i++)
    {
        scanf("%d",d+i);
        c=1;
        for(j=i-1;j>=0;j--)
        {
            if(d[i]>=d[j])
                c++;
            else
                break;
        }
        printf("%d\n",c);
    }
    return 0;
}