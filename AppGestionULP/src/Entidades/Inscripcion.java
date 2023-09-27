
package Entidades;

/**
 *
 * @author Ed Le Franc
 */
public class Inscripcion {
    
    //Creo que el planteamiento de esta clase está mal,
    //ya que la clase Inscripcion debe correlacionarse con la tabla inscripcion de la base de datos.
    
    private int id_inscripcion;
    private Alumno alumno; // Acá, por ejemplo, solo necesito el idAlumno
    private Materia materia; // Acá, por ejemplo, solo necesito el idMateria
    private double nota;

    public Inscripcion() {
    }

    public Inscripcion(Alumno alumno, Materia materia, double nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public int getId_inscripcion() {
        return id_inscripcion;
    }

    public Inscripcion(int id_inscripcion, Alumno alumno, Materia materia, double nota) {
        this.id_inscripcion = id_inscripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public void setId_inscripcion(int id_inscripcion) {
        this.id_inscripcion = id_inscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        String insc= "| legajo: " + id_inscripcion + " | nombre: " + materia.getNombre() + " | nota: " + nota;
        return insc;
    }
    
    
}

/*

public class Inscripcion {
    private int idInscripcion;
    private Alumno alumno; // Relación con Alumno
    private Materia materia; // Relación con Materia
    private double nota;

    // Resto de los métodos y constructores
}

====================================================

String sql = "SELECT inscripcion.idInscripcion, inscripcion.nota, " +
             "alumno.idAlumno AS alumno_id, materia.idMateria AS materia_id " +
             "FROM inscripcion " +
             "JOIN alumno ON inscripcion.idAlumno = alumno.idAlumno " +
             "JOIN materia ON inscripcion.idMateria = materia.idMateria";

====================================================

while (rs.next()) {
    Inscripcion insc = new Inscripcion();
    insc.setIdInscripcion(rs.getInt("idInscripcion"));
    insc.setNota(rs.getDouble("nota"));
    
    Alumno alumno = new Alumno();
    alumno.setIdAlumno(rs.getInt("alumno_id"));
    insc.setAlumno(alumno);
    
    Materia materia = new Materia();
    materia.setIdMateria(rs.getInt("materia_id"));
    insc.setMateria(materia);
    
    inscripciones.add(insc);
}



public List<Inscripcion> obtenerInscripciones() {
    List<Inscripcion> inscripciones = new ArrayList<>();
    String sql = "SELECT inscripcion.idInscripcion, inscripcion.nota, " +
                 "alumno.idAlumno AS alumno_id, alumno.apellido AS alumno_apellido, alumno.nombre AS alumno_nombre, " +
                 "materia.idMateria AS materia_id, materia.nombre AS materia_nombre " +
                 "FROM inscripcion " +
                 "JOIN alumno ON inscripcion.idAlumno = alumno.idAlumno " +
                 "JOIN materia ON inscripcion.idMateria = materia.idMateria";

    try {
        try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                insc.setNota(rs.getDouble("nota"));
                
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("alumno_id"));
                alumno.setApellido(rs.getString("alumno_apellido"));
                alumno.setNombre(rs.getString("alumno_nombre"));
                insc.setAlumno(alumno);
                
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("materia_id"));
                materia.setNombre(rs.getString("materia_nombre"));
                insc.setMateria(materia);
                
                inscripciones.add(insc);
            }
        }
    } catch (Exception e) {
        e.printStackTrace(); // Manejo de excepciones básico
    }

    return inscripciones;
}



*/