#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node* next;
};
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
    else
    {
        while(temp->next!=NULL)
            temp=temp->next;
        temp->next=new_node;
    }
}
void display(struct node *head)
{
    struct node *temp;
    temp=head;
    if(temp->next!=NULL)
        display(temp->next);
    printf(" %d",temp->data);
}
int main()
{
    struct node *head=NULL;
    int data;
    do
    {
        scanf("%d",&data);
        if(data>0)
            append(&head,data);
    }
    while(data>-1);
    struct node *temp=head;
    printf("The students are seated in the order:");
    while(temp!=NULL)
    {
        printf(" %d",temp->data);
        temp=temp->next;
    }
    printf("\nAfter reversing the students are seated in the order:");
    display(head);
    return 0;
}