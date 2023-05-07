
package actividadexperimental2;

public class Carrera {
    private String nombre;
    private String modalidad;
    private int numSemestres;
    private int materias;

    public Carrera(String nombre, String modalidad, int numSemestres, int materias) {
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.numSemestres = numSemestres;
        this.materias = materias;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public int getNumSemestres() {
        return numSemestres;
    }

    public void setNumSemestres(int numSemestres) {
        this.numSemestres = numSemestres;
    }

    public int getMaterias() {
        return materias;
    }

    public void setMaterias(int materias) {
        this.materias = materias;
    }
    
    
}
