package com.coretworks.presentacion;

import java.util.Scanner;

public class Ingreso2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double ingreso;

        boolean tieneVivienda;
        System.out.println("Su ingreso");
        ingreso = sc.nextDouble();
        System.out.println("Tiene vivienda? true - false");
        tieneVivienda = sc.nextBoolean();
        if(ingreso < 20_000 && tieneVivienda){
            System.out.println("Su impuesto es del 18% " + ingreso*1.18 + " €");
        }else{
            System.out.println("Su impuesto es del 15% " + ingreso*1.15 + " €");
        }




    }
}
