package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
		}
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			
			System.out.println("Voce diz: ");
			valor = entrada.nextLine();
		}
		
		entrada.close();

	}

}
