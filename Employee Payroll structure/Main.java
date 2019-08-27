#include<stdio.h>
#include<stdlib.h>
struct employee
{
    int ba,hra,da,ma,ph,ins,id,pf;
    char name[10];
    float gs,ns; 
};
int main()
{
   int i,n,a,gs;
   printf("Enter the number of employees:");
   scanf("%d",&n);
    struct employee *s;
   s=(struct employee*)malloc(n*sizeof(struct employee));
   struct employee *p=s;
   printf("\nEnter your input for every employee:\n");
   for(i=0;i<n;i++)
   {
       printf("Employee ID:");
       scanf("%d",&(s->id));
       printf("\nEmployee Name:");
       scanf("%s",s->name);
        printf("\nBasic salary,HRA:");
       scanf("%d %d",&s->ba,&s->hra);
        printf("\nDA,Medical Allowance:");
       scanf("%d %d",&s->da,&s->ma);
        printf("\nPF and Insurance:");
       scanf("%d %d",&s->pf,&s->ins);
       s++;
        
   }
   int idd;
   printf("Enter employee ID to get payslip:\n");
      scanf("%d",&idd);
   do
   {
      if(idd==p->id)
      {
          s=p;
      printf("Salary slip of Rajkumar:\n");
       printf("Employee ID:%d\n",s->id);
       printf("Basic Salary:%d\n",s->ba);
       printf("House Rent Allowance:%d\n",s->hra);
       printf("Dearness Allowance:%d\n",s->da);
       printf("Medical Allowance:%d\n",s->ma);
       s->gs=(s->ba+s->hra+s->da+s->ma)*12;
       printf("Gross Salary:%.2f Rupees\n",s->gs);
       printf("Deductions:\n");
       printf("Provident fund:%d\n",s->pf);
       printf("Insurance:%d\n",s->ins);
       s->ns=(s->gs)-((s->pf+s->ins)*12);
       printf("Net Salary:%.2f Rupees\n",s->ns);
      }
      else
      {
          s++;
      }
   }
   while(idd!=s->id);
   
    return 0;
}