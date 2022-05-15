package com.giordano.estruturadados.fila.labs;

import java.util.Random;

import com.giordano.estruturadados.fila.Fila;

public class Exercicio04 {

    public static void main(String[] args) {

	Fila<Integer> fila = new Fila<Integer>();

	for (int i = 0; i < 10; i++) {
	    fila.enfileira(i);
	}

	Random aleatorio = new Random();
	int num = 0;
	while (num == 0) {
	    num = aleatorio.nextInt(10);
	}
	System.out.println("N�mero = " + num);
	
	while(fila.tamanho()>1) {
	    for (int i = 0; i < num; i++) {
		fila.enfileira(fila.desenfileira());
	    }
	    System.out.println("Eliminado = " + fila.desenfileira());
	}
	System.out.println("Ganhador: "+ fila.desenfileira());
    }

}
