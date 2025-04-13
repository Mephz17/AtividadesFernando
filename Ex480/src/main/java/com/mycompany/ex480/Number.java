/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex480;

/**
 *
 * @author iagom
 */
public class Number {
    public boolean verificaCapicua(String numero){
        char primeiro = numero.charAt(numero.length() - 1);
        char segundo = numero.charAt(numero.length() - 2);
        String resultado = "" + primeiro + segundo;
        for(int i = numero.length() - 3; i >= 0; i--){
            char c = numero.charAt(i);
            resultado = resultado + c;
        }
        if(numero.equals(resultado)){
            return true;
        }
        return false;
    }
}
