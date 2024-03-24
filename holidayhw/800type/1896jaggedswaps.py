t=int(input())
for i in range(t):
    n=int(input())
    l=list(map(int,input().split()))
    lnew=l.copy()
    for k in range(n):
        for j in range(1,n-1):
            if(l[j]>l[j-1] and l[j]>l[j+1]):
                l[j],l[j+1]=l[j+1],l[j]
    if(l==sorted(lnew)): 
        print('yes')  
    else:
        print('no')         
            
        