package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//FORMA MAIS TRABALHOSA PARA FINS DE APRENDIZADO

public class FileReaderAndBufferedReader {

	public static void main(String[] arg) {
		// caminho do arquivo:
		String path = "c:\\temp\\in.txt";

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr); // como é instanciado a partir do FileReader, a leitura do arquivo é mais
											// rápida

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally { // pode ocorrer uma exceção ao tentar fechar as streams:
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
