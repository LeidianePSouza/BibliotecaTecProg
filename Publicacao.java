package TecProg;

public abstract class Publicacao {
	protected String Titulo;
	protected int AnoPublicacao;
	protected String Autor;
	protected int qtdDisponivel;
	protected String Tipo;
	

	public Publicacao(String titulo, int anoPublicacao, String autor, int qtdDisponivel) {
		super();
		Titulo = titulo;
		AnoPublicacao = anoPublicacao;
		Autor = autor;
		this.qtdDisponivel = qtdDisponivel;
	}
	
	public String getTipo() {
		return Tipo;
	}
	
	public void mostrarDados() {
		System.out.println(Titulo + AnoPublicacao + Autor + qtdDisponivel);
	}
	
	public int getqtdDisponivel(){
		
		return this.qtdDisponivel;
	}
	
}
