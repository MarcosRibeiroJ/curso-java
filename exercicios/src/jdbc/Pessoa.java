package jdbc;

public class Pessoa {

	private int codigo;
	private String nome;

	public Pessoa(int codigo, String pessoa) {
		this.codigo = codigo;
		this.nome = pessoa;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String pessoa) {
		this.nome = pessoa;
	}

}
