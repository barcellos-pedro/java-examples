package com.alura;

// Gerente herda attrs e métodos da classe Funcionario
public class Gerente extends Funcionario {
	
	private int senha;
	
	public boolean autentica(int senha) {
		if(this.senha == senha)
			return true;
		return false;
	}
	
	public int getSenha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	// Reescrita do método com a mesma assinatura
	// Isso quer dizer, mesma visibilidade, mesmo retorno, mesmo nome e os mesmos parâmetros.
	// Porém a Implementação é diferente
	public double getBonificacao() {
		// Super para acessar o atributo da classe mãe
		System.out.println("Bonificacao do [Gerente]");
		return super.getBonificacao() + super.getSalario();
	}
	
}
