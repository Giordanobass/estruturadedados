package com.giordano.estruturadados.pilha.teste;

import java.util.Stack;

import com.giordano.estruturadados.pilha.Pilha;

public class Aula18 {

    public static void main(String[] args) {

	Pilha<Integer> pilha = new Pilha<>();
	
	Stack<Integer> stack = new Stack<>();
	
	System.out.println(stack.isEmpty());
	
	stack.push(1); // EMPILHA
	stack.push(2);
	stack.push(3);
	
	System.out.println(stack.isEmpty());
	System.out.println(stack.size());
	System.out.println(stack);
	System.out.println(stack.peek());
	System.out.println(stack.pop());// DESEMPILHA
	System.out.println(stack);
    }

}
