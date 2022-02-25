package com.dio;

import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);

		double raio, area; 
		
        raio = scan.nextDouble();

		area = 3.14159 * (Math.pow( raio   ,2));

		System.out.printf("A=%.4f\n", area);
	}
}

/**
 * 

import java.util.Scanner; 

public class Classe {
  
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		 //declare suas variaveis do tipo double
		 double raio, area; 

      //continue a solucao
      raio = scan.nextDouble();

		area = 3.14159 * (Math.pow(area    ,2));

		System.out.printf("A=%.4f\n", area);
	}
} */