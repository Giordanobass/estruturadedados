package com.giordano.estruturadados.vetor.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestandoLista {

    public static void main(String[] args) {

//	List<Object> lista1 = new ArrayList<>();
//	List<Object> lista2 = new ArrayList<>();
//	List<Object> lista3 = new ArrayList<>();
//	Object[] dados1 = { 1, 2, 3, 4 };
//	Object[] dados2 = { "a", "b", "c", "d" };
//	Object[] dados3 = { "a1", "b2", "c3", "d4" };
//	lista1.add(dados1);
//	lista1.add(dados2);
//	lista1.add(dados3);
//	lista2.add(dados2);
//	lista3.add(dados3);
//
//	List<Object> listaTotal = lista1;
//
//	for (int a = 0; a < listaTotal.size(); a++) {
//	    Object[] obj0 = (Object[]) listaTotal.get(a);
//
//	    for (int i = 0; i < lista1.size(); i++) {
//		Object[] obj1 = (Object[]) lista1.get(i);
//
//		for (int o = 0; o < lista2.size(); o++) {
//		    Object[] obj2 = (Object[]) lista2.get(o);
//
//		    for (int u = 0; u < lista3.size(); u++) {
//			Object[] obj3 = (Object[]) lista3.get(u);
//			System.out.println("------");
//			System.out.println(obj0);
//			System.out.println(obj0[3]);
//			System.out.println("------");
//			System.out.println(obj1);
//			System.out.println(obj1[3]);
//			System.out.println("------");
//			System.out.println(obj2);
//			System.out.println(obj2[3]);
//			System.out.println("------");
//			System.out.println(obj3);
//			System.out.println(obj3[3]);
//		    }
//		}
//	    }
//
//	}
	int day = 1;
	int year = 2022;

	Calendar cal = new GregorianCalendar(year, 0, 1);

	int res = cal.getActualMaximum(Calendar.DATE);
	System.out.println("Today's Date = " + cal.getTime());
	System.out.println("Last Date of the current month = " + res);
	cal.set(Calendar.DAY_OF_MONTH, 1);
    }
}
