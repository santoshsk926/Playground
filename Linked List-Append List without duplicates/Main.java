#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
}*head=NULL;
int append(int a)
{
    struct node *newnode,*temp;
    temp=head;
    newnode=(struct node*)malloc(sizeof(struct node*));
    newnode->data=a;
    newnode->next=NULL;
    if(head==NULL)
    {
        head=newnode;
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
void removeDuplicates() 
{ 
    struct node *ptr1, *ptr2, *dup; 
    ptr1 = head; 
    while (ptr1 != NULL && ptr1->next != NULL) 
    { 
        ptr2 = ptr1; 
        while (ptr2->next != NULL) 
        {
            if (ptr1->data == ptr2->next->data) 
            { 
                dup = ptr2->next; 
                ptr2->next = ptr2->next->next; 
                free(dup); 
            } 
            else
            {
                ptr2 = ptr2->next;
            }
        } 
        ptr1 = ptr1->next; 
    } 
} 
void display()
{
    while (head != NULL)
    {
        printf(" %d", head->data);
        head = head->next;
    }
    printf("\n");
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
            append(data);
        }
    }
    while(data>-1);
    removeDuplicates();
    printf("The assigned roll numbers are:");
    display();
    return 0;
}