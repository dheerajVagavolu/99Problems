#Duplicate the elements of a list 'n' number of times


def dupe(alist,n):
	new = []
	for item in alist:
		for i in range(0,n):
			new.append(item)
	return new

sample = [1,2,3,4,5]

newList = dupe(sample,4)

print(newList)