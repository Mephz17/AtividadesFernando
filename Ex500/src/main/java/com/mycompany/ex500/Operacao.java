/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex500;

/**
 *
 * @author iagom
 */
public class Operacao {
    public int[] soma(int vetor[], int vetor2[]){
        int soma[] = new int[5];
        for(int i = 0; i < 5; i++){
            soma[i] = vetor[i] + vetor2[i];
        }
        return soma;
    }
    public int[] diferenca(int vetorA[], int vetorB[]){
        int diferenca[] = new int[5];
        for(int i = 0; i < 5; i++){
            diferenca[i] = vetorA[i] - vetorB[i];
        }
        return diferenca;
    }
}
