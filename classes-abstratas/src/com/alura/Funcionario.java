package com.alura;

// Classe abstrata não pode ser instanciada
public abstract class Funcionario {
	// Private == apenas visivel dentro da classe
	// Public == visivel em todo lugar
	// Protected == público para os filhos e privado para outras classes
	private String nome;
	private String cpf;
	private double salario;
	
	// Metodo abstrato não possui corpo (implementação) só assinatura (visibilidade, retorno, nome método e parametros)
	// Somente seus filhos não abstratos (concretos)
	public abstract double getBonificacao();
	
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
