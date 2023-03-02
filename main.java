package menù_package;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		List <utente> utenti = new ArrayList<>();
		utente dummy = new utente(" "," ");
		utenti.add(dummy);
		
		
		
		boolean control0 = true;
		boolean control1 = true;
		boolean controlLoginMenu = true;
		boolean controlRegistration = true;
		boolean controlLogin = true;
		
		
		double conto = 0;
		
		
   while (controlLoginMenu) {
		
		System.out.println("Inserisca il numero corrispondente alla sua scelta");
		
		System.out.println ("1)Registrarti.");
		System.out.println ("2)Fare il login.");
		System.out.println ("3)Uscire.");
		
		Scanner scanLogin = new Scanner(System.in);
		String comandoInseritoLogin = scanLogin.nextLine();
		
		if (comandoInseritoLogin.equals("1")) {
			
		   
			while (controlRegistration) {
			
			System.out.println("Inserire username:");
		   Scanner scanUsernameRegistrazione = new Scanner(System.in);
			String usernameRegistrazione = scanUsernameRegistrazione.nextLine();
			System.out.println ("Inserire password:");
			Scanner scanPasswordRegistrazione = new Scanner(System.in);
			String passwordRegistrazione = scanPasswordRegistrazione.nextLine();
			
			utente u = new utente (usernameRegistrazione,passwordRegistrazione);
			
			for (int i = 0; i<utenti.size();i++) {
				if((utenti.get(i).getUsername().equals(u.getUsername()))) {
					System.out.println("Username non disponibile.");
				}//chiusura if della gestione omonimie
				else {
					System.out.println("Registrazione avvenuta con successo.");
					System.out.println("Username: "+usernameRegistrazione);
					System.out.println("Password: "+passwordRegistrazione);
					
					controlRegistration = false;
				}//registrazione avvenute
				
				
			}//chiusura for della verifica
			           utenti.add(u); //aggiunta alla lista utenti
			
			}//chiusura while registrazione
			
		}// chiusura if della registrazione
		
		else if (comandoInseritoLogin.equals("3")) {
			
			System.out.println("Programma terminato.");
			System.exit(0);
			
		}// chiusura if uscire
		
		else if  (comandoInseritoLogin.equals("2")) {
			
			while (controlLogin) {
			
				System.out.println("Inserire username:");
				Scanner scanUsernameLogin = new Scanner(System.in);
				String usernameLogin = scanUsernameLogin.nextLine();
				
				Iterator<utente> it_utente = utenti.iterator();

				while (it_utente.hasNext()){
					 utente test_utente = it_utente.next();
					if (test_utente.getUsername().equals(usernameLogin)) {
						
						System.out.println("Inserire password:");
						Scanner scanPasswordLogin = new Scanner(System.in);
						String passwordLogin = scanPasswordLogin.nextLine();
						
							if (test_utente.getPassword().equals(passwordLogin)) {
							
								System.out.println("Accesso consentito.");
								
								controlLogin=false ;
								controlLoginMenu = false;
							     }//chiusura if password corretta
							
							
						
						
					}// chiusura if Username corretto
					
					
					
				
				}//chiusura 1mo while verifica username
				
			}//chiusura while login
			
		}// chiusura if login
		
		else {
			
		   System.out.println("Comando non valido.");
		
	
		}// chiusura if gestione errori
		
         }//chiusura while del Login
		
		while (control0) {
			
			System.out.println ("Benvenuto!");
			System.out.println ("Inserisca il numero corrispondente all'opzione desiderata.");
			System.out.println("1)Ordinare.");
			System.out.println("2)Uscire.");
			
			Scanner scan0 = new Scanner(System.in);
			String comandoInserito0 = scan0.nextLine();
			
			if (comandoInserito0.equals("2")) {
				
				if (conto>0) {
					System.out.println("Totale da pagare:");
					System.out.println("£"+conto);
				}//if della stampa del conto
				
				control0=false;
				
				System.out.println ("Grazie per averci scelto");
				System.out.println ("Arrivederla");
			}//chiusura dell'if dell'End
			
			
			else if (comandoInserito0.equals("1")) {
				
				
				while (control1) {
				
				System.out.println ("Inserisca il numero corrispondente all'opzione desiderata.");
				System.out.println("1) Visualizza il menù.");
				System.out.println ("2) Ordina una pietanza dal menù.");
				System.out.println ("3) Torna indietro.");
				
				
				Scanner scan1 = new Scanner(System.in);
				String comandoInserito1 = scan1.nextLine();
				
				if (comandoInserito1.equals("1")) {
					
					
						
						
					
					
				}//chiusura dell'if della visualizzazione del menù
				
				else if (comandoInserito1.equals("2")) {
					
				}//chiusura dell'If della procedura per ordinare
				
				else if (comandoInserito1.equals("3")){
					control1 = false;
				}//chiusura dell'if per tornare indietro
				
				
				else {
				System.out.println("Comando non valido.");	
				}	// chiusura dell'else per la gestione di comandi non validi
					
				}//chiusura while dell'operazione
				}//chiusura dell'if dell'operazione
			
			else {
		     System.out.println("Comando non valido.");
			}// chiusura dell'else per gestire comandi non validi nel menù dell'ingresso
			
		}//chiusura while dell'ingresso
		
		
	
		
		
		
		
	}

}
