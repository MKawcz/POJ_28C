package com.company;

public class nwd {
    public static int Nwd(int a, int b){
        if (b == 0)
        {
            return a;
        }
        else
        {
            return Nwd(b,a % b);
        }
    }
}
