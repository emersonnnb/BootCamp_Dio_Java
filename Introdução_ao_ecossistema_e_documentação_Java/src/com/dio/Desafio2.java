package com.dio;

import java.io.IOException;
import java.util.Scanner;

public class Desafio2 {

	   public static void main(String[] args) throws IOException{
		int num, i;
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite um numero: ");
		num = sc.nextInt();
		
		
	if (num % 2 !=0 ) {
		num--;		
	}
	System.out.println(num);
		
	for( i=2; i <= num; i+=2) {
		System.out.println(i);
	}
	
		
		
			
			
	}
}