package com.java.academy.week2.day1.comparable.v2;
public class Student implements Comparable<Student> {

    private String name;
    private int age;
    private double average;

public Student(String name, int age, double average) {
        this.name = name;
        this.age = age;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }


    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", average=" + average + "]";
    }

    @Override
    public int compareTo(Student o) {
        return (int)((o.average*1000) - (this.average*1000));
        //return (int)((this.average*1000) - (o.average*1000));
    }

//	@Override
//	public int compareTo(Student o) {
//		return this.name.compareTo(o.name);
//		//return o.name.compareTo(this.name);
//	}

//	@Override
//	public int compareTo(Student o) {
//		//SI EL PRIMER VALOR ES MAYOR REGRESA UN POSITIVO
//		if (this.age > o.age)
//			return 10;
//		//SI EL PRIMER VALOR ES MENOR REGRESA UN NEGATIVO
//		else if (this.age < o.age)
//			return -10;
//		//SI SON IGUALES REGRESA UN CERO
//		else
//			return 0;
//	}

//	@Override
//	public int compareTo(Student o) {
//		return this.age - o.age;
//	}
    
    
    
}
