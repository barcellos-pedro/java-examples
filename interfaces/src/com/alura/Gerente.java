package com.alura;

public class Gerente extends Funcionario implements Autenticavel {

	private int senha;
	
	@Override
	public double getBonificacao() {
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		System.out.println("Autentica do [Gerente]");
		if(this.senha == senha)
			return true;
		else
			return false;
	}
	
}
