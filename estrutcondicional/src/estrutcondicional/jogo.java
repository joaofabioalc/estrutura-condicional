package estrutcondicional;

import java.util.Scanner;

public class jogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inic, fin, horas;
		
		inic = sc.nextInt();
		fin = sc.nextInt();
		
		if (inic > fin) {
			horas = 24 - inic + fin;
			
		}
		else if (inic == fin) {
			horas = 24;
		}
		else {
			horas = fin - inic;
		}
		
		System.out.println("O JOGO DUROU " + horas + " HORA(S)");
		sc.close();
	}

}
