package TecProg;

import java.util.ArrayList;

public class Biblioteca {
	
	protected ArrayList<Emprestimo> listaEmprestimo;
	
	public Biblioteca() {
		listaEmprestimo = new ArrayList<Emprestimo>();
	}
	
	public void addEmprestimo(Emprestimo emprestimo) {
		listaEmprestimo.add(emprestimo);
	}
	
	public ArrayList<Emprestimo> getListaEmprestimo() {
		return listaEmprestimo;
	}
	
}
