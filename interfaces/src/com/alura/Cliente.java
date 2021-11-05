package com.alura;

public class Cliente implements Autenticavel {

	private int senha;
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		System.out.println("Autentica do [Cliente]");
		if(this.senha == senha)
			return true;
		else
			return false;
	}

	
}
