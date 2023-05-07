package TecProg;

public class Servidor extends Cliente {
	
	public Servidor(String nome, int codigo) {
		super(nome, codigo);	
		this.Tipo = "Servidor";
		TPs = 0;
	}
	
	public int verificacaoDias() {
		return 15;
	}

	public float verificarTPs() {
		return this.TPs = TPs + 15;
	}
}
