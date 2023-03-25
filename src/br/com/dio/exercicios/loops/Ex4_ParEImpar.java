package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int numImpar = 0, numPares = 0;
        int count = 0;

        System.out.println("Quantidades de números: ");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) numPares++;
            else numImpar++;

            count++;
        }while (count < quantNumeros);

        System.out.println("Quantidades de par: " + numPares);
        System.out.println("Quantidades de impar: " + numImpar);
    }
}
