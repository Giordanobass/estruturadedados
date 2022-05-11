package com.giordano.estruturadados.vetor;

public class VetorObjetos {
   
    private Object[] elementos;
    private int tamanho;

    public VetorObjetos(int capacidade) {
	this.elementos = new Object[capacidade];
	this.tamanho = 0;
    }

    public void adiciona1(Object elemento) {
	for (int i = 0; i < this.elementos.length; i++) {
	    if (this.elementos[i] == null) {
		this.elementos[i] = elemento;
		break;
	    }
	}
    }

    public void adiciona2(Object elemento) throws Exception {
	if (this.tamanho < this.elementos.length) {
	    this.elementos[this.tamanho] = elemento;
	    this.tamanho++;
	} else {
	    throw new Exception("N�o � poss�vel adicionar mais elementos");
	}
    }

    public boolean adiciona(Object elemento) {
	if (this.tamanho < this.elementos.length) {
	    this.elementos[this.tamanho] = elemento;
	    this.tamanho++;
	    return true;
	}
	return false;
    }

    public boolean adiciona(int posicao, Object elemento) {

	if (!(posicao >= 0 && posicao < tamanho)) {
	    throw new IllegalArgumentException("Posicao inv�lida");
	}

	for (int i = this.tamanho - 1; i >= posicao; i--) {
	    this.elementos[i + 1] = this.elementos[i];
	}
	this.elementos[posicao] = elemento;
	this.tamanho++;

	return false;
    }

    private void aumentaCapacidade() {
	if (this.tamanho == this.elementos.length) {
	    Object[] elementosNovos = new Object[this.elementos.length * 2];
	    for (int i = 0; i < this.elementos.length; i++) {
		elementosNovos[i] = this.elementos[i];
	    }
	    this.elementos = elementosNovos;
	}
    }

    public Object busca(int posicao) {
	if (!(posicao >= 0 && posicao < tamanho)) {
	    throw new IllegalArgumentException("Posicao inv�lida");
	}
	return this.elementos[posicao];
    }

    public int busca(Object elemento) {
	for (int i = 0; i < this.tamanho; i++) {
	    if (this.elementos[i].equals(elemento)) {
		return i;
	    }
	}
	return -1;
    }

    // B G D E F -> posi��o a ser removida � 1(G)
    // 0 1 2 3 4 -> tamanho � 5
    public void remove(int posicao) {
	if (!(posicao >= 0 && posicao < tamanho)) {
	    throw new IllegalArgumentException("Posi��o inv�lida!");
	}
	for (int i = posicao; i < this.tamanho - 1; i++) {
	    this.elementos[i] = this.elementos[i + 1];
	}
	this.tamanho--;
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
