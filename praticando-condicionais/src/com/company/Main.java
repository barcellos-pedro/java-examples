package com.company;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Testando condicionais");
        int idade = 24;

        if (idade >= 18) {
            System.out.println("Maior de idade | " + idade);
        } else {
            System.out.println("Menor de idade | " + idade);
        }

        boolean checkIdade = idade >= 18;

        if (checkIdade)
            System.out.println("Maior de idade | Com checkIdade");
    }
}
