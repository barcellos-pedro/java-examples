package com.company;

public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.saldo);
		
		
		contaDaMarcela.titular = new Cliente();
		
		// null caso o titular não receba uma referência (linha 9)
		// Atributo de referência começa como nulo
		System.out.println(contaDaMarcela.titular);
		
		// NullPointerException caso titular não receba referência (linha 9)
		contaDaMarcela.titular.nome = "Marcela";
		
		System.out.println(contaDaMarcela.titular.nome);
	}
}
