package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Local de declaração de variáveis
        Scanner scanner = new Scanner(System.in);
        int menu = 0;


        //Seção do layout do menu
        System.out.println("---------------------------------------");
        System.out.println("|        Programa de resolução        |");
        System.out.println("|             de cálculos             |");
        System.out.println("---------------------------------------");
        System.out.println();
        System.out.println("Bem vindo ao programa de resolução de cálculos");
        System.out.println("escolha a opção desejada");
        System.out.println("1 - Conversor de moeda");
        System.out.println("2 - Conversor de medidas");
        System.out.println("3 - Conversor de temperatura");
        //Lê a entrada do teclado do usuario
        System.out.print("Opção: ");
        menu = scanner.nextInt();

        //Execução do menu nível correto

        switch(menu) {
            case 1:
                System.out.println("Entrou no conversão de moeda");
                break;
            case 2 :
                System.out.println("Entrou no conversão de medida");
                break;
            case 3:
                System.out.println("Entrou no conversão de temperatura");
                break;
            default:
                System.out.println("Opção Inválida");
                break;

        }

        return;

        //Execução do menu no nível complicado
        //if (menu == 1) {
            //verifica se digitou o valor 1 para o menu
            //System.out.println("Entrou no conversor de moeda");

        //} else {
            //se nao digitou o valor 1,executa isso
        //}
        //if (menu == 2) {

            //System.out.println("Entrou no covesor de medidas");
        //} else {

            //se não digitou o valor 2,executa isso
            //if (menu == 3) {
                //verifica se digitou o valor 3 para o menu
                //System.out.println("Entrou no conversor de temperatura");
            //} else {
                //se não digitou o valor 3, executa isso
                //System.out.println("Opção inválida");
            //}
        //}
    }

}