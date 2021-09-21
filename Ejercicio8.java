package paquete;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*Programa que lee 4 números. Al finalizar mostrará el máximo introducido, y cuántas veces
		se repite dicho máximo.*/
		
		
		int numero;
		int max = Integer.MIN_VALUE;
		int contador=0;
		
		Scanner sc= new Scanner(System.in);
		
		for(int i=1; i<=4 ;i++) {
			
			System.out.println("Introduce numero");
			numero= sc.nextInt();
			
			if(numero>max) {
				max=numero;	
				contador=0;
			}
			
			else if(max == numero) {
				contador++;
				
			}
		}
		
		System.out.println("El numero max es: " + max + "y se repite : " + contador);

	}

}
