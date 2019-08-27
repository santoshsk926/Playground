#include<stdio.h>
int main()
{
  char a[100],result[100];
  gets(a);
  for(int i=0;i<strlen(a);i++)
  {
    a[i] = a[i] + 32;
  }
  
  printf("String with lowercase is %s",a);
}