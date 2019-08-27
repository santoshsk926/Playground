#include<stdio.h>
#include<stdlib.h>
int main()
{
    int n,i,j,*a;
    scanf("%d",&n);
    a=(int*)malloc(n*sizeof(int));
    for(i=0;i<n;i++)
    {
        scanf("%d",a+i);
    }
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
            {
                int b=a[i];
                 a[i]=a[j];
                 a[j]=b;
            }
        }
    }
    printf("Sorted array is:\n");
    for(i=0;i<n;i++)
    {
        printf("%d\n",a[i]);
    }
    return 0;
}