class Q20 
{
    <T> Pair<L<T>, T> F(L<T> L, int n) 
    {
        L<T> xs = nil();
        T x = null;
        int i = 0;
        for (T E : L) 
        {
            i++;
            if (i == n)
                x = E;
            else
                xs = cons(E, xs);
        }

        return pair(xs.reverse(), x);
    }
}