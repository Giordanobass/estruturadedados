package com.giordano.estruturadados.pilha.labs;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio01 {

    public static void main(String[] args) {

	try (Scanner scan = new Scanner(System.in)) {
	    Stack<Integer> stack = new Stack<Integer>();

	    for (int i = 0; i < 10; i++) {
		System.out.println("Informe um número");
		Integer numero = scan.nextInt();
		if (numero % 2 == 0) {
		    stack.push(numero);
		} else {
		    if (stack.isEmpty()) {
			System.out.println("Pilha vazia");
		    } else {
			Integer desempilhado = stack.pop();
			System.out.println("Numero ímpar, desempilhando um elemento da pilha: " + desempilhado);
		    }
		}
	    }
	    System.out.println("Pilha: " + stack);
	    while (!stack.isEmpty()) {
		System.out.println("Desempilhando um elemento da pilha: " + stack.pop());
	    }
	    System.out.println("Todos os elementos foram desempilhados");
	} catch (Exception e) {
	    System.out.println("Error: " + e.getMessage());
	    System.out.println(e.getCause());
	    e.printStackTrace();
	}
    }
}
