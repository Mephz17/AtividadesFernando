/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex499;

/**
 *
 * @author iagom
 */
import java.util.Scanner;
public class Ex499 {
    static void menu(){
        System.out.println("MENU VETOR - FUNCAO");
        System.out.println("\n1.Dados do VETOR\n2.Ordena VETOR\n3.Imprime VETOR\n4.Sai do programa\nOPCAO: ");
    }
    static int[] entrarDados(int vetor[], Scanner input){
        for(int i = 0; i < 5; i++){
            System.out.println("Digite valor "+(i + 1)+": ");
            vetor[i] = input.nextInt();
        }
        return vetor;
    }
    static void imprimirValores(int vetor[]){
        System.out.println("Valores: \n");
        for(int i = 0; i < 5; i++){
            System.out.println(vetor[i]);
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        Vetor obj = new Vetor();
        int vetor[] = new int[5];
        Scanner input = new Scanner(System.in);
        int opcao;
        boolean dadosArmazenados = false;
        menu();
        opcao = input.nextInt();
        while(opcao != 4){
            if(opcao == 1){
                entrarDados(vetor, input);
                dadosArmazenados = true;
                menu();
                opcao = input.nextInt();
            }
            else if(opcao == 2){
                if(dadosArmazenados == false){
                    System.out.println("Digite opcao 1");
                    opcao = input.nextInt();
                    continue;
                }
                vetor = obj.selectionSort(vetor, vetor.length);
                menu();
                opcao = input.nextInt();
            }
            else if(opcao == 3){
                if(dadosArmazenados == false){
                    System.out.println("Digite opcao 1");
                    opcao = input.nextInt();
                    continue;
                }
                imprimirValores(vetor);
                menu();
                opcao = input.nextInt();
            }
            
        }
        System.out.println("Programa encerrado!");
    }
}
