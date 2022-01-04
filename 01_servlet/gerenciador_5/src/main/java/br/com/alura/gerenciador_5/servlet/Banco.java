package br.com.alura.gerenciador_5.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<Empresa>();
	private static Integer chaveSequencial = 1;
	
	static {
		
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		empresa.setId(chaveSequencial++);
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		empresa2.setId(chaveSequencial++);
		
		Banco.lista.add(empresa);
		Banco.lista.add(empresa2);
		
	}
	
	
	public void adciona(Empresa empresa) {	
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);
		
	}
	
	public List<Empresa> getEmpresa() {
		return Banco.lista;
	}

	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = Banco.lista.iterator();
		
		while (it.hasNext()) {
			
			Empresa emp = it.next(); 
			
			if (emp.getId() == id) {
				it.remove();
			}	
		}
		
		
	}

	public Empresa buscaEmpresaPelaId(Integer id) {
		
		for (Empresa empresa : lista) {
			
			if (empresa.getId() == id) {
				return empresa;
			}
		}	
		
		return null;
	}
	
	

}
