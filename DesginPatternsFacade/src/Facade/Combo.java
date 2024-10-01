package Facade;

public class Combo {
	
	public void CriarCombo(int tipo){
		Burguer bg = new Burguer();
		Sobremesa sbm = new Sobremesa();
		Bebida bb = new Bebida();

		
		switch(tipo) {
		  case 1:
			  System.out.println("Combo Master");
			  
			  bg.setDescricao("Master burguer");
			  bg.setPreco(23.50);
			  bg.setGramas(180);
			  
			  sbm.setDescricao("Sundae");
			  sbm.setPreco(10.50);
			  sbm.setTamanho("Grande");
			  
			  
			  bb.setDescricao("Free refil");
			  bb.setPreco(6.50);
			  bb.setMl(400);
		  break;
		    
		  case 2:
			  System.out.println("Super Combo");
			  
			  bg.setDescricao("Super burguer");
			  bg.setPreco(19.50);
			  bg.setGramas(120);
			  
			  sbm.setDescricao("Sorvete");
			  sbm.setPreco(5.50);
			  sbm.setTamanho("Medio");
			  
			  
			  bb.setDescricao("Coca-cola");
			  bb.setPreco(5.50);
			  bb.setMl(350);
		  break;
		}
		
		double valFin = bg.getPreco() + sbm.getPreco() + bb.getPreco();
		
		System.out.println("Preco final: " + valFin);
		
		System.out.println("Burguer: " + bg.getDescricao());
		System.out.println("Preco: " + bg.getPreco());
		System.out.println("Gramas: " + bg.getGramas());
		
		System.out.println("Sobremesa: " + sbm.getDescricao());
		System.out.println("Preco: " + sbm.getPreco());
		System.out.println("Tamanho: " + sbm.getTamanho());
		
		System.out.println("Bebida: " + bb.getDescricao());
		System.out.println("Preco: " + bb.getPreco());
		System.out.println("Ml: " + bb.getMl());
	}
}
