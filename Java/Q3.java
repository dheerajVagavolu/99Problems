//kth element in a list
class Q3{
	public static void main(String[] args)
	{
		int ar[] = {1,2,3,4,5,6};
		int i = myFunction(ar,4);
		System.out.println(i);
	}

	private static int myFunction(int [] ar, int k) {
		//System.out.println(ar[ar.length-1]);
		return ar[k-1];
	}
}