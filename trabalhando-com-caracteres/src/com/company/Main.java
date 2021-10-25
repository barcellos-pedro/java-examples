package com.company;

public class Main {

    public static void main(String[] args) {
        // Guarda uma unica letra e utilizamos aspas simples
        // Tabela unicode
	    char charzinho = 'a';
        char valor = 66;

        System.out.println("Charzinho: " + charzinho);
        System.out.println("Valor: " + valor);
        System.out.println("Proxima letra: " + (char) (valor + 1));

        // int, double, char == tipos primitivos
        // String == Wrapper
        String palavra = "Alura cursos online de tecnologia";
        System.out.println(palavra);

        int primeiro = 5;
        int segundo = 7;
        // guardamos o valor e não a referencia
        segundo = primeiro;
        primeiro = 10;
        System.out.println(segundo);
    }
}
