package ru.biriukov.com.java1_2;

public class Java2 {

    public static void main(String[] args) {
        int a = 3;
        if( a == 1){
            System.out.println("a = 1");
        } else if (a == 3) {
            System.out.println("a = 3");
        }else {
            System.out.println("Ни одно из условий не сработало");
        }
        System.out.println("---");

        int b = 5;
        switch (b) {
            case 1 -> System.out.println("b = 1");
            case 5 -> System.out.println("b = 5");
            default -> System.out.println("ни одно из условий не сработало");
        }
        System.out.println("----");

        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("End");

        for (int i = 0; i < 10; i++) {
            if(i > 4){
                break;
            }
            System.out.println("i = " + i);
        }
        System.out.println("---");

        String[] sm = {"A", "B", "C", "D"};
        for (String o : sm) {
            System.out.println(o + " ");
        }
        System.out.println("---");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + i + j);
            }
        }
        System.out.println(" ");
        System.out.println("---");

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }



}
