/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex500;

/**
 *
 * @author iagom
 */
import java.util.Scanner;
public class Ex500 {
    static void menu(){
        System.out.println("VETORES\n");
        System.out.println("1.Dados do vetor A\n2. Dados do vetor B\n3.Imprime vetores\n4.Soma vetores\n5.Subtrai vetores\n6.Sai do programa\nOPCAO: ");
        
    }
    static int[] lerDados(int[] vetor, Scanner input){
        for(int i = 0; i < 5; i++){
            System.out.println("Digite valor "+(i + 1)+": ");
            vetor[i] = input.nextInt();
        }
        return vetor;
    }
    static void imprimirVetor(int[] vetor){
        for(int i = 0; i < 5; i++){
            System.out.println(vetor[i]);
        }
    }
    public static void main(String[] args) {
      Operacao obj = new Operacao();
      int vetorA[] = new int[5];
      int vetorB[] = new int[5];
      menu();
      Scanner input = new Scanner(System.in);
      boolean opcao1, opcao2;
      opcao1 = opcao2 = false;
      int opcao = input.nextInt();
      while(opcao != 6){
          if(opcao == 1){
              vetorA = lerDados(vetorA, input);
              menu();
              opcao = input.nextInt();
              opcao1 = true;
          }
          else if(opcao == 2){
              vetorB = lerDados(vetorB, input);
              menu();
              opcao = input.nextInt();
              opcao2 = true;
          }
          else if(opcao == 3){
              if(!(opcao1 && opcao2)){
                  System.out.println("Escolha primeiro opcoes 1 e 2");
                  System.out.println("OPCAO: ");
                  opcao = input.nextInt();
                  continue;
              }
              System.out.println("VETOR A: ");
              imprimirVetor(vetorA);
              System.out.println("VETOR B: ");
              imprimirVetor(vetorB);
              menu();
              opcao = input.nextInt();
          }
          else if(opcao == 4){
              if(!(opcao1 && opcao2)){
                  System.out.println("Escolha primeiro opcoes 1 e 2");
                  System.out.println("OPCAO: ");
                  opcao = input.nextInt();
                  continue;
              }
              int resultadoSoma[] = obj.soma(vetorA, vetorB);
              System.out.println("Soma: \n");
              imprimirVetor(resultadoSoma);
              menu();
              opcao = input.nextInt();
          }
          else if(opcao == 5){
              if(!(opcao1 && opcao2)){
                  System.out.println("Escolha primeiro opcoes 1 e 2");
                  System.out.println("OPCAO: ");
                  opcao = input.nextInt();
                  continue;
              }
              int resultadoDiff[] = obj.diferenca(vetorA, vetorB);
              System.out.println("Diferenca: \n");
              imprimirVetor(resultadoDiff);
              menu();
              opcao = input.nextInt();
          }
      }
        System.out.println("Programa encerrado!");
    }
}
