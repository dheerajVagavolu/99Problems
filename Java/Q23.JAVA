class Q23 
{
    <T> List<T> F(int n, List<T> list) 
    {
        List<T> A = nil();

        while (n > 0) 
        {
            int i = random.nextInt(list.length());
            Pair<List<T>, T> p = removeAt(list, i);
            A = cons(p.getB(), A);
            list = p.getA();
            n--;
        }

        return A;
    }

}