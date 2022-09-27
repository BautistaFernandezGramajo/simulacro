package simulacro;

import java.util.Scanner;

public class Simulacro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        double[][] matrizReal;
        double arr[];
        int tam;
        System.out.println("Ingrese el tamaño de la matriz: ");
        tam = sc.nextInt();
        matrizReal = new double[tam][tam];
        cargarMatriz(matrizReal);
        arr = sumaElementos(matrizReal);
        mostrarArreglo(arr);

    }
    
    public static double[] sumaElementos(double mat[][]){
    double[] arr = new double[mat.length];
        for (int i = 0; i < mat.length; i++) {
            double suma = 0;
            for (int j = 0; j < mat[0].length; j++) {
                suma = suma + mat[i][j];
            }
            arr[i] = suma;
        }
    return arr;
    }
    
    public static void cargarMatriz(double mat[][]) {
        Scanner sc = new Scanner(System.in);
        double elemento;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.println("Ingrese el elemento en la posición [" + i +"] ["+ j +"] ");
                elemento = sc.nextDouble();
                mat[i][j] = elemento;
            }
        }
    }
    
    public static void mostrarArreglo(double arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
    }
