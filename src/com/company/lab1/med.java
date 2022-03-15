package com.company;

import java.lang.reflect.Array;

public class med {
    public static double mediana(int[] t)
    {
        double tmp = 0;
        double avg = 0;
        //nie musimy sortować tablicy bo dane uzupełniają się rosnąco

        if(t.length % 2 == 0)
        {
            avg = t[t.length/2] + t[(t.length/2)-1];
            tmp = avg / 2;
        }
        else
        {
            tmp = t[t.length/2];
        }
        return tmp;
    }
}
