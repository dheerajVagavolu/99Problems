#List Rotation of n places

def rotate(alist, n):
	return alist[n:]+alist[:n]

sample = [1,2,3,4,5]

newList = rotate(sample,4)

print(newList)

