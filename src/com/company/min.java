package com.company;

public class min {
    public static int minimum(int[] t)
    {
        int tmp = t[0];

        for(int i = 1; i < t.length; i++)
        {
            if(t[i] < tmp)
            {
                tmp = t[i];
            }
        }
        return tmp;
    }
}
