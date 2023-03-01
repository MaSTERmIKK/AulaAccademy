package esercizio;


import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// menù per scelta
		// disponibile 4 operazioni, su 2 addendi(somma sottr =int)(dv e molt = boll)
		// creare risultato corretto e risultato sbagliato
		// quando voglio uscire mi dice quante volte ho calcolato

		// istanzio le variabili che ospiteranno gli input del client

		String r1 = "";
		String risp = "";
		String nInp = "";
		String cInp = "";
		double v1;
		double v2;

		//istanzio il valore random
		
		int random;


		//istanziole credenziali di accesso
		String nome = "FRANCESCO";
		String cognome = "PIATTI";

		//creo gli oggetti scanner
		Scanner myObjN = new Scanner(System.in); // oggetto scanner numeri
		Scanner myObjS = new Scanner(System.in);// oggetto scanner stringhe

		int contatore = 0; // contatore che incrementerà ad ogni calcolo

		//booleans per i cicli
		boolean verificaProgrCalcolo = false;
		boolean verificaProgrLogIn = false;

		while (verificaProgrLogIn == false && verificaProgrCalcolo == false) // verifico condizioni iniziale
		{
			System.out.println("insert username");
			nInp = myObjN.nextLine().toUpperCase();
			System.out.println("insert surname(password)");
			cInp = myObjN.nextLine().toUpperCase();

			if (nInp.equals(nome) && cInp.equals(cognome)) {//verifico cedenziali accesso

				while (verificaProgrCalcolo == false)// primo ciclo apertura al verificarsi del booleano
				{

					if (contatore >0) // lo utilizzo per verificare che abbia già fatto il primo calcolo
					{
						// System.out.println("SONO QUA 1"); per fare test
						System.out.println("Do you want to do an other calculation? you've done it for: " + contatore
								+ " times [Y]=yes [N]=no");
						// System.out.println("SONO QUA2"); per fare test
						r1 = myObjN.nextLine().toUpperCase();
					} 
					else
					{

						System.out.println("Welcome to the calculator. Can I help you?[Y]=yes [N]=no");
						//r1 = myObjN.nextLine().toUpperCase();//se lo metto qua non funziona
					}
					//System.out.println("SONO QUA 3"); per fare test
					r1 = myObjN.nextLine().toUpperCase();//se lo metto qui funziona ma deve essere pure nell' if
					
					switch (r1) { // verifico la risposta dell'utente
					case "N": {

						System.out.println("Ok thank you, goodbye.");
						verificaProgrCalcolo = true;

					}
						break;
					case "Y": {
						System.out.println("Perfect, please ensert your values");
						System.out.print("Value1:  ");
						v1 = myObjN.nextDouble();

						System.out.print("Value2:  ");

						v2 = myObjN.nextDouble();

						System.out.println(
								"what kind of calculation do you want to do?: [+]=sum;[-]=subtraction;[x]=moltiplication;[/]=division");
						risp = myObjS.nextLine();

					}

						switch (risp) {// in case al tipo di calcolo inserito lo svolgerà
						case "+": {
							double vSomma = v1 + v2;
							System.out.println("correct value: " + vSomma);
							random = (int) (Math.random() * 101);
							System.out.println("not correct value: "+random);
							contatore++;

						}
							break;
						case "-": {
							if (v1 < v2) {
								double vSott = v1 - v2;
								System.out.println("correct value: -" + vSott);
								random = (int) (Math.random() * 101);
								System.out.println("not correct value: "+random);
								contatore++;
							} else {
								double vSott = v1 - v2;
								System.out.println("correct value: " + vSott);
								random = (int) (Math.random() * 101);
								System.out.println("not correct value: " + random);
								contatore++;
							}
						}
							break;

						case "x": {
							double vMolt = v1 * v2;
							System.out.println("correct value: " + vMolt);
							random = (int) (Math.random() * 101);
							System.out.println("not correct value: " + random);
							contatore++;
						}
							break;
						case "/": {
							double vDiv = v1 / v2;
							System.out.println("correct value: " + vDiv);
							random = (int) (Math.random() * 101);
							System.out.println("not correct value: " + random);
							contatore++;
						}
							break;

						}

					}
					

				}

			} 
			else {
				System.out.println("you're datas are wrong.Do you want to try again? [Y]=yes [N]=no");
				Scanner myObjS2 = new Scanner(System.in);
				String vf = myObjS2.nextLine().toUpperCase();
				if(vf.equals("N"))
					verificaProgrLogIn=true;
				 else {
					 verificaProgrLogIn=false;
		 }
		 
					 
						
				
				

			}
		}
	}
}


