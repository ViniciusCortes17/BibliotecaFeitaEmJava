package br.edu.unifcv.biblioteca;

public class Livros{
	
	
	private String nomeLivro;
	private String descricao;
	private String autor;
	private String dataLancamento;
	boolean Alugado;
	
	public Livros(String nomeLivro, String autor, String descricao, String dataLancamento) {
		this.nomeLivro = nomeLivro;
		this.autor = autor;
		this.descricao = descricao;
		this.dataLancamento = dataLancamento;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getDescrišao() {
		return descricao;
	}

	public void setDescrišao(String descricao) {
		this.descricao = descricao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	

	public String getDataLanšamento() {
		return dataLancamento;
	}

	public void setDataLanšamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	} 

	
	/// METODO PARA IMPRIMIR OS LIVROS DA LISTA
	@Override
	public String toString() {
		return "Nome: " + nomeLivro + "\nAutor: " + autor + "\nDescrišao: " + descricao + "\nData de lanšamento: " + dataLancamento;
	}	
	
}

