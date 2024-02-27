package com.example.library2;

public class Pair<T1, T2>
{
    private T1 theFirst;
    private T2 theSecond;

    public Pair(T1 aFirst, T2 aSecond)
    {
        theFirst = aFirst;
        theSecond = aSecond;
    }

    public T1 first()
    {
        return theFirst;
    }

    public T2 second()
    {
        return theSecond;
    }
}
