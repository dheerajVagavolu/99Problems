#Insert an element at a given position into a list

def insert_at(val, alist, pos):
	return alist[:pos-1]+[val]+alist[pos-1:]

sample = [1,2,3,4,5]

newList = insert_at(7,sample,4)

print(newList)