#include <iostream> 
using namespace std; 
struct node 
{ 
	int data; 
	struct node* next; 
}; 
struct node *reverse (struct node *head, int k) 
{ 
	struct node* current = head; 
	struct node* next = NULL; 
	struct node* prev = NULL; 
	int count = 0; 
	while (current != NULL && count < k) 
	{ 
		next = current->next; 
		current->next = prev; 
		prev = current; 
		current = next; 
		count++; 
	} 
	
	if (next != NULL) 
	head->next = reverse(next, k); 

	return prev; 
} 


void push(struct node** headadd, int data) 
{ 
struct node *temp,*newnode;
    temp=*headadd;
    newnode=(struct node*)malloc(sizeof(struct node));
    newnode->data=data;
    newnode->next=NULL;
    if(*headadd==NULL)
      *headadd=newnode;
    else{
      while(temp->next!=NULL){
        temp=temp->next;  
  }
      temp->next=newnode;
}

} 
void printList(struct node *node) 
{ 
	while (node != NULL) 
	{ 
		cout<<node->data<<endl; 
		node = node->next; 
	} 
} 
int main() 
{ 
	struct node* head = NULL; 
  int data;
  do
  {
    cin>>data;
    if(data>0)
      push(&head,data);
  }while(data>0);
int key;
  cin>>key;
	head = reverse(head, key); 
printList(head); 

	return(0); 
} 

// This code is contributed by rathbhupendra 
