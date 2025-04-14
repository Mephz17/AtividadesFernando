/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex499;

/**
 *
 * @author iagom
 */

public class Vetor {
    public int[] selectionSort(int numeros[], int k){
        for(int i = 0; i < k -1; i++){
            int menor = Menornumero(numeros, i, k); // chamando a função Menornumero
            int atual = numeros[i]; // pegando valor atual
            int menorarray = numeros[menor]; // pegando o menor valor do array, selecionado a partir da função acima
            
            numeros[i] = menorarray; // realizando a troca, colocando o valor do menor numero na sua devida posição
            numeros[menor] = atual; // colocando o valor atual na posição do valor menor.
        }
        return numeros;
    }
    private static int Menornumero(int[] numeros, int atual, int k){
        int menor = atual; // admite o menor valor como sendo o atual
        for(int i = atual + 1; i < k; i++){ // itera sobre todo o vetor
            if(numeros[menor] > numeros[i]){ // se o numero dado como menor for MAIOR do que qualquer valor do array, o menor vale o novo numero
                menor = i;
            }
        }
        return menor;
    }
}
