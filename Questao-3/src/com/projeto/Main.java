package com.projeto;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int menor = 0;
        int maior = 0;
        int lista[];
        int numDigitados;
        int media = 0;

        Scanner ler = new Scanner(System.in);

        System.out.println("\n Informe quantos números pretende digitar: ");

        numDigitados = ler.nextInt();

        lista = new int [numDigitados];

        for(int i = 0; i < numDigitados; i++){
            System.out.println("\nInforme o " + (i + 1) +"º valor e aperte enter para continuar: ");
            lista[i] = ler.nextInt();

            maior = lista[i];
            menor = lista[i];

        }
        for(int i = 0; i < numDigitados; i++){
            if(lista[i] > maior){
                maior = lista[i];
            } else if(lista[i] < menor){
                menor = lista[i];
            }

        }
        System.out.println("Maior: " +maior);
        System.out.println("Menor: " +menor);
        System.out.println("Media: " + (maior + menor)/2);
    }
}
