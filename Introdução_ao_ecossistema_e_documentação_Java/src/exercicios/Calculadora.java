package exercicios;

public class Calculadora {
	
	public static void soma(double num1, double num2) {
		
		double resultado = num1 + num2;		
		System.out.println("A soma de " +num1+" + "+num2+" = " +resultado );
	}
	
	public static void subtracao(double num1, double num2) {
		
		double resultado = num1 - num2;		
		System.out.println("A subtra��o de "+num1+" - "+num2+" = " +resultado );
	}
	
	public static void multiplica��o(double num1, double num2) {
		
		double resultado = num1 * num2;		
		System.out.println("A multiplica��o de "+num1 +" * "+ num2+" = " +resultado );
	}
	
	public static void divis�o (double num1, double num2) {
		
		if(num2==0) {
			System.out.println("N�o � possivel divis�o por Zero");
		}else {		
			double resultado = num1 / num2;		
			System.out.println("A Divis�o de "+num1+" / "+num2+" = " +resultado );
		}
	}
	
	

}
