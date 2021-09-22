package paquete;

import java.util.Calendar;
import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {

			/*
				Programa que lee nombre y año de nacimiento de una serie de alumnos hasta introducir
				como nombre de alumno “fin”. En ese momento mostrará la edad media de los alumnos y
				el nombre del alumno menor. NOTA: Al introducir como nombre “fin”, no nos ha de pedir el
				año de nacimiento.
			 */
		
		

		String nombre, nombreMenor= "";
		int anoNacimiento;
		int anoActual;
		int edad;
		int contEdad=0;
		int menor=Integer.MAX_VALUE;
		int suma=0;
		float media=0;
		boolean continuar = true;
	
		Scanner sc= new Scanner(System.in);
		//Calendar calendario = Calendar.getInstance();
		anoActual= Calendar.getInstance().get(Calendar.YEAR);
		System.out.println(anoActual);
		
		do {
			
			System.out.println("Introduce nombre");
			nombre= sc.nextLine();
			
			if(nombre.equals("fin")){
				continuar = false;
			}else {	
				
			System.out.println("Introduce año de nacimiento");
			//Quiero convertir a INT, como no puedo usar int , utilizo el ENVOLVENTE (la clase ) Integer.valueOF
			anoNacimiento= Integer.valueOf(sc.nextLine());

			edad= anoActual - anoNacimiento;
			
			contEdad++;
			suma += edad ;
			
			if(edad < menor) {
			menor = edad;
			nombreMenor= nombre;
			}
		}
			
		} while(continuar);
		
		sc.close();
		
		if(contEdad > 0) {
		media= (float)suma/contEdad;		
		System.out.println("La edad media de los alumno es : " + media + " y el alumno menor es: " + nombreMenor + " que tiene " + menor);
		}
	}
}
