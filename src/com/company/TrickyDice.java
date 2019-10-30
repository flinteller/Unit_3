package com.company;


public class TrickyDice {

    public static int regularRoll(){
        return (int) (Math.random() * 6) + 1;
    }

    public static int trickyRoll(){
        int chance = (int) (Math.random() * 100) + 1;
        if (chance < 23)
            return 6;
        else if (chance >= 23 && chance < 44)
            return 5;
        else if (chance >= 44 && chance < 63)
            return 4;
        else if (chance >= 63 && chance < 80)
            return 3;
        else if (chance >= 80 && chance < 90)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args){
        System.out.println(regularRoll());
        System.out.println(trickyRoll());
    }
}
