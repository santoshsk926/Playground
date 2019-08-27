#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
}*head=NULL;
void insertInAscOrder(int val) 
{
    struct node *newnode,*temp,*previous;
    newnode = (struct node *)malloc(sizeof(struct node)); 
    if(newnode == NULL) 
    {
        printf("Insufficient memory.");
        return;
    }
    newnode -> data = val;
    newnode->next = NULL;    
    if (head== NULL) 
    {       
        head= newnode;
    } 
    else if(val < head-> data) 
    {
        newnode-> next = head;
        head= newnode;
    } 
    else 
    {   
        previous = head;
        temp =head->next;
        while(temp != NULL && val > temp -> data) 
        {
            previous = temp;
            temp = temp -> next;
        }
        if(temp == NULL) 
        {
            previous -> next = newnode;
        } 
        else 
        {
            newnode-> next = temp;
            previous -> next = newnode;
        }
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
            insertInAscOrder(data);
        }
    }
    while(data>-1);
    printf("The students are seated in the order:");
    display();
    return 0;
}
