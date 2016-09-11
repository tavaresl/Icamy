package br.com.icamy.beans;

import java.util.List;

public class Cliente {
  private int codigo;
  private Bairro bairro;
  private String nome;
  private int cpf;
  private String dataDeNascimento;
  private List<String> emails;
  private List<Integer> telefones;
  private List<Portfolio> portfolios;

  public Cliente(int codigo, Bairro bairro, String nome, int cpf, String dataDeNascimento, List<String> emails,
      List<Integer> telefones, List<Portfolio> portfolios) {
    super();
    this.codigo = codigo;
    this.bairro = bairro;
    this.nome = nome;
    this.cpf = cpf;
    this.dataDeNascimento = dataDeNascimento;
    this.emails = emails;
    this.telefones = telefones;
    this.portfolios = portfolios;
  }

  public Cliente() {
    super();
    // TODO Auto-generated constructor stub
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public Bairro getBairro() {
    return bairro;
  }

  public void setBairro(Bairro bairro) {
    this.bairro = bairro;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getCpf() {
    return cpf;
  }

  public void setCpf(int cpf) {
    this.cpf = cpf;
  }

  public String getDataDeNascimento() {
    return dataDeNascimento;
  }

  public void setDataDeNascimento(String dataDeNascimento) {
    this.dataDeNascimento = dataDeNascimento;
  }

  public List<String> getEmails() {
    return emails;
  }

  public void setEmails(List<String> emails) {
    this.emails = emails;
  }

  public List<Integer> getTelefones() {
    return telefones;
  }

  public void setTelefones(List<Integer> telefones) {
    this.telefones = telefones;
  }

  public List<Portfolio> getPortfolios() {
    return portfolios;
  }

  public void setPortfolios(List<Portfolio> portfolios) {
    this.portfolios = portfolios;
  }
}
