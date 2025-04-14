/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex495;

/**
 *
 * @author iagom
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Ex495 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Ordenar obj = new Ordenar();
        ArrayList<String> palavras = new ArrayList<>();
        System.out.println("Digite as palavras para ordenar: ");
        int decisao = 0;
        while(decisao != -1){
            palavras.add(input.nextLine());
            System.out.println("Digite 1 para continuar ou -1 para parar: ");
            decisao = input.nextInt();
            input.nextLine();
        }
        obj.ordenando(palavras);
        
    }
}
