/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex480;

/**
 *
 * @author iagom
 */
import java.util.Scanner;
public class Ex480 {

    public static void main(String[] args) {
        Number obj = new Number();
        System.out.println("Digite o numero: ");
        Scanner input = new Scanner(System.in);
        String numero = input.nextLine();
        System.out.println(obj.verificaCapicua(numero));
    }
}
