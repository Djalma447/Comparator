package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Playstation 5", 5999.90));
		list.add(new Product("Iphone 11", 4999.99));
		list.add(new Product("TV Samsung", 2999.50));
		
		Comparator<Product> comp = new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
			
		};
		
		list.sort(comp);
		
		for (Product p : list) {
			System.out.println(p);
		}

	}

}
