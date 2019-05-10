class Q15 
{
    <T> List<T> F(int n, List<T> list) 
    {
        List<T> A = nil();
        for (T each : list)
            for (int i = 0; i < n; i++)
                A = cons(each, A);
        return A.reverse();
    }
}