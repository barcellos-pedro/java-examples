package com.alura;

public class TestaSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		
		// Vamos restringir o acesso direto ao atributo (private)
		// E vamos ler/editar os atributos através de métodos
		// conta.saldo -= 101;
		// System.out.println(conta.saldo);
		
		conta.saca(101);
		System.out.println(conta.getSaldo());
	}
}
