package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LeitorDeArquivos {

	public static void main(String[] args) {

		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(file); // instancia-se o scanner com o próprio arquivo
			while (sc.hasNextLine()) { // testa se há uma nova linha no arquivo
				System.out.println(sc.nextLine()); // para imprimir a nova linha caso exista
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}
}
