package com.bridgelabz;

public class MaximumNumber {
    public static void main(String[] args) {
        System.out.println("Welcome Generics program......");
        System.out.println("Max Number of three Integer :" + Number(34, 48, 21));
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


}





