package sumas;

import java.util.Scanner;

public class Sumas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1;
		int numero2;
		int sumaTotal;
		 Scanner scanner = new Scanner(System.in);
			//almacena numero 1
			System.out.println("Ingresa el primer numero para sumar: ");
			numero1 = scanner.nextInt();
			
			//almacenar numero 2
			System.out.println("Ingresa el segundo numero para sumar: ");
			numero2 = scanner.nextInt();
		
			//realizar la suma
		sumaTotal = numero1 + numero2;
		System.out.println("La suma suma de los dos numeros insertado es: " + sumaTotal);
		
		
	}

}


	

