#Pack consecutive duplicates of list elements into sublists

def group(alist):
	packed = []
	for i, item in enumerate(alist):
		if i ==0 or item != alist[i-1]:
			packed.append([item])
		else:
			packed[-1].append(item)
	return packed

sampleList = ['a','a','a','a','b','c','c','a','a','d','e','e','e','e']

newList = group(sampleList)
print(sampleList)
print(newList)