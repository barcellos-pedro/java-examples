package com.company;

public class Main {

    public static void main(String[] args) {
	    int count = 0;

        while (count <= 10) {
            System.out.println(count);
            count++;
        }

        System.out.println("###########");

        int total = 0;

        for (int i = 0; i <= 10; i++) {
            total += i;
            System.out.println(total);
        }

        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            for (int contador = 0; count <= 10; contador++) {
                System.out.print(multiplicador * contador);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
