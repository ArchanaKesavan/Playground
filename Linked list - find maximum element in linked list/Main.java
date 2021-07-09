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
  Node* newnode = new Node(); //allocating the memory using new keyword
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
void printList(Node *node) 
{ 
   int m=0;
  if(node!=NULL){
  while (node != NULL) 
  { 
  if(node->data>m)
    m=node->data;
 node = node->next; 
  } 
  }
  cout<<m;
} 

int main() 
{
 Node* head = NULL; 
   int a;
    do{
      cin>>a;
      if(a<0)
        break;
      append(&head,a);
    }while(a>0);
  printList(head);
    return 0;
}