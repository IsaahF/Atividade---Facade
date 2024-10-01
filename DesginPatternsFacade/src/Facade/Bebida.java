package Facade;

public class Bebida extends Produto{
	private int Ml;
	
	Bebida(){
		super();
	}
	
	public void setMl(int ml) {
		this.Ml = ml;
	}
	
	public int getMl() {
		return Ml;
	}
}
