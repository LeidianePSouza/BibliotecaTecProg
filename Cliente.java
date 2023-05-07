package TecProg;

public abstract class Cliente implements validarEmprestimo {

	protected String Nome;
	protected int Codigo;
	protected int qtdEmprestimo;
	protected float TPs;
	protected String Tipo;
	
	public Cliente(String nome, int codigo) {
		super();
		Nome = nome;
		Codigo = codigo;
	
	}
	
	
	public int getcodigo() {
		return this.Codigo;
	}
	
	public int getqtdEmprestimo() {
		return this.qtdEmprestimo;
	}
}
