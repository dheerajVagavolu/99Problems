class Q21 
{
    <T> List<T> F(List<T> list, int n, T x) 
    {
        List<T> result = nil();
        int i = 0;
        for (T E : list) 
        {
            i++;
            result = i == 1 ? cons(x, cons(E, result)) : cons(E, result);
        }

        return result.reverse();
    }
}