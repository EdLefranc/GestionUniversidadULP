/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Materia;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Ed Le Franc
 */
public class MateriaData {
    Conexion conex = new Conexion();

    public MateriaData() {
    }
    
    public void guardarMateria(Materia materia){
        
    }
    
    public Materia buscarMateria(int id){
        return null;
        
    }
    
    public void modificarMateria(Materia materia) {
    String sql = "UPDATE materia SET nombre = ?, año = ?, estado = ? WHERE idMateria = ?";

    try {
        try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql)) {
            
            ps.setString(1, materia.getNombre()); // nombre
            ps.setInt(2, materia.getAnio_materia()); // año
            ps.setBoolean(3, materia.isActivo()); // estado
            ps.setInt(4, materia.getId_materia()); // idMateria
            //ps.setInt(5, materia.getIdMateria()); // idMateria en la cláusula WHERE

            int filasAfectadas = ps.executeUpdate();
            
            if (filasAfectadas > 0) {
                System.out.println("Materia modificada con éxito.");
            } else {
                System.out.println("No se pudo modificar la materia.");
            }
        }
    } catch (SQLException e) {
        System.out.println("Error al modificar la materia. ERROR: " + e);
    }
}

    public void eliminarMateria(int id){
        
    }
    
    public List<Materia> listarMateria(){
        return null;
        
    }
    
    
    
}


/*

public void modificarMateria(Materia materia) {
    String sql = "UPDATE materia SET nombre = ?, año = ?, estado = ? WHERE idMateria = ?";

    try {
        try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql)) {
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setInt(3, materia.getEstado());
            ps.setInt(4, materia.getIdMateria());

            int rowsAffected = ps.executeUpdate();
            
            if (rowsAffected > 0) {
                System.out.println("Materia modificada con éxito.");
            } else {
                System.out.println("No se pudo modificar la materia.");
            }
        }
    } catch (SQLException e) {
        System.out.println("Error al modificar la materia. ERROR: " + e);
    }
}


*/