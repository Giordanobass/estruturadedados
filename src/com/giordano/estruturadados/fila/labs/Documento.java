package com.giordano.estruturadados.fila.labs;

import java.util.Objects;

public class Documento {

    private String nome;
    private Integer quantidade;

    public Documento(String nome, Integer quantidade) {
	super();
	this.nome = nome;
	this.quantidade = quantidade;
    }

    public Documento() {
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public Integer getQuantidade() {
	return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
	this.quantidade = quantidade;
    }

    @Override
    public int hashCode() {
	return Objects.hash(nome, quantidade);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Documento other = (Documento) obj;
	return Objects.equals(nome, other.nome) && Objects.equals(quantidade, other.quantidade);
    }

    @Override
    public String toString() {
	return "Documento [nome=" + nome + ", quantidade=" + quantidade + "]";
    }

}
