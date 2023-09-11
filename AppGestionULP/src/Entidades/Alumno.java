
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author Ed Le Franc
 */
public class Alumno {
    private int id_alumno;
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;
    private boolean activo;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, LocalDate fechaNac, boolean activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.activo = activo;
    }

    public Alumno(int id_alumno, String nombre, String apellido, LocalDate fechaNac, boolean activo) {
        this.id_alumno = id_alumno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.activo = activo;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id_alumno=" + id_alumno + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

    
    
    
    
    
}
