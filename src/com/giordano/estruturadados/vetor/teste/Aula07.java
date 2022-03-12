package com.giordano.estruturadados.vetor.teste;

import com.giordano.estruturadados.vetor.Vetor;

public class Aula07 {

    public static void main(String[] args) {

	Vetor vetor = new Vetor(10);
	vetor.adiciona("B");
	vetor.adiciona("C");
	vetor.adiciona("D");
	vetor.adiciona("F");
	vetor.adiciona("G");

	System.out.println(vetor);
	
	vetor.adiciona(0,"A");
	
	System.out.println(vetor);
    }

}
