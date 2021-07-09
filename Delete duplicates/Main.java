#include <iostream> 
using namespace std; 
class Node 
{ 
public: 
int data; 
Node *next; 
}; 
void append(Node** head_ref, int new_data) 
{ 
  Node* new_node = new Node(); 
  Node *last=*head_ref;
  new_node->data = new_data; 
  new_node->next = NULL; 
  if(*head_ref==NULL)
  	*head_ref = new_node; 
  else{
    while(last->next!=NULL)
      last=last->next;
      last->next=new_node;
  }
} 

void remov(Node** head_ref){
   Node *last=*head_ref;
     Node *prev=NULL;
  while(last!=NULL){
    Node *c=*head_ref;
    while(c!=last){
      if(c->data!=last->data)
        c=c->next;
      else{
        prev->next=last->next;
        delete(last);
         last=prev->next;
        break;
      }
    }
    if(c==last){
    prev=last;
    last=last->next;
    }
  }
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
  Node* head = NULL; 
  int a;
    do{
      cin>>a;
      if(a<0)
        break;
      append(&head,a);
    }while(1);
  cout<<"Linked list before removal of duplicates"<<endl;
  printList(head);
 cout<<"Linked list after removal of duplicates"<<endl;
  remov(&head);
 
      printList(head);

  return 0;
}
