/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appgestionulp;

import AccesoADatos.AlumnoData;
import AccesoADatos.Conexion;
import AccesoADatos.InscripcionData;
import Entidades.Alumno;
import Entidades.Materia;
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
        
        //instanciamos un objeto de tipo Alumno
        LocalDate fecha = LocalDate.of(2006, 5, 5);       
        Alumno a1 = new Alumno(35200321, "Juan", "Quinteros", fecha, true);
        
        //insc.obtenerMateriasCursadas(4);
        //dataAlumno.guardarAlumno(a1);
        //dataAlumno.buscarAlumno(7);
        //dataAlumno.buscarAlumnoPorDni(28222113);
        dataAlumno.listarAlumnos();
    }
}
        
        
    

