package com.alura;

public class TesteReferencias {
	public static void main(String[] args) {
		
//		Funcionario g1 = new Gerente();
//		g1.setNome("Marcos");
//		
//		String nome = g1.getNome();
//		
//		System.out.println(nome);
		
		Gerente gerente = new Gerente();
		gerente.setNome("Pedro");
		gerente.setSalario(5000.0);
		
		Funcionario f = new Funcionario();
		f.setSalario(2000.0);
		
		EditorVideo ed = new EditorVideo();
		ed.setSalario(2500.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(f);
		controle.registra(ed);
		
		System.out.println("Soma: " + controle.getSoma());
	}
}
