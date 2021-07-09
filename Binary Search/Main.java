#include <iostream>
using namespace std;
int main()
{
  int c, f=0, l, m, n, search, a[100];
  cin>>n;  
  for (c = 0; c < n; c++)
  cin>>a[c];
  cin>>search;
   
  l = n - 1;
  m = (f+l)/2;

  while (f <= l) {
    if (a[m] < search)
      f = m + 1;
    else if (a[m] == search) {
    cout<<m;
      break;
    }
    else
      l = m - 1;

    m = (f + l)/2;
  }
  if (f> l)
   cout<<"Not found";

  return 0;
}