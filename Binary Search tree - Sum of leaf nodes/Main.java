#include<iostream>
#include <stdio.h>
#include<stdlib.h>

using namespace std;
struct node

{
    
int data;
    
struct node *left,*right;

}*root;


struct node *newnode(int item)

{
   
 struct node*temp=(struct node*)malloc(sizeof(struct node));
   
 temp->data=item;
   
 temp->left=temp->right=NULL;
 
   return temp;

}


struct node*insert(struct node* node,int data)

{
   
 if(node==NULL)
   
 {
        
return newnode(data);
  
  }
   
 if(data < node->data)
 
   {
       
 node->left=insert(node->left,data);
  
  }
    
else if(data > node->data)
  
  {
      
  node->right=insert(node->right,data);
 
   }
    
return node;

}
void leafSum(struct node *root, int *sum){ 
    if (!root) 
        return; 
  
   
    if (!root->left && !root->right) 
        *sum += root->data; 
  
   
    leafSum(root->left, sum); 
    leafSum(root->right, sum); 
} 
  
int main()

{
    
int data,n;
 

 
do

    {

        scanf("%d",&data);
 
       if(data>0)
  
      {

            root=insert(root,data);

        }

        
    }
while(data>0);
 int sum = 0; 
    leafSum(root, &sum); 
    cout <<"Sum of all leaf nodes are "<< sum << endl;

   return 0;

}
