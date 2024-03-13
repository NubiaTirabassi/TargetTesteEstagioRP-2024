package Fibonacci;

import java.util.Scanner;

public class VerificaFibonacci {
	
    public static void main(String[] args) {
    	
    	FormataTexto formata = new FormataTexto();
    	VerificaNumeroFibonacci numeroFibonacci = new VerificaNumeroFibonacci();
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print(formata.perguntaInicial());
        Integer numeroInserido = scanner.nextInt();
        scanner.close();

        
        if (numeroFibonacci.calculoFibonacci(numeroInserido)) {
            System.out.println(formata.retornaNumeroFibonacci(numeroInserido));
        }else {
        	 System.out.println(formata.retornaNumeroNaoFibonacci(numeroInserido));
        }
     
    }
}

