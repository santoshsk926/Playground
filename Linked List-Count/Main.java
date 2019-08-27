#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node* next;
};
void append(struct node **head,int);
 void display(struct node *head);
int main()
{
    struct node *head=NULL;
    int data;
    int c=0;
    do
    {
    scanf("%d",&data);
    if(data>0){
        c++;
    append(&head,data);}
    }while(data>-1);
    printf("The students who are present in the class are\n");
    display(head);
    printf("\nThe number of students who are present is %d.",c);
    return 0;
}

   void append(struct node **head,int data)
    {
        struct node *temp,*new_node;
        temp=*head;
    new_node=(struct node*)malloc(sizeof(struct node));
    new_node->next=NULL;
    new_node->data=data;
    if(*head==NULL)
    {
        *head=new_node;
    }
    else{
    while(temp->next!=NULL)
        temp=temp->next;
    temp->next=new_node;
    }
    }
    
    
   void display(struct node *head)
    {
     struct node *temp=head;
while(temp!=NULL)
{
     printf("%d ",temp->data);
     temp=temp->next;
}
    }