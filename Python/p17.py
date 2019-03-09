#Extractin a slice for i to k

def slice(alist, i ,k):
	return alist[i-1:k]

sample = [1,2,3,4,5,6,7,8,9]

newList = slice(sample,3,7)

print(newList)
