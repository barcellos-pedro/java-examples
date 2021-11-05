package com.alura;

public class SistemaInterno {

	private int senha = 222;
	
	// Polimorfismo através da interface
	public void autentica(Autenticavel autenticavel) {
		boolean autenticou = autenticavel.autentica(this.senha);
		
		if(autenticou)
			System.out.println("Pode entrar no sistema");
		else
			System.out.println("Não pode entrar no sistema :(");
	}
}
