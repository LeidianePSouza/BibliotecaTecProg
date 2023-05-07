package TecProg;

public class Aluno extends Cliente {

	public Aluno(String nome, int codigo) {
		super(nome, codigo);
		this.Tipo = "Aluno";
		TPs = 0;
	}
	
	public int verificacaoDias() {
		return 10;
	}
	
	public float verificarTPs() {
		return TPs + 10;
	}
}
