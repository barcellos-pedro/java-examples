package com.company;

public class TesteReferencia {
    public static void main(String[] args) {
        // Lado esquerdo é uma referência do tipo Conta
        // Lado direito é o novo objeto de fato
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

        // Copia uma REFERENCIA da Conta (numero no endereço de memória)
        // E faz referência para o mesmo objeto
        // Então teremos 2 referências para o mesmo objeto
        Conta segundaConta = primeiraConta;

        segundaConta.saldo += 100;

        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
        System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

        // Aqui comparamos por referencia
        if (primeiraConta == segundaConta)
            System.out.println("São a mesma conta");

        // Mesma referencia
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
