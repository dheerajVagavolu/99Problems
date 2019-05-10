import core.List;
import static core.List.*;

class P09 
{
    <T> List<List<T>> F(List<T> list) 
    {
        if (list.isEmpty()) 
            return nil();

        List< List<T> > result = nil();

        List<T> V = nil();
        
            for (T each : list) 
            {
                    if (V.isEmpty() || V.head() == each) 
                    {
                        V = cons(each, V);
                    } 
                    else 
                    {
                        result = cons(V, result);
                        V = singleton(each);
                    }
            }
            
            return result.reverse();
    }
}