package com.alura;

public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando getBonificacao do [Editor de video]");
		return super.getBonificacao() + 100;
	}
}
