package simulacro;
/**
 * Desarrollo de Algoritmos - 2022
 * @author Fernandez Gramajo Bautista
 */
public class Salon{
    private String nombre;
    private int dispo;
    private boolean musica;
    private String direccion;
    private int telefono;   
    
    // Constructores
    
    public Salon(String nom, int dis, boolean mus, String dir, int tel){
    nombre = nom;
    dispo = dis;
    musica = mus;
    direccion = dir;
    telefono = tel;
    }

    public Salon(String nom){
    nombre = nom;
    dispo = 0;
    musica = false; 
    direccion = "";
    telefono = 0;
    }

    Salon(String nombre, int disponibilidad, boolean musica, String direccion, int telefono) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Observadores
    public String getNombre(){
    return nombre;
    }
    public int getDispo(){
    return dispo;
    }
    public boolean getMusica(){
    return musica;
    }
    public String getDireccion(){
    return direccion;   
    }
    public int getTelefono(){
    return telefono;
    }
    public String toString(){
    return "Nombre: " + nombre + "Disponibilidad: " + dispo + "Musica: " + musica + "Direccion: " + direccion + "Telefono: " + telefono ; 
    }
    // Modificadores
    public void setNombre(String nom){
    nombre = nom;
    }
    public void setDispo(int dis){
    dispo = dis;
    }
    public void setMusica(boolean mus){
    musica = mus;
    }
    public void setDireccion(String dir){
    direccion = dir;
    }
    public void setTelefono(int tel){
    telefono = tel;
    }
    // Comparativas
    public boolean equals(Salon otroSalon){
    return nombre.equalsIgnoreCase(otroSalon.getNombre());
    }
    public int compareTo(Salon otroSalon){
    return this.nombre - otroSalon.getNombre();
    }
    // Propias del tipo
    public boolean adecuadoCantInvitados(int cant){
    int rangoIni = (int) (dispo * 0.75);
    int rangoFin = (int) (dispo * 0.85);
    return (rangoIni<cant && cant<rangoFin);    
    }
    public boolean noApto(int cant){
    int rangoInf = (int) (dispo * 0.05);
    return (cant<rangoInf || cant>dispo);
    }
    
    
}