package com.company.lab10.zad5;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        FullCaliber fullCaliber = new FullCaliber();
        Cannon cannon = new Cannon(tree, fullCaliber);
        cannon.cel.shootAt();
    }
}
