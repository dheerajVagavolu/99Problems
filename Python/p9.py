#Eliminate consecutive duplicates of list elements


list = [1,1,1,3,3,7,14,4,4,12,12,15]

def removeDupes(aList):
	return aList[:1] + [aList[i] for i in range(1, len(aList)) if aList[i-1] != aList[i]]

print(list)
newList = removeDupes(list)
print(newList)