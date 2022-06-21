package com.bridgelabz;

public class MaximumNumber <T extends Comparable<T>> {
    T a,b,c;

    public MaximumNumber(T a,T b,T c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static void main(String[] args) {
        System.out.println("Welcome Generics program......");
        System.out.println("Max Number of three Integer :" + Number(34, 48, 21));
        System.out.println("Max Number of three Float :"+ Number(3.5f, 9.6f, 10.3f));
        System.out.println("Max of three String :"+ Number("Apple", "Peach" ,"Banana"));
    }
    public static <T extends Comparable> T Number(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
}





