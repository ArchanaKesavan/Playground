#include<iostream>
using namespace std;
struct node
{
  int data;
  node*next;
};
struct node*head=NULL;
struct node*tail=NULL;
void append(int d)
{
  node*newnode;
  newnode=new node;
  newnode->data=d;
  newnode->next=NULL;
  if(head==NULL)
  {
    head=newnode;
    tail=newnode;
  }
  else
  {
    tail->next=newnode;
    tail=newnode;
  }
}
void display()
{
  node*temp=head;
  while(temp!=NULL)
  {
    cout<<temp->data<<" ";
    temp=temp->next;
  }
}
int main()
{
  int data;
  do
  {
    cin>>data;
    if(data>0)
      append(data);
  }while(data>0);
  display();
  return 0;
}