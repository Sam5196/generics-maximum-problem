package com.bridgelabz;

public class MaximumNumber <T extends Comparable<T>> {
    public static void main(String[] args) {
        System.out.println("Welcome Generics program......");
        System.out.println("Max Number of three Integer :" + Number(34, 48, 21, 65, 23, 38));
        System.out.println("Max Number of three Float :"+ Number(3.5f, 9.6f, 10.3f, 5.3f,7.1f));
        System.out.println("Max of three String :"+ Number("Apple", "Peach" ,"Banana"));
    }
    public static <T extends Comparable<T>> T Number(T... value) {
        T max = value[0];

        for(int i = 1;i < value.length; i++) {
            if (value[i].compareTo(max) > 0) {
                max = value[i];
            }
        }
        System.out.println("Given Value : ");
        for(int i =0; i < value.length; i++){
            System.out.println(value[i]);
        }
        printMax(max);
        return max;
    }
    public static <T> void printMax(T max){
        System.out.println("Maximum Value = " +max + " ");
    }
}





