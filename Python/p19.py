#Remove kth element from a list

def removek(alist, k):
	return alist[:k-1]+alist[k:]

sample = [1,2,3,4,5]

newList = removek(sample,4)

print(newList)