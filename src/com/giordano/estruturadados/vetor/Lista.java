package com.giordano.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {
    
    private T[] elementos;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public Lista(int capacidade) {
	this.elementos = (T[]) new Object[capacidade];
	this.tamanho = 0;
    }

    @SuppressWarnings("unchecked")
    public Lista(int capacidade, Class<T> tipoClasse) {
	this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
	this.tamanho = 0;
    }

    public void adiciona1(T elemento) {
	for (int i = 0; i < this.elementos.length; i++) {
	    if (this.elementos[i] == null) {
		this.elementos[i] = elemento;
		break;
	    }
	}
    }

    public void adiciona2(T elemento) throws Exception {
	if (this.tamanho < this.elementos.length) {
	    this.elementos[this.tamanho] = elemento;
	    this.tamanho++;
	} else {
	    throw new Exception("Não é possível adicionar mais elementos");
	}
    }

    public boolean adiciona(T elemento) {
	if (this.tamanho < this.elementos.length) {
	    this.elementos[this.tamanho] = elemento;
	    this.tamanho++;
	    return true;
	}
	return false;
    }

    public boolean adiciona(int posicao, T elemento) {

	if (!(posicao >= 0 && posicao < tamanho)) {
	    throw new IllegalArgumentException("Posicao inválida");
	}

	for (int i = this.tamanho - 1; i >= posicao; i--) {
	    this.elementos[i + 1] = this.elementos[i];
	}
	this.elementos[posicao] = elemento;
	this.tamanho++;

	return false;
    }

    @SuppressWarnings({ "unused", "unchecked" })
    private void aumentaCapacidade() {
	if (this.tamanho == this.elementos.length) {
	    T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
	    for (int i = 0; i < this.elementos.length; i++) {
		elementosNovos[i] = this.elementos[i];
	    }
	    this.elementos = elementosNovos;
	}
    }
    
    public T obtem(int posicao) {
	return this.busca(posicao);
    }

    public T busca(int posicao) {
	if (!(posicao >= 0 && posicao < tamanho)) {
	    throw new IllegalArgumentException("Posicao inválida");
	}
	return this.elementos[posicao];
    }

    public int busca(T elemento) {
	for (int i = 0; i < this.tamanho; i++) {
	    if (this.elementos[i].equals(elemento)) {
		return i;
	    }
	}
	return -1;
    }
    
    public int ultimoIndice(T elemento) {
	int ultimaPos = -1;
	for (int i = this.tamanho-1; i >=0; i--) {
	    if (this.elementos[i].equals(elemento)) {
		return i;
	    }
	}
	return -1;
    }
    
    
    public boolean contem(T elemento) {
	return busca(elemento) > -1;
    }

    // B G D E F -> posição a ser removida é 1(G)
    // 0 1 2 3 4 -> tamanho é 5
    public void remove(int posicao) {
	if (!(posicao >= 0 && posicao < tamanho)) {
	    throw new IllegalArgumentException("Posição inválida!");
	}
	for (int i = posicao; i < this.tamanho - 1; i++) {
	    this.elementos[i] = this.elementos[i + 1];
	}
	this.tamanho--;
    }

    public void remove(T elemento) {
	int pos = this.busca(elemento);
	if(pos >-1) {
	    this.remove(pos);
	}
    }
    
    @SuppressWarnings("unchecked")
    public void limpar() {
//	this.elementos = (T[]) new Object[this.elementos.length];
//	this.tamanho = 0;
	for (int i = 0; i < elementos.length; i++) {
	    this.elementos[i] = null;
	}
	this.tamanho = 0;
    }

    public int tamanho() {
	return this.tamanho;
    }

    @Override
    public String toString() {

	StringBuilder s = new StringBuilder();
	s.append("[");
	for (int i = 0; i < this.tamanho - 1; i++) {
	    s.append(this.elementos[i]);
	    s.append(", ");
	}
	if (this.tamanho > 0) {
	    s.append(this.elementos[this.tamanho - 1]);
	}
	s.append("]");

	return s.toString();
    }

}
