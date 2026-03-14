package br.edu.uniesp.media2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1 = entrada.nextDouble();
        double nota2 = entrada.nextDouble();
        double nota3 = entrada.nextDouble();
        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 5;
        double somaPesos = peso1 + peso2 + peso3;
        double mediaPonderada = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / 10;
        System.out.printf("MEDIA = %.1f\n", mediaPonderada);

    }
}
