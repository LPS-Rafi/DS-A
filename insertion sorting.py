#making insert method that will check if the element is less than the previous element and if it is then it will swap the elements
def insert(A, j):
    for i in range(j, 0, -1):
        if A[i] < A[i-1]:
            A[i], A[i-1] = A[i-1], A[i]
        else:
            break
#making a list and calling the insert method
li= [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]
#calling the insert method
for j in range(1, len(li)):
    insert(li, j)

print(li)