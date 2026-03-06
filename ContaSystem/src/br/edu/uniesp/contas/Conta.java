package br.edu.uniesp.contas;

public class Conta {

    private Integer numero;
    private String nome;
    private double saldo;
    private double limite;

    public Conta() {
    }

    public Conta(Integer numero, String nome, Double saldo, Double limite) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void sacar (double valor) {

        double novoSaldo = this.saldo - valor;
        this.saldo = novoSaldo;

    }

    public void depositar (double valor) {

        double novoSaldo = this.saldo + valor;
        this.saldo = novoSaldo;

    }
}
