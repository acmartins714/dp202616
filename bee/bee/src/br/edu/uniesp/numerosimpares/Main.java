package br.edu.uniesp.numerosimpares;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        if (numero >= 1 && numero <= 1000) {
            for (int x = 1; x < numero+1; x=x+2) {
                System.out.println(x);
            }
        }
    }
}