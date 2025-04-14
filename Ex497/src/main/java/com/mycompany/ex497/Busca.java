/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex497;

/**
 *
 * @author iagom
 */
import java.util.ArrayList;
public class Busca {
    public int aux;
    public ArrayList<Integer> selectionSort(ArrayList<Integer> numeros, int k){
        for(int i = 0; i < k -1; i++){
            int menor = Menornumero(numeros, i, k); // chamando a função Menornumero
            int atual = numeros.get(i); // pegando valor atual
            int menorarray = numeros.get(menor); // pegando o menor valor do array, selecionado a partir da função acima
            
            numeros.set(i, menorarray); // realizando a troca, colocando o valor do menor numero na sua devida posição
            numeros.set(menor, atual); // colocando o valor atual na posição do valor menor.
        }
        return numeros;
    }
    private static int Menornumero(ArrayList<Integer> numeros, int atual, int k){
        int menor = atual; // admite o menor valor como sendo o atual
        for(int i = atual + 1; i < k; i++){ // itera sobre todo o vetor
            if(numeros.get(menor) > numeros.get(i)){ // se o numero dado como menor for MAIOR do que qualquer valor do array, o menor vale o novo numero
                menor = i;
            }
        }
        return menor;
    }
        public void buscando(ArrayList<Integer> array, int item) {
        int baixo = 0;
        int alto = array.size() - 1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2; // Calcula o índice do meio
            if (array.get(meio) == item) {
                System.out.println("O valor esta no indice " + meio);
                return; 
            }
            if (array.get(meio) < item) {
                baixo = meio + 1;
            } else {
                alto = meio - 1;
            }
        }

        System.out.println("O valor nao foi encontrado.");
    }
  }

