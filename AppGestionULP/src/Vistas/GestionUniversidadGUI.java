/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author Ed Le Franc
 */
public class GestionUniversidadGUI extends javax.swing.JFrame {

    /**
     * Creates new form GestionUniversidadGUI
     */
    public GestionUniversidadGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
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
        btn_Eliminar_Alumno = new javax.swing.JButton();
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
        btn_Eliminar_Materia = new javax.swing.JButton();
        btn_Guardar_Materia = new javax.swing.JButton();
        btn_Salir_Materia = new javax.swing.JButton();
        JT_NombreMateria = new javax.swing.JTextField();
        JT_AñoMateria = new javax.swing.JTextField();
        IF_Administracion = new javax.swing.JInternalFrame();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        IF_Consultas = new javax.swing.JInternalFrame();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        SP_Tabla = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_Salir_Consults = new javax.swing.JButton();
        CB_Seleccion_Materia = new javax.swing.JComboBox<>();
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
        JM_Salir = new javax.swing.JMenu();
        opcionSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(800, 600));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IF_Alumno.setClosable(true);
        IF_Alumno.setIconifiable(true);
        IF_Alumno.setMaximizable(true);
        IF_Alumno.setResizable(true);
        IF_Alumno.setTitle("Formulario de  Alumno");
        IF_Alumno.setPreferredSize(new java.awt.Dimension(800, 600));
        IF_Alumno.setVisible(true);

        jLabel1.setText("Alumno");

        jLabel2.setText("DNI");

        jLabel3.setText("Apellido");

        jLabel4.setText("Nombre");

        jLabel5.setText("Estado");

        jLabel6.setText("Fecha de nacimiento");

        btn_Buscar.setText("Buscar");

        RB_Activo.setText("Activo");

        btn_Guardar_Alumno.setText("Guardar");

        btn_Nuevo_Alumno.setText("Nuevo");

        btn_Eliminar_Alumno.setText("Eliminar");

        javax.swing.GroupLayout IF_AlumnoLayout = new javax.swing.GroupLayout(IF_Alumno.getContentPane());
        IF_Alumno.getContentPane().setLayout(IF_AlumnoLayout);
        IF_AlumnoLayout.setHorizontalGroup(
            IF_AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IF_AlumnoLayout.createSequentialGroup()
                .addGroup(IF_AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IF_AlumnoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(IF_AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(IF_AlumnoLayout.createSequentialGroup()
                                .addGroup(IF_AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IF_AlumnoLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(35, 35, 35))
                                    .addGroup(IF_AlumnoLayout.createSequentialGroup()
                                        .addGroup(IF_AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(107, 107, 107)))
                                .addGroup(IF_AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(IF_AlumnoLayout.createSequentialGroup()
                                        .addComponent(JT_Dni, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(btn_Buscar))
                                    .addComponent(JT_Apellido, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(RB_Activo)
                                    .addComponent(JT_Nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JDC_FechaNac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(IF_AlumnoLayout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(jLabel1))))
                    .addGroup(IF_AlumnoLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btn_Nuevo_Alumno)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Eliminar_Alumno)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Guardar_Alumno)))

                .addContainerGap(357, Short.MAX_VALUE))

                .addContainerGap(113, Short.MAX_VALUE))

        );
        IF_AlumnoLayout.setVerticalGroup(
            IF_AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IF_AlumnoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(IF_AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(IF_AlumnoLayout.createSequentialGroup()
                        .addGroup(IF_AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(IF_AlumnoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32)
                                .addGroup(IF_AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JT_Dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Buscar)
                                    .addComponent(jLabel2))
                                .addGap(53, 53, 53))
                            .addGroup(IF_AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JT_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))
                        .addGap(23, 23, 23)
                        .addGroup(IF_AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(22, 22, 22)
                        .addGroup(IF_AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RB_Activo)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(JDC_FechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                .addGroup(IF_AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Eliminar_Alumno)
                    .addComponent(btn_Nuevo_Alumno)
                    .addComponent(btn_Guardar_Alumno))
                .addGap(31, 31, 31))
        );

        jDesktopPane1.add(IF_Alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 440));

        IF_Materia.setClosable(true);
        IF_Materia.setIconifiable(true);
        IF_Materia.setMaximizable(true);
        IF_Materia.setTitle("Formulario de Materias");
        IF_Materia.setVisible(true);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setText("Materia");

        jLabel8.setText("Código:");

        jLabel9.setText("Nombre:");

        jLabel10.setText("Año:");

        jLabel11.setText("Estado:");

        RB_Activo_Materia.setText("Activo");

        JT_CodigoMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_CodigoMateriaActionPerformed(evt);
            }
        });

        btn_Buscar_Cod_Materia.setText("Buscar");

        btn_Nuevo_Materia.setText("Nuevo");
        btn_Nuevo_Materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Nuevo_MateriaActionPerformed(evt);
            }
        });

        btn_Eliminar_Materia.setText("Eliminar");
        btn_Eliminar_Materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Eliminar_MateriaActionPerformed(evt);
            }
        });

        btn_Guardar_Materia.setText("Guardar");
        btn_Guardar_Materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Guardar_MateriaActionPerformed(evt);
            }
        });

        btn_Salir_Materia.setText("Salir");
        btn_Salir_Materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Salir_MateriaActionPerformed(evt);
            }
        });

        JT_AñoMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_AñoMateriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IF_MateriaLayout = new javax.swing.GroupLayout(IF_Materia.getContentPane());
        IF_Materia.getContentPane().setLayout(IF_MateriaLayout);
        IF_MateriaLayout.setHorizontalGroup(
            IF_MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IF_MateriaLayout.createSequentialGroup()
                .addGroup(IF_MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IF_MateriaLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(IF_MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(IF_MateriaLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JT_CodigoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btn_Buscar_Cod_Materia))
                            .addGroup(IF_MateriaLayout.createSequentialGroup()
                                .addGroup(IF_MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(IF_MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JT_AñoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JT_NombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RB_Activo_Materia)))))
                    .addGroup(IF_MateriaLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btn_Nuevo_Materia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Eliminar_Materia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Guardar_Materia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Salir_Materia))
                    .addGroup(IF_MateriaLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel7)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        IF_MateriaLayout.setVerticalGroup(
            IF_MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IF_MateriaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addGap(38, 38, 38)
                .addGroup(IF_MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(JT_CodigoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Buscar_Cod_Materia))
                .addGap(18, 18, 18)
                .addGroup(IF_MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(JT_NombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(IF_MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(JT_AñoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(IF_MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(RB_Activo_Materia))
                .addGap(33, 33, 33)
                .addGroup(IF_MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Nuevo_Materia)
                    .addComponent(btn_Eliminar_Materia)
                    .addComponent(btn_Guardar_Materia)
                    .addComponent(btn_Salir_Materia))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jDesktopPane1.add(IF_Materia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 440));

        IF_Administracion.setClosable(true);
        IF_Administracion.setIconifiable(true);
        IF_Administracion.setMaximizable(true);
        IF_Administracion.setPreferredSize(new java.awt.Dimension(450, 450));
        IF_Administracion.setVisible(true);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Formulario de Inscripcion");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Seleccione un alumno:");

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Listado de Materias");

        jRadioButton1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jRadioButton1.setText("Materias Inscriptas");

        jRadioButton2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jRadioButton2.setText("Materias no Inscriptas");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Inscribir");

        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setText("Anular Inscripcion");

        jButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton3.setText("Salir");

        javax.swing.GroupLayout IF_AdministracionLayout = new javax.swing.GroupLayout(IF_Administracion.getContentPane());
        IF_Administracion.getContentPane().setLayout(IF_AdministracionLayout);
        IF_AdministracionLayout.setHorizontalGroup(
            IF_AdministracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IF_AdministracionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(130, 130, 130))
            .addGroup(IF_AdministracionLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton1)
                .addGap(67, 67, 67)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(28, 28, 28))
            .addGroup(IF_AdministracionLayout.createSequentialGroup()
                .addGroup(IF_AdministracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IF_AdministracionLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel9))
                    .addGroup(IF_AdministracionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(41, 41, 41)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IF_AdministracionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IF_AdministracionLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jRadioButton1)
                        .addGap(28, 28, 28)
                        .addComponent(jRadioButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IF_AdministracionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        IF_AdministracionLayout.setVerticalGroup(
            IF_AdministracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IF_AdministracionLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(IF_AdministracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addGap(31, 31, 31)
                .addGroup(IF_AdministracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(IF_AdministracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(0, 41, Short.MAX_VALUE))
        );

        jDesktopPane1.add(IF_Administracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 400));

        IF_Consultas.setClosable(true);
        IF_Consultas.setIconifiable(true);
        IF_Consultas.setMaximizable(true);
        IF_Consultas.setTitle("Consulta Alumnos por Materia");
        IF_Consultas.setVisible(true);

        jLabel7.setText("Seleccione una materia:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Listado de Alumnos por Materia");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "Apellido", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
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
        SP_Tabla.setViewportView(jTable1);

        btn_Salir_Consults.setText("Salir");
        btn_Salir_Consults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir(evt);
            }
        });

        CB_Seleccion_Materia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout IF_ConsultasLayout = new javax.swing.GroupLayout(IF_Consultas.getContentPane());
        IF_Consultas.getContentPane().setLayout(IF_ConsultasLayout);
        IF_ConsultasLayout.setHorizontalGroup(
            IF_ConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IF_ConsultasLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(IF_ConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SP_Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addGroup(IF_ConsultasLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(78, 78, 78)
                        .addComponent(CB_Seleccion_Materia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_Salir_Consults, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        IF_ConsultasLayout.setVerticalGroup(
            IF_ConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IF_ConsultasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(28, 28, 28)
                .addGroup(IF_ConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CB_Seleccion_Materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SP_Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addComponent(btn_Salir_Consults)
                .addContainerGap())
        );

        jDesktopPane1.add(IF_Consultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 400));

        getContentPane().add(jDesktopPane1);

        Menu_Nav.setPreferredSize(new java.awt.Dimension(320, 24));

        JM_Alumno.setText("Alumno");

        form_alumno.setText("Formulario de Alumno");
        form_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                form_alumnoActionPerformed(evt);
            }
        });
        JM_Alumno.add(form_alumno);

        Menu_Nav.add(JM_Alumno);

        JM_Materia.setText("Materia");

        form_materia.setText("Formulario de Materia");
        JM_Materia.add(form_materia);

        Menu_Nav.add(JM_Materia);

        JM_Admin.setText("Administración");

        form_manejoInscripciones.setText("Manejo de Inscripciones");
        JM_Admin.add(form_manejoInscripciones);

        form_modNotas.setText("Modificación de Notas");
        JM_Admin.add(form_modNotas);

        Menu_Nav.add(JM_Admin);

        JM_Consultas.setText("Consultas");

        consulta_alumMaterias.setText("Alumnos por Materias");
        JM_Consultas.add(consulta_alumMaterias);

        Menu_Nav.add(JM_Consultas);

        JM_Salir.setText("Salir");
        JM_Salir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        opcionSalir.setText("Salir de la Aplicación");
        JM_Salir.add(opcionSalir);

        Menu_Nav.add(JM_Salir);

        setJMenuBar(Menu_Nav);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void form_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_form_alumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_form_alumnoActionPerformed


    private void salir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir
        // TODO add your handling code here:
    }//GEN-LAST:event_salir


    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    private void JT_CodigoMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_CodigoMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_CodigoMateriaActionPerformed

    private void btn_Nuevo_MateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Nuevo_MateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Nuevo_MateriaActionPerformed

    private void btn_Eliminar_MateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Eliminar_MateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Eliminar_MateriaActionPerformed

    private void btn_Guardar_MateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Guardar_MateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Guardar_MateriaActionPerformed

    private void btn_Salir_MateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Salir_MateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Salir_MateriaActionPerformed

    private void JT_AñoMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_AñoMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_AñoMateriaActionPerforme
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



    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionUniversidadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionUniversidadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionUniversidadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionUniversidadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionUniversidadGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_Seleccion_Materia;
    private javax.swing.JInternalFrame IF_Administracion;
    private javax.swing.JInternalFrame IF_Alumno;
    private javax.swing.JInternalFrame IF_Consultas;
    private javax.swing.JInternalFrame IF_Materia;
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

    private javax.swing.JScrollPane SP_Tabla;

    private javax.swing.JRadioButton RB_Activo_Materia;

    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Buscar_Cod_Materia;
    private javax.swing.JButton btn_Eliminar_Alumno;
    private javax.swing.JButton btn_Eliminar_Materia;
    private javax.swing.JButton btn_Guardar_Alumno;
    private javax.swing.JButton btn_Guardar_Materia;
    private javax.swing.JButton btn_Nuevo_Alumno;

    private javax.swing.JButton btn_Salir_Consults;

    private javax.swing.JButton btn_Nuevo_Materia;
    private javax.swing.JButton btn_Salir_Materia;

    private javax.swing.JMenuItem consulta_alumMaterias;
    private javax.swing.JMenuItem form_alumno;
    private javax.swing.JMenuItem form_manejoInscripciones;
    private javax.swing.JMenuItem form_materia;
    private javax.swing.JMenuItem form_modNotas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;

    private javax.swing.JTable jTable1;

    private javax.swing.JLabel jLabel9;

    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;


    private javax.swing.JMenuItem opcionSalir;
    // End of variables declaration//GEN-END:variables
}
