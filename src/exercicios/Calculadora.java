package exercicios;

public class Calculadora {
	
	public static void soma(double num1, double num2) {
		
		double resultado = num1 + num2;		
		System.out.println("A soma de " +num1+" + "+num2+" = " +resultado );
	}
	
	public static void subtracao(double num1, double num2) {
		
		double resultado = num1 - num2;		
		System.out.println("A subtração de "+num1+" - "+num2+" = " +resultado );
	}
	
	public static void multiplicação(double num1, double num2) {
		
		double resultado = num1 * num2;		
		System.out.println("A multiplicação de "+num1 +" * "+ num2+" = " +resultado );
	}
	
	public static void divisão (double num1, double num2) {
		
		if(num2==0) {
			System.out.println("Não é possivel divisão por Zero");
		}else {		
			double resultado = num1 / num2;		
			System.out.println("A Divisão de "+num1+" / "+num2+" = " +resultado );
		}
	}
	
	

}
