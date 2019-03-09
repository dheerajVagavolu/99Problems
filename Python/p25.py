#Generate a random permutation of the elements of a list

import random 

def permute(alist):
	new = alist
	random.shuffle(new)
	return new

sample = [1,2,3,4,5]

new = permute(sample)

print(new)