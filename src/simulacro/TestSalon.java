/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package simulacro;

import java.util.Scanner;

public class TestSalon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Salon[] arr;
        int cantSal;
        Salon sal;
        String nombre;
        int disponibilidad;
        boolean musica;
        String direccion;
        int telefono;
        System.out.println("Ingrese la cantidad de salones");
        cantSal = sc.nextInt();
        arr = new Salon[cantSal];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Ingrese el nombre del salon nro " + i);
            nombre = sc.nextLine();
            System.out.println("Ingrese la disponbilidad del salon nro " + i);
            disponibilidad = sc.nextInt();
            System.out.println("Ingrese si puede usarse musica en el salon " + i);
            musica = sc.nextBoolean();
            System.out.println("Ingrese la direccion del salon" + i);
            direccion = sc.nextLine();
            System.out.println("Ingrese el telefono del salon nro " + i);
            telefono = sc.nextInt();
            sal = new Salon(nombre, disponibilidad, musica, direccion, telefono);
            arr[i] = sal;
        }
        System.out.println(mayorCapacidad(arr));
    }

    public static String mayorCapacidad(Salon[] arr) {
        Salon sal = arr[0];
        int mayorCapacidad = sal.getDispo();
        for (int i = 0; i < arr.length; i++) {
            if (mayorCapacidad < arr[i].getDispo()) {
                sal = arr[i];
            }
        }
        return sal.toString();
    }

}
