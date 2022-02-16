package com.dio;

import java.io.IOException;
import java.util.Scanner;

public class Desafio21 {

	   public static void main(String[] args) throws IOException{
		int num, i;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite um numero: ");
		num = sc.nextInt();
		
	
		if (num % 2 !=0 ) {
			num--;		
		}			
					
		if (num > 0) {
			for( i=2; i <= num; i+=2) {
				System.out.println(i);
			}			
		}else
			System.out.println("Inclua numeros maior que  0!!");			
	}
}