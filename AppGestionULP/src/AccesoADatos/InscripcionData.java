package AccesoADatos;

import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Ed Le Franc
 */
public class InscripcionData {
    
    private Conexion conex = new Conexion();
    
    private MateriaData matData;
    private AlumnoData aluData;

    public InscripcionData(Conexion conex, MateriaData matData, AlumnoData aluData) {
        this.conex = conex;
        this.matData = matData;
        this.aluData = aluData;
    }
    
    
    public InscripcionData(){
        
    }
    
    public void guardarInscripcion(Inscripcion insc){
        String sql = "INSERT INTO inscripcion(nota, idAlumno, idMateria) VALUES (?, ?, ?)"; //INSERT INTO `inscripcion`(`idInscripcion`, `nota`, `idAlumno`, `idMateria`) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]')
        try {
            try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                ps.setDouble(1, insc.getNota());
                ps.setInt(2, insc.getAlumno().getId_alumno());
                ps.setInt(3, insc.getMateria().getId_materia());
                
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    //alumno.setId_alumno(rs.getInt("idAlumno"));
                    JOptionPane.showMessageDialog(null, "Materia añadida con exito.");
                    
                }   }
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripción. Error: "+ex.getMessage());

}
    }
    
    
    
    
    
    public List <Inscripcion> obtenerInscripciones(){
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT inscripcion.idInscripcion, inscripcion.nota, inscripcion.idAlumno, inscripcion.idMateria " // se puede usar SELECT * ya que se consulta portadas las columnas
                + "FROM inscripcion "
                + "JOIN alumno ON inscripcion.idAlumno = alumno.idAlumno "
                + "JOIN materia ON inscripcion.idMateria = materia.idMateria";

        try {
            try(PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Inscripcion insc = new Inscripcion();
                    Alumno alumno = new Alumno();
                    Materia materia = new Materia();

                    insc.setId_inscripcion(rs.getInt("idInscripcion"));
                    insc.setNota(rs.getDouble("nota"));


                    alumno.setId_alumno(rs.getInt("idAlumno"));
                    //alumno.setApellido(rs.getString("alumno_apellido"));
                    //alumno.setNombre(rs.getString("alumno_nombre"));
                    insc.setAlumno(alumno);


                    materia.setId_materia(rs.getInt("idMateria"));
                    //materia.setNombre(rs.getString("materia_nombre"));
                    insc.setMateria(materia);

                    inscripciones.add(insc);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener las inscripciones. ERROR: " + e);
        }
        System.out.println("Las inscripciones son: \n" + inscripciones);
        return inscripciones;
    }
          
    public List<Inscripcion> obtenerInscripcionesPorAlumno2(int id) {
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT inscripcion.idMateria, materia.nombre, inscripcion.nota " // Solo seleccionar las columnas necesarias
        + "FROM inscripcion "
        + "JOIN materia ON inscripcion.idMateria = materia.idMateria "
        + "WHERE inscripcion.idAlumno = ?";
        try {
            try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql)) {
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    Inscripcion insc = new Inscripcion();
                    Materia materia = new Materia();

                    materia.setId_materia(rs.getInt("idMateria"));
                    materia.setNombre(rs.getString("nombre"));

                    insc.setMateria(materia);
                    insc.setNota(rs.getDouble("nota"));

                    inscripciones.add(insc);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener las inscripciones del alumno. ERROR: " + e);
        }
        System.out.println("Las inscripciones son: \n" + inscripciones);
        return inscripciones;
    }

       
    public List <Inscripcion> obtenerInscripcionesPorAlumno(int id){ // = new List<>(int id);
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT inscripcion.idInscripcion, inscripcion.nota, inscripcion.idAlumno, inscripcion.idMateria " // se puede usar SELECT * ya que se consulta portadas las columnas
                + "FROM inscripcion "
                + "JOIN alumno ON inscripcion.idAlumno = alumno.idAlumno "
                + "JOIN materia ON inscripcion.idMateria = materia.idMateria WHERE inscripcion.idAlumno = ?";
        try {
            try(PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                
                while (rs.next()) {
                    
                    Inscripcion insc = new Inscripcion();
                    Alumno alumno = new Alumno();
                    Materia materia = new Materia();
                    insc.setId_inscripcion(rs.getInt("idInscripcion"));
                    insc.setNota(rs.getDouble("nota"));                

                    alumno.setId_alumno(id);                
                    insc.setAlumno(alumno);

                    materia.setId_materia(rs.getInt("idMateria"));                
                    insc.setMateria(materia);

                    inscripciones.add(insc);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener las inscripciones del alumno. ERROR: " + e);
        }
        System.out.println("Las inscripciones son: \n" + inscripciones);        
        return inscripciones;        
    } 
        
    
    //Obtención de las materias que están siendo cursadas por un alumno.
    public List <Materia> obtenerMateriasCursadas(int id){
        //Conexion conn = new Conexion();
        List<Materia> materias = new ArrayList<>();        
        
        try {
            String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion, materia WHERE inscripcion.idMateria = materia.idMateria AND inscripcion.idAlumno = ?;";
            String otraFormaSQL = "SELECT i.idMateria, nombre, año FROM inscripcion i JOIN materia ON(i.idMateria = materia.idMateria) WHERE i.idAlumno = ?;";
            try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(otraFormaSQL)) {
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
    
    public List <Materia> obtenerMateriasNoCursadas(int id){
        List <Materia> mat = new ArrayList<>();        
        
        try {            
            //String sql = "SELECT i.idMateria, nombre, año FROM inscripcion i JOIN materia ON(i.idMateria = materia.idMateria) WHERE i.idAlumno = ? AND i.estado = 0;";
            String sql = "SELECT materia.idMateria, materia.nombre, materia.año "
                    + "FROM materia WHERE materia.idMateria "
                    + "NOT IN (SELECT inscripcion.idMateria FROM inscripcion WHERE inscripcion.idAlumno = ?);";
            
            try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql)) {
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                Materia materia;
                
                while (rs.next()) {
                    materia = new Materia();
                    materia.setId_materia(rs.getInt("idMateria"));
                    materia.setNombre(rs.getString("nombre"));
                    materia.setAnio_materia(rs.getInt("año"));
                    //materia.setActivo(rs.getBoolean("estado"));
                    mat.add(materia);                    
                }
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener las materias no cursadas. Error: " + e);
        }
        System.out.println(mat);        
        return mat;
        
    }
        
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
    
        try {
            try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql)) {
                ps.setInt(1, idAlumno);
                ps.setInt(2, idMateria);

                int filasAfectadas = ps.executeUpdate();

                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(null, "Alumno desinscripto de la materia.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró una inscripción válida para eliminar.");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la inscripción: " + ex.getMessage());
        }
        
        
    }
        
    public void actualizarNota(int idMateria, double nota, int idAlumno){
        try {
            // Supongamos que tienes una tabla de inscripciones llamada "inscripcion"
            String sql = "UPDATE inscripcion SET nota = ? WHERE idMateria = ? AND idAlumno = ?";
            try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql)) {
                ps.setDouble(1, nota);
                ps.setInt(2, idMateria);
                ps.setInt(3, idAlumno);

                int rowsAffected = ps.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Nota actualizada con éxito.");
                } else {
                    System.out.println("No se encontró la inscripción para actualizar la nota.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar la nota: " + e.getMessage());
        }
    }
       
    public List <Alumno> obtenerAlumnoPorMateria(int id){
       
       Conexion conn = new Conexion(); 
       List<Alumno> alumnos = new ArrayList<>();
                    
       try {
        String sql = "SELECT alumno.idAlumno, alumno.dni, alumno.apellido, alumno.nombre " +
                     "FROM alumno " +
                     "INNER JOIN inscripcion ON alumno.idAlumno = inscripcion.idAlumno " +
                     "WHERE inscripcion.idMateria = ?";
           try (PreparedStatement ps = conn.Conexion_Maria().prepareStatement(sql)) {
               ps.setInt(1, id);
               ResultSet rs = ps.executeQuery();
               while (rs.next()) {
                   Alumno alumno = new Alumno();
                   
                   alumno.setId_alumno(rs.getInt("idAlumno"));
                   alumno.setDni(rs.getInt("dni"));
                   alumno.setApellido(rs.getString("apellido"));
                   alumno.setNombre(rs.getString("nombre"));                 
                   
                   alumnos.add(alumno);
                   
                   
               }  }        
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno "+ ex.getMessage());
            //System.out.println("El error es: " + ex);
        }
        //System.out.println("Los alumno son:\n" + alumnos);
        return alumnos;
    }    
}
