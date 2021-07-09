#include<iostream>
using namespace std;
struct node
{
  int data;
  node*next;
};
node*top=NULL;
void push(int d)
{
  node*newnode;
  newnode=new node;
  newnode->data=d;
  newnode->next =top;
  top=newnode;
}
void display()
{
  node*temp=top;
  while(temp!=NULL)
  {
    cout<<temp->data<<" ";
    temp=temp->next;
  }
}
int delet()
{
  if(top==NULL)
    return 0;
  cout<<endl<<"Deleted element is "<<top->data;
  top=top->next;
  return 1;
}
int main()
{
  int d;
  do
  {
    cin>>d;
    if(d<0)
      break;
    push(d);
  }while(1);
  cout<<"Before deleting:"<<endl;
  display();
  while(delet());
  {
  }
  cout<<endl<<"Stack is empty";
  return 0;
}
  