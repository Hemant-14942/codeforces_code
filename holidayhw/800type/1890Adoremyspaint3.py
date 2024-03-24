t=int(input())
for i in range(t):
    n=int(input())
    l=list(map(int,input().split()))
    unique_elements=[]
    c=0
    c1=0
    c2=0
    for i in l:
        if i not in unique_elements:
            unique_elements.append(i)
    for j in unique_elements:
        c=c+1
    if c>2:
        print('no')
    elif c==1:
        print('yes')
    else:
        print(unique_elements)
       
        for j in l:
            if unique_elements[0]==j:
                c1=c1+1
            elif unique_elements[1]==j:
                c2=c2+1
           
        if c2-c1==1 or c2-c1==0 or c2-c1==-1:
            print('yes')
        else:
            print('no')
            
    