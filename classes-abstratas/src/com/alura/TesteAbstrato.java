package com.alura;

public class TesteAbstrato {
	public static void main(String[] args) {
		
		// Classe abstrata não pode ser instanciada
		// Somente classes concretas
		//Funcionario f = new Funcionario();
		//f.setSalario(2000.0);
		
		Gerente gerente = new Gerente();
		gerente.setNome("Pedro");
		gerente.setSalario(5000.0);
		System.out.println("Bonificação Gerente " + gerente.getBonificacao());
		
		EditorVideo ed = new EditorVideo();
		ed.setSalario(2500.0);
		System.out.println("Bonificação Editor " + ed.getBonificacao());
		
		// Mesmo assim podemos usar o tipo Funcionario como referencia
		Funcionario testeGerente = new Gerente();
	}
}
