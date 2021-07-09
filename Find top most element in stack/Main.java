#include<iostream>
using namespace std;
class Node
{
  public:
  int data;
  Node *next;
};

void append(Node **head,int data)
{
  Node *newnode=new Node();
  newnode->data = data;
  newnode -> next =*head;
  *head = newnode;
}

void printList(Node *head)
{
  while(head != NULL)
  {
    cout<<head->data<<" ";
    head = head -> next;
  }
}

void maxi(Node *head ,Node **h)
{
  while(head != NULL)
  {
    if(head -> next != NULL && head -> next -> data > head -> data)
      append(h,head->next->data);
    else
      append(h,head -> data);
    head = head -> next;
  }
}

int main()
{
  Node *head = NULL,*h=NULL;
  int d;
  do{
    cin>>d;
    if(d>0)
      append(&head,d);
  }while(d>0);
  cout<<"Before maximizing:"<<endl;
  printList(head);
  cout<<endl<<"After maximizing:"<<endl;
  maxi(head,&h);
  printList(h);
  return 0;
}