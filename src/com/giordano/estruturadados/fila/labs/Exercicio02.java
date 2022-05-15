package com.giordano.estruturadados.fila.labs;

import com.giordano.estruturadados.fila.Fila;

public class Exercicio02 {

    public static void main(String[] args) {

	final int MAX_PRIORIDADE = 3;

	Fila<String> regular = new Fila<>();
	Fila<String> prioridade = new Fila<>();

	regular.enfileira("Pesso 1");
	regular.enfileira("Pesso 2");
	regular.enfileira("Pesso 3");
	
	prioridade.enfileira("Pesso 1P");
	prioridade.enfileira("Pesso 2P");
	prioridade.enfileira("Pesso 3P");
	prioridade.enfileira("Pesso 4P");
	prioridade.enfileira("Pesso 5P");
	
	regular.enfileira("Pesso 4");
	regular.enfileira("Pesso 5");
	regular.enfileira("Pesso 6");
	regular.enfileira("Pesso 7");
	regular.enfileira("Pesso 8");

	while (!regular.estaVazia() || !prioridade.estaVazia()) {
	    int cont = 0;
	    while (!prioridade.estaVazia() && cont < MAX_PRIORIDADE) {
		atendePessoa(prioridade);
		cont++;
	    }
	    
	    if (!regular.estaVazia()) {
		atendePessoa(regular);
	    }
	    
	    if (prioridade.estaVazia()) {
		while (!regular.estaVazia()) {
		    atendePessoa(regular);
		}
	    }
	}

    }

    public static void atendePessoa(Fila<String> fila) {
	String pessoaAtendida = fila.desenfileira();
	System.out.println(pessoaAtendida + "foi atendida.");
    }
}
