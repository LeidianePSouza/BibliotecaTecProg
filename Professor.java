package TecProg;

public class Professor extends Cliente {
	
	public Professor(String nome, int codigo){
		super(nome, codigo);
		this.Tipo = "Professor";
		TPs = 0;
	}
	
	public int verificacaoDias() {
		return 20;
	}
	
	public float verificarTPs() {
		return this.TPs = TPs + 25;
	}
	
}
