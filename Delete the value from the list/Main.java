#include <iostream> 
using namespace std; 
class Node 
{ 
public: 
int data; 
Node *next; 
}; 
void append(Node** head, int newdata) 
{ 
  Node* newnode = new Node(); 
  Node *temp=*head;
  newnode->data = newdata; 
  newnode->next = NULL; 
  if(*head==NULL)
  	*head = newnode; 
  else{
    while(temp->next!=NULL)
      temp=temp->next;
      temp->next=newnode;
  }
} 
void delet(Node** head,int a)
{
  if(*head==NULL)
  return ;
    Node *last=*head,*prev=NULL;
  if(last->data==a)
    *head=last->next;
  else{
 do {
      prev=last;
      last=last->next;
    }  while(last!=NULL&&last->data!=a);
      if(last==NULL)
      return ;
  prev->next=last->next;
  }

  delete(last);
}

void printList(Node *head) 
{ 
  while (head != NULL) 
  { 
    cout<<head->data<<endl; 
    head = head->next; 
  } 
} 
int main() 
{
  Node* head = NULL; 
  int d,a;
    do{
      cin>>d;
      if(d>0)
      append(&head,d);
    }while(d>0);
  cout<<"Before deletion:"<<endl;
  printList(head);
cout<<"Enter the value to be deleted:"<<endl;
  cin>>a;
  delet(&head,a);
  cout<<"After deletion:"<<endl;
      printList(head);

  return 0;
}