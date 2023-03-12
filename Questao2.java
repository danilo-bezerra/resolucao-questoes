import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Número: ");
		int n = sc.nextInt();

		List<Integer> numeros = fib(n);
		boolean pertence = numeros.contains(n);

		System.out.printf("O número %d %s na sequencia de fibonacci!", n, pertence ? "está" : "não está");

		sc.close();
	}

	public static List<Integer> fib(int n) {
		List<Integer> numeros = new ArrayList<>();
		int n1 = 1, n2 = 1, i = 0, soma = 0;

		do {
			if (i == 0 || i == 1) {
				numeros.add(1);
			} else {
				soma = n1 + n2;
				n1 = n2;
				n2 = soma;
				numeros.add(soma);
			}
			i++;
		} while (soma <= n);

		return numeros;
	}
}
