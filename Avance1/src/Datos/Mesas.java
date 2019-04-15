/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Validaciones.Validador;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author gilio
 */
public class Mesas {

    Validador val = new Validador();

    ArrayList<String> mesa = new ArrayList<String>();
    ArrayList<String> comida = new ArrayList<String>();
    ArrayList<String> bebestibles = new ArrayList<String>();

    public void cartaComida() {
        comida.add("1.- Hambueguesas.");
        comida.add("2.- Pollo y papas fritas.");
        comida.add("3.- Carne a la olla.");
        comida.add("4.- Pizza napolitana.");
        comida.add("5.- Pizza vegetariana.");

        bebestibles.add("1.- Bebida");
        bebestibles.add("2.- Nectar");
        bebestibles.add("3.- Jugos naturales");
        bebestibles.add("4.- Agua mineral");

    }

    public void mostrarCartaComida() {
        comida.size();
        for (int i = 0; i < comida.size(); i++) {
            System.out.println(comida.get(i));

        }

    }

    public void mostrarCartaBebestibles() {
        bebestibles.size();
        for (int i = 0; i < bebestibles.size(); i++) {
            System.out.println(bebestibles.get(i));
        }
        // System.out.println(bebestibles);
    }

    public void menuMesas() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Qué carta desea ver?");
        System.out.println();
        System.out.println("1.- Comida.");
        System.out.println("2.- Bebestibles.");
        System.out.println("3.- Regresar menu anterior.");

        int opcn = val.validarNumero();
        seleccion(opcn);
    }

    public void seleccion(int opcn) {
        Menu menu = new Menu();

        switch (opcn) {
            case 1:
                mostrarCartaComida();
                menu.menu();
                break;

            case 2:
                mostrarCartaBebestibles();
                menu.menu();
                break;

            case 3:
                menu.menu();
                break;

            default:
                menu.menu();
                break;
        }

    }

}
