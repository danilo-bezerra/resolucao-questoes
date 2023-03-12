import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Palavra: ");
		String string = sc.nextLine();
		String stringInvertida = "";

		String[] caracteresString = string.split("");

		for (int i = caracteresString.length - 1; i >= 0; i--) {
			stringInvertida += caracteresString[i];
		}

		System.out.printf("Palavra invertida: %s", stringInvertida);

		sc.close();
	}

}
