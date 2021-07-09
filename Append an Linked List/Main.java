#include<iostream>
using namespace std;
struct node
{
int data;
struct node *next;
};
void insert(struct node **headadd,int data)
{
  struct node *newnode,*temp;
  temp = *headadd;
  newnode=(struct node*) malloc(sizeof(struct node));
  newnode->data = data;
  newnode->next = NULL;
  if(*headadd == NULL)
    *headadd=newnode;
  else
  {
    while(temp->next != NULL)
    {
      temp = temp->next;
    }
    temp->next = newnode;
  }
}
void display(struct node *head)
{
while(head != NULL)
{
  cout<<head->data<<endl;
  head = head->next;
}
}
int main()
{
  struct node *head = NULL;
  int data;
  
  do{
    cin>>data;
  if(data>0)
    insert(&head,data);
  }while(data>0);
  display(head);
  return 0;
}