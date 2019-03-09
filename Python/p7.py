#Finding if a list is palindrome

def isPalindrome(somelist):
	return somelist == somelist[::-1]

list1 = [1,2,3,2,1]
list2 = [2,3,1,4]

print(isPalindrome(list1))

print(isPalindrome(list2))