/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex495;

/**
 *
 * @author iagom
 */
import java.util.ArrayList;
public class Ordenar {
    public void ordenando(ArrayList<String> palavras){
        ArrayList<String> result = new ArrayList<>();
        char alfabeto[] = {'a', 'b', 'c', 'd', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for(int i = 0; i < alfabeto.length; i++){
           char c = alfabeto[i];
           for(int j = 0; j < palavras.size(); j++){
              if(Character.toLowerCase(palavras.get(j).charAt(0)) == c){
                  result.add(palavras.get(j));
              }
           }
        }
        
        for(int k = 0; k < result.size(); k++){
               System.out.println(result.get(k));
           }
    }
}
