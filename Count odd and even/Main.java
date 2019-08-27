#include<stdio.h>
int main()
{
  int arr[10],i,n,even=0,odd=0;
  scanf("%d",&n);
 for(i=0;i<n;i++){
    scanf("%d",&arr[i]);
  }
  for(i=0;i<n;i++){
    if(arr[i] % 2 == 0)
      even++;
    else
      odd++;
  }
  printf("Odd: %d\nEven: %d",odd,even);
}