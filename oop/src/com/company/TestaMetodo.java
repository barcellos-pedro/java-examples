package com.company;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 50;
        conta.deposita(100);

        System.out.println("Saldo inicial: " + conta.saldo);

        System.out.println(conta.saca(50));
        System.out.println("Saldo da conta: " + conta.saldo);

        System.out.println(conta.saca(100));
        System.out.println("Saldo da conta: " + conta.saldo);

        System.out.println(conta.saca(1));
        System.out.println("Saldo da conta: " + conta.saldo);

        Conta contaTeste = new Conta();
        contaTeste.deposita(1000);

        contaTeste.transfere(300, conta);
        System.out.println("Saldo da contaTeste: " + contaTeste.saldo);
        System.out.println("Saldo da conta: " + conta.saldo);
    }
}
