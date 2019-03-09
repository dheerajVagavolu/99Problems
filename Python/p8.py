#Flatten a nested List structure

#Nested List

nested = [1,2,3,[33,44],102,[1,3,4]]

#to convert into [1,2,3,33,44,102,1,3,4]

def flatttenIT(listy):
	flat = []
	for item in listy:
		if(type(item)==list):
			flat.extend(flatttenIT(item))
		else:
			flat.append(item)
	return flat

print(nested)

flatList = flatttenIT(nested)

print(flatList)