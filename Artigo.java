package TecProg;

public class Artigo extends Publicacao {

	public Artigo(String titulo, int anoPublicacao, String autor, int qtdDisponivel) {
		super(titulo, anoPublicacao, autor, qtdDisponivel);
		this.Tipo = "Artigo";
	}

}
