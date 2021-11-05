package com.alura;

// Classes abstratas não são obrigadas a implementar métodos abstratos
public abstract class AutenticavelClass extends Funcionario {
	
	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if(this.senha == senha){
			return true;
		} else {
			return false;
		}
	}
}
