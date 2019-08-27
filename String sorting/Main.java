#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main()
{
   char a[10],i,j,temp;
   scanf("%s",a);
   for(i=0;i<strlen(a);i++)
   {
     for(j=0;j<strlen(a);j++)
     {
       if(a[i] < a[j])
       {
         temp = a[i];
         a[i] = a[j];
         a[j] = temp;
       }
     }
   }
  printf("The sorted string is %s",a);
}