/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex470;

/**
 *
 * @author iagom
 */
import java.util.Scanner;
public class Ex470 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Number obj = new Number();
        int num1;
        System.out.println("Digite um numero: ");
        num1 = input.nextInt();
        System.out.println("Primo: "+obj.verificaPrimo(num1));
        
    }
}
