package com.giordano.estruturadados.fila.labs;

import java.util.PriorityQueue;
import java.util.Queue;

public class Exercicio01 {

    public static void main(String[] args) {
	
	Queue<Documento> fila = new PriorityQueue<>();
	
	fila.add(new Documento("Folha 1", 3));
	fila.add(new Documento("Folha 2", 5));
	fila.add(new Documento("Folha 3", 1));
	
	System.out.println(fila);
    }

}
