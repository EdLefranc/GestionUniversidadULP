
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
        
       
    //Guardar Alumno   
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
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno. Error: "+ex.getMessage());

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
    

    public Alumno buscarAlumno(int dni) throws SQLException {

        Alumno alumno = null;
        ArrayList<Alumno> alum = new ArrayList<>();
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE dni=? AND estado = 1";
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
                alumno.setActivo(true); 
                alum.add(alumno);

                //System.out.println(alum);
                } 
            ps.close();

                System.out.println(alum);
                JOptionPane.showMessageDialog(null, "Alumno encontrado");
                } else{
                JOptionPane.showMessageDialog(null, "No existe el alumno");       
                ps.close(); 
            }               
                     
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());
            
        } 
        
        return alumno;        
}

    //Buscar Alumno por DNI
    public Alumno buscarAlumnoPorDni(int dni) {
        Alumno alumno = null;
        ArrayList<Alumno> alum = new ArrayList<>();
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE dni=? AND estado = 1";
        PreparedStatement ps = null;
        
        if (!esNumeroDNI(String.valueOf(dni))) {
            JOptionPane.showMessageDialog(null, "El número no corresponde a un DNI o hay campos vacíos.\nIngrese un DNI válido por favor.");
            System.out.println("El valor de 'dni' no es un entero válido o tiene más de 8 dígitos.");
        } else {
            System.out.println("El valor de 'dni' es un entero válido y tiene 8 o menos dígitos.");
        }
        
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
        alumno.setActivo(true); 
        alum.add(alumno);
        System.out.println(alum);
        } else {
            JOptionPane.showMessageDialog(null, "No existe el alumno");

        }
        ps.close();

        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());
        }
            return alumno;       
    }

    //Listado de Alumnos
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
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno "+ex.getMessage());
        }
        //System.out.println(alumnos);
        return alumnos;
}

    //Modificar Alumno
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

    //Eliminar Alumno
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
