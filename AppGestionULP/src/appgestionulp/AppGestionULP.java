/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appgestionulp;

import AccesoADatos.AlumnoData;
import AccesoADatos.Conexion;
import AccesoADatos.InscripcionData;
import Entidades.Materia;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ed Le Franc
 */
public class AppGestionULP {

    
    public static void main(String[] args) {
        //instanciamos un objeto de tipo Conexion.
        Conexion conn = new Conexion();
        InscripcionData insc = new InscripcionData();
        AlumnoData dataAlumno = new AlumnoData();
        
        //dataAlumno.
//        List<Materia> materias = new ArrayList<>();
//        String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion, materia WHERE inscripcion.idMateria = materia.idMateria AND inscripcion.idAlumno = ?;";
//        String otraFormaSQL = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion JOIN materia ON(inscripcion.idMateria = materia.idMateria) WHERE inscripcion.idAlumno = ?;";
//            
//        
//        try {
//            conn.Conexion_Maria();
//            System.out.println("Conexion establecida");
//        } catch (Exception e) {
//            System.out.println("No se ha podido conectar, error: " + e);
//        }
//        
//        try {
//            
//            PreparedStatement ps = conn.Conexion_Maria().prepareStatement(otraFormaSQL);
//            ps.setInt(1, 4);
//            ResultSet resultado = ps.executeQuery();
//            Materia materia;
//                
//                while (resultado.next()) {
//                    materia = new Materia();
//                    materia.setId_materia(resultado.getInt("idMateria"));
//                    materia.setNombre(resultado.getString("nombre"));
//                    materia.setAnio_materia(resultado.getInt("año"));
//                    materias.add(materia);
//                    System.out.println(materias);
//                }                       
//        } catch (SQLException e) {
//            System.out.println("No se ha podido mostrar los datos papu.\nERROR:\n" + e);
//        }
        insc.obtenerMateriasCursadas(4);
        }
    
    
}
