package com.alura;

public class Funcionario {
	// Private == apenas visivel dentro da classe
	// Public == visivel em todo lugar
	// Protected == público para os filhos e privado para outras classes
	private String nome;
	private String cpf;
	private double salario;
	
	public double getBonificacao() {
		System.out.println("Chamando getBonificacao do [Funcionario]");
		return salario * 0.05;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
