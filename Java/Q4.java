//number of elements in a list
class Q4{
	public static void main(String[] args)
	{
		int ar[] = {1,2,3,4,5,6};
		int i = myFunction(ar);
		System.out.println(i);
	}

	private static int myFunction(int [] ar) {
		//System.out.println(ar[ar.length-1]);
		return ar.length;
	}
}