/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex470;

/**
 *
 * @author iagom
 */
public class Number {
    public boolean verificaPrimo(int number){
        if(number == 1 || number == 2){
            return true;
        }
        for(int i = 2; i < number; i++){
            if(number != i && number % i == 0){
                return false;
            }
        }
        return true;
    }
}
