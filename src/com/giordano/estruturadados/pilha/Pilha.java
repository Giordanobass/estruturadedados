package com.giordano.estruturadados.pilha;

import com.giordano.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
	super();
    }

    public Pilha(int capacidade) {
	super(capacidade);
    }

    public void empilha(T elemento) {
	this.adiciona(elemento);
    }

    public T topo() {
	if (this.estaVazia()) {
	    return null;
	}
	return this.elementos[tamanho - 1];
    }
}
