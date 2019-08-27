#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
};
int append(struct node **headadd,int a)
{
    struct node *newnode,*temp;
    temp=*headadd;
    newnode=(struct node*)malloc(sizeof(struct node*));
    newnode->data=a;
    newnode->next=NULL;
    if(*headadd==NULL)
    {
        *headadd=newnode;
    }
    else
    {
        while(temp->next!=NULL)
        {
            temp=temp->next;
        }
        temp->next=newnode;
    }
    return 0;
}
void display(struct node *head)
{
    printf("The students marks are:\n");
    while (head != NULL)
    {
        printf("%d ", head->data);
        head = head->next;
    }
    printf("\n");
}
void maximum(struct node *head)
{
    int max=head->data;
    while(head!=NULL)
    {
        if(max<head->data)
        {
            max=head->data;
        }
        head=head->next;
    }
    printf("The maximum mark is %d.",max);
}
int main()
{
    struct node *head;
    head=NULL;
    int data;
    do
    {   
        scanf("%d",&data);
        if(data>0)
        {
            append(&head,data);
        }
    }
    while(data>-1);
    display(head);
    maximum(head);
    return 0;
}