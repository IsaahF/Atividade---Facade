package Facade;

public class Produto {
	private String descricao;
	private double preco;

	public void setDescricao(String desc) {
		this.descricao = desc;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public double getPreco() {
		return preco;
	}
}
