#include<stdio.h>
int main()
{
  int a;
  char str1[100],str2[100];
  gets(str1);
  gets(str2);
  a = strcmp(str1,str2);
  if(a == 0)
    printf("Strings are same");
    
}