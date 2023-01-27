package com.java.academy.week2.day4.composite.v3;

public class Principal {

    public static void main(String[] args){

        Component c1 = new LeafConstant(2.0);
        Component c2 = new LeafConstant(3.0);
        Component c3 = new LeafConstant(4.0);
        Component c4 = new LeafConstant(5.0);
        Component c5 = new LeafConstant(8.0);

        // This way we can create a complex expression with a simple way to calculate it
        // and we can add new operations without modifying the code
        Component component = new CompositeSum(
                new CompositeMultiplication(c1, c2),
                new CompositeDivision(c5, c1),
                new CompositeSubtraction(c3, c4)
        );

        System.out.println(component.getValue());

    }

}
