package empresa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int peso;
		double altura;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o peso: ");
		peso = teclado.nextInt();
		System.out.println();
		System.out.println("Digite a altura: ");
		altura = teclado.nextDouble();
		System.out.println();
		
		double imc = peso / (altura*altura);
		
		
		System.out.println("IMC: " + imc);
				
				
	}

}
