package com.alura;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    
    public double getSaldo() {
    	return this.saldo;
    }
    
    public void deposita(double valor) {
    	this.saldo += valor;
    }
    
    public int getAgencia() {
		return this.agencia;
	}
    
    public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
    
    public int getNumero() {
    	return this.numero;
    }
    
    public void setNumero(int numero) {
    	this.numero = numero;
    }
    
    public void setTItular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta contaDestino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            contaDestino.deposita(valor);
            return true;
        }
        return false;
    }
}
