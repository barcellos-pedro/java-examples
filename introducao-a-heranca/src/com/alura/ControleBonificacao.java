package com.alura;

public class ControleBonificacao {
	private double soma;

	// Usamos a referencia a partir do tipo mais genérico
	// Evitando duplicar o método para cada tipo que herda de Funcionario (:15:28)
	public void registra(Funcionario funcionario) {
		// Sempre ira chamar primeiro o método mais especifico
		// getBonificacao de cada filho (Gerente, EditorVideo, etc)
		// E depois o própio (Funcionario)
		double bonificacao = funcionario.getBonificacao();
		this.soma += bonificacao;
	}
	
//	public void registra(Gerente gerente) {
//		double bonificacao = gerente.getBonificacao();
//		this.soma += bonificacao;
//	}
//	
//	public void registra(Funcionario funcionario) {
//		double bonificacao = funcionario.getBonificacao();
//		this.soma += bonificacao;
//	}
//	
//	public void registra(EditorVideo editorVideo) {
//		double bonificacao = editorVideo.getBonificacao();
//		this.soma += bonificacao;
//	}
	
	public double getSoma() {
		return this.soma;
	}
}
