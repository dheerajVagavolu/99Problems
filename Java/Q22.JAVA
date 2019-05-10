class Q22 
{
    List<Integer> F(int a, int b) 
    {
        int i = b;
        List<Integer> RES = nil();
            while (i >= a) 
            {
                RES = cons(i, RES);
                i--;
            }

        return RES;
    }
}