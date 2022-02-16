package exercicios;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int op;
		
		System.out.println("*** Esolha uma opção: ***\n");
		System.out.println("1 - Calculadora");
		System.out.println("2 - Saudação");
		op=sc.nextInt();
		
		switch (op) {
		
			case 1:
				ChamarCalculadora();
			break;
			
			case 2:
				ChamarSaudacao();
			break;
		}
	}
	
	public static void ChamarCalculadora() {
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		int op;
				
		System.out.println("------- Calculadora -------");
		System.out.println("1- Soma");
		System.out.println("2- Subtração");
		System.out.println("3- Multiplicação");
		System.out.println("4- Divisão");
		System.out.println("\nEsolha uma opção: ");
		op = sc.nextInt();		
		
		switch (op){
			case 1:
				System.out.println("Digite um numero: ");
				num1 = sc.nextDouble();		
				System.out.println("Digite outro numero: ");
				num2 = sc.nextDouble();
				Calculadora.soma(num1, num2);
				break;				
			case 2:
				System.out.println("Digite um numero: ");
				num1 = sc.nextDouble();		
				System.out.println("Digite outro numero: ");
				num2 = sc.nextDouble();
				Calculadora.subtracao(num1, num2);
				break;				
			case 3:
				System.out.println("Digite um numero: ");
				num1 = sc.nextDouble();		
				System.out.println("Digite outro numero: ");
				num2 = sc.nextDouble();
				Calculadora.multiplicação(num1, num2);
				break;				
			case 4:
				System.out.println("Digite um numero: ");
				num1 = sc.nextDouble();		
				System.out.println("Digite outro numero: ");
				num2 = sc.nextDouble();
				Calculadora.divisão(num1, num2);
				break;
			default:  
				System.out.println("Opção Invalida!!!");				
		}
				
	}
	
	// Metodo responsável por verificar se o valor digitado é um valor valido 
	 
	public static void ChamarSaudacao() {
		Scanner sc = new Scanner(System.in);
		int  valor;
		
		System.out.println("\nDigite um valor entre 00 e 24: ");
		valor = sc.nextInt();
		
		if(valor >= 00 && valor <= 24 ) {
			Saudacao.mostrarSaudacao(valor);
		}else
			System.out.println("Valor Invalido!!");
	}
}
