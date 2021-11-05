package com.alura;

public class Adminstrador extends Funcionario implements Autenticavel {

	private int senha;
	
	@Override
	public double getBonificacao() {
		return 50;
	}
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		System.out.println("Autentica do [ADM]");
		if(this.senha == senha)
			return true;
		else
			return false;
	}

}
