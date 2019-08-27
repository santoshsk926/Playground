#include <stdio.h>
#include <stdlib.h>
struct node 
{
    int data;          
    struct node *next;  
}*head;
void insertNodeAtBeginning(int data)
{
    struct node *newNode;
    newNode = (struct node*)malloc(sizeof(struct node));
    if(newNode == NULL)
    {
        printf("Unable to allocate memory.");
    }
    else
    {
        newNode->data = data; 
        newNode->next = head; 
        head = newNode;          
    }
}
void displayList()
{
    struct node *temp;
    if(head == NULL)
    {
        printf("List is empty.");
    }
    else
    {
        temp = head;
        while(temp != NULL)
        {
            printf("%d ", temp->data); 
            temp = temp->next;                 
        }
    }
}
int main()
{
    int n, data;
    do
    {
        scanf("%d",&data);
        if(data>0)
        {
            insertNodeAtBeginning(data);
        }
    }
    while(data>-1);
    displayList();
    return 0;
}