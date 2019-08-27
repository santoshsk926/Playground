#include<stdio.h>
int main()
{
  int *a1,*a2;
  int n,i;
  scanf("%d",&n);
  a1 = (int*)malloc(n*sizeof(int));
  a2 = (int*)malloc(n*sizeof(int));
  for(i=0;i<n;i++)
  {
    scanf("%d",i+a1);
  }
  for(i=0;i<n;i++)
  {
    scanf("%d",i+a2);
  }
  add(a1,a2,n);
  return 0;
}
void add(int*a1,int*a2,int n)
{
    int i,sum[5]={0,0,0,0,0};
    for(i=0;i<n;i++)
    {
       sum[i]=a1[i]+a2[i]; 
    }
    for(i=0;i<n;i++)
    {
        printf("%d ",sum[i]);
    }
}