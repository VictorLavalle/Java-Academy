package com.java.academy.week2.day4.composite.v0;

public class Principal {

    public static void main(String[] args){

        LeafConstant leaf1 = new LeafConstant(5.0);
        LeafConstant leaf2 = new LeafConstant(8.0);

        double value1 = leaf1.getValue();
        double value2 = leaf2.getValue();

        System.out.println("Value1: " + value1);
        System.out.println("Value2: " + value2);

        CompositeSum sum = new CompositeSum(leaf1, leaf2);
        double valueSum = sum.getValue();
        System.out.println("ValueSum: " + valueSum);

        CompositeSubtraction subtraction = new CompositeSubtraction(leaf1, leaf2);
        double valueSubtraction = subtraction.getValue();
        System.out.println("ValueSubtraction: " + valueSubtraction);
        
    }

}
