package estrutcondicional;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
				
		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (B % A == 0 || A % B == 0) {
			System.out.println("SÃO MÚLTIPLOS");
		}
		else {
			System.out.println("NÃO SÃO MÚLTIPLOS");
		}
				
		sc.close();
	}

}
