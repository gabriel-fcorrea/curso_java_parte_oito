package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		String[] names = new String[] { "TV LED", "Video Game Chair", "iPhone X", "Samsung Galaxy 9" };
		double[] prices = new double[] { 1290.99, 350.50, 900.00, 850.00 };
		int[] quantity = new int[] { 1, 3, 2, 2 };

		List<Product> products = new ArrayList<>();

		for (int i = 0; i < names.length; i++) {
			Product product = new Product(names[i], prices[i], quantity[i]);
			products.add(product);
		}

		String path = "c:\\temp\\source.csv";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (Product text : products) {
				bw.write(text.toString());
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		String path2 = "c:\\temp\\output.csv";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2))) {
			for (Product text : products) {
				bw.write(text.Output());
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
