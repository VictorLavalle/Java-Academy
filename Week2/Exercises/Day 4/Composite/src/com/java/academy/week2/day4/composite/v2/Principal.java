package com.java.academy.week2.day4.composite.v2;

public class Principal {

    public static void main(String[] args){

        Component c1 = new LeafConstant(5.0);
        Component c2 = new LeafConstant(8.0);
        Component c3 = new LeafConstant(3.0);
        Component c4 = new LeafConstant(9.0);


        // (5*8) + (3-9) = 40 - 6 = 34
        // This way we can create a complex expression with a simple way to calculate it
        // and we can add new operations without modifying the code
        Component component = new CompositeSum(
                new CompositeMultiplication(c1, c2),
                new CompositeSubtraction(c3, c4)
        );

        System.out.println(component.getValue());

    }

}
