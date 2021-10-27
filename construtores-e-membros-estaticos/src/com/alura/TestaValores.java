package com.alura;

public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		Conta conta2 = new Conta(1337, 16549);
		
		System.out.println("Total de contas " + Conta.getTotalContas());
		
		//conta.setAgencia(-50);
		//conta.setNumero(-330);
		
		//int total = 0;
		//total++;
		
		//System.out.println(conta.getAgencia());
		//System.out.println(conta.getNumero());
	}
}
