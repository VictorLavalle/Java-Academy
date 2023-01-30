package com.java.academy.week2.day4.composite.v1;

public class Principal {

    public static void main(String[] args){

        Component c1 = new LeafConstant(5.0);
        Component c2 = new LeafConstant(8.0);
        Component c3 = new LeafConstant(3.0);
        Component c4 = new LeafConstant(9.0);

        Component componentSum1 = new CompositeSum(c1, c2); // 13.0
        Component componentSum2 = new CompositeSum(c3, c4); // 12.0

        Component componentSubtraction = new CompositeSubtraction(componentSum1, componentSum2); // 1.0

        double result = componentSubtraction.getValue(); // 1.0

        System.out.println("Result: " + result); // Result: 1.0

    }

}
