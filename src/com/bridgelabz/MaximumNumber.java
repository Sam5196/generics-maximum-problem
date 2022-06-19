package com.bridgelabz;

public class MaximumNumber {
    public static void main(String[] args) {
        System.out.println("Welcome Generics program......");
        System.out.println("Max Number of three Integer :" + Number(34, 48, 21));
        System.out.println("Max Number of three Float :"+ Number(3.5f, 9.6f, 10.3f));
    }
    public static Integer Number(Integer a, Integer b, Integer c) {
        Integer max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
    public static Float Number(Float a, Float b, Float c) {
        Float max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }


}





