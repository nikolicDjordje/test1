package test;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		/* Drugi zadatak
Napisati program koji racuna razliku izmedju visine najviseg i najnizeg igraca kosarkaskog tima
kao i prosecnu visinu igraca.
Korisnik na standardni ulaz unosi visinu svih pet igraca kosarkskog tima. 
Visina je izrazena u metrima.
Po zavrsetku unosa ispisuje se prosecna visina clana ekipe, visina najviseg igraca,
visina najnizeg igraca i razlika u visini ta dva igraca.
Ukoliko korisnik unese nevalidnu vrednost kao visinu ispisati poruku o gresci i 
omoguciti mu da ponovi unos. Smatrati da ne postoji kosarkas visi od 2,5 metara.
 
 */
		
		Scanner sc = new Scanner(System.in);
	    double Kosarkas;
		int brojac = 0;
		double prosecnaVisina = 0;
		double najvisiIgrac = 0;
		double najniziIgrac = 10;
		double razlika = 0;
		
		do {
			brojac++;
			System.out.println("Unesite visinu " + brojac + ".kosarkasa");
			Kosarkas = sc.nextDouble();
			
		if (Kosarkas > 2.5)  {
			System.out.println("Uneli ste neispravnu vrednost, molimo pokusajte ponovo: ");
			Kosarkas = sc.nextDouble();
		}
		
		
		if (Kosarkas <= 0)  {
			System.out.println("Uneli ste neispravnu vrednost, molimo pokusajte ponovo: ");
			Kosarkas = sc.nextDouble();
		}
		
				
				
			if (Kosarkas > najvisiIgrac) {
				najvisiIgrac = Kosarkas;
			}
			if (najniziIgrac > Kosarkas) {
				najniziIgrac = Kosarkas;
			}
			prosecnaVisina = prosecnaVisina + Kosarkas;
			razlika = najvisiIgrac - najniziIgrac;
		} while (brojac < 5);
		
		System.out.println("Prosecna visina kosarkasa je: " + prosecnaVisina / 5);
		System.out.println("Najvisi igrac u timu visok je: " + najvisiIgrac);
		System.out.println("Najnizi igrac u timu visok je: " + najniziIgrac);
		System.out.println("Razlika u visini najviseg i najnizeg igraca je: " + razlika);

	}

}
