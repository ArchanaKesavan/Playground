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
void check(Node **head, int newdata)
{
  Node *node = *head;
  while(node != NULL)
  {
    if(node -> data == newdata)
      return;
    node = node ->next;
  }
 append(head,newdata);
}
void printList(Node *node)
{
  while(node != NULL)
  {
    cout<<node->data<<endl;
    node = node->next;
  }
}
int main() 
{
 Node* head = NULL; 
  int a;
    do{
      cin>>a;
      if(a<0)
        break;
      check(&head,a);
    }while(a>0);
  printList(head);
    return 0;
}