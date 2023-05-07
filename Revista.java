package TecProg;

public class Revista extends Publicacao {

	public Revista(String titulo, int anoPublicacao, String autor, int qtdDisponivel) {
		super(titulo, anoPublicacao, autor, qtdDisponivel);
		this.Tipo = "Revista";
	}

}
