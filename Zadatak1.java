package test;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
	/*	Test Java
		Prvi zadatak
		Napisati program na programskom jeziku Java koji sluzi kao kviz za pogadjanje zemalja 
		iz kojih dolaze teniseri. 
		Korisnik moze da odgovara sve dok ne izabere opciju za izlaz.
		 Korisniku se na standardni izlaz ispisuje sledecui meni:
		1. Djokovic
		2. Nadal
		3. Federer
		4. Izlaz

		Korisnik bira redni broj tesnisera za koga ce pogadjati zemlju porekla. 
		Nakon toga mu se ispisuje poruka sa pitanjem.
		 Npr. ukoliko je korisnik izablao opciju jedan ispisuje se poruka:
		"Iz koje zemlje dolazi Djokovic?". Ukoliko korisnik unese tacan odgovor ispisuje se poruka "Tacno!".
		 Ukoliko korisnik unese netacan odgovor ispisuje se poruka "Netacno!".
		Nakon toga opet se ispisuje isti meni sa istim funkcionalnostima.
		Ukoliko korisnik izabere opciju 4 izlazi se iz programa.  
		Ukoliko korisnik unese neki nevalidan broj kao opciju ponovo ispisati meni.
		Prilikom provere tacnosti odgovora ne treba voditi racuna o velikim i malim slovima.
		Tacni odgovori su: Djokovic - Srbija, Nadal - Spanija, Federer - Svajcarska. */
		
		Scanner sc = new Scanner(System.in);
		int redniBroj;
		String nole = "SRBIJA";
		String rafa = "SPANIJA";
		String roger = "SVAJCARSKA";
		String tacanOdgovor1;
		String tacanOdgovor2;
		String tacanOdgovor3;
		
		boolean teniser = true;
		
		
			System.out.println("1. Djokovic");
			System.out.println("2. Nadal");
			System.out.println("3. Federer");
			System.out.println("4. Izlaz");
			
			System.out.println("Izaberite redni broj tenisera");
			redniBroj = sc.nextInt();
			
			do {
			switch (redniBroj) {
			case 1:
				do  {
					System.out.println("Iz koje zemlje dolazi Djokovic?");
					String odgovor1 = sc.next();
					tacanOdgovor1 = odgovor1.toUpperCase();
				} while (!tacanOdgovor1.equals(nole));
				
				if (tacanOdgovor1.equals(nole)) {
					System.out.println("Tacan odgovor");
				} else {
					System.out.println("Netacan odgovor");
				}
				break;

			case 2: 
				do  {
					System.out.println("Iz koje zemlje dolazi Nadal?");
					String odgovor2 = sc.next();
					tacanOdgovor2 = odgovor2.toUpperCase();
				} while (!tacanOdgovor2.equals(rafa));
				

				if (tacanOdgovor2.equals(rafa)) {
					System.out.println("Tacan odgovor");
				} else {
					System.out.println("Netacan odgovor");
				}
				
				break;
			case 3: 
			
			     do	{
				System.out.println("Iz koje zemlje dolazi Federer?");
				String odgovor3 = sc.next();
				tacanOdgovor3 = odgovor3.toUpperCase();
				} while (!tacanOdgovor3.equals(roger));
			     
			     if (tacanOdgovor3.equals(roger)) {
						System.out.println("Tacan odgovor");
					} else {
						System.out.println("Netacan odgovor");
					}
			     
					break;
				
			case 4: 
				System.out.println("Dovidjenja!");
				teniser = false;
				break;
				
				default: System.out.println("Nije dobra vrednost!");
				break;
			}
			} while (redniBroj != 4);
	
	}

}
