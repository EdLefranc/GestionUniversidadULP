
package AccesoADatos;

import Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class MateriaData {
    
    private Connection con = null;
    Conexion conex = new Conexion();
    
    public MateriaData(){
        con = conex.getConexion_inst();
    }
    
    
public void guardarMateria(Materia materia) {
        String sql = "INSERT INTO materia (nombre, año, estado) VALUES (?, ?, ?)";
    try {
            try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                ps.setString(1, materia.getNombre());
                ps.setInt(2, materia.getAnio_materia());
                ps.setBoolean(3, materia.isActivo()); // if reducido
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Materia añadida con exito.");
                    
                }   }
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia. Error: "+ex.getMessage());

    }
    
}    
   
    
public Materia buscarMateria(int id) throws SQLException {
        Materia materia = null;
        String sql = "SELECT nombre, año FROM materia WHERE idMateria = ? AND estado = 1";
        PreparedStatement ps = null;
        ArrayList<Materia> mater = new ArrayList<>();
        try {
            ps = conex.Conexion_Maria().prepareStatement(sql);
            ps.setInt(1,id );
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materia=new Materia();
                materia.setId_materia(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio_materia(rs.getInt("año"));
                materia.setActivo(true);
                mater.add(materia);
                System.out.println(mater);
                JOptionPane.showMessageDialog(null, "Materia encontrada");
                } else{
                JOptionPane.showMessageDialog(null, "No existe la materia");       
                ps.close(); 
            }               
                     
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia "+ex.getMessage());
            
        } 
        
        return materia;        
    }


public void modificarMateria (Materia materia){
String sql = "UPDATE materia SET nombre = ?, año = ?, estado = ? WHERE idMateria = ?";
        PreparedStatement ps = null;
        
        try {
        ps = conex.Conexion_Maria().prepareStatement(sql);
        
        ps.setString(1, materia.getNombre());
        ps.setInt(2, materia.getAnio_materia());
        ps.setBoolean(3, materia.isActivo());
        ps.setInt(4, materia.getId_materia());
        int exito = ps.executeUpdate();
        
        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Materia modificada Exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "La materia no existe");
        }
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia "+ex.getMessage());
    }
}    
    
    public void eliminarmateria(int id) {
        try {
        String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ? ";
        PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql);
        //PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        int fila=ps.executeUpdate();
        
        if(fila==1){
            JOptionPane.showMessageDialog(null, " Se eliminó la materia exitosamente");
        }
        ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Materia");
        }
    }
   
 public List<Materia> listarMaterias() {
        
        List<Materia> materias = new ArrayList<>();
        try {
        String sql = "SELECT * FROM materia WHERE estado = 1 ";
        PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Materia materia = new Materia();

            materia.setId_materia(rs.getInt("idMateria"));
            materia.setNombre(rs.getString("nombre"));
            materia.setAnio_materia(rs.getInt("año"));
            materia.setActivo(rs.getBoolean("estado"));
            materias.add(materia);            
        }
        ps.close();        
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno "+ex.getMessage());
        }
        System.out.println(materias);
        return materias;
}    


}