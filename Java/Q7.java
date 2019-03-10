//Eleminate Consecutive Duplicates of list elements.
class Q7{

	public static int len;

	public static void setlength(int a){
		len = a;
	}

	public static void main(String[] args)
	{
		int ar[] = {1,2,3,3,3,222,222,1,1,1};
		
		
		
		ar = removedupes(ar);

		for(int i = 0;i<len;i++){
			System.out.println(ar[i]);
			
		}
		
	}

	public static int [] removedupes(int [] ar){
	int [] array = new int[10];

	int j = 1;

	array[0] = ar[0];
	for(int i = 1;i<ar.length-1;i++){
		if(ar[i]!=ar[i-1]){
			array[j] = ar[i];
			j++;
			
		}
	}
	setlength(j);


	return array;
	}
}