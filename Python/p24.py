#Generate a random permutation of the elements of a list

import random

def permute(alist):
	new = []
	for i in range(len(alist)):
		x = random.choice(alist)
		new.append(x)
		alist.remove(x)
	return new

sample = [1,2,3,4,5,6,7]

newList = permute(sample)

print(newList)