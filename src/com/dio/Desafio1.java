package com.dio;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        double A, B, media;
	        
	        System.out.println("Informe o valor A:");
	        A = sc.nextDouble();
	        System.out.println("Informe o valor B:");
	        B = sc.nextDouble();

	        System.out.println("Valor de A = "+A);
	        System.out.println("Valor de B = "+B);
	        
	        media = ( A * 3.5 + B * 7.5)/11; 
	        	        
	        System.out.printf("MEDIA = %.5f", media    );
	        System.out.println();
	}		
}
