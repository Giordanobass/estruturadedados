package com.giordano.estruturadados.pilha.teste;

import com.giordano.estruturadados.pilha.Pilha;

public class Aula15 {

    public static void main(String[] args) {

	Pilha<Integer> pilha = new Pilha<>();

	System.out.println(pilha.estaVazia());

	pilha.empilha(1);

	System.out.println(pilha.estaVazia());
    }

}
