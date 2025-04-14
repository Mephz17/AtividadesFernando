/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex497;

/**
 *
 * @author iagom
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Ex497 {

    public static void main(String[] args) {
        Busca obj = new Busca();
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> vetor = new ArrayList<>();
        System.out.println("Digite os valores: ");
        int decisao;
        while(true){
            vetor.add(input.nextInt());
            System.out.println("Digite -1 para sair ou 1 para continuar: ");
            decisao = input.nextInt();
            input.nextLine();
            if(decisao == -1){
                break;
            }
        }
        // ordenando
        ArrayList<Integer> ordenado = obj.selectionSort(vetor, vetor.size());
        System.out.println("Digite o valor a ser buscado: ");
        int valor = input.nextInt();
        obj.buscando(ordenado, valor );
        
    }
}
