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
        List<Materia> materias = new ArrayList<>();
        
        try {
            String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion,"
                    + " materia WHERE inscripcion.idMateria = materia.idMateria\n"
                    + "AND inscripcion.idAlumno = ?;";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
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
        return materias;
    }
    List <Materia> obtenerMateriasNoCursadas;
    
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
        
    }
    
    public void actualizarNota(int idMateria, double nota){
        
    }
    
    public List <Alumno> obtenerAlumnoPorMateria(){
        return null;
    }
}
