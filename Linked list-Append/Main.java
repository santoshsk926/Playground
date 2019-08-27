#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
};
struct node*head=NULL;
int append(int a)
{
    struct node *newnode,*temp;
    temp=head;
    newnode=(struct node*)malloc(sizeof(struct node*));
    newnode->data=a;
    newnode->next==NULL;
    if(head==NULL)
    {
        head=newnode;
    }else
    {
        while(temp->next!=NULL)
        {
            temp=temp->next;
        }
    temp->next=newnode;
    }
    return 0;
}
void display()
{
    struct node*temp=head;
    while(temp!=NULL)
    {
        printf("%d ",temp->data);
        temp=temp->next;
    }
    printf("\n");
}
int main()
{
  int data;
  do
  {
      scanf("%d",&data);
      if(data>0)
      {
          append(data);
      }
  }
  while(data>-1);
  display();
    return 0;
}