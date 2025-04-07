/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.diegowmmuller.circulo;

import Model.Circulo;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Diiego
 */
public class Main {

    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       
        System.out.print("Informe o raio do circulo: ");
        Double raio = sc.nextDouble();
        
        Circulo circulo = new Circulo(raio);
        
        double area = circulo.getArea();
        
        System.out.println("A area do circulo é: " + String.format("%.2f", area));
    }
}
