#include<iostream>
using namespace std;

class Node
{ 
public: 
	int value; 
	Node* next; 
};

void print(struct Node *head)
{
    struct Node *node = head;
    while(node != NULL)
    {
        cout << node->value << endl;
        node = node->next;
    }
}

Node* newNode(int key) 
{ 
	Node* temp = new Node; 
	temp->value = key; 
	temp->next = NULL; 
	return temp; 
} 

void insert(Node **head, int value)
{
    Node *last = *head;
    Node *newnode = new Node;
    newnode->value = value;
    newnode->next = NULL;
    
    if(*head == NULL)
    {
        *head = newnode;
    }
    else
    {
        while(last->next != NULL)
        {
            last = last->next;
        }
        last->next = newnode;
    }
}

void swap(Node* head) 
{ 
  if(head!=NULL)
  {
	Node* temp = head; 
	while (temp != NULL && temp->next != NULL) { 
	
		swap(temp->value,temp->next->value); 

			temp = temp->next->next; 
	} 
}
  else
  {
    cout<<"List is empty";
  }
}

int main()
{
    Node* head = NULL;
    int a;
    while(1)
    {
        cin >> a;
        if(a >0)
        {
            insert(&head, a);
        }
        else
        {
           
          break;
        }
    }

    swap(head);
    
    
    print(head);
}