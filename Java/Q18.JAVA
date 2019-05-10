class Q18 
{
    <T> List<T> F(List<T> list, int i, int k) 
    {
        return list.splitAt(k).getA().splitAt(i - 1).getB();
    }
}