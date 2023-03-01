package tutorial;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    boolean control = true;
	    boolean controlLogin = true;
	    // questi sono i booleani che controllano l'iterazione dei cicli
	    
	    int programIterations = 0;
	    // variabile contatore per le operazioni svolte
	    
	    String username = "Mirko Campari";
	    String password = "java";
	    // credenziali
	    
	    
	    while (controlLogin) {
	    	//qui inizia il ciclo while del login
	    	System.out.println("Inserire Username");
	    	
	    	Scanner scUser = new Scanner (System.in);
		    String usernameInserito = scUser.nextLine();
		    //inserimento username
		    
		    if (usernameInserito.equals(username)) {
		    	//qui viene elaborato il caso di un inserimento corretto
		    	
		    	System.out.println("Inserire password");
		    	//passiamo a richiedere il dato successivo
		    	
		    	Scanner scPass = new Scanner (System.in);
			    String passwordInserita = scPass.nextLine();
			    
			    if (passwordInserita.equals(password)) {
			    //qui viene elaborato il caso di un inserimento corretto
			    System.out.println("Accesso consentito.");
			    
			    controlLogin = false;
			    // si interrompe il ciclo accedendo alla funzione del programma
			    
			    }//fine if password
			    
			    else {	
			    	System.out.println("Accesso negato / Credenziali non valide.");
			    }
			    
		    }//fine if username
		    
		    
		    else {	
		    	System.out.println("Accesso negato / Credenziali non valide.");
		    }
		    //nelle righe sovrastanti viene gestita una risposta non corretta
		    
	    }//fine ciclo while del login 
	    
	    while (control) {
	    // inizia l'operazione della calcolatrice	
		
		System.out.println("Desidera procedere con il calcolo?");
	    
	    Scanner sc = new Scanner (System.in);
	    String answer = sc.nextLine();
	    
	    // registriamo l'input dall'user
	    
	  
	    
	    if ( answer.equals("No")) {
	    	control = false ;
	    	System.out.println("Programma terminato.");
	    	System.out.println("La calcolatrice ha operato " + programIterations + " volte.");
	   
	    	// procedura con cui si termina il programma
	    }
	   
	    else if ( answer.equals("Sì"))
	    	
	    	// in caso di volontà positiva ad operare, si richiede l'immissione dei dati
      
	    	System.out.println("Inserire il primo numero su cui operare");
	    	Scanner sc2 = new Scanner (System.in);
	    	
	    if (sc2.hasNextInt()) { 	
	    	
	    	int primoNumero =  sc2.nextInt();
	    	
	     // solo se il dato inserito è realmente un numero si passa alla richiesta del secondo dato
	    	
	    	System.out.println("Inserire il secondo numero su cui operare");
	    	Scanner sc3 = new Scanner (System.in);
	    
	    if (sc3.hasNextInt()) {	
	    	int secondoNumero = sc3.nextInt();
	    	
	    	// se tutti i dati sono corretti si passa alla scelta dell'operazione
	    	
	    	System.out.println("Operazioni disponibili:");
	    	System.out.println ("Addizione, Sottrazione, Moltiplicazione, Divisione.");
	    	
	    	
	    	System.out.println("Scegliere l'operazione da eseguire");
	    	Scanner sc4 = new Scanner (System.in);
	    	String operazione = sc4.nextLine();
	    	
	    	Random rand = new Random();
	    	int numeroRandom = rand.nextInt(10);
	    	
	    	// si gestiscono quindi le diverse operazioni
	    	
	    	 if (operazione.equals("Addizione") ) {
	    		 
	    		 programIterations = programIterations + 1 ;
	    		 
	    		 System.out.println("Il risultato corretto è ");
	    		 System.out.println(primoNumero + secondoNumero);
	             System.out.println("Il risultato sbagliato è ");
	             System.out.println (primoNumero + secondoNumero + numeroRandom);
	    	 
	    	 }  
	    		 else if (operazione.equals("Sottrazione")) {
	    			 
	    			 programIterations = programIterations + 1 ;
	    			 
	    			 System.out.println("Il risultato corretto è ");
	    			 System.out.println (primoNumero - secondoNumero);
	    			 System.out.println ("Il risultato sbagliato è ");
	    			 System.out.println (primoNumero - secondoNumero + numeroRandom);
	    		 } 
	    	 
                  else if (operazione.equals("Moltiplicazione")) {
	    			 
	    			 programIterations = programIterations + 1 ;
	    			 
	    			 System.out.println("Il risultato corretto è ");
	    			 System.out.println (primoNumero * secondoNumero);
	    			 System.out.println ("Il risultato sbagliato è ");
	    			 System.out.println (primoNumero * secondoNumero + numeroRandom);
	    		 } 
	    	 
                  else if (operazione.equals("Divisione")) {
 	    			 
 	    			 programIterations = programIterations + 1 ;
 	    			 
 	    			 double primoNumeroDecimale = primoNumero; 
 	    			 double secondoNumeroDecimale = secondoNumero ;
 	    			 
 	    			 System.out.println("Il risultato corretto è ");
 	    			 System.out.println (primoNumeroDecimale / secondoNumeroDecimale);
 	    			 System.out.println ("Il risultato sbagliato è ");
 	    			 System.out.println (primoNumeroDecimale / secondoNumeroDecimale + numeroRandom);
 	    		 } 
	    	 
	    	 
	    	 
	    	 
	    	 
	    			 else {
	    				 System.out.println("Operazione scelta non valida");
	    				// gestione di un comando non valido  				 
	    			 }
	      
	    	 
	    } // if secondo numero 
	    else {
   		 System.out.println("Prego inserire un numero.");
     }
	     } // if primoNumero 
	    else {
   		 System.out.println("Prego inserire un numero.");
     }
	    // gestione di immissioni non coerenti con il tipo di dato richiesto
	    
	    } //while chiusura
	    	 
	    		 }
	    	 }
	    
	    
