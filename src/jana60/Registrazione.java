package jana60;

import java.util.Scanner;

public class Registrazione {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean flag = false;

		do {
			System.out.print("Inserisci nome utente: ");
			String nomeUtente = scan.nextLine();
			
			System.out.print("Inserisci cognome utente: ");
			String cognomeUtente = scan.nextLine();
			
			System.out.print("Inserisci la tua mail: ");
			String emailUtente = scan.nextLine();
			
			System.out.print("Inserisci la tua password: ");
			String passwordUtente = scan.nextLine();
			
			System.out.print("Inserisci la tua etá: ");
			int etaUtente = Integer.parseInt(scan.nextLine());
			
			try {

				Utente utente = new Utente(nomeUtente, cognomeUtente, emailUtente, passwordUtente, etaUtente);

				System.out.println("Registrazione completata con successo!");
				System.out.println(utente.toString());
				flag = true;
				
			} catch (Exception e) {
				System.out.println("Il seguente dato inserito non é valido: ");
				System.out.println(e.getMessage());
			} 
			
		} while (!flag);
		
		System.out.println("Arrivederci");
		
		scan.close();
	}
	

}
