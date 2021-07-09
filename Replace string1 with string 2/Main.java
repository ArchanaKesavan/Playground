k=input()
m=input()
li=[]
f=m[:1]
for i in k:
  if(f not in i):
    li.append(i)
  else:
    break;
    
m1=''.join(li)
print(m1+m)
