package menù_package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Piatto {
      private int indice;
	  private String nome;
	  private String ingredienti;
	  private double prezzo;
	  
	  
	  List <Piatto> ListaPiatti = new ArrayList <Piatto>();

	  public Piatto (int indice, String nome, String ingredienti, double prezzo) {
		  this.indice = indice;
		  this.nome = nome;
		  this.ingredienti = ingredienti;
		  this.prezzo = prezzo;
		  
		  
		  
		  Piatto piatto1 = new Piatto (1,"Spaghetti alla Carbonara", "Pasta, uovo, guanciale, pecorino",6.5);
		  Piatto piatto2 = new Piatto (2,"Pizza Fritta","Pizza, pomodoro, ricotta, cicoli",5.00);
		  Piatto piatto3 = new Piatto (3, "Zuppa di Farro", "Farro, legumi, olio, cipolla", 4.5);
		  
		  
		  
		  
		  ListaPiatti.add(piatto1);
		  ListaPiatti.add(piatto2);
		  ListaPiatti.add(piatto3);	  
		  
	  } 
	  
	  public void stampaPiatti () {
		  Iterator<Piatto> it_Piatto = ListaPiatti.iterator();

		  while (it_Piatto.hasNext()){
			  Piatto test_Piatto = it_Piatto.next();
			  System.out.println(test_Piatto.getIndice());
			  System.out.println(test_Piatto.getNome());
			  System.out.println(test_Piatto.getIngredienti());
	  }
	  }



	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIngredienti() {
		return ingredienti;
	}

	public void setIngredienti(String ingredienti) {
		this.ingredienti = ingredienti;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
}