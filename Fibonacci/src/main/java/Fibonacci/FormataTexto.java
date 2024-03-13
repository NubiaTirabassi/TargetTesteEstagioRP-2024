package Fibonacci;

public class FormataTexto {
	
	public String retornaNumeroFibonacci(Integer numero) {
		
		return "O número " + numero + " pertence à sequência de Fibonacci.";
		
	}
	
	public String retornaNumeroNaoFibonacci(Integer numero) {
		
		return "O número " + numero + " não pertence à sequência de Fibonacci.";	
	}
	
	public static String perguntaInicial() {
		
		return "Quer descobrir se um número faz parte da sequência? Digite-o aqui: ";
	}

}
