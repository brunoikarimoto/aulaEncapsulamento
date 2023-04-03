package moldes;

public class Pessoa {
	private String cpf;
	private String nome;
	private float peso;
	
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public String getCPF() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public float getPeso() {
		return peso;
	}
}
