package ProjetoLacoRepeticao;

public class Repetidor {

	public Integer retornaSoma(Integer indice) {

		int contador = 0;
		int soma = 0;

		while (contador < indice) {
			contador = contador + 1;
			soma = soma + contador;
		}
		return soma;
	}

}
