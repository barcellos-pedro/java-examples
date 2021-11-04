package com.alura;

public class TesteFuncionario2 {
	public static void main(String[] args) {
		Funcionario2 funcionario = new Funcionario2();
		funcionario.setSalario(3000.00);
		System.out.println(funcionario.getTipo());
		System.out.println(funcionario.getBonificacao());
		
		Funcionario2 funcionario2 = new Funcionario2();
		funcionario2.setTipo(1);
		funcionario2.setSalario(5000.00);
		System.out.println(funcionario2.getTipo());
		System.out.println(funcionario2.getBonificacao());
	}
}
