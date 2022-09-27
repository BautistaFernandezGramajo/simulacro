package simulacro;

public class newJavaFile1 {

    public static void main(String args[]) {
        String oracion = "Acuerdo con todos Totalmente";
        String oracionFinal;
        System.out.println(recortarTexto(oracion));
    }

    public static String recortarTexto(String textoIni) {
        String textoFin = "", palabra;
        int posIni, posFin;
        textoIni = textoIni + " ";
        posIni = 0;
        posFin = textoIni.indexOf(" ");
        do {
            palabra = textoIni.substring(posIni, posFin);
            if (palabra.length() > 5) {
                palabra = palabra.substring(0, 5) + ". ";
            }
            posIni = posFin + 1;
            posFin = textoIni.indexOf(" ", posFin);
            textoFin = textoFin + " " + palabra;
        } while (posFin != -1);
        return textoFin;
    }
}
