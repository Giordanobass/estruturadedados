package com.giordano.estruturadados.fila.teste;

import com.giordano.estruturadados.fila.Fila;

public class Aula21 {

    public static void main(String[] args) {
	
	Fila<Integer> fila = new Fila<>();
	
	fila.enfileira(1);
	fila.enfileira(2);
	fila.enfileira(3);
	
	System.out.println("Primeira posi��o da fila: " + fila.espiar());
    }

}