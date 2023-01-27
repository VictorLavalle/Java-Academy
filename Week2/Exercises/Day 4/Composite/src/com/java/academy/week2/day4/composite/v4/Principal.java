package com.java.academy.week2.day4.composite.v4;

public class Principal {

    public static void main(String[] args){

        //Here we can see the Composite Pattern in action with the CompositeSum class
        //which is a Component and can be used as a leaf or as a composite
        //Looks like a tree, doesn't it?
        Component component = new CompositeSum(
                new CompositeMultiplication(
                                new LeafConstant(2),
                                new LeafConstant(3)
                        ),
                new CompositeDivision(
                                new LeafConstant(10),
                                new LeafConstant(2)
                        ),
                new CompositeSubtraction(
                                new LeafConstant(10),
                                new LeafConstant(5)
                        )
                );

        System.out.println(component.getValue()); // 15.0

    }

}
