import core.List;
import core.Pair;
import static core.List.*;
import static core.Pair.*;

class Q10 
{
	    <T> List<Pair<Integer, T>> F(List<List<T>> list) 
	    {
	        List<Pair<Integer, T>> R = nil();
	        
		        for (List<T> each : list.reverse())
		            R = cons(pair(each.length(), each.head()), R);

	        return R;
    }
}