#include<iostream>
//#include <bits/stdc++.h> 
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
  Node *last = *head; 
  newnode->data = newdata; 
  newnode->next = NULL; 
  if (*head == NULL) 
    { 
    *head = newnode; 
    return; 
    } 
  while (last->next != NULL) 
  	last = last->next; 
  last->next = newnode; 
return; 
} 
void delet(Node** h){
  Node *n=*h,*p=NULL,*t;
  while(n->next!=NULL){
    t=p;
  p=n;
  n=n->next;
  }
    if(t==NULL)
      *h=n;
    else
      t->next=n;
    delete(p);
}
void printList(Node *node) 
{ 
  while (node != NULL) 
  { 
    cout<<node->data<<" "; 
    node = node->next; 
  } 
} 

int main() 
{
  Node* head = NULL; 
  int a,i=0;
    do{
      cin>>a;
      if(a<0)
        break;
      append(&head,a);
      i++;
    }while(1);
if(i<=1)
     cout<<"Deletion of second last element is not possible"<<endl;
else{
  
  delet(&head);
  
  printList(head);
}
  
  return 0;
}
