//Reverse a list
class Q5{
	public static void main(String[] args)
	{
		int ar[] = {1,2,3,4,5,6};
		
		for(int i = 0;i<ar.length/2;i++){
			int temp = ar[ar.length - i - 1];

			ar[ar.length - i - 1] = ar[i];

			ar[i] = temp;
		}

		for(int i = 0;i<ar.length;i++){
			System.out.println(ar[i]);
		}

	}
}