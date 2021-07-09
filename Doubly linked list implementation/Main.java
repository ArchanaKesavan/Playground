#include<iostream>
using namespace std;
struct node
{
  int data;
  node*next;
  node*prev;
};
node*head = NULL;
node*tail = NULL;
void append(int d)
{
  node*newnode;
 newnode=new node;
  //newnode=(struct node*)malloc(sizeof(struct node));
  newnode->data=d;
  newnode->prev = NULL;
  newnode->next = NULL;
  if(head==NULL)
  {
    head=newnode;
    tail=newnode;
  }
  else
  {
    tail->next=newnode;
    newnode->prev=tail;
    tail=newnode;
  }
}
void display()
{
  node*temp;
  temp = head;
  while(temp!=NULL)
  {
    cout<<temp ->data<<endl;
    temp = temp ->next;
  }
}

int main()
{
  int d;
  do
  {
    cin>>d;
    if(d>0)
      append(d);
    }while(d>0);
    display();
  }
