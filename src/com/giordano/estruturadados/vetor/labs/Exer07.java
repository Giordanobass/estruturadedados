package com.giordano.estruturadados.vetor.labs;

import java.util.ArrayList;
import java.util.Scanner;

import com.giordano.estruturadados.vetor.teste.Contato;

public class Exer07 extends Exer06 {

    public static void main(String[] args) {

	// criacao das variaveis
	Scanner scan = new Scanner(System.in);

	// criar vetor com 20 de capacidade
	ArrayList<Contato> lista = new ArrayList<Contato>(20);

	// criar e adicionar 30 contatos
	criarContatosDinamicamente(5, lista);

	// criar um menu para que o usuario escolha a upção
	int opcao = 1;
	while (opcao != 0) {
	    opcao = obterOpcaoMenu(scan);

	    switch (opcao) {
	    case 1:
		adicionarContatoFinal(scan, lista);
		break;
	    case 2:
		adicionarContatoPosicao(scan, lista);
		break;
	    case 3:
		obtemContatoPosicao(scan, lista);
		break;
	    case 4:
		obtemContato(scan, lista);
		break;
	    case 5:
		pesquisaUltimoIndece(scan, lista);
		break;
	    case 6:
		pesquisaContatoExiste(scan, lista);
		break;
	    case 7:
		excluiPorPosicao(scan, lista);
		break;
	    case 8:
		excluiContato(scan, lista);
		break;
	    case 9:
		imprimeTamanhoVetor(lista);
		break;
	    case 10:
		limpaVetor(lista);
		break;
	    case 11:
		imprimirVetor(lista);
		break;

	    default:
		break;
	    }
	}
	System.out.println("O usuario digitou 0, programa terminado!");
    }

    protected static void imprimirVetor(ArrayList<Contato> lista) {

	System.out.println(lista);
    }

    protected static void limpaVetor(ArrayList<Contato> lista) {
	lista.clear();
	System.out.println("Todos os contatos do vetor foram excluidos ");
    }

    protected static void imprimeTamanhoVetor(ArrayList<Contato> lista) {

	System.out.println("Tamanho do vetor é de: " + lista.size());
    }

    protected static void excluiContato(Scanner scan, ArrayList<Contato> lista) {
	int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);
	try {
	    Contato contato = lista.get(pos);
	    lista.remove(contato);
	    System.out.println("contato excluido");
	} catch (Exception e) {
	    System.out.println("Posição inválida");
	}
    }

    protected static void excluiPorPosicao(Scanner scan, ArrayList<Contato> lista) {
	int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);
	try {
	    lista.remove(pos);
	    System.out.println("contato excluido");
	} catch (Exception e) {
	    System.out.println("Posição inválida");
	}
    }

    protected static void pesquisaContatoExiste(Scanner scan, ArrayList<Contato> lista) {
	int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);
	try {

	    Contato contato = lista.get(pos);
	    boolean existe = lista.contains(contato);
	    if (existe) {
		System.out.println("Contato existe, seguem os dados:");
		System.out.println(contato);
	    } else {
		System.out.println("contato não existe");
	    }
	} catch (Exception e) {
	    System.out.println("Posição inválida");
	}
    }

    protected static void pesquisaUltimoIndece(Scanner scan, ArrayList<Contato> lista) {
	int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);
	try {

	    Contato contato = lista.get(pos);
	    System.out.println("Contato existe, seguem os dados:");
	    System.out.println(contato);
	    System.out.println("Fazendo pesquisa do ultimo indice do contato encontrado");
	    pos = lista.indexOf(contato);
	    System.out.println("Contato encontrado na posição " + pos);
	} catch (Exception e) {
	    System.out.println("Posição inválida");
	}
    }

    protected static void obtemContato(Scanner scan, ArrayList<Contato> lista) {
	int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);
	try {

	    Contato contato = lista.get(pos);
	    System.out.println("Contato existe, seguem os dados:");
	    System.out.println(contato);
	    System.out.println("Fazendo pesquisa do contato encontrado");
	    pos = lista.indexOf(contato);
	    System.out.println("Contato encontrado na posição " + pos);
	} catch (Exception e) {
	    System.out.println("Posição inválida");
	}
    }

    protected static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> lista) {
	int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

	try {

	    Contato contato = lista.get(pos);
	    System.out.println("Contato existe, seguem os dados:");
	    System.out.println(contato);
	} catch (Exception e) {
	    System.out.println("Posição inválida");
	}
    }

    protected static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> lista) {
	System.out.println("Criando um contato, entre com as informações: ");
	String nome = leInformacao("Entre com o nome", scan);
	String telefone = leInformacao("Entre com o telefone", scan);
	String email = leInformacao("Entre com o email", scan);

	Contato contato = new Contato(nome, telefone, email);
	lista.add(contato);
    }

    protected static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> lista) {
	System.out.println("Criando um contato, entre com as informações: ");
	String nome = leInformacao("Entre com o nome", scan);
	String telefone = leInformacao("Entre com o telefone", scan);
	String email = leInformacao("Entre com o email", scan);

	Contato contato = new Contato(nome, telefone, email);
	int pos = leInformacaoInt("Entre com a posição a adicionar o contato", scan);
	try {
	    lista.add(pos, contato);
	} catch (Exception e) {
	    System.out.println("Não adicionado");
	}
    }

    protected static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista) {

	Contato contato = new Contato();

	for (int i = 0; i <= quantidade; i++) {
	    contato = new Contato();
	    contato.setNome("Contato " + i);
	    contato.setTelefone("111111111" + i);
	    contato.setEmail("giordano@email.com");
	    lista.add(contato);
	}
    }

}
