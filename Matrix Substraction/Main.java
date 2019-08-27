#include<stdio.h>
int main()
{
    int r,c,i,j;
    scanf("%d%d",&r,&c);
    int a1[r][c];
    int a2[r][c];
    int diff[r][c];
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            scanf("%d",&a1[i][j]);
        }
    }
    
    
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            scanf("%d",&a2[i][j]);
        }
    }
    
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
           diff[i][j]=a2[i][j]-a1[i][j]; 
        }
    }
    printf("The Result is:\n");
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            printf("%d ",diff[i][j]);
        }
        printf("\n");
    }
    
    return 0;
}