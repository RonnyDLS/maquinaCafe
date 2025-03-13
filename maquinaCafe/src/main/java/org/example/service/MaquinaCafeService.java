package org.example.service;

import org.example.models.MaquinaCafe;
import org.example.models.Vaso;

import java.util.Scanner;

public class MaquinaCafeService {

    public void run() {
        MaquinaCafe maquinaDeCafe = new MaquinaCafe();
        Scanner read = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println("BIENVENIDO A LA MAQUINA DE CAFE");
        System.out.println("===============================");

        System.out.println("");
        System.out.println("Elija el tamaño del vaso");
        System.out.println("1:[Pequeño, 2:[Mediano], 3:[Grande]");
        System.out.print("-> ");

        int numeroVaso = read.nextInt();
        Vaso tipoVaso = maquinaDeCafe.getTipoVaso(numeroVaso);

        System.out.println("");
        System.out.println("Elija la cantidad de vaso");
        System.out.print("-> ");

        int cVaso = read.nextInt();

        System.out.println("");
        System.out.println("Elija la cantidad de cucharas de azucar");
        System.out.print("-> ");

        int cAzucar = read.nextInt();

        Vaso vaso = maquinaDeCafe.getVasoCafe(tipoVaso,cVaso,cAzucar);

        try {
            System.out.println("===============================");
            System.out.println("Preparando el cafe ...");
            System.out.println("===============================");
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println("Error al crear el cafe: "+e);
        }

        System.out.println("");
        System.out.println("===============================");
        System.out.println("Cafe preparado");
        System.out.println("===============================");
        System.out.println("");
        System.out.println("");

        System.out.println("Su orden:");
        System.out.println("");

        System.out.println("+--------------------------------------------------------+");
        System.out.println("| Tipo de vaso: "+vaso.getTipo());
        System.out.println("| Cantidad de vasos: "+vaso.getCantidadVasos());
        System.out.println("| Contenido: "+vaso.getContent());
        System.out.println("+--------------------------------------------------------+");
    }
}
