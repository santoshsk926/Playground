#include<stdio.h>
union employee
{
char name[20];
int salary;
};
int main()
{
  union employee e;
  printf("Enter the Employee details\n");
  printf("Enter the Employee name\n");
  scanf("%s",e.name);
  printf("Enter the Employee salary\n\n");
  scanf("%d",&e.salary);
  printf("Employee Details\n");
  printf("'  %d",e.salary);
}
  