limit = int(input())

numbers = [x for x in range(2, limit + 1)]

for i in range(2,int(limit ** .5) + 1):
    numbers[:] = [x for x in numbers if x % i != 0 or x % i == 0 and x == i]

print(numbers)