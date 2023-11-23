package com.coretworks.presentacion;

import java.util.Scanner;

public class Coche {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        int anio=1;
        if(anio <2  ){
            System.out.println("exento" );
        }else if (anio <= 5 ){
            System.out.println("anual");

        }else {
            System.out.println("semestral");
        }
    }
}
