#include <iostream>
using namespace std;
class node
{
  public: 
  int data;
  node *next;
};
void append(node **head,int newdata)
{
  node* newnode = new node(); 
  node *last = *head; 
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

int List(node *Node,int a) 
{ 
while (Node != NULL)
  {  
  if(Node->data==a)
    return 1;
    Node = Node->next; 
  }   
  return 0;
} 

int main() 
{
 node *head = NULL;
  int a;
  do{
    cin>>a;
      if(a<0)
        break;
      append(&head,a);
  }while(a>0);
   cout<<"Enter the value to be searched:"<<endl;
  cin>>a;
  cout<<a;
  a = List(head,a);
   if(a)
    cout<<" is present in the list";
  else
    cout<<" is not present in the list";
  return 0;
    return 0;
}