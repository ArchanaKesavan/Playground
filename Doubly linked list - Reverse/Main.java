#include<iostream>
using namespace std;
class Node 
{ 
public: 
int data; 
Node *next,*prev; 
}; 
void append(Node** head, int newdata) 
{ 
  Node* newnode = new Node(); 
  Node *last=*head;
  newnode->data = newdata; 
  newnode->next = newnode->prev=NULL; 
  if(*head==NULL)
  	*head = newnode; 
  else{
    while(last->next!=NULL)
      last=last->next;
      last->next=newnode;
    newnode->prev=last;
  }
} 
void h(Node** head){
  Node *p,*t,*node=*head;
   while (node!= NULL) {
     p=node;
     node = node->next;
  t=p->prev;
  p->prev=p->next;
  p->next=t;
   }
  *head=p;
}
void printList(Node *node) 
{ 
  while (node != NULL) 
  { 
    cout<<node->data<<endl; 
    node = node->next; 
  } 
} 
int main()
{
  Node *head=NULL;
  int a;
  do{
    cin>>a;
    if(a<0)
      break;
    else
      append(&head,a);
  }while(1);
  cout<<"Original order:"<<endl;
  printList(head);
  h(&head);
   cout<<"Reverse order:"<<endl;
  printList(head);
  return 0;
}