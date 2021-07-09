#include<iostream>
using namespace std; 
struct Node 
{ 
	char data; 
	Node *next; 
}; 
Node *root = NULL;
void append(int d) 
{ 
  Node* newnode = new Node(); 
  newnode->data = d; 
  newnode->next = root; 
  root = newnode; 
} 
void printList() 
{ 
  Node *temp = root;
  while ( temp != NULL) 
  { 
    cout<<temp->data; 
    temp = temp->next; 
  } 
} 

int main() 
{ 
  string a;
  cin>>a;
  int i=0;
    do{
      if(a[i]=='\0')
        break;
      append(a[i]);
      i++;
    }while(1);
  printList();
  return 0;
}
