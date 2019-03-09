#Create a list containing all integers within a given range

def create(start, end):
	new = []
	for i in range(start, end+1):
		new.append(i)
	return new
	
newList = create(3,7)
print(newList)