/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Bautista
 */
import java.util.Scanner;
import simulacro.Camion;

public class TestCamiones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Atributos
        int codigo;
        String patente;
        int cantEjes;
        int capacidad;
        boolean acoplado;
        Camion camion;
        System.out.println("Ingrese el codigo: ");
        codigo = sc.nextInt();
        System.out.println("Ingrese la patente: ");
        patente = sc.next();
        System.out.println("Ingrese la cantidad de ejes: ");
        cantEjes = sc.nextInt();
        System.out.println("Ingrese la capacidad del camion: ");
        capacidad = sc.nextInt();
        System.out.println("Ingrese si tiene acoplado o no (true/false).");
        acoplado = sc.nextBoolean();
        camion = new Camion(codigo, patente, cantEjes, capacidad, acoplado);
        boolean terminar = false;
        String opcion;
        do {
            System.out.println("Ingrese una opcion ");
            opcion = sc.next();
            switch (opcion) {
                case "1":
                    System.out.println("Los datos del camion ingresado son " + camion.toString());
                    break;
                case "2":
                    if (camion.getCantEjes() == 3 && (acoplado == false)) {
                        System.out.println(camion.toString());
                    } else {
                        System.out.println("No cumpleo con los requisitos");
                    }
                    break;
                case "3":
                    if (camion.getCapacidad() < 5000) {
                        System.out.println(camion.toString());
                    } else {
                        System.out.println("No cumpleo con los requisitos");
                    }
                    break;
                default:
                    terminar = true;
                    break;
            }
        } while (!terminar);
    }
}
