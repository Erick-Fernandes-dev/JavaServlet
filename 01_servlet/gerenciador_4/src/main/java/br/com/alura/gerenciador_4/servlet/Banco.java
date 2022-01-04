package br.com.alura.gerenciador_4.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<Empresa>();
	
	static {
		
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		
		Banco.lista.add(empresa);
		Banco.lista.add(empresa2);
		Banco.lista.add(new Empresa("Algnologia"));
		
	}
	
	
	public void adciona(Empresa empresa) {	
		
		Banco.lista.add(empresa);
	
		
	}
	
	public List<Empresa> getEmpresa() {
		return Banco.lista;
	}

}
