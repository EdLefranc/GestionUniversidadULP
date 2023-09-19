package AccesoADatos;

import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Ed Le Franc
 */
public class InscripcionData {
    private Connection con;
    
    //private MateriaData matData;
    //private AlumnoData aluData;
    
    
    public InscripcionData(){
        
    }
    
    public void guardarInscripcion(Inscripcion insc){
        
    }
    
    public List <Inscripcion> obtenerInscripciones(){
        return null;
    }
    
    
    public List <Inscripcion> obtenerInscripcionesPorAlumno(){ // = new List<>(int id);
        return null;        
    } 
    
    
    public List <Materia> obtenerMateriasCursadas(int id){
        Conexion conn = new Conexion();
        List<Materia> materias = new ArrayList<>();        
        
        try {
            String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion, materia WHERE inscripcion.idMateria = materia.idMateria AND inscripcion.idAlumno = ?;";
            String otraFormaSQL = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion JOIN materia ON(inscripcion.idMateria = materia.idMateria) WHERE inscripcion.idAlumno = ?;";
            try (PreparedStatement ps = conn.Conexion_Maria().prepareStatement(otraFormaSQL)) {
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                Materia materia;
                
                while (rs.next()) {
                    materia = new Materia();
                    materia.setId_materia(rs.getInt("idMateria"));
                    materia.setNombre(rs.getString("nombre"));
                    materia.setAnio_materia(rs.getInt("año"));
                    materias.add(materia);                    
                }
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener las inscripciones. Error: " + e);
        }
        System.out.println(materias);
        return materias;
    }
    public List <Materia> obtenerMateriasNoCursadas(){
        return null;
        
    }
    
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
        
        
        
    }
    
    public void actualizarNota(int idMateria, double nota){
        
    }
    
    public List <Alumno> obtenerAlumnoPorMateria(int id){
       
       Conexion conn = new Conexion(); 
       List<Alumno> alumnos = new ArrayList<>();
        try {
        String sql = "SELECT inscripcion.idMateria, dni, apellido, nombre FROM materia, alumno WHERE inscripcion.idMateria = materia.idMateria AND materia.idMateria = ?;";
        PreparedStatement ps = conn.Conexion_Maria().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Alumno alumno = new Alumno();

            alumno.setId_alumno(rs.getInt("idAlumno"));
            alumno.setDni(rs.getInt("dni"));
            alumno.setApellido(rs.getString("apellido"));
            alumno.setNombre(rs.getString("nombre"));
            
            alumnos.add(alumno);
            
            
        }
        ps.close();        
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno "+ex.getMessage());
        }
        System.out.println(alumnos);
        return alumnos;
    }
        
       
        
    
}
