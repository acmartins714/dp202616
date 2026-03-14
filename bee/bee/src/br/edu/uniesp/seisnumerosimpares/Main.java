package br.edu.uniesp.seisnumerosimpares;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        if ((numero % 2) == 0) numero++;

        for (int x = numero; x < numero + 11; x = x + 2) {
            System.out.println(x);
        }
    }
}
