package com.alura;

public class ContaCorrente extends Conta {
	// Construtor não é herdado na herança
	// Precisamos criar o construtor especifico da classe
	// E passar os parametros para a classe mãe 
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	// @Override utilizado para o compilador saber da sobrescrita
	@Override
	public boolean saca(double valor) {
		double taxaSaque = 0.2; 
		return super.saca(valor + taxaSaque);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
}
