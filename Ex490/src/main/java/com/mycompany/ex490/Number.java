/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex490;

/**
 *
 * @author iagom
 */
import java.util.ArrayList;
public class Number {
    public void retirarCarac(ArrayList<String> palavras, char caractere, int tamanho){
        for(int i = 0; i < tamanho; i++){
            String newPalavra = palavras.get(i);
            System.out.println(newPalavra.replace(caractere, '*'));
        }
    }
}
