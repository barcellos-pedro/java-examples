package com.alura;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario2 nico = new Funcionario2();
		nico.setNome("Nico Steppat");
		nico.setCpf("222.222.222-22");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}
}
