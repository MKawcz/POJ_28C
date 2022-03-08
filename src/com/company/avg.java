package com.company;

public class avg {
    public static double average(int[] t)
    {
        double tmp = 0;

        for(int i = 0; i < t.length; i++)
        {
            tmp += t[i];
        }
        return tmp / t.length;
    }
}
