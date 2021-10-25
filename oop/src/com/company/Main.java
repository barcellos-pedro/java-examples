package com.company;

public class Main {

    public static void main(String[] args) {
        // ByteBank console app
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println("Saldo primeira conta: " + primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println("Saldo primeira conta: " + primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        System.out.println("Saldo segunda conta: " + segundaConta.saldo);
        System.out.println("Titular segunda conta: " + segundaConta.titular);

        if (primeiraConta == segundaConta)
            System.out.println("Contas iguais");
        else
            System.out.println("Contas diferentes");

        // Referencias diferentes
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
