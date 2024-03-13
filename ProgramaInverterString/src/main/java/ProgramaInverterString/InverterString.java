package ProgramaInverterString;

import java.util.Scanner;

public class InverterString {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		RetornaTexto texto = new RetornaTexto();
		Inverte inverte = new Inverte();

		System.out.println(texto.textoFixo());
		
		String string = scanner.nextLine();

		System.out.println(texto.retornaTextoInvertido(inverte.inverterPalavra(string)));

		scanner.close();
	}

}
