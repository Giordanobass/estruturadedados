package com.giordano.estruturadados.vetor.teste;

import java.util.*;

public class TestandoLista {

	public static void main(String[] args) {

		List<Object> lista1 = new ArrayList<>();
		Object[] dados0 = { 65, 1, "lci-1" };
		Object[] dados1 = { 65, 92, "lci-92" };
		Object[] dados2 = { 65, 98, "lci-98" };
		Object[] dados3 = { 67, 1, "lci-67-1" };
		Object[] dados4 = { 67, 2, "lci-67-2" };
		Object[] dados5 = { 2078, 1, "lci-2078-1" };
		lista1.add(dados0);
		lista1.add(dados1);
		lista1.add(dados2);
		lista1.add(dados3);
		lista1.add(dados4);
		lista1.add(dados5);

		for (int a = 0; a < lista1.size(); a++) {
			Object[] obj0 = (Object[]) lista1.get(a);
			int count = 0;
			System.out.println("Produto");
			System.out.println(obj0[0].toString());
			System.out.println("---------------------");
			for (int i = a; i < lista1.size(); i++) {
				Object[] obj1 = (Object[]) lista1.get(i);
				String produtoObj0 = obj0[0].toString();
				String produtoObj1 = obj1[0].toString();
				if (!produtoObj0.equals(produtoObj1)) {
					a = a - 1;
//					i = a;
					break;
				}
				a++;
				System.out.println("Contador: " + count);
				System.out.println("Modalidade");
				System.out.println(obj1[2].toString());
			}
		}
	}
}
