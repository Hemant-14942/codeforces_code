# t=int(input())
# for i in range (t):
#     c=0
#     n=int(input())
#     l=input()
#     flag=0
#     for i in range(0,n-2):
#         if(l[i]==l[i+1] and l[i+1]==l[i+2] and l[i]=='.'):
#             flag=1
#             print(2)
#             break
#     if flag==0:
#         print(l.count('.'))
####################################
# t = int(input())
# for _ in range(t):
#     c = 0
#     n = int(input())
#     l = input()
#     found_consecutive_dots = False
#     for i in range(n - 2):
#         if l[i:i+3] == '...':
#             found_consecutive_dots = True
#             print(2)
#             break
#     if not found_consecutive_dots:
#         for j in l:
#             if j == '.':
#                 c += 1
#         print(c)
#################################
t=int(input())
for i in range (t):
    c=0
    n=int(input())
    l=input()
    flag=0
    for i in range(0,n-2):
        if(l[i]==l[i+1] and l[i+1]==l[i+2] and l[i]=='.'):
            flag=1
            print(2)
            break
    if flag==0:
        for i in range(n):
            if l[i]=='.':
                c=c+1
        print(c)