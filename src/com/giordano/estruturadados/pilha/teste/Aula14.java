package com.giordano.estruturadados.pilha.teste;

import com.giordano.estruturadados.pilha.Pilha;

public class Aula14 {

    public static void main(String[] args) {
	
	Pilha<Integer> pilha = new Pilha<>();
	
	for (int i = 1; i < 10; i++) {
	    pilha.empilha(1);
	}
	System.out.println(pilha);
	System.out.println(pilha.tamanho());
    }

}