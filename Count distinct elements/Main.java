#include<stdio.h>
#include<stdlib.h>
int distinctElement(int *a, int n)
{
  int res = 1,i,j;
    for (i = 1; i < n; i++)
    { 
        j = 0; 
        for (j = 0; j < i; j++) 
        {
            if (*(a+i) == *(a+j)) 
            {   
                break;
            }
        }
        if (i == j) 
        {
            res++;
        }
    }
  return res;
}
int main()
{
  int *a,n,i;
  scanf("%d",&n);
  a = (int*)malloc(n * sizeof(int));
  for(i=0;i<n;i++)
  {
    scanf("%d",a+i);
  }
  printf("There are %d distinct elements in the array.",distinctElement(a, n));
  }
