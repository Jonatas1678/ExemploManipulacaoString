package teste;

public class ExemploManipulacaoString {

	private String nomeTeste;
	private int numeroTeste;

	ExemploManipulacaoString() {

	}

	ExemploManipulacaoString(String recebeNomeTeste, int recebeNumeroTeste) {
		this.nomeTeste = recebeNomeTeste;
		this.numeroTeste = recebeNumeroTeste;
	}

	public String getNomeTeste() {
		return nomeTeste;
	}

	public void setNomeTeste(String nomeTeste) {
		this.nomeTeste = nomeTeste;
	}

	public int getNumeroTeste() {
		return numeroTeste;
	}

	public void setNumeroTeste(int numeroTeste) {
		this.numeroTeste = numeroTeste;
	}
}
