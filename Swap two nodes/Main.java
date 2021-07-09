/* This program swaps the nodes of linked list rather 
than swapping the field from the nodes.*/
#include <bits/stdc++.h> 
using namespace std; 

/* A linked list node */
class Node 
{ 
	public: 
	int data; 
	Node *next; 
}; 

/* Function to swap nodes x and y in linked list by 
changing links */
void swapNodes(Node **head_ref, int x, int y) 
{ 
// Nothing to do if x and y are same 
if (x == y) return; 

// Search for x (keep track of prevX and CurrX 
Node *prevX = NULL, *currX = *head_ref; 
while (currX && currX->data != x) 
{ 
	prevX = currX; 
	currX = currX->next; 
} 

// Search for y (keep track of prevY and CurrY 
Node *prevY = NULL, *currY = *head_ref; 
while (currY && currY->data != y) 
{ 
	prevY = currY; 
	currY = currY->next; 
} 

// If either x or y is not present, nothing to do 
if (currX == NULL || currY == NULL) 
	return; 

// If x is not head of linked list 
if (prevX != NULL) 
	prevX->next = currY; 
else // Else make y as new head 
	*head_ref = currY; 

// If y is not head of linked list 
if (prevY != NULL) 
	prevY->next = currX; 
else // Else make x as new head 
	*head_ref = currX; 

// Swap next pointers 
Node *temp = currY->next; 
currY->next = currX->next; 
currX->next = temp; 
} 

/* Function to add a node at the beginning of List */
void push(Node** headadd, int data) 
{ 
	 Node *temp,*newnode;
    temp=*headadd;
    newnode=(Node*)malloc(sizeof(Node));
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

/* Function to print nodes in a given linked list */
void printList(Node *node) 
{ 
	while(node != NULL) 
	{ 
		cout<<node->data<<" "; 
		node = node->next; 
	} 
} 

/* Driver program to test above function */
int main() 
{ 
	Node *start = NULL; 
  int n,data;
    cin>>n;
     for(int i=1;i<=n;i++)
     {
       cin>>data;
	push(&start, data); 
     }
	 int x,y;
	cin>>x>>y;
	swapNodes(&start, x, y); 

	printList(start); 

	return 0; 
} 

// This is code is contributed by rathbhupendra 
