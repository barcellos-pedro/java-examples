package com.alura;

public class TesteSistema {

	public static void main(String[] args) {
		
		// Podemos usar a interface como tipo da referencia mais genérico
		Autenticavel testeReferencia = new Gerente();
		Autenticavel testeReferencia2 = new Adminstrador();
		Autenticavel testeReferencia3 = new Cliente();
		
		Gerente g = new Gerente();
		g.setSenha(222);
		
		Adminstrador adm = new Adminstrador();
		adm.setSenha(3333);
		
		Cliente cli = new Cliente();
		cli.setSenha(2224);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cli);
		
	}
}
