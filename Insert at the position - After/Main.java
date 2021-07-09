#include<iostream>
using namespace std;
struct node
{
  int data;
  node*next;
};
node*head=NULL;
node*tail= NULL;
void append(int data)
{
  node*newnode;
  newnode=new node;
  newnode->data=data;
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
void insert(int pos,int value)
{
  int i;
  node*newnode=new node;
  node*temp=head;
  newnode->data=value;
  for(i=1;i<pos;i++)
  temp=temp->next;
  newnode->next=temp->next;
  temp->next=newnode;
}
void display()
{
  node*temp=head;
  if(temp==NULL)
  {
    cout<<"List is empty"<<endl;
  }
  else
  {
    while(temp!=NULL)
    {
      cout<<temp->data<<endl;;
      temp=temp->next;
    }
  }
}
int main()
{
    int data;
    do{
        cin>>data;
        if(data<0)
          break;
            append(data);
    }while(data>0);
  cout<<"Before inserting the value:"<<endl;
  display();
  cout<<"Enter the position and value to be inserted:"<<endl;
  int pos,da;
  cin>>pos>>da;
  insert(pos,da);
  cout<<"After inserting the value:"<<endl;
  display();
}