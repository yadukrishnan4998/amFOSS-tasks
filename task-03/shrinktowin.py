num=int(input())
count=0
while num>=10:
    sum_of_digits=0
    while num>0:
        d=num%10
        sum_of_digits=sum_of_digits+d
        num=num//10
    num=sum_of_digits
    count=count+1
print(count)