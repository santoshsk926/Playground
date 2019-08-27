#include<stdio.h>
#include<stdlib.h>
struct employee
{
    int id,age,salary;
    char name[10],designation[10];
};
int main()
{
    struct employee e;
    printf("Enter name:\n");
    scanf("%s",e.name);
    printf("Enter ID:\n");
    scanf("%d",&e.id);
    printf("Enter age:\n");
    scanf("%d",&e.age);
    printf("Enter designation:\n");
    scanf("%s",e.designation);
    printf("Enter Salary:\n");
    scanf("%d",&e.salary);
    printf("Employee Details\n");
    printf("Name of the Employee:%s\n",e.name);
    printf("ID of the Employee:%d\n",e.id);
    printf("Age of the Employee:%d\n",e.age);
    printf("Designation of the employee:%s\n",e.designation);
    printf("Salary of the Employee:%d\n",e.salary);
    return 0;
}