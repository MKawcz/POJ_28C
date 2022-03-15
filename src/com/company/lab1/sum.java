package com.company;

public class sum {
    public static int suma(int[] t)
    {
        int tmp = 0;

        for(int i = 0; i < t.length; i++)
        {
            tmp += t[i];
        }
        return tmp;
    }
}
