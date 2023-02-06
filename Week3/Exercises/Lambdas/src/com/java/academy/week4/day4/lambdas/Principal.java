package com.java.academy.week4.day4.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Principal {

    public static void main(String[] args) {

        //------- Supplier ----------

        String s = null;
        System.out.println(s);

        //DEFINICION DE LAMBDA
        Supplier<String> sup1 = () -> new String("Hello");

        //EJECUTAR LA LAMBDA
        s = sup1.get();
        System.out.println(s);

        Supplier<Integer> sup3 = () -> Integer.valueOf(9);
        Integer integer = sup3.get();
        System.out.println(integer);

        Supplier<Integer> sup2 = () -> 8;
        int i = sup2.get();
        System.out.println(i);

        //------- Consumer ----------

        //DEFINICION DE LAMBDA
        Consumer<String> con1 = x -> System.out.println(x);
        con1.accept("hola");

        Consumer<Integer> con2 = y -> System.out.println(y + 100);
        con2.accept(5);

        List<String> listaNombres = Arrays.asList("Patrobas","Tercio","Andronico");

        listaNombres.forEach(x -> System.out.println(x));

        //------- Function ----------

        Function<String,Integer> fun1 = cadena -> cadena.length();
        int r = fun1.apply("Xideral");
        System.out.println(r);

        Function<Employee,String> fun2 = e -> e.getName();
        Employee emp = new Employee("Patrobas",28,56.79);
        System.out.println(fun2.apply(emp));

        Function<String,String> fun3 = s1 -> s1.substring(5);
        System.out.println(fun3.apply("CursoJava"));

        UnaryOperator<String> uo1 = s1 -> s1.substring(5);
        System.out.println(uo1.apply("CursoPhp"));

        listaNombres.replaceAll(z -> z.concat(" Perez"));

        listaNombres.forEach(System.out::println);

        System.out.println("-------------");
        List<Employee> listaEmployees = new ArrayList<>();
        listaEmployees.add(new Employee("Patrobas",28,45.67));
        listaEmployees.add(new Employee("Tercio",35,56.67));
        listaEmployees.add(new Employee("Andronico",19,40.50));
        listaEmployees.add(new Employee("Rolas",17,10.03));

        listaEmployees.replaceAll(e -> e.addSalary(100));
        System.out.println("-------------");

        listaEmployees.forEach(System.out::println);

    }

}
