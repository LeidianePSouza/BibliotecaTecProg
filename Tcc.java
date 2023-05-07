package TecProg;

public class Tcc extends Publicacao{

	public Tcc(String titulo, int anoPublicacao, String autor, int qtdDisponivel) {
		super(titulo, anoPublicacao, autor, qtdDisponivel);
		this.Tipo = "Tcc";
	}

}
