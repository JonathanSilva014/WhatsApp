
public class Contato {
	
	private String nome;
	private int numTelm;
	private String tipoContato;
	
	public Contato(String nome, int numTelm, String tipoContato) {
		super();
		this.nome = nome;
		this.numTelm = numTelm;
		this.tipoContato = tipoContato;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumTelm() {
		return numTelm;
	}

	public String getTipoContato() {
		return tipoContato;
	}
	
	
	
	
}
