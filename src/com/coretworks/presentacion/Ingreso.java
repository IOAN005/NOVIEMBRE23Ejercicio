package com.coretworks.presentacion;

import java.util.Scanner;

public class Ingreso {
    public static void main(String[] args) {
        //
        Scanner sc =new Scanner(System.in);
        double ingreso;
        int numHijos;
        System.out.println("Escriba el ingreso -> " );
        ingreso= sc.nextDouble();
        System.out.println("Escriba el numero de hijos");
        numHijos=sc.nextInt();
        if(ingreso< 19_000 && numHijos >=2){
            System.out.println("Hay ayuda ");
        }else{
            System.out.println("No coresponde ayuda");
        }

    }
}
