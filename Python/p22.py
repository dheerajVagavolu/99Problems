#Extract a given number of randomly selected elements from a list
import random

def pick(alist, n):
	tmp = alist
	new = []
	for i in range(n):
		x = random.choice(tmp)
		new.append(x)
		tmp.remove(x)
	return new

sample = [1,2,3,4,5,6,7]

newList = pick(sample, 2)

print(newList)