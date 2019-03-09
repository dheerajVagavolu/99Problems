#Lotto: Draw N different random numbers from the set 1

import random

def lotto(seq,n):
	return random.sample(seq, n)

sample = [1,2,3,4,5,6,7]

new = lotto(sample,3)

print(new)