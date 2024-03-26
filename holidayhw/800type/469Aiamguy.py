level =int(input())
n1=int(input())
l1=input().split()
l1=[int(i) for i in l1] 
n2=int(input())
l2=input().split()
l2=[int(i) for i in l2] 
l1n=l1.copy()
l2n=l2.copy()
l1n.extend(l2n)
for i in l1n:
    if(i==level):
        print("I become the guy.")
        break  
else:
    print("Oh, my keyboard!")           
    
