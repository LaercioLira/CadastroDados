package model;

public class Usuario {
	private String nome;
	private int idade;
	private char sexo;
	
	public Usuario(String nome, int idade, char sexo) {
		this.nome= nome;
		this.idade=idade;
		this.sexo=sexo;
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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public void apresentar() {
		System.out.println("==========================");
		System.out.println("O nome do usuário é "+nome);
		System.out.println("A idade do usuário é "+idade);
		System.out.println("O sexo do usuário é "+sexo);
	}
}
