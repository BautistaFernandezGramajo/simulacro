package simulacro;

/**
 * Desarrollo de Algoritmos - 2022
 *
 * @author Fernandez Gramajo Bautista
 */
public class Camion {

    private int codigo;
    private String patente;
    private int cantEjes;
    private int capacidad;
    private boolean acoplado;

    // Constructores
    public Camion(int cod) {
        codigo = cod;
        patente = "";
        cantEjes = 0;
        capacidad = 0;
        acoplado = false;
    }

    public Camion(int cod, String pat, int cEjes, int cap, boolean acopl) {
        codigo = cod;
        patente = pat;
        cantEjes = cEjes;
        capacidad = cap;
        acoplado = acopl;
    }

    // Modificadores
    public void setPatente(String pat) {
        patente = pat;
    }

    public void setCantEjes(int cEjes) {
        cantEjes = cEjes;
    }

    public void setCapacidad(int cap) {
        capacidad = cap;
    }

    public void setAcoplado(boolean acopl) {
        acoplado = acopl;
    }

    // Observadores
    public int getCodigo() {
        return codigo;
    }

    public String getPatente() {
        return patente;
    }

    public int getCantEjes() {
        return cantEjes;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public boolean getAcoplado() {
        return acoplado;
    }

    public String toString() {
        return "Codigo " + codigo + ", Patente " + patente + ", Cantidad de Ejes " + cantEjes + ", Capacidad " + capacidad + " Acoplado " + acoplado;
    }

    // Comparativas
    public boolean equals(Camion c) {
        return (this.codigo == c.getCodigo());
    }
}
