package com.dio;

import java.io.IOException;
import java.util.Scanner;

public class Desafio6 {
	
		 public static void main(String[] args) throws IOException {
		    	Scanner leitor = new Scanner(System.in);
		    	double vp=0;
		    	double A = leitor.nextDouble();
		    	double B = leitor.nextDouble();
		    	
		    	vp = (B-A)*100/A;
		    	System.out.printf("%.2f%%",vp);
		    	//Escreva aqui a sua lógica
		    }
			
}
