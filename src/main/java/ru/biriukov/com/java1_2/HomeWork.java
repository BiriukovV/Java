package ru.biriukov.com.java1_2;

public class HomeWork {

    public static void main(String[] args) {
        twoNumbers(5, 7);
        System.out.println("---");
        positiveNumber(2);
        System.out.println("---");
        positiveAndNegativeValue(-5);
        System.out.println("---");
        stringAndNumber("Hello world", 5);
    }

    public static boolean twoNumbers(int a, int b){
        if((a + b) >= 10 && (a + b) <= 20){
            System.out.println("True");
            return true;
        }else {
            System.out.println("False");
            return false;
        }
    }

    public static void positiveNumber(int a){
        if(a >= 0){
            System.out.println("Число положительное");
        }else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean positiveAndNegativeValue(int a){
        if(a >= 0){
            System.out.println("False");
            return false;
        }else {
            System.out.println("True");
            return true;
        }
    }

    public static void stringAndNumber(String string, int a){
        for (int i = 0; i < a; i++) {
            System.out.println(string);
        }
    }
}
