package com.coretworks.presentacion;

import java.util.Scanner;

public class edad {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int edad;
        System.out.println("Escriba la edad");
        edad=sc.nextInt();
        if(edad>=18){
            System.out.println("puede conducir");
        }else{
            System.out.println("prohibido conducir");
        }


    }
}
