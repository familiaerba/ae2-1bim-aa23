package actividadexperimental2;

public class Universidad {

    private String nombre; 
    private String siglas;
    private String direccion;
    private int numProfesores;
    
    private Carrera[] arreglo_C = new Carrera[10];

    public Universidad(String nombre, String siglas, String direccion, int numProfesores) {
        this.nombre = nombre;
        this.siglas = siglas;
        this.direccion = direccion;
        this.numProfesores = numProfesores;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumProfesores() {
        return numProfesores;
    }

    public void setNumProfesores(int numProfesores) {
        this.numProfesores = numProfesores;
    }

    public Carrera[] getArreglo_C() {
        return arreglo_C;
    }

    public void setArreglo_C(Carrera[] arreglo_C) {
        this.arreglo_C = arreglo_C;
    }
    
    
}
