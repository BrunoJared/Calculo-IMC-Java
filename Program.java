package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Individuo;

public class Program {

	

	

	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Individuo ind = new Individuo();
		
		
		
		
		
		System.out.println("###  Progama Cálculo de IMC  ###");
		
		System.out.println();
		
		System.out.print("Insira o Nome: ");
		ind.setNome(sc.next());
		
		System.out.print("Insira a Altura: ");
		ind.setAltura(sc.nextDouble());
		
		System.out.print("Insira o Peso: ");
		ind.setPeso(sc.nextDouble());
		
		System.out.println("IMC = " + ind.IMC());
		System.out.println(ind);
		
		System.out.println();
		
		if(ind.IMC() <= 18.5) {
			System.out.println("Abaixo do Peso");
		}
		else if(ind.IMC() <= 24.9) {
			System.out.println("Peso Normal");
			
		}
		else if(ind.IMC() <= 29.9) {
			System.out.println("Sobrepeso");
		}
		else if(ind.IMC() <= 39.9) {
			System.out.println("Obesidade");
		}
		else if(ind.IMC() > 40.0){
			System.out.println("Obesidade Grave");
		}
		

		
		sc.close();
	}

}
