#include<iostream>
using namespace std;
struct node
{
  int data;
  node*next;
};
node*head = NULL;
node*tail = NULL;
void append(int d)
{
  node*newnode;
 newnode=new node;
  //newnode=(struct node*)malloc(sizeof(struct node));
  newnode->data=d;
  newnode->next =NULL;
  if(head==NULL)
  {
    head= newnode;
    tail = newnode;
  }
  else
  {
    tail->next = newnode;
    tail=newnode;
    tail->next=head;
  }
}
void display()
{
  node*temp;
  temp = head;
  while(temp->next!=head)
  {
    cout<<temp ->data<<endl;
    temp = temp ->next;
  }
  cout<<temp->data<<endl;
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