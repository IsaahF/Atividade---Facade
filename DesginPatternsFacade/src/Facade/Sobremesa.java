package Facade;

public class Sobremesa extends Produto{
	private String tamanho;
	
	Sobremesa(){
		super();
	}
	
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getTamanho() {
		return tamanho;
	}
}
