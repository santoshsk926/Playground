#include<stdio.h>
int main()
{
int n;
scanf("%d",&n);
int arr[n];
int i, sum = 0;
for(i = 0; i < n; i++)
{
scanf("%d",&arr[i]);
}

for(i = 0; i < n; i++)
sum = sum + arr[i];
printf("%d",sum);
return 0;
}