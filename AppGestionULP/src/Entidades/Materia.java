
package Entidades;

/**
 *
 * @author Ed Le Franc
 */
public class Materia {
    private int id_materia;
    private String nombre;
    private int anio_materia;
    private boolean activo;

    public Materia() {
    }

    public Materia(String nombre, int anio_materia, boolean activo) {
        this.nombre = nombre;
        this.anio_materia = anio_materia;
        this.activo = activo;
    }
    
    public Materia(int id_materia, String nombre, int anio_materia, boolean activo) {
        this.id_materia = id_materia;
        this.nombre = nombre;
        this.anio_materia = anio_materia;
        this.activo = activo;
    }

    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio_materia() {
        return anio_materia;
    }

    public void setAnio_materia(int anio_materia) {
        this.anio_materia = anio_materia;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Materia{" + "id_materia=" + id_materia + ", nombre=" + nombre + ", anio_materia=" + anio_materia + '}';
    }

    
    
    
}
