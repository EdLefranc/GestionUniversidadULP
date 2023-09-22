/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appgestionulp;

import AccesoADatos.AlumnoData;
import AccesoADatos.Conexion;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import Entidades.Materia;
import Vistas.GestionUniversidadGUI;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ed Le Franc
 */
public class AppGestionULP {

    
    public static void main(String[] args) throws SQLException, ParseException {
        //instanciamos un objeto de tipo Conexion.
        Conexion conn = new Conexion();
        InscripcionData insc = new InscripcionData();
        AlumnoData dataAlumno = new AlumnoData();
        GestionUniversidadGUI gui = new GestionUniversidadGUI();

        MateriaData dataMateria = new MateriaData();
        
        //instanciamos un objeto de tipo Alumno
        LocalDate fecha = LocalDate.of(2006, 5, 5);       
        Alumno a1 = new Alumno(3, 35200321, "Juan", "Quinteros", fecha, false);
        
        Materia mat1 = new Materia(7,"Sistemas II", 2 , true );        
        String nombre = "Scrum";       
        Materia mat = new Materia(9, nombre, 2, true);
        
        //insc.obtenerMateriasCursadas(4);
        //dataAlumno.guardarAlumno(a1);
        //dataAlumno.buscarAlumno(7);
        //dataAlumno.buscarAlumnoPorDni(28222113);

        //dataAlumno.listarAlumnos();
        //insc.obtenerInscripciones();
        //insc.obtenerInscripcionesPorAlumno(4);
        //insc.obtenerMateriasNoCursadas();
        //matData.modificarMateria(mat);

        //dataAlumno.modificarAlumno(a1);
        //dataAlumno.listarAlumnos();
        //dataAlumno.eliminarAlumno(1);
        
        //dataMateria.guardarMateria(mat1);
        //dataMateria.buscarMateria(3);
        //dataMateria.eliminarmateria(6);
        //dataMateria.listarMaterias();
        //dataMateria.modificarMateria(mat1);
        //insc.obtenerAlumnoPorMateria(5);
        gui.obtenerIdMateria("Programacion 2");
    }
}
        
        
    

