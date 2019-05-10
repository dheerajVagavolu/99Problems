class Q17 
{
    <T> Pair<List<T>, List<T>> F(int n, List<T> list) 
    {
        return list.splitAt(n);
    }
}