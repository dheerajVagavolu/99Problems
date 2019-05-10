class Q12 
{
    List F(List list) 
    {
        List A = nil();

        for (Object each : list) 
        {
            if (each instanceof Pair) 
            {
                Pair<Integer, Object> pair = (Pair<Integer, Object>) each;
                A = concat(List.replicate(pair.getA(), pair.getB()), A);
            } 
            else 
            {
                A = cons(each, A);
            }
        }

        return A.reverse();
    }
}