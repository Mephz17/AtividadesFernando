/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex490;

/**
 *
 * @author iagom
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Ex490 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<String>();
        System.out.println("Digite as palavras: ");
        int decisao = 0;
        while(decisao != -1){
            palavras.add(input.nextLine());
            System.out.println("Deseja digitar mais algo? 1 para sim e -1 para nao: ");
            decisao = input.nextInt();
            input.nextLine();
        }
        Number obj = new Number();
        System.out.println("Digite o caracter a ser retirado: ");
        char caractere = input.next().charAt(0);
        obj.retirarCarac(palavras, caractere, palavras.size());
    }
}
