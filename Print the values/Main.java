#include<stdio.h>
int main()
{
  int i,n,arr[10];
  scanf("%d",&n);
  for(i=0;i<n;i++){
    scanf("%d",&arr[i]);
  }
  for(i=0;i<n;i++){
    printf("%d\n",arr[i]);
  }
  
}