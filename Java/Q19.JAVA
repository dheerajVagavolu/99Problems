class Q19 
{
    <T> L<T> F(L<T> L, int n) 
    {
        int l = L.length();
        int i = L.nonEmpty() ? n % l : 0;
        Pair<L<T>, L<T>> p = L.splitAt(i < 0 ? l + i : i);
        return concat(p.getB(), p.getA());
    }
}