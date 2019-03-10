// Length Encoding of a list.

//Checking wether a list is palindrome or not.
//Reverse a list
class Q8{
	public static void main(String[] args)
	{
		int ar[] = {1,2,3,4,2,1};
		
		encode(ar);

	}

	public static void encode(int [] ar){
		int c = 1;
		for(int i = 0;i<ar.length/2;i++){
			if(ar[i]!= ar[ar.length-1-i]){
				c = 0;
			}
		}

		if(c==1){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}