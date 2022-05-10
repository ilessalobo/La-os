package b;

import java.util.ArrayList;

public class TestaFor {

	public static void main(String[] args) {

		// Cria��o e inicializa��o de uma variavel
		int i = 1;

		// Condi��o de parada
		while (i < 10) {

		// Executa o loop
			System.out.println(i);

		// Incremento que � acrescentado a cada vez que o la�o � executado
			i++;
		}
		// Verifica a condi��o; Executa o loop; Executa o incremento

		System.out.println("-----------");
		// Formando o conhecido FOR:

		for (int a = 1; a < 10; a++) {
			System.out.println(a);
		}

		System.out.println("-----------");
		
		 /*
		 Usando FOR com mais de uma variavel: Se a variavel for inicializada
		 anteriormente e separada posteriormente por virgula ser� executada
		 */

		int y;
		int x;
		for (y = 0, x = 0; y < 10; y++, x++) {
			System.out.println(y + " " + x);

		}

		System.out.println("-----------");

		// Usando FOR para Array
		int[] numeros = { 1, 2, 3, 4, 5, 6 };

		for (int j = 0; j < numeros.length; j++) {
			System.out.println(numeros[j]);
		}

		System.out.println("-----------");
		// Usando FOR EACH para ArrayList

		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Ana");
		nomes.add("Bruno");
		for (String nome : nomes) {
			System.out.println(nome);
		}

		// Usando o m�todo forEach
		System.out.println("-----------");
		nomes.forEach(System.out::println);
	}
}