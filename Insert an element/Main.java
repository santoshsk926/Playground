#include<stdio.h>
#include<stdlib.h>
int main()
{
    int n;
    scanf("%d",&n);
    int i;
    int a[100];
    int pos,ele;
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    scanf("%d",&pos);
    scanf("%d",&ele);
    if(pos>n+1||pos<=0)
    {
        printf("Invalid Input");
    }
    else
    {
    for(i=n;i>=pos;i--)
    {
            a[i]=a[i-1];
    }
    a[pos-1]=ele;
    n++;
    printf("Array after insertion is:\n");
    for(i=0;i<n;i++)
    {
        printf("%d\n",a[i]);
    }
    }
    return 0;
}