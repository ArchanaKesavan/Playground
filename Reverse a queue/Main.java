#include <iostream>
#include<stdlib.h>
using namespace std; 
class Node 
{ 
public: 
int data; 
Node *next; 
}; 
  Node* root = NULL;
void append(int new_data) 
{ 
  Node* new_node = new Node(); 
  Node *last= root;
  new_node->data = new_data; 
  new_node->next = NULL; 
  if(root==NULL)
  	root = new_node; 
  else{
    while(last->next!=NULL)
      last=last->next;
      last->next=new_node;
  }
} 
void rever(){
        Node* current = root; 
        Node *prev = NULL, *next = NULL; 
        while (current != NULL) { 
            next = current->next; 
            current->next = prev; 
            prev = current; 
            current = next; 
        } 
        root = prev; 
}
void printList() 
{ 
  Node *temp =  root;
  while (temp != NULL)
  { 
    cout<<temp->data<<" "; 
    temp = temp->next; 
  } 
} 
int main() 
{ 
  int a;
    do{
      cin>>a;
      if(a<0)
        break;
      append(a);
    }while(1);
  if(root == NULL)
  {
  cout<<"Queue is empty";
    return 0;
  }
  cout<<"Before reversing:"<<endl;
  printList();
  rever();
  cout<<endl<<"After reversing:"<<endl;
  printList();
  return 0;
}
