#Length encoding of a list using group function

def group(alist):
	packed = []
	for i, item in enumerate(alist):
		if i ==0 or item != alist[i-1]:
			packed.append([item])
		else:
			packed[-1].append(item)
	return packed

def encode(alist):
	return [[len(packed), packed[0]] for packed in group(alist)]

sampleList = ['a','a','a','a','b','c','c','a','a','d','e','e','e','e']

newList = encode(sampleList)

print(newList)