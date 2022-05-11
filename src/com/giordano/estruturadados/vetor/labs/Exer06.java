package com.giordano.estruturadados.vetor.labs;

import java.util.Scanner;

import com.giordano.estruturadados.vetor.Lista;
import com.giordano.estruturadados.vetor.teste.Contato;

public class Exer06 {

    public static void main(String[] args) {

	// criacao das variaveis
	Scanner scan = new Scanner(System.in);

	// criar vetor com 20 de capacidade
	Lista<Contato> lista = new Lista<Contato>(20);

	// criar e adicionar 30 contatos
	criarContatosDinamicamente(5, lista);

	// criar um menu para que o usuario escolha a up��o
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

    protected static void imprimirVetor(Lista<Contato> lista) {

	System.out.println(lista);
    }

    protected static void limpaVetor(Lista<Contato> lista) {
	lista.limpar();
	System.out.println("Todos os contatos do vetor foram excluidos ");
    }

    protected static void imprimeTamanhoVetor(Lista<Contato> lista) {

	System.out.println("Tamanho do vetor � de: " + lista.tamanho());
    }

    protected static void excluiContato(Scanner scan, Lista<Contato> lista) {
	int pos = leInformacaoInt("Entre com a posi��o a ser pesquisada", scan);
	try {
	    Contato contato = lista.busca(pos);
	    lista.remove(contato);
	    System.out.println("contato excluido");
	} catch (Exception e) {
	    System.out.println("Posi��o inv�lida");
	}
    }

    protected static void excluiPorPosicao(Scanner scan, Lista<Contato> lista) {
	int pos = leInformacaoInt("Entre com a posi��o a ser pesquisada", scan);
	try {
	    lista.remove(pos);
	    System.out.println("contato excluido");
	} catch (Exception e) {
	    System.out.println("Posi��o inv�lida");
	}
    }

    protected static void pesquisaContatoExiste(Scanner scan, Lista<Contato> lista) {
	int pos = leInformacaoInt("Entre com a posi��o a ser pesquisada", scan);
	try {

	    Contato contato = lista.busca(pos);
	    boolean existe = lista.contem(contato);
	    if (existe) {
		System.out.println("Contato existe, seguem os dados:");
		System.out.println(contato);
	    } else {
		System.out.println("contato n�o existe");
	    }
	} catch (Exception e) {
	    System.out.println("Posi��o inv�lida");
	}
    }

    protected static void pesquisaUltimoIndece(Scanner scan, Lista<Contato> lista) {
	int pos = leInformacaoInt("Entre com a posi��o a ser pesquisada", scan);
	try {

	    Contato contato = lista.busca(pos);
	    System.out.println("Contato existe, seguem os dados:");
	    System.out.println(contato);
	    System.out.println("Fazendo pesquisa do ultimo indice do contato encontrado");
	    pos = lista.ultimoIndice(contato);
	    System.out.println("Contato encontrado na posi��o " + pos);
	} catch (Exception e) {
	    System.out.println("Posi��o inv�lida");
	}
    }

    protected static void obtemContato(Scanner scan, Lista<Contato> lista) {
	int pos = leInformacaoInt("Entre com a posi��o a ser pesquisada", scan);
	try {

	    Contato contato = lista.busca(pos);
	    System.out.println("Contato existe, seguem os dados:");
	    System.out.println(contato);
	    System.out.println("Fazendo pesquisa do contato encontrado");
	    pos = lista.busca(contato);
	    System.out.println("Contato encontrado na posi��o " + pos);
	} catch (Exception e) {
	    System.out.println("Posi��o inv�lida");
	}
    }

    protected static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista) {
	int pos = leInformacaoInt("Entre com a posi��o a ser pesquisada", scan);

	try {

	    Contato contato = lista.busca(pos);
	    System.out.println("Contato existe, seguem os dados:");
	    System.out.println(contato);
	} catch (Exception e) {
	    System.out.println("Posi��o inv�lida");
	}
    }

    protected static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista) {
	System.out.println("Criando um contato, entre com as informa��es: ");
	String nome = leInformacao("Entre com o nome", scan);
	String telefone = leInformacao("Entre com o telefone", scan);
	String email = leInformacao("Entre com o email", scan);

	Contato contato = new Contato(nome, telefone, email);
	lista.adiciona(contato);
    }

    protected static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista) {
	System.out.println("Criando um contato, entre com as informa��es: ");
	String nome = leInformacao("Entre com o nome", scan);
	String telefone = leInformacao("Entre com o telefone", scan);
	String email = leInformacao("Entre com o email", scan);

	Contato contato = new Contato(nome, telefone, email);
	int pos = leInformacaoInt("Entre com a posi��o a adicionar o contato", scan);
	try {
	    lista.adiciona(pos, contato);
	} catch (Exception e) {
	    System.out.println("N�o adicionado");
	}
    }

    protected static String leInformacao(String msg, Scanner scan) {
	System.out.println(msg);
	String entrada = scan.nextLine();
	return entrada;
    }

    protected static int leInformacaoInt(String msg, Scanner scan) {
	boolean entradaValida = false;
	int num = 0;
	while (!entradaValida) {
	    try {
		System.out.println(msg);
		String entrada = scan.nextLine();
		num = Integer.parseInt(entrada);
		entradaValida = true;
	    } catch (Exception e) {
		System.out.println("Entrada inv�lida! \n\n");
	    }
	}
	return num;
    }

    protected static int obterOpcaoMenu(Scanner scan) {

	boolean entradaValida = false;
	int opcao = 0;
	String entrada = "";

	while (!entradaValida) {

	    System.out.println("Digite a op��o desejada: ");
	    System.out.println("1: Adiciona contato no final do vetor");
	    System.out.println("2: Adiciona contato em uma posicao espec�fica");
	    System.out.println("3: Obtem contato de uma posi��o espec�fica");
	    System.out.println("4: Consulta contato");
	    System.out.println("5: Consulta �ltimo indice do contato");
	    System.out.println("6: Verifica se contato existe");
	    System.out.println("7: remove por posi��o");
	    System.out.println("8: Excluir contato");
	    System.out.println("9: Verifica tamano do vetor");
	    System.out.println("10: Excluir todos os contatos do vetor");
	    System.out.println("11: Imprime vetor");
	    System.out.println("0: Sair");

	    try {
		entrada = scan.nextLine();
		opcao = Integer.parseInt(entrada);
		if (opcao >= 0 && opcao <= 11) {
		    entradaValida = true;
		} else {
		    throw new Exception();
		}
	    } catch (Exception e) {
		System.out.println("Entrada inv�lida! \n\n");
	    }
	}
	return opcao;
    }

    protected static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {

	Contato contato = new Contato();

	for (int i = 0; i <= quantidade; i++) {
	    contato = new Contato();
	    contato.setNome("Contato " + i);
	    contato.setTelefone("111111111" + i);
	    contato.setEmail("giordano@email.com");
	    lista.adiciona(contato);
	}
    }

}
