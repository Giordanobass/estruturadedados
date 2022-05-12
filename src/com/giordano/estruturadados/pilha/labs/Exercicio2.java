package com.giordano.estruturadados.pilha.labs;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

    public static void main(String[] args) {

	try (Scanner scan = new Scanner(System.in)) {
	    Stack<Integer> stackPar = new Stack<Integer>();
	    Stack<Integer> stackImpar = new Stack<Integer>();

	    for (int i = 0; i < 10; i++) {
		System.out.println("Informe um número");
		Integer numero = scan.nextInt();

		if (numero == 0) {

		    Integer desempilhado = null;

		    if (!stackPar.isEmpty()) {
			desempilhado = stackPar.pop();
			System.out.println("Desempilhando da pilha par: " + desempilhado);
		    }

		    if (desempilhado == null) {
			System.out.println("Pilha Par vazia!");
		    }

		    if (!stackImpar.isEmpty()) {
			desempilhado = stackImpar.pop();
			System.out.println("Desempilhando da pilha Impar: " + desempilhado);
		    }

		    if (desempilhado == null) {
			System.out.println("Pilha Impar vazia!");
		    }
		}

		if (numero % 2 == 0) {
		    stackPar.push(numero);
		} else {
		    stackImpar.push(numero);
		}

	    }

	    System.out.println("Pilha Par: " + stackPar);
	    System.out.println("Pilha Impar: " + stackImpar);
	    System.out.println("---------");

	    while (!stackPar.isEmpty()) {
		System.out.println("Desempilhando um elemento da pilha Par: " + stackPar.pop());
	    }

	    System.out.println("---------");

	    while (!stackImpar.isEmpty()) {
		System.out.println("Desempilhando um elemento da pilha Impar: " + stackImpar.pop());
	    }

	    System.out.println("---------");
	    System.out.println("Todos os elementos foram desempilhados");

	} catch (Exception e) {
	    System.out.println("Error: " + e.getMessage());
	    System.out.println(e.getCause());
	    e.printStackTrace();
	}
    }
}
