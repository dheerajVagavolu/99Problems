class Q14 
{
    <T> List<T> F(List<T> list) 
    {
        return list.isEmpty() ? List.<T>nil() : cons(list.head(), cons(list.head(), f1(list.tail())));
    }
}