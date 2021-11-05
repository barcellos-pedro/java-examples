package com.alura;

// Todos os métodos em uma interface são abstratos
// Não há nada concreto, nem mesmo atributos
// Contrato Autenticavel, quem assiná-lo precisa implementar os métodos abstratos
public interface Autenticavel {
	
	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);
	
}
