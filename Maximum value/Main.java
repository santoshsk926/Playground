#include<stdio.h>
int main()
{
  int i,n,arr[10];
  int higher=0;
  scanf("%d",&n);
  for(i=0;i<n;i++){
    scanf("%d",&arr[i]);
  }
   higher=arr[0];
  for(i=1;i<n;i++){
   if(arr[i] > higher)
     higher = arr[i];
  }
  printf("%d",higher);
}