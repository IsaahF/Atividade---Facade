package Facade;

public class Burguer extends Produto{
	private int gramas;
	
	Burguer(){
		super();
	}
	
	public void setGramas(int grm) {
		this.gramas = grm;
	}
	
	public int getGramas() {
		return gramas;
	}
}
