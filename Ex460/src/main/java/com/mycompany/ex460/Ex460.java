/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex460;

/**
 *
 * @author iagom
 */
import java.util.Scanner;
public class Ex460 {

    public static void main(String[] args) {
        Number obj = new Number();
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Digite o valor 1: ");
        num1 = input.nextInt();
        System.out.println("Dobro: "+obj.dobro(num1));
        
        System.out.println("Digite o valor 2: ");
        num2 = input.nextInt();
        System.out.println("Dobro: "+obj.dobro(num2));
        
        System.out.println("Digite o valor 3: ");
        num3 = input.nextInt();
        System.out.println("Dobro: "+obj.dobro(num3));
    }
}
