package br.edu.uniesp.apps;

import br.edu.uniesp.contas.Conta;

public class App {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");

        Conta conta1 = new Conta();
        conta1.setNumero(1);
        conta1.setNome("Alexandre");
        conta1.setLimite(1000.00);
        conta1.depositar(500);




    }
}
