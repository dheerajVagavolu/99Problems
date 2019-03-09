#Decode a run-length encoded list.

sample = [[4,'a'], [5,'b'],[6,'g']]

def decode(alist):
	decoded = []
	for item in sample:
		for i in range(0,item[0]):
			decoded.append(item[1])
	return decoded

newList = decode(sample)

print(newList)