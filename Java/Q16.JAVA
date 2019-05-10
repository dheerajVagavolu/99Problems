

class Q16 
{
	    <T> List<Pair<Integer, T>> F(List<List<T>> list) 
	    {
	        List<Pair<Integer, T>> R = nil();
	        
		        for (List<T> E : list.reverse())
		            R = cons(pair(E.length(), E.head()), R);

	        return R;
    }
}