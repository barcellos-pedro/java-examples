package com.alura;

public class EditorVideo extends Funcionario {
	
	@Override
	public double getBonificacao() {
		System.out.println("Chamando getBonificacao do [Editor de video]");
		return 150;
	}
}
