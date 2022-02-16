package exercicios;

public class Saudacao {
	
	public static void mostrarSaudacao(int hora) {
		
		if(hora >= 12 && hora < 18) {
			System.out.println("Boa tarde!!");
		}else if(hora >= 18 && hora < 24) {
			System.out.println("Boa noite!!");
		}else
			System.out.println("Bom dia!!");
	}

}
