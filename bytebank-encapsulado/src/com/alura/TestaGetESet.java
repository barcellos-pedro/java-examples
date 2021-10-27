package com.alura;

public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1337);
		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");

		conta.setTItular(paulo);
		
		conta.getTitular().setProfissao("programador");
		
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getProfissao());
		
		// 2 referencias para o mesmo objeto
		System.out.println(paulo);
		System.out.println(conta.getTitular());
	}
}
