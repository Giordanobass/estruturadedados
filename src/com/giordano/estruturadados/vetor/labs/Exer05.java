package com.giordano.estruturadados.vetor.labs;

import java.util.ArrayList;

import com.giordano.estruturadados.vetor.Lista;

public class Exer05 {

    public static void main(String[] args) {
	ArrayList<String> arrayList = new ArrayList<>(5);
	arrayList.add("A");
	arrayList.add("B");
	arrayList.add("C");
	arrayList.add("D");
	arrayList.add("E");

	System.out.println("ArrayList: "+arrayList);
	arrayList.clear();
	System.out.println(arrayList);

	Lista<String> lista = new Lista<String>(5);
	lista.adiciona("A");
	lista.adiciona("B");
	lista.adiciona("C");
	lista.adiciona("D");
	lista.adiciona("E");
	System.out.println("Lista: "+lista);
	lista.limpar();
	System.out.println(lista);

    }

}
