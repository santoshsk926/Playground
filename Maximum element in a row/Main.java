#include<stdio.h>
int main()
{
    int r,c,i,j,max,k=0;
    scanf("%d%d",&r,&c);
    int max1[r];
    int a[r][c];
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
    for(i=0;i<r;i++)
    {
        max=a[i][0];
        for(j=1;j<c;j++)
        {
            if(a[i][j]>max)
            {
                max=a[i][j];
            }
        }
        max1[k]=max;
        k++;
    }
    for(i=0;i<k;i++)
    {
        printf("%d\n",max1[i]);
    }
    return 0;
}