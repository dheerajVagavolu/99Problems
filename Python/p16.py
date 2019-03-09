#Split a list into two parts; the length of the first part is given

def split(alist, n):
	return alist[:n], alist[n:]

sample = [1,2,3,4,5,6,7,8]

first, second = split(sample,3)

print(first)
print(second)