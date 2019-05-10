class Q11 
{
    <T> List F(List<Pair<Integer, T>> list) 
    {
        List A = nil();
        for (Pair<Integer, T> each : list)
            A = cons(each.getA().equals(1) ? each.getB() : each, A);
        return A.reverse();
    }
}