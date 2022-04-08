package com.giordano.estruturadados.vetor.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class TestandoLista {

    public static void main(String[] args) {

	int day = 1;
	int year = 2022;

	Calendar cal = new GregorianCalendar(year, 0, 1);

	int res = cal.getActualMaximum(Calendar.DATE);
	System.out.println("Today's Date = " + cal.getTime());
	System.out.println("Last Date of the current month = " + res);
	cal.set(Calendar.DAY_OF_MONTH, 1);

	List<Object> lista1 = new ArrayList<>();
	Object[] dados0 = { 65, 1, "lci-1" };
	Object[] dados1 = { 65, 92, "lci-92" };
	Object[] dados2 = { 65, 98, "lci-98" };
	Object[] dados3 = { 67, 1, "lci-67-1" };
	Object[] dados4 = { 67, 2, "lci-67-2" };
	Object[] dados5 = { 2078, 1, "lci-2078-1" };
	Object[] dados6 = { 2078, 2, "lci-2078-2" };
	Object[] dados7 = { 2078, 3, "lci-2078-3" };
	Object[] dados8 = { 2078, 4, "lci-2078-4" };
	Object[] dados9 = { 25, 1, "lci-25-1" };
	Object[] dados10 = { 79, 1, "lci-79-1" };
	lista1.add(dados0);
	lista1.add(dados1);
	lista1.add(dados2);
	lista1.add(dados3);
	lista1.add(dados4);
	lista1.add(dados5);
	lista1.add(dados6);
	lista1.add(dados7);
	lista1.add(dados8);
	lista1.add(dados9);
	lista1.add(dados10);

	for (int a = 0; a < lista1.size(); a++) {
	    Object[] obj0 = (Object[]) lista1.get(a);
	    System.out.println("Produto");
	    System.out.println(obj0[0].toString());

	    for (int i = a; i < lista1.size(); i++) {
		Object[] obj1 = (Object[]) lista1.get(i);
		String produtoObj0 = obj0[0].toString();
		String produtoObj1 = obj1[0].toString();
		if (!produtoObj0.equals(produtoObj1)) {
		    a = a - 1;
		    System.out.println("------------------");
		    break;
		}
		a++;
		System.out.println("Modalidade");
		System.out.println(obj1[2].toString());
	    }
	}
    }
}
