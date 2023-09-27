
package AccesoADatos;


import AccesoADatos.Conexion;
import Entidades.Alumno;
import Vistas.GestionUniversidadGUI;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class AlumnoData {
    
    GestionUniversidadGUI interfaz = new GestionUniversidadGUI();
    
    private Connection con = null;
    Conexion conex = new Conexion();
    
    
    
    public AlumnoData(){
        con = conex.getConexion_inst();
    }
        
       
       
    public void guardarAlumno(Alumno alumno) {
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                ps.setInt(1, alumno.getDni());
                ps.setString(2, alumno.getApellido());
                ps.setString(3, alumno.getNombre());
                ps.setDate(4, Date.valueOf(alumno.getFechaNac()));//localDate a Date
                ps.setBoolean(5, alumno.isActivo()); // if reducido
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    //alumno.setId_alumno(rs.getInt("idAlumno"));
                    JOptionPane.showMessageDialog(null, "Alumno añadido con exito.");
                    
                }   }
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "El alumno ya existe con estos datos.\nPrueba con 'modificar' algún dato.");

    }
        }
    
       
    public void guardarAlumnoVE(Alumno alumno) {
        String sqlSelect = "SELECT idAlumno FROM alumno WHERE dni = ?";
        String sqlInsert = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)";
        String sqlUpdate = "UPDATE alumno SET apellido = ?, nombre = ?, fechaNacimiento = ?, estado = ? WHERE dni = ?";

        try {
            // Verificar si el alumno ya existe
            try (PreparedStatement selectStatement = conex.Conexion_Maria().prepareStatement(sqlSelect)) {
                selectStatement.setInt(1, alumno.getDni());
                ResultSet resultSet = selectStatement.executeQuery();

                if (resultSet.next()) {
                    //int idAlumnoExistente = resultSet.getInt("idAlumno");
                    // El alumno ya existe, ofrecer opción de actualización
                    int opcion = JOptionPane.showConfirmDialog(null, "El alumno ya existe. ¿Desea actualizar los datos?",
                            "Confirmar actualización", JOptionPane.YES_NO_OPTION);
                    if (opcion == JOptionPane.YES_OPTION) {
                        // Actualizar los datos existentes
                        try (PreparedStatement updateStatement = conex.Conexion_Maria().prepareStatement(sqlUpdate)) {
                            updateStatement.setString(1, alumno.getApellido());
                            updateStatement.setString(2, alumno.getNombre());
                            updateStatement.setDate(3, Date.valueOf(alumno.getFechaNac()));
                            updateStatement.setBoolean(4, alumno.isActivo());
                            updateStatement.setInt(5, alumno.getDni());
                            updateStatement.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Datos del alumno actualizados con éxito.");
                        }
                    }
                } else {
                    // El alumno no existe, realizar la inserción
                    try (PreparedStatement insertStatement = conex.Conexion_Maria().prepareStatement(sqlInsert)) {
                        insertStatement.setInt(1, alumno.getDni());
                        insertStatement.setString(2, alumno.getApellido());
                        insertStatement.setString(3, alumno.getNombre());
                        insertStatement.setDate(4, Date.valueOf(alumno.getFechaNac()));
                        insertStatement.setBoolean(5, alumno.isActivo());
                        insertStatement.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Alumno añadido con éxito.");
                    }
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos: " + ex.getMessage());
        }
    }

    
    
    public Alumno buscarAlumno(int dni) throws SQLException {
        Alumno alumno = null;
        String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE dni = ? AND estado = 1";
        PreparedStatement ps = null;
        ArrayList<Alumno> alum = new ArrayList<>();    
        
        try {
         ps = conex.Conexion_Maria().prepareStatement(sql);
         ps.setInt(1,dni);
         ResultSet rs = ps.executeQuery();

         if (rs.next()) {
             alumno=new Alumno();
             //alumno.setId_alumno(id);
             alumno.setDni(rs.getInt("dni"));
             alumno.setApellido(rs.getString("apellido"));
             alumno.setNombre(rs.getString("nombre"));
             alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
             alumno.setActivo(true);
             alum.add(alumno);
             System.out.println(alum);
             //JOptionPane.showMessageDialog(null, "Alumno encontrado");
             }              
             ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());

        }        
        return alumno;        
    }

    public static boolean esNumeroDNI(String str) {
        if (str == null || str.isEmpty()) { // Evalúa que no sea un campo vacío
            return false;
        }

        for (char c : str.toCharArray()) { // Evalúa que no contenga carácteres, uso un for each
            if (!Character.isDigit(c)) {
                return false; // No es un número válido.
            }
        }

        try {
            int dni = Integer.parseInt(str); // Intenta convertir a entero.
            return dni > 999999 && dni < 99999999;
        } catch (NumberFormatException e) {
            return false; // No se pudo convertir a entero.
        }
    }
    
    public Alumno buscarAlumnoPorDni(int dni) {
        Alumno alumno = null;
        ArrayList<Alumno> alum = new ArrayList<>();
        String sql = "SELECT * FROM alumno WHERE dni=?";
        PreparedStatement ps = null;    
        
        try {                
            ps = conex.Conexion_Maria().prepareStatement(sql);
            ps.setInt(1,dni );
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno=new Alumno();
                alumno.setId_alumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(rs.getBoolean("estado"));  // Establecer el estado activo o no activo 
                alum.add(alumno);
                //System.out.println(alum);
                } 
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());
            System.out.println("Error: " + ex);
        }
            return alumno;       
    }
    
    
    public List<Alumno> listarAlumnos() {
        
        List<Alumno> alumnos = new ArrayList<>();
        try {
        String sql = "SELECT * FROM alumno WHERE estado = 1";
            try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Alumno alumno = new Alumno();
                    
                    alumno.setId_alumno(rs.getInt("idAlumno"));
                    alumno.setDni(rs.getInt("dni"));
                    alumno.setApellido(rs.getString("apellido"));
                    alumno.setNombre(rs.getString("nombre"));
                    alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                    alumno.setActivo(rs.getBoolean("estado"));
                    alumnos.add(alumno);
                }   }        
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());
        }
        //System.out.println(alumnos);
        return alumnos;
}


    public void modificarAlumno(Alumno alumno){
        String sql = "UPDATE alumno SET dni = ? , apellido = ?, nombre = ?, fechaNacimiento = ?, estado = ? WHERE idAlumno = ?";
        PreparedStatement ps = null;
        
        try {
        ps = conex.Conexion_Maria().prepareStatement(sql);
        ps.setInt(1, alumno.getDni());
        ps.setString(2, alumno.getApellido());
        ps.setString(3, alumno.getNombre());
        ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
        ps.setBoolean(5, alumno.isActivo());
        ps.setInt(6, alumno.getId_alumno());
        int exito = ps.executeUpdate();
        
        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "El alumno no existe");
        }
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());
        }
    }


    public void eliminarAlumno(int id) {
        try {
        String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno = ? ";
        PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql);
        //PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        int fila=ps.executeUpdate();
        
        if(fila==1){
            JOptionPane.showMessageDialog(null, " Se eliminó el alumno.");
        }
        ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno");
        }
    }      
}
