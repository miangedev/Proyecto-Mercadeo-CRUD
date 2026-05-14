package vista;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.AdminRolBD;
import modelo.rol; 

public class FrmDiagAdminRol extends javax.swing.JDialog {

    DefaultTableModel modeloTabla;
    AdminRolBD objAdmRolDB = new AdminRolBD();

    public FrmDiagAdminRol(javax.swing.JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.configurarTabla();
        this.refrescarTabla();
    } 

    private void configurarTabla() {
        String cabecera[] = {"ID", "Nombre rol"};
        String datos[][] = {};
        this.modeloTabla = new DefaultTableModel(datos, cabecera) {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };
        this.tblRoles.setModel(this.modeloTabla);
    }

    private void refrescarTabla() {
        this.modeloTabla.setNumRows(0);
        String filaDeTabla[] = new String[2];

        for (Object obj : objAdmRolDB.listarTodo()) {
            rol objRol = (rol) obj; // Casteo a rol con minúscula
            filaDeTabla[0] = Integer.toString(objRol.getId());
            filaDeTabla[1] = objRol.getNombre_rol(); // Uso de getNombre_rol()
            this.modeloTabla.addRow(filaDeTabla);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRoles = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administrar Roles");

        jScrollPane1.setViewportView(tblRoles);

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(55, 55, 55)
                        .addComponent(btnModificar)
                        .addGap(65, 65, 65)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        rol objRol = new rol();
        // Se asume que estos Diags también usan la clase 'rol'
        FrmDiagAdminRolAgregar objFrmdiagARAgregar = new FrmDiagAdminRolAgregar((java.awt.Frame) null, true, objRol);        objFrmdiagARAgregar.setLocationRelativeTo(null);
        objFrmdiagARAgregar.setVisible(true);
        objAdmRolDB.insertar(objRol);
        this.refrescarTabla();
    }                                          

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        if (this.tblRoles.getSelectedRow() >= 0) {
            rol objRol = new rol();
            int idRol = Integer.parseInt(this.tblRoles.getValueAt(this.tblRoles.getSelectedRow(), 0).toString());
            objRol.setId(idRol);
            objRol = (rol) objAdmRolDB.listarUno(objRol);

            FrmdiagAdminRolModificar objFrmDiagARMod = new FrmdiagAdminRolModificar((java.awt.Frame) null, true, objRol);            objFrmDiagARMod.setLocationRelativeTo(null);
            objFrmDiagARMod.setVisible(true);

            objAdmRolDB.actualizar(objRol);
            this.refrescarTabla();
        } else {
            JOptionPane.showMessageDialog(this, "!!! Por favor, seleccione un Rol !!!");
        }
    }                                            

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (this.tblRoles.getSelectedRow() >= 0) {
            int respuesta = JOptionPane.showConfirmDialog(this, "¿Está seguro que quiere eliminar este rol?", "Eliminar", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                rol objRol = new rol();
                int idRol = Integer.parseInt(this.tblRoles.getValueAt(this.tblRoles.getSelectedRow(), 0).toString());
                objRol.setId(idRol);

                if (objAdmRolDB.eliminar(objRol)) {
                    JOptionPane.showMessageDialog(this, "!!! El rol se eliminó exitosamente !!!");
                } else {
                    JOptionPane.showMessageDialog(this, "!!! No se pudo eliminar el rol !!!");
                }
                this.refrescarTabla();
            }
        } else {
            JOptionPane.showMessageDialog(this, "!!! Por favor, seleccione un Rol !!!");
        }
    }                                           

    // Variables declaration - do not modify
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRoles;
    // End of variables declaration
}