package paquete;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		/*Programa consistente en un juego en el que el Jugador1 introduce un n�mero entre el 1 y
		el 100 y el Jugador2 tendr� que adivinarlo en un m�ximo de 10 intentos. Por cada intento
		del Jugador2, y en el caso de no acertar, se mostrar� el mensaje �Te pasaste�, o �No
		llegaste�, seg�n corresponda. De la misma manera, y al terminar el programa, se
		mostrar�n los mensajes �Acertaste� o bien �Intentos agotados�.
		 
		 */
		
		int numero;
		int intento;
		int maxIntentos =10;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Jugador 1 introduce numero entre el 1 y el 100: ");
		numero=sc.nextInt();
		
		for(int i=1; i<=maxIntentos; i++) {
			System.out.println("Introduce numero");
			intento=sc.nextInt();
			if(intento>numero) {
				System.out.println("Te pasaste");
			}
			else if(intento < numero) {
				System.out.println("No llegaste");
			}
			else if( intento==numero) {
				System.out.println("Has acertado!");
				sc.close();
			}
		}
			
		
		
	}

}
