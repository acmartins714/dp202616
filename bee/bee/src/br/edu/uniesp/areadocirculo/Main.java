package br.edu.uniesp.areadocirculo;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        final double n = 3.14159;

        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();

        double area = n * raio * raio;

        System.out.printf("A=%.4f\n", area);

    }
}
