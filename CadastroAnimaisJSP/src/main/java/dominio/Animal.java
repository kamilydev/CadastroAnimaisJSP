package dominio;

public class Animal {
	private String nome;
	private int idade;
	private float peso;
	private String especie;
	
	/*
	 * metodo construtor	não tem retorno, 
	 *igual nome da classe, executado 
	 *quando um objeto é construido na 
	 *memoria do método
	 */
	public Animal() {
		
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
}
