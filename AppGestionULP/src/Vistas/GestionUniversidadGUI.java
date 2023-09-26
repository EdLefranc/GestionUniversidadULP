package Vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.Conexion;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatSpacegrayIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatLightOwlIJTheme;
import java.awt.event.ItemEvent;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ed Le Franc
 */
public class GestionUniversidadGUI extends javax.swing.JFrame {
    
    private DefaultTableModel modelo = new DefaultTableModel();
    
    
    public GestionUniversidadGUI() {
        initComponents();
        setLocationRelativeTo(null); // Esto setea la posición de la ventana principal de la app en el centro de la pantalla
        eliminarInternalFrames();
        //cargarMateriasComboBox();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jDeskFondo = new javax.swing.JDesktopPane();
        IF_Alumno = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JT_Dni = new javax.swing.JTextField();
        JT_Apellido = new javax.swing.JTextField();
        JT_Nombre = new javax.swing.JTextField();
        btn_Buscar = new javax.swing.JButton();
        RB_Activo = new javax.swing.JRadioButton();
        JDC_FechaNac = new com.toedter.calendar.JDateChooser();
        btn_Guardar_Alumno = new javax.swing.JButton();
        btn_Nuevo_Alumno = new javax.swing.JButton();
        IF_Materia = new javax.swing.JInternalFrame();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        RB_Activo_Materia = new javax.swing.JRadioButton();
        JT_CodigoMateria = new javax.swing.JTextField();
        btn_Buscar_Cod_Materia = new javax.swing.JButton();
        btn_Nuevo_Materia = new javax.swing.JButton();
        btn_Guardar_Materia = new javax.swing.JButton();
        JT_NombreMateria = new javax.swing.JTextField();
        JT_AñoMateria = new javax.swing.JTextField();
        IF_Administracion = new javax.swing.JInternalFrame();
        label_Titulo_Insc = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        CB_SeleccionAlumno = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        RB_MateriasInsc = new javax.swing.JRadioButton();
        RB_MateriasNoInsc = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Inscripciones = new javax.swing.JTable();
        btn_Inscripcion = new javax.swing.JButton();
        btn_AnularInsc = new javax.swing.JButton();
        RB_Ninguno = new javax.swing.JRadioButton();
        IF_Consultas = new javax.swing.JInternalFrame();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        SP_Tabla = new javax.swing.JScrollPane();
        TablaListAlumMateria = new javax.swing.JTable();
        CB_Seleccion_Materia = new javax.swing.JComboBox<>();
        IF_ModificacionNotas = new javax.swing.JInternalFrame();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        JCB_SelecAlumnos = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Notas = new javax.swing.JTable();
        btn_GuardarNota = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        btn_mostrarMateriasNotas = new javax.swing.JButton();
        Menu_Nav = new javax.swing.JMenuBar();
        JM_Alumno = new javax.swing.JMenu();
        form_alumno = new javax.swing.JMenuItem();
        JM_Materia = new javax.swing.JMenu();
        form_materia = new javax.swing.JMenuItem();
        JM_Admin = new javax.swing.JMenu();
        form_manejoInscripciones = new javax.swing.JMenuItem();
        form_modNotas = new javax.swing.JMenuItem();
        JM_Consultas = new javax.swing.JMenu();
        consulta_alumMaterias = new javax.swing.JMenuItem();
        cambiarTema = new javax.swing.JMenu();
        darkTheme = new javax.swing.JMenuItem();
        lightTheme = new javax.swing.JMenuItem();
        Soporte = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        JM_Salir = new javax.swing.JMenu();
        opcionSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jDeskFondo.setPreferredSize(new java.awt.Dimension(800, 600));
        jDeskFondo.setLayout(new java.awt.BorderLayout());

        IF_Alumno.setClosable(true);
        IF_Alumno.setTitle("Formulario de  Alumno");
        IF_Alumno.setPreferredSize(new java.awt.Dimension(800, 600));
        IF_Alumno.setVisible(true);
        IF_Alumno.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Alumno");
        IF_Alumno.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("DNI");
        IF_Alumno.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Apellido");
        IF_Alumno.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Nombre");
        IF_Alumno.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Estado");
        IF_Alumno.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Fecha de nacimiento");
        IF_Alumno.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, -1));

        JT_Dni.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        IF_Alumno.getContentPane().add(JT_Dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 154, -1));

        JT_Apellido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        IF_Alumno.getContentPane().add(JT_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 272, -1));

        JT_Nombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        IF_Alumno.getContentPane().add(JT_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 272, -1));

        btn_Buscar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_Buscar.setText("Buscar");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });
        IF_Alumno.getContentPane().add(btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, 50));

        RB_Activo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        RB_Activo.setText("Activo");
        IF_Alumno.getContentPane().add(RB_Activo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        JDC_FechaNac.setForeground(new java.awt.Color(0, 204, 0));
        JDC_FechaNac.setDateFormatString("yyyy-MM-dd");
        JDC_FechaNac.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        IF_Alumno.getContentPane().add(JDC_FechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 313, 40));

        btn_Guardar_Alumno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_Guardar_Alumno.setText("Guardar - Actualizar");
        btn_Guardar_Alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Guardar_AlumnoActionPerformed(evt);
            }
        });
        IF_Alumno.getContentPane().add(btn_Guardar_Alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 220, -1));

        btn_Nuevo_Alumno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_Nuevo_Alumno.setText("Nuevo");
        btn_Nuevo_Alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Nuevo_AlumnoActionPerformed(evt);
            }
        });
        IF_Alumno.getContentPane().add(btn_Nuevo_Alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 130, -1));

        jDeskFondo.add(IF_Alumno, java.awt.BorderLayout.SOUTH);

        IF_Materia.setClosable(true);
        IF_Materia.setTitle("Formulario de Materias");
        IF_Materia.setPreferredSize(new java.awt.Dimension(800, 600));
        IF_Materia.setVisible(true);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel7.setText("Materia");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Código:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Nombre:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Año:");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("Estado:");

        RB_Activo_Materia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        RB_Activo_Materia.setText("Activo");

        btn_Buscar_Cod_Materia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_Buscar_Cod_Materia.setText("Buscar Materia");
        btn_Buscar_Cod_Materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Buscar_Cod_MateriaActionPerformed(evt);
            }
        });

        btn_Nuevo_Materia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_Nuevo_Materia.setText("Nuevo");
        btn_Nuevo_Materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Nuevo_MateriaActionPerformed(evt);
            }
        });

        btn_Guardar_Materia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_Guardar_Materia.setText("Guardar - Actualizar");
        btn_Guardar_Materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Guardar_MateriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IF_MateriaLayout = new javax.swing.GroupLayout(IF_Materia.getContentPane());
        IF_Materia.getContentPane().setLayout(IF_MateriaLayout);
        IF_MateriaLayout.setHorizontalGroup(
            IF_MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IF_MateriaLayout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addGroup(IF_MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IF_MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(IF_MateriaLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(65, 65, 65)
                            .addComponent(JT_NombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(IF_MateriaLayout.createSequentialGroup()
                            .addGroup(IF_MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(IF_MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(RB_Activo_Materia)
                                .addComponent(JT_AñoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(IF_MateriaLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(JT_CodigoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addComponent(btn_Buscar_Cod_Materia, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
            .addGroup(IF_MateriaLayout.createSequentialGroup()
                .addGroup(IF_MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IF_MateriaLayout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jLabel7))
                    .addGroup(IF_MateriaLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(btn_Nuevo_Materia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Guardar_Materia, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(185, 185, 185))
        );
        IF_MateriaLayout.setVerticalGroup(
            IF_MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IF_MateriaLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel7)
                .addGap(80, 80, 80)
                .addGroup(IF_MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IF_MateriaLayout.createSequentialGroup()
                        .addGroup(IF_MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(JT_CodigoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(IF_MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(IF_MateriaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(JT_NombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(IF_MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT_AñoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_Buscar_Cod_Materia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(IF_MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RB_Activo_Materia)
                    .addComponent(jLabel11))
                .addGap(60, 60, 60)
                .addGroup(IF_MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Nuevo_Materia)
                    .addComponent(btn_Guardar_Materia))
                .addGap(115, 115, 115))
        );

        jDeskFondo.add(IF_Materia, java.awt.BorderLayout.WEST);

        IF_Administracion.setClosable(true);
        IF_Administracion.setTitle("Formulario de Inscripciones");
        IF_Administracion.setMinimumSize(new java.awt.Dimension(60, 22));
        IF_Administracion.setPreferredSize(new java.awt.Dimension(800, 600));
        IF_Administracion.setVisible(true);
        IF_Administracion.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Titulo_Insc.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        label_Titulo_Insc.setText("Formulario de Inscripciones");
        IF_Administracion.getContentPane().add(label_Titulo_Insc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setText("Seleccione un Alumno");
        IF_Administracion.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, 30));

        CB_SeleccionAlumno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        CB_SeleccionAlumno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CB_SeleccionAlumnoItemStateChanged(evt);
            }
        });
        IF_Administracion.getContentPane().add(CB_SeleccionAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 390, 30));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setText("Listado de Materias");
        IF_Administracion.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        buttonGroup1.add(RB_MateriasInsc);
        RB_MateriasInsc.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        RB_MateriasInsc.setText("Materias Inscriptas");
        RB_MateriasInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_MateriasInscActionPerformed(evt);
            }
        });
        IF_Administracion.getContentPane().add(RB_MateriasInsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        buttonGroup1.add(RB_MateriasNoInsc);
        RB_MateriasNoInsc.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        RB_MateriasNoInsc.setText("Materias no Inscriptas");
        RB_MateriasNoInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_MateriasNoInscActionPerformed(evt);
            }
        });
        IF_Administracion.getContentPane().add(RB_MateriasNoInsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, -1));

        Tabla_Inscripciones.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Tabla_Inscripciones.setForeground(new java.awt.Color(0, 204, 0));
        Tabla_Inscripciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Año"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla_Inscripciones);

        IF_Administracion.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 740, 150));

        btn_Inscripcion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_Inscripcion.setText("Inscripción");
        btn_Inscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InscripcionActionPerformed(evt);
            }
        });
        IF_Administracion.getContentPane().add(btn_Inscripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, -1, -1));

        btn_AnularInsc.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_AnularInsc.setText("Anular Inscripción");
        btn_AnularInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AnularInscActionPerformed(evt);
            }
        });
        IF_Administracion.getContentPane().add(btn_AnularInsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, -1, -1));

        buttonGroup1.add(RB_Ninguno);
        RB_Ninguno.setSelected(true);
        RB_Ninguno.setText("Ninguno");
        IF_Administracion.getContentPane().add(RB_Ninguno, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, -1, -1));

        jDeskFondo.add(IF_Administracion, java.awt.BorderLayout.NORTH);

        IF_Consultas.setClosable(true);
        IF_Consultas.setTitle("Consulta Alumnos por Materia");
        IF_Consultas.setPreferredSize(new java.awt.Dimension(800, 600));
        IF_Consultas.setVisible(true);
        IF_Consultas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setText("Seleccione una materia:");
        IF_Consultas.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 220, 32));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel16.setText("Listado de Alumnos por Materia");
        IF_Consultas.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        TablaListAlumMateria.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TablaListAlumMateria.setForeground(new java.awt.Color(0, 204, 0));
        TablaListAlumMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "Apellido", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SP_Tabla.setViewportView(TablaListAlumMateria);

        IF_Consultas.getContentPane().add(SP_Tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 760, 230));

        CB_Seleccion_Materia.setMaximumRowCount(14);
        CB_Seleccion_Materia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CB_Seleccion_MateriaItemStateChanged(evt);
            }
        });
        IF_Consultas.getContentPane().add(CB_Seleccion_Materia, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 180, 32));

        jDeskFondo.add(IF_Consultas, java.awt.BorderLayout.CENTER);

        IF_ModificacionNotas.setClosable(true);
        IF_ModificacionNotas.setTitle("Cargar Notas");
        IF_ModificacionNotas.setNormalBounds(new java.awt.Rectangle(0, 0, 71, 0));
        IF_ModificacionNotas.setPreferredSize(new java.awt.Dimension(800, 600));
        IF_ModificacionNotas.setVisible(true);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel17.setText("Actualizar Notas");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setText("Seleccione un alumno");

        JCB_SelecAlumnos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JCB_SelecAlumnos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JCB_SelecAlumnosItemStateChanged(evt);
            }
        });

        Tabla_Notas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Tabla_Notas.setForeground(new java.awt.Color(0, 204, 0));
        Tabla_Notas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tabla_Notas);

        btn_GuardarNota.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_GuardarNota.setText("Guardar");
        btn_GuardarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarNotaActionPerformed(evt);
            }
        });

        btn_Salir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_Salir.setText("Salir");

        btn_mostrarMateriasNotas.setText("Mostrar Materias y Notas");
        btn_mostrarMateriasNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarMateriasNotasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IF_ModificacionNotasLayout = new javax.swing.GroupLayout(IF_ModificacionNotas.getContentPane());
        IF_ModificacionNotas.getContentPane().setLayout(IF_ModificacionNotasLayout);
        IF_ModificacionNotasLayout.setHorizontalGroup(
            IF_ModificacionNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IF_ModificacionNotasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(26, 26, 26)
                .addComponent(JCB_SelecAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(IF_ModificacionNotasLayout.createSequentialGroup()
                .addGroup(IF_ModificacionNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IF_ModificacionNotasLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel17))
                    .addGroup(IF_ModificacionNotasLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IF_ModificacionNotasLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(btn_GuardarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IF_ModificacionNotasLayout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(btn_mostrarMateriasNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        IF_ModificacionNotasLayout.setVerticalGroup(
            IF_ModificacionNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IF_ModificacionNotasLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel17)
                .addGap(41, 41, 41)
                .addGroup(IF_ModificacionNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCB_SelecAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_mostrarMateriasNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(IF_ModificacionNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_GuardarNota)
                    .addComponent(btn_Salir))
                .addGap(69, 69, 69))
        );

        jDeskFondo.add(IF_ModificacionNotas, java.awt.BorderLayout.EAST);

        getContentPane().add(jDeskFondo);

        Menu_Nav.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Menu_Nav.setMaximumSize(new java.awt.Dimension(800, 32769));
        Menu_Nav.setPreferredSize(new java.awt.Dimension(800, 28));

        JM_Alumno.setText("Alumno");
        JM_Alumno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        JM_Alumno.setIconTextGap(25);

        form_alumno.setText("Formulario de Alumno");
        form_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                form_alumnoActionPerformed(evt);
            }
        });
        JM_Alumno.add(form_alumno);

        Menu_Nav.add(JM_Alumno);

        JM_Materia.setText("Materia");
        JM_Materia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        JM_Materia.setIconTextGap(25);

        form_materia.setText("Formulario de Materia");
        form_materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                form_materiaActionPerformed(evt);
            }
        });
        JM_Materia.add(form_materia);

        Menu_Nav.add(JM_Materia);

        JM_Admin.setText("Administración");
        JM_Admin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        JM_Admin.setIconTextGap(25);

        form_manejoInscripciones.setText("Manejo de Inscripciones");
        form_manejoInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                form_manejoInscripcionesActionPerformed(evt);
            }
        });
        JM_Admin.add(form_manejoInscripciones);

        form_modNotas.setText("Modificación de Notas");
        form_modNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                form_modNotasActionPerformed(evt);
            }
        });
        JM_Admin.add(form_modNotas);

        Menu_Nav.add(JM_Admin);

        JM_Consultas.setText("Consultas");
        JM_Consultas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        JM_Consultas.setIconTextGap(25);

        consulta_alumMaterias.setText("Alumnos por Materias");
        consulta_alumMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta_alumMateriasActionPerformed(evt);
            }
        });
        JM_Consultas.add(consulta_alumMaterias);

        Menu_Nav.add(JM_Consultas);

        cambiarTema.setText("Temas");
        cambiarTema.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cambiarTema.setIconTextGap(25);

        darkTheme.setText("Noche");
        darkTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darkThemeActionPerformed(evt);
            }
        });
        cambiarTema.add(darkTheme);

        lightTheme.setText("Día");
        lightTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lightThemeActionPerformed(evt);
            }
        });
        cambiarTema.add(lightTheme);

        Menu_Nav.add(cambiarTema);

        Soporte.setText("Equipo");
        Soporte.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Soporte.setIconTextGap(25);

        jMenuItem1.setText("EQUIPO 39");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Soporte.add(jMenuItem1);

        Menu_Nav.add(Soporte);

        JM_Salir.setText("Salir");
        JM_Salir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        JM_Salir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JM_Salir.setIconTextGap(25);

        opcionSalir.setText("Salir de la Aplicación");
        opcionSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionSalirActionPerformed(evt);
            }
        });
        JM_Salir.add(opcionSalir);

        Menu_Nav.add(JM_Salir);

        setJMenuBar(Menu_Nav);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void eliminarInternalFrames(){
        IF_Administracion.setVisible(false);
        IF_Alumno.setVisible(false);
        IF_Consultas.setVisible(false);
        IF_Materia.setVisible(false);
        IF_ModificacionNotas.setVisible(false);
    }
    
    private void form_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_form_alumnoActionPerformed
        eliminarInternalFrames();
        IF_Alumno.setVisible(true);
        JDC_FechaNac.getDateEditor().setEnabled(false);
        
        // Luego, cuando desees abrir la ventana interna:
        if (IF_Alumno == null || IF_Alumno.isClosed()) {            
            // Agregando la ventana interna al jDesktopPane1
            jDeskFondo.add(IF_Alumno);
            IF_Alumno.setVisible(true); //hacerlo visible
        }

        // Me aseguro de manejar el evento de cierre para 'ocultar' en lugar de 'eliminar'
        IF_Alumno.setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_form_alumnoActionPerformed

    private void btn_Nuevo_MateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Nuevo_MateriaActionPerformed
        
        JT_CodigoMateria.setText("");
        JT_NombreMateria.setText("");
        JT_AñoMateria.setText("");
        RB_Activo_Materia.setSelected(false);
        
    }//GEN-LAST:event_btn_Nuevo_MateriaActionPerformed

    private void btn_Guardar_MateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Guardar_MateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Guardar_MateriaActionPerformed
                                               
    private void opcionSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionSalirActionPerformed
        int confirm = JOptionPane.showConfirmDialog(
            this,
            "¿Estás seguro de que quieres cerrar la aplicación?",
            "Confirmar Cierre",
            JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {
            // Cierra la aplicación
            System.exit(0);
        }
    }//GEN-LAST:event_opcionSalirActionPerformed

    private void form_materiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_form_materiaActionPerformed
        eliminarInternalFrames();
        IF_Materia.setVisible(true);
        JT_CodigoMateria.setEditable(false);
        
        // Luego, cuando desees abrir la ventana interna:
        if (IF_Materia == null || IF_Materia.isClosed()) {            
            // Agregando la ventana interna al jDesktopPane1
            jDeskFondo.add(IF_Materia);
            IF_Materia.setVisible(true);
        }

        // Me aseguro de manejar el evento de cierre para 'ocultar' en lugar de 'eliminar'
        IF_Materia.setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_form_materiaActionPerformed

    private void form_manejoInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_form_manejoInscripcionesActionPerformed
        cargarAlumnosComboBox(CB_SeleccionAlumno);
        RB_Ninguno.setVisible(false);
        eliminarInternalFrames();
        IF_Administracion.setVisible(true);
        
        // Luego, cuando desees abrir la ventana interna:
        if (IF_Administracion == null || IF_Administracion.isClosed()) {            
            // Agregando la ventana interna al jDesktopPane1
            jDeskFondo.add(IF_Administracion);
            IF_Administracion.setVisible(true);
        }

        // Me aseguro de manejar el evento de cierre para 'ocultar' en lugar de 'eliminar'
        IF_Administracion.setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_form_manejoInscripcionesActionPerformed

    private void consulta_alumMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta_alumMateriasActionPerformed
        cargarMateriasComboBox();
        eliminarInternalFrames();
        IF_Consultas.setVisible(true);
        
        // Luego, cuando desees abrir la ventana interna:
        if (IF_Consultas == null || IF_Consultas.isClosed()) {            
            // Agregando la ventana interna al jDesktopPane1
            jDeskFondo.add(IF_Consultas);
            IF_Consultas.setVisible(true);
        }

        // Me aseguro de manejar el evento de cierre para 'ocultar' en lugar de 'eliminar'
        IF_Consultas.setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_consulta_alumMateriasActionPerformed

    private void btn_Nuevo_AlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Nuevo_AlumnoActionPerformed
        JT_Dni.setText("");
        JT_Apellido.setText("");
        JT_Nombre.setText("");
        RB_Activo.setSelected(false);
        JDC_FechaNac.setDate(null);        
    }//GEN-LAST:event_btn_Nuevo_AlumnoActionPerformed

    private void btn_Guardar_AlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Guardar_AlumnoActionPerformed
        AlumnoData alumData = new AlumnoData();        
        
        String dni = JT_Dni.getText();
        String nombre = JT_Nombre.getText();
        String apellido = JT_Apellido.getText();
        
        String date = ((JTextField)JDC_FechaNac.getDateEditor().getUiComponent()).getText(); // capturo la fecha como String        

        // Convertir Date a LocalDate puuufff!!
        LocalDate fechaNac = LocalDate.parse(date);
        
               
        boolean estado = RB_Activo.isSelected(); //Verifico que el estado del radioButton según el estado del alumno

        Alumno alum = new Alumno(Integer.parseInt(dni), nombre, apellido, fechaNac, estado);
        alumData.guardarAlumnoVE(alum);        
    }//GEN-LAST:event_btn_Guardar_AlumnoActionPerformed
    
    public static boolean esNumeroDNI(String str) {
        
        
        if (str == null || str.isEmpty()) { // Evalúa que no sea un campo vacío
            return false;
        }

        for (char c : str.toCharArray()) { // Evalúa que no contenga carácteres, uso un for each para eso
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
            
    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
                      
        AlumnoData alumData = new AlumnoData();
        ArrayList <Alumno> alumnoBuscado = new ArrayList<>();
        String dni = JT_Dni.getText();
        
        boolean esValido = esNumeroDNI(dni);
        
        if(esValido){
            try {          
            
            int dniAlumno = Integer.parseInt(dni);            
            alumnoBuscado.add(alumData.buscarAlumnoPorDni(dniAlumno));     

            // Verifico si se encontró un alumno antes de mostrar los datos
            String apellido = alumnoBuscado.get(0).getApellido();
            String nombre = alumnoBuscado.get(0).getNombre();
            LocalDate localDate = alumnoBuscado.get(0).getFechaNac();
            java.util.Date utilDate = java.util.Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
            boolean activo = alumnoBuscado.get(0).isActivo();
            
            // Muestra los datos en los campos de información
            JT_Apellido.setText(apellido);
            JT_Nombre.setText(nombre);
            JDC_FechaNac.setDate(utilDate);           
            RB_Activo.setSelected(activo); // Establecemos el estado del RadioButton           
        
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "El alumno no existe en las listas\nIntenta con otro DNI");
        }
            
        }else{
               JOptionPane.showMessageDialog(null, "Ingresa un DNI válido");
                }
                
    }//GEN-LAST:event_btn_BuscarActionPerformed
       
    
    public int obtenerIdMateria(String nombreMateria){
        Conexion conex = new Conexion();
        // Obtengo el ID de la materia seleccionada en función del nombre capturado en el comboBox
                //String nombreMateriaSeleccionada = (String) CB_Seleccion_Materia.getSelectedItem();
                
                // Realizo la consulta sql para obtener el ID de la materia en función del nombre
                String sqlObtenerIdMateria = "SELECT idMateria FROM materia WHERE nombre = ?";
                int idMateriaSeleccionada = -1; // Valor predeterminado en caso de que no se encuentre la materia (no existe un item -1)
                
                try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sqlObtenerIdMateria)) {
                    ps.setString(1, nombreMateria); // Configura el parámetro con el nombre seleccionado
                    ResultSet rs = ps.executeQuery();
                    
                    if (rs.next()) {
                        idMateriaSeleccionada = rs.getInt("idMateria"); // Obtiene el ID de la materia
                    }
                } catch (SQLException e1) {
                    System.out.println("Error al obtener el ID de la materia. ERROR: " + e1);
                }
        //System.out.println("El id de la materia " + nombreMateria + " es: " + idMateriaSeleccionada);
        return idMateriaSeleccionada;
    }
    
    private void CB_Seleccion_MateriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CB_Seleccion_MateriaItemStateChanged
        
        InscripcionData inscData = new InscripcionData();
        String nombreMateria = (String) CB_Seleccion_Materia.getSelectedItem();
        List<Alumno> alumnosEnMateria = inscData.obtenerAlumnoPorMateria(obtenerIdMateria(nombreMateria));
        // Obtengo la lista de alumnos        

        // Obtengo el modelo de la tabla existente
        DefaultTableModel modeloTabla = (DefaultTableModel) TablaListAlumMateria.getModel();

        // Limpia la tabla (borra todas las filas existentes)
        modeloTabla.setRowCount(0);

        // Itero sobre la lista de alumnos y agrego a cada alumno a la tabla
        alumnosEnMateria.forEach((alumno) -> {
            // Agrega una fila con los datos del alumno en el mismo orden que las columnas
            modeloTabla.addRow(new Object[]{alumno.getId_alumno(), alumno.getDni(), alumno.getNombre(), alumno.getApellido()});
        });
        
        centrarCeldas(TablaListAlumMateria);

        // Actualiza la tabla para que se muestren los nuevos datos
        modeloTabla.fireTableDataChanged();
          
    }//GEN-LAST:event_CB_Seleccion_MateriaItemStateChanged

    private void form_modNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_form_modNotasActionPerformed
        cargarAlumnosComboBox(JCB_SelecAlumnos);
        eliminarInternalFrames();
        IF_ModificacionNotas.setVisible(true);
        
        // Luego, cuando desees abrir la ventana interna:
        if (IF_ModificacionNotas == null || IF_ModificacionNotas.isClosed()) {            
            // Agregando la ventana interna al jDesktopPane1
            jDeskFondo.add(IF_ModificacionNotas);
            IF_ModificacionNotas.setVisible(true); //hacerlo visible
        }

        // Me aseguro de manejar el evento de cierre para 'ocultar' en lugar de 'eliminar'
        IF_ModificacionNotas.setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_form_modNotasActionPerformed
    
    
    
    public static boolean esNumeroValido(String str){
        if (str == null || str.isEmpty()) { // Evalúa que no sea un campo vacío
            return false;
        }

        for (char c : str.toCharArray()) { // Evalúa que no contenga carácteres, uso un for each para eso
            if (!Character.isDigit(c)) {
                return false; // No es un número válido.
            }
        }
        try {
            int num = Integer.parseInt(str); // Intenta convertir a entero positivo.
            return num > 0 && num < 99999999;
        } catch (NumberFormatException e) {
            return false; // No se pudo convertir a entero positivo.
        }
    }
    
    private void btn_Buscar_Cod_MateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Buscar_Cod_MateriaActionPerformed
        
            MateriaData matData = new MateriaData();            
            ArrayList<Materia> matAlmacen = new ArrayList<>();            
            boolean esValido = esNumeroValido(JT_CodigoMateria.getText()); //Evaluo si en el JT_CodigoMateria se colocó un número positivo
            
            if (esValido) {
                try {
                    String nombreMateria = JT_NombreMateria.getText();
                    matAlmacen.add(matData.buscarMateriaPorNombre(nombreMateria));
                    // Obtengo la materia almacenada y luego accedo a sus datos
                    int codigo = matAlmacen.get(0).getId_materia();
                    String nombre = matAlmacen.get(0).getNombre();
                    int anio = matAlmacen.get(0).getAnio_materia();               

                    //Mostrando los datos en los campos de texto
                    String codigoAString = String.valueOf(codigo);
                    String anioAString = String.valueOf(anio);

                    JT_CodigoMateria.setText(codigoAString);
                    JT_NombreMateria.setText(nombre);
                    JT_AñoMateria.setText(anioAString);
                    RB_Activo_Materia.setSelected(true);                
                
            }catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Esta materia aún no ha sido creada.\nTe invito a crearla.");
            }   catch (SQLException ex) {  
                    Logger.getLogger(GestionUniversidadGUI.class.getName()).log(Level.SEVERE, null, ex);
                }  
            
        } else  {
            JOptionPane.showMessageDialog(null, "Ingresa un nombre válido");
        }
        
    }//GEN-LAST:event_btn_Buscar_Cod_MateriaActionPerformed

    private void darkThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darkThemeActionPerformed
               
        try {
            UIManager.setLookAndFeel(new FlatSpacegrayIJTheme()); // Cambiar al tema nocturno
            SwingUtilities.updateComponentTreeUI(GestionUniversidadGUI.this);
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_darkThemeActionPerformed

    private void lightThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lightThemeActionPerformed
        
        try {
            UIManager.setLookAndFeel(new FlatCyanLightIJTheme()); // Cambiar al tema diurno
            SwingUtilities.updateComponentTreeUI(GestionUniversidadGUI.this);
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_lightThemeActionPerformed

    private void RB_MateriasInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_MateriasInscActionPerformed
           
        InscripcionData insc = new InscripcionData();
        // Obtener el alumno seleccionado en el ComboBox CB_SeleccionAlumno
        Alumno alumnoSeleccionado = (Alumno) CB_SeleccionAlumno.getSelectedItem();        
        
        if (RB_MateriasInsc.isSelected()) {
            btn_Inscripcion.setEnabled(false);
            btn_AnularInsc.setEnabled(true);
        }
        
        if (RB_MateriasInsc.isSelected()) {
            
            if (alumnoSeleccionado != null) {
                // Obtener el ID del alumno
                int idAlumno = alumnoSeleccionado.getId_alumno();

                // Llamar al método obtenerMateriasCursadas() con el ID del alumno
                List<Materia> materiasCursadas = insc.obtenerMateriasCursadas(idAlumno);

                refrescarTabla(materiasCursadas);

                centrarCeldas(Tabla_Inscripciones); // Con esto me aseguro que las celdas estén centradas

            } else {
                // Manejar el caso en el que no se ha seleccionado un alumno
                JOptionPane.showMessageDialog(null, "Por favor, selecciona un alumno.");
            }
        }
    
    
    }//GEN-LAST:event_RB_MateriasInscActionPerformed
      
    private void RB_MateriasNoInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_MateriasNoInscActionPerformed
        InscripcionData inscData = new InscripcionData();
        // Obtener el alumno seleccionado en el ComboBox CB_SeleccionAlumno
        Alumno alumnoSeleccionado = (Alumno) CB_SeleccionAlumno.getSelectedItem();        
        
        if (RB_MateriasNoInsc.isSelected()) {
            btn_AnularInsc.setEnabled(false);
            btn_Inscripcion.setEnabled(true);
        }
        
        if (RB_MateriasNoInsc.isSelected()) {
            
            if (alumnoSeleccionado != null) {
                // Obtener el ID del alumno
                int idAlumno = alumnoSeleccionado.getId_alumno();

                // Llamar al método obtenerMateriasCursadas() con el ID del alumno
                List<Materia> materiasNoCursadas = inscData.obtenerMateriasNoCursadas(idAlumno);

                refrescarTabla(materiasNoCursadas);

            } else {                
                // Manejar el caso en el que no se ha seleccionado un alumno
                JOptionPane.showMessageDialog(null, "Por favor, selecciona un alumno.");
            }
        }    
        
    }//GEN-LAST:event_RB_MateriasNoInscActionPerformed
    
    public void refrescarTabla(List<Materia> lista){
        // Llenar la JTable TablaInscripciones con los datos de materiasCursadas
        DefaultTableModel model = (DefaultTableModel) Tabla_Inscripciones.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de llenarla

        lista.forEach((materia) -> {
            model.addRow(new Object[]{materia.getId_materia(), materia.getNombre(), materia.getAnio_materia()});            
        });

        centrarCeldas(Tabla_Inscripciones); // Con esto me aseguro que las celdas estén centradas
    }
        
    private void btn_mostrarMateriasNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarMateriasNotasActionPerformed
        Materia mat = new Materia();
        InscripcionData inscData = new InscripcionData();
        Alumno alum = (Alumno) JCB_SelecAlumnos.getSelectedItem();
        
        int filaSeleccionada = Tabla_Notas.getSelectedRow();
        if (filaSeleccionada != -1) {
            int idMateria = Integer.parseInt(Tabla_Notas.getValueAt(filaSeleccionada, 0).toString());
            int idAlumno = alum.getId_alumno();
            double notaMateria = Double.parseDouble(Tabla_Notas.getValueAt(filaSeleccionada, 2).toString());
            
            List<Inscripcion> listaInscripciones = inscData.obtenerInscripcionesPorAlumno(idAlumno);
            refrescarTablaNotas(mat, listaInscripciones);
        }else{
            
        }
    }//GEN-LAST:event_btn_mostrarMateriasNotasActionPerformed

    
    
    private void btn_InscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InscripcionActionPerformed
        
        int filaSeleccionada = Tabla_Inscripciones.getSelectedRow();
        if (filaSeleccionada != -1) {
        // Obtenemos los valores de las celdas en las columnas 'Id', 'Nombre' y 'Año'
        int idMateria = Integer.parseInt(Tabla_Inscripciones.getValueAt(filaSeleccionada, 0).toString());
        String nombre = Tabla_Inscripciones.getValueAt(filaSeleccionada, 1).toString();
        int año = Integer.parseInt(Tabla_Inscripciones.getValueAt(filaSeleccionada, 2).toString());
        
        Materia mat = new Materia(idMateria, nombre, año);        
        Alumno alum = (Alumno) CB_SeleccionAlumno.getSelectedItem();
        
        Inscripcion insc = new Inscripcion(alum, mat, NORMAL);        
        InscripcionData inscData = new InscripcionData();
        
        inscData.guardarInscripcion(insc);
        
        int idAlumno = alum.getId_alumno();
        List<Materia> listMaterias = inscData.obtenerMateriasNoCursadas(idAlumno);
        
        RB_MateriasInsc.setSelected(false);
        RB_MateriasNoInsc.setSelected(false);
        RB_Ninguno.setSelected(true);
        refrescarTabla(listMaterias);   
        
        }else{
            JOptionPane.showMessageDialog(null, "Selecciona un alumno por favor.");
        }
    }//GEN-LAST:event_btn_InscripcionActionPerformed

    private void btn_AnularInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AnularInscActionPerformed
        int filaSeleccionada = Tabla_Inscripciones.getSelectedRow();
        if (filaSeleccionada != -1) {
        // Obtenemos los valores de las celdas en las columnas 'Id', 'Nombre' y 'Año'
        int idMateria = Integer.parseInt(Tabla_Inscripciones.getValueAt(filaSeleccionada, 0).toString());
                      
        Alumno alum = (Alumno) CB_SeleccionAlumno.getSelectedItem();
                      
        InscripcionData inscData = new InscripcionData();
        int idAlumno = alum.getId_alumno();
        
        inscData.borrarInscripcionMateriaAlumno(idAlumno, idMateria);        
        
        List<Materia> listMaterias = inscData.obtenerMateriasCursadas(idAlumno);
        
        RB_MateriasInsc.setSelected(false);
        RB_MateriasNoInsc.setSelected(false);
        RB_Ninguno.setSelected(true);
        refrescarTabla(listMaterias);   
        
        }else{
           JOptionPane.showMessageDialog(null, "Selecciona un alumno por favor."); 
        }
    }//GEN-LAST:event_btn_AnularInscActionPerformed
            
    private void CB_SeleccionAlumnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CB_SeleccionAlumnoItemStateChanged
        RB_Ninguno.setSelected(true);
    }//GEN-LAST:event_CB_SeleccionAlumnoItemStateChanged

    private void btn_GuardarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarNotaActionPerformed
        Materia mat = new Materia();
        InscripcionData inscData = new InscripcionData();
        Alumno alum = (Alumno) JCB_SelecAlumnos.getSelectedItem();
        
        int filaSeleccionada = Tabla_Notas.getSelectedRow();
        if (filaSeleccionada != -1) {
            int idMateria = Integer.parseInt(Tabla_Notas.getValueAt(filaSeleccionada, 0).toString());
            int idAlumno = alum.getId_alumno();
            double notaMateria = Double.parseDouble(Tabla_Notas.getValueAt(filaSeleccionada, 2).toString());
            
            List<Inscripcion> listaInscripciones = inscData.obtenerInscripcionesPorAlumno(idAlumno);
            refrescarTablaNotas(mat, listaInscripciones);
            
            inscData.actualizarNota(idMateria, notaMateria, idAlumno);
            }else{
            JOptionPane.showMessageDialog(null, "Selecciona un alumno por favor");
        }
    }//GEN-LAST:event_btn_GuardarNotaActionPerformed
    
      
    public void refrescarTablaNotas(Materia materia, List<Inscripcion> lista){
        // Llenar la JTable Tabla_Notas con los datos de obtenerInscripcionesPorAlumno()
        DefaultTableModel model = (DefaultTableModel) Tabla_Notas.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de llenarla

        lista.forEach((inscripcion) -> {
            model.addRow(new Object[]{inscripcion.getId_inscripcion(), materia.getNombre(), inscripcion.getNota()});            
        });

        centrarCeldas(Tabla_Notas); // Con esto me aseguro que las celdas estén centradas
    }
       
    private void JCB_SelecAlumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JCB_SelecAlumnosItemStateChanged
        InscripcionData inscData = new InscripcionData();
        int idAlumno = ((Alumno) JCB_SelecAlumnos.getSelectedItem()).getId_alumno();

        List<Inscripcion> inscripciones = inscData.obtenerInscripcionesPorAlumno(idAlumno);

        // Obtengo el modelo de la tabla existente
        DefaultTableModel modeloTabla = (DefaultTableModel) Tabla_Notas.getModel();

        // Limpia la tabla (borra todas las filas existentes)
        modeloTabla.setRowCount(0);

        // Itero sobre la lista de inscripciones y agrego cada una a la tabla
        inscripciones.forEach((inscripcion) -> {
            // Agrega una fila con los datos en el mismo orden que las columnas ('Id', 'Nombre', 'Nota')
            modeloTabla.addRow(new Object[]{inscripcion.getMateria().getId_materia(), inscripcion.getMateria().getNombre(), inscripcion.getNota()});
        });

        centrarCeldas(Tabla_Notas);

        // Actualiza la tabla para que se muestren los nuevos datos
        modeloTabla.fireTableDataChanged();
    }//GEN-LAST:event_JCB_SelecAlumnosItemStateChanged

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
      JOptionPane.showMessageDialog(null, "INTEGRANTES: \n Eduardo Andres Cardozo \n Julio Cesar Silvero Gonzalez \n Sebastian Zuluaga Piedrahita \n Marcelo Claudio Garcia");  
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    private void centrarCeldas(JTable tabla){
        // Configurar el centrado de las celdas en la tabla
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        
        // Aplicar el centrado a todas las columnas de la tabla
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }        
    }
    
    private void cargarAlumnosComboBox(JComboBox combo){
        AlumnoData alumData = new AlumnoData();
        //Obtener la lista de alumnos
        List listaAlumnos = alumData.listarAlumnos();
        
        combo.removeAllItems();
        
        // Agregar los nombres de las materias al JComboBox
        listaAlumnos.forEach((alum) -> {
            combo.addItem(alum);
        }); 
    }
    
    private void cargarMateriasComboBox() {
        MateriaData matData = new MateriaData();
    
        // Obtener la lista de materias
        List<Materia> listaMaterias = matData.listarMaterias();

        // Limpio el JComboBox antes de agregar elementos nuevos
        CB_Seleccion_Materia.removeAllItems();

        // Agregar los nombres de las materias al JComboBox
        listaMaterias.forEach((materia) -> {
            CB_Seleccion_Materia.addItem(materia.getNombre());
        });             
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        FlatSpacegrayIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionUniversidadGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> CB_SeleccionAlumno;
    private javax.swing.JComboBox<String> CB_Seleccion_Materia;
    private javax.swing.JInternalFrame IF_Administracion;
    private javax.swing.JInternalFrame IF_Alumno;
    private javax.swing.JInternalFrame IF_Consultas;
    private javax.swing.JInternalFrame IF_Materia;
    private javax.swing.JInternalFrame IF_ModificacionNotas;
    private javax.swing.JComboBox<Object> JCB_SelecAlumnos;
    private com.toedter.calendar.JDateChooser JDC_FechaNac;
    private javax.swing.JMenu JM_Admin;
    private javax.swing.JMenu JM_Alumno;
    private javax.swing.JMenu JM_Consultas;
    private javax.swing.JMenu JM_Materia;
    private javax.swing.JMenu JM_Salir;
    private javax.swing.JTextField JT_Apellido;
    private javax.swing.JTextField JT_AñoMateria;
    private javax.swing.JTextField JT_CodigoMateria;
    private javax.swing.JTextField JT_Dni;
    private javax.swing.JTextField JT_Nombre;
    private javax.swing.JTextField JT_NombreMateria;
    private javax.swing.JMenuBar Menu_Nav;
    private javax.swing.JRadioButton RB_Activo;
    private javax.swing.JRadioButton RB_Activo_Materia;
    private javax.swing.JRadioButton RB_MateriasInsc;
    private javax.swing.JRadioButton RB_MateriasNoInsc;
    private javax.swing.JRadioButton RB_Ninguno;
    private javax.swing.JScrollPane SP_Tabla;
    private javax.swing.JMenu Soporte;
    private javax.swing.JTable TablaListAlumMateria;
    private javax.swing.JTable Tabla_Inscripciones;
    private javax.swing.JTable Tabla_Notas;
    private javax.swing.JButton btn_AnularInsc;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Buscar_Cod_Materia;
    private javax.swing.JButton btn_GuardarNota;
    private javax.swing.JButton btn_Guardar_Alumno;
    private javax.swing.JButton btn_Guardar_Materia;
    private javax.swing.JButton btn_Inscripcion;
    private javax.swing.JButton btn_Nuevo_Alumno;
    private javax.swing.JButton btn_Nuevo_Materia;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton btn_mostrarMateriasNotas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenu cambiarTema;
    private javax.swing.JMenuItem consulta_alumMaterias;
    private javax.swing.JMenuItem darkTheme;
    private javax.swing.JMenuItem form_alumno;
    private javax.swing.JMenuItem form_manejoInscripciones;
    private javax.swing.JMenuItem form_materia;
    private javax.swing.JMenuItem form_modNotas;
    private javax.swing.JDesktopPane jDeskFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_Titulo_Insc;
    private javax.swing.JMenuItem lightTheme;
    private javax.swing.JMenuItem opcionSalir;
    // End of variables declaration//GEN-END:variables

    
}
