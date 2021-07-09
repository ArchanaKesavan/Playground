#include<stdio.h>
#include<string.h>

int main()
{
    char a[100];
    int l,i,j;
    scanf("%s",a);
    l=strlen(a);
    for(i=0;i<l;i++)
    {
        
if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
        {
            
        }else printf("%c",a[i]);
    }
    return 0;
}
