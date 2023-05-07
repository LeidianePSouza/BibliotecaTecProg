package TecProg;

public class Emprestimo {
	
	protected Cliente cliente;
	protected Publicacao publicacao;
	
	public Emprestimo(Cliente cliente, Publicacao publicacao) {
		super();
		this.cliente = cliente;
		this.publicacao = publicacao;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public Publicacao getPublicacao() {
		return this.publicacao;
	}
	
	private int diasEmprestimo() {
		return cliente.verificacaoDias();
	}
	
	private float TPs() {
		return cliente.verificarTPs();
	}
	
	public String relatorioEmprestimo() {
		String saida = "";
		saida = this.cliente.Tipo + ": " + this.cliente.Nome + " / " + publicacao.Tipo + ": " + this.publicacao.Titulo + " / Dias de empréstimo: " + this.diasEmprestimo() + " dias" +" / TPs: " + this.cliente.verificarTPs();
		return saida;
	}
	
	

}
