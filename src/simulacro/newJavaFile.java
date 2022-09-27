/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package simulacro;

import java.util.Scanner;

/**
 *
 * @author Bautista
 */
public class newJavaFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String oracionInicial;
        String oracionFinal = "";
        String[] arr;
        System.out.println("Ingrese una oracion.");
        oracionInicial = sc.nextLine();
        oracionFinal = nuevoTexto(oracionInicial);
        System.out.println(oracionFinal);
        /*arr = oracionInicial.split(" ");
        oracionFinal = palabra(arr);
        System.out.println(oracionFinal);*/
    }
    public static String nuevoTexto(String text) {
        String nuevoTexto = "", palabra;
        int posPrSub = 0, posEsp; //posPrSub: Primer Poscion de la subcadena, posEsp: Posicion Espacio
        
        text = text + " "; //Le concatenamos un espacio para poder generar el sub string de la ultima palabra
        do {
            posEsp = text.indexOf(" "); //Buscamos la poscion del espacio
            
            palabra = text.substring(posPrSub, posEsp); //Hacemos una subcadena de la posicion iniciona (0 en el primer caso) hasta la posicion del espacio
            
            text = text.substring(posEsp+1); //Asignamos al texto una sub cadena generada desde la posicion en la que se encontraba el espacio + 1, para dps buscar el espacio nuevamente en las siguiente vuelta del dowhile
            
            if(palabra.length()>5){
                palabra = palabra.substring(0,5)+"."; //Si la palabra tiene mas de 5 letras entonces generamos una subcadena de ella misma desde la pos 0 hasta las 4 y le concatenamos un punto 
            }
            
            nuevoTexto = nuevoTexto + " " + palabra; //Concatenamos las palabras
            
        } while (!text.equals("")); //Esto pasara mientras que el text no seate vacio

        return nuevoTexto;
    }
    
/*
    public static String palabra(String[] arr) {
        String pal = "";
        for (int i = 0; i < arr.length; i++) {
            pal = pal + " " + recortarPalabra(arr[i]);
        }
        return pal;
    }

    public static String recortarPalabra(String pal) {
        int i = 0;
        String palRec = "";
        boolean cinco = false;
        while (i < pal.length() && !cinco) {
            if (i < 5) {
                palRec = palRec + pal.charAt(i);
            } else if (i == 5) {
                palRec = palRec + ".";
                cinco = true;
            }
            i = i + 1;
        }
        return palRec;
    }
    */
}
