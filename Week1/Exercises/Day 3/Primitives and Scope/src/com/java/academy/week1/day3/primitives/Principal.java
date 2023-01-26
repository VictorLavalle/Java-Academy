package com.java.academy.week1.day3.primitives;

public class Principal {

    public static void main(String[] args) {
        float f = 5.5f; //Should have f at the end of the number to be a float

        long l = 3123456789L; //Should have L at the end of the number to be a long

        long ll1 = 2_147_483_647; //It's allowed to use _ to separate numbers in longs and ints

        long ll2 = 2_147_483_648L;

        int int1 = (int) ll2; //It's not allowed to assign a long to an int without casting it

        System.out.println(int1);

        long ll3 = 2_147_483_647;

        int int2 = (int) ll3;

        System.out.println(ll3);


        int int3 = 123;
        short short1 = (short) int3;
        System.out.println(short1);

        final int int4 = 123;
        short short2 = int4;
        System.out.println(short2);

        short short3 = 1;
        short short4 = 2;
        int i = short4 + short3;
        System.out.println(i);

        short short5 = 2;
        short short6 = 8;
        short5 = (short) (short5 + short6);
        System.out.println(short5);

        short short7 = 9;
        short short8 = 8;
        System.out.println(short7 += short8);
    }

}
