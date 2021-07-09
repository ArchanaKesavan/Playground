#include <stdio.h>
#include<stdlib.h>
struct node
{
  int data;
  struct node *next;
};
struct node *head =NULL;
void append(int d)
{
  struct node * newnode;
  newnode=(struct node*)malloc(sizeof(struct node));
  newnode->data=d;
  newnode->next=NULL;
  if(head==NULL)
  {
    head=newnode;
  }
  else
  {
    newnode->next=head;
    head=newnode;
  }
}
void display(struct node *head)
{
  struct node *temp=head;
  while(temp!=NULL)
  {
    printf("%d\n",temp->data);
    temp=temp->next;
  }
}
int main()
{
  int d;
  
  do 
  {
    scanf("%d",&d);
    if(d>0)
      append(d);
  }while(d>0);
  display(head);
}
    