package com.alura;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int totalContas;
        
    public Conta(int agencia, int numero) {
    	Conta.totalContas++;
    	this.agencia = agencia;
    	this.numero = numero;
    	
    	System.out.println("Estou criando uma conta | Agencia " + this.agencia + " Numero " + this.numero);
    	System.out.println("O total e contas é " + Conta.totalContas);
    }
    
    // Método statico para retornar um attr estático
    public static int getTotalContas() {
    	// Não é possível usar this dentro e um método estático
    	//System.out.println(this.getSaldo());
		return Conta.totalContas;
	}
    
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
    	if(agencia <= 0) {
    		System.out.println("Não é permitido agencia menor ou igual a zero");
    		return;
    	}
		this.agencia = agencia;
	}
    
    public int getNumero() {
    	return this.numero;
    }
    
    public void setNumero(int numero) {
    	if(numero <= 0) {
    		System.out.println("Não é permitido agencia menor ou igual a zero");
    		return;
    	}
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
