package TecProg;

public class Livro extends Publicacao{

	public Livro(String titulo, int anoPublicacao, String autor, int qtdDisponivel) {
		super(titulo, anoPublicacao, autor, qtdDisponivel);
		this.Tipo = "Livro";
	}


}
