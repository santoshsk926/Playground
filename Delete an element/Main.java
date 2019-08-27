#include<stdio.h>
int main()
{
    int n,i,pos;
    scanf("%d",&n);
    int a[100];
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    scanf("%d",&pos);
    if(pos>n||pos<0)
    {
        printf("Invalid Input");

    }else
{
    for(i=pos-1;i<n-1;i++)
    {
       a[i]=a[i+1]; 
    }
    n--;

printf("Array after deletion is:\n");
for(i=0;i<n;i++)
{
    printf("%d\n",a[i]);
}
}
    return 0;
}