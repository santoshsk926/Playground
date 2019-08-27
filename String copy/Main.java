#include<stdio.h>
int main()
{
  char a[100],b[100];
  gets(a);
  strcpy(b,a);
  printf("The copied string is %s.",b);
}