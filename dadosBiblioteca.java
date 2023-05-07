package TecProg;

public class dadosBiblioteca {

	
	public static void main(String[] args) {
		Cliente aluno1 = new Aluno("Mary", 456);
		Cliente aluno2 = new Aluno("John", 123);
		
		Cliente professor1 = new Professor("Maria", 123);
		Cliente professor2 = new Professor("João", 456);
		
		Publicacao livro = new Livro("Teste III", 2023, "Fulano", 1);
		Publicacao artigo = new Artigo("Teste II", 2023, "Sicrano", 1);
		Publicacao revista = new Revista("Teste IV", 2023, "Beltrano", 1);
		Publicacao tcc = new Tcc("Teste I", 2023, "Folanu", 1);
		
		Biblioteca biblioteca = new Biblioteca();
		
		Emprestimo emprestimo1 = new Emprestimo(aluno1, tcc);
		Emprestimo emprestimo2 = new Emprestimo(aluno2, artigo);
		Emprestimo emprestimo3 = new Emprestimo(professor1,livro);
		Emprestimo emprestimo4 = new Emprestimo(professor2, revista);
	
		biblioteca.addEmprestimo(emprestimo1);
		System.out.println(emprestimo1.relatorioEmprestimo());
		
		biblioteca.addEmprestimo(emprestimo2);
		System.out.println(emprestimo2.relatorioEmprestimo());
		
		biblioteca.addEmprestimo(emprestimo3);
		System.out.println(emprestimo3.relatorioEmprestimo());
		
		biblioteca.addEmprestimo(emprestimo4);
		System.out.println(emprestimo4.relatorioEmprestimo());
		
	}
	
}
