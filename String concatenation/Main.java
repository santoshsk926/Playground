#include<stdio.h>
int main()
{
  char a[10],b[10];
  gets(a);
  gets(b);
  printf("The concatenated string is %s",strcat(a,b));
}