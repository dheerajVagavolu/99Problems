#Drop every nth element from a list

def dropn(alist, n):
	return alist[::n]

sample = [1,2,3,4,5]

newList = dropn(sample, 2)	

print(newList)