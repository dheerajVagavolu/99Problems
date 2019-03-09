#Duplicate(double) the elements of a list


def dupe(alist):
	new = []
	for item in alist:
		for i in range(0,2):
			new.append(item)
	return new

sample = [1,2,3,4,5]

newList = dupe(sample)

print(newList)