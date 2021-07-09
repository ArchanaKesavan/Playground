#include<iostream>
using namespace std;
struct Node
{
    int data;
    Node *next;
};
void create(int d);
void display();
int del();
Node *head = NULL;
Node *tail = NULL;
int main()
{
    int d;
    do
    {
        cin>>d;
        if(d<0)
          break;
          create(d);
    }while(1);
    cout<<"Before deletion:"<<endl;
    display();
    int i=1;
    while(del())
    {
     cout<<"After "<<i<<" deletion:"<<endl;
     display();
     i++;
     }
    return 0;
}
void create(int d)
{
    Node *newnode;
    newnode = new Node();
    newnode->data = d;
    newnode->next = NULL;
    if(head == NULL)
    {
       head = newnode;
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
    Node *temp;
    temp = head;
    if(temp == NULL)
    {
        cout<<"No value to delete"<<endl;
    }
    else
    {
        while(temp!= NULL)
        {
            cout<<temp->data<<endl;
        temp=temp->next;
        }
    }
}
/*int del()
  {
    Node*temp=head;
   while(temp->next!=tail)
    {
     temp=temp->next;
   }
    temp->next=NULL;
    tail=temp;
  }*/
  int del()
{
 Node *temp,*p;
  if(head == NULL)
    return 0;
  else if(head -> next == NULL)
  {
    head = NULL;
    free(head);
    return 1;
  }
  temp = head;
    while(temp -> next != NULL)
    {
      p=temp;
      temp = temp -> next;
    }
    p -> next = NULL;
    free(temp);
    return 1;
  }
