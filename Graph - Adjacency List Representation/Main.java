#include<iostream>
using namespace std;
#include<bits/stdc++.h>  
#include<vector>
void addEdge(vector<int> adj[], int u, int v) 
{ 
	adj[u].push_back(v); 
	adj[v].push_back(u); 
} 
void printGraph(vector<int> adj[], int v) 
{ 
  cout<<"Adjacency List:\n";
	for (int i = 0; i < v; i++) 
	{ 
		cout << i<<"--->"; 
		for ( vector<int> :: iterator x=adj[i].begin();x!=adj[i].end();x++) 
		cout << *x<<" "; 
		cout<<"\n"; 
	} 
} 
int main()
{
  cout<<"Enter the number of vertices:\nEnter the number of edges:\n";
  int v,e;
  cin>>v>>e;
  vector<int> adj[v]; 
  for(int i=1;i<=e;i++)
  {
    cout<<"Enter the Start node and End node of edge "<<i<<endl;
    int s,e;
    cin>>s>>e;
    addEdge(adj,s,e); 
  }
      printGraph(adj, v); 
  return 0;
}