package vista;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.AdminPenalizacionPrestamosBD;
import modelo.penalizacionprestamos;

public class FrmDiagAdminPenalizaciones extends javax.swing.JDialog {

    DefaultTableModel modeloTabla;
    AdminPenalizacionPrestamosBD objAdmPenaliBD = new AdminPenalizacionPrestamosBD();

    public FrmDiagAdminPenalizaciones(javax.swing.JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.configurarTabla();
        this.refrescarTabla();
    }

    private void configurarTabla() {
        String cabecera[] = {"ID", "Dias Retraso", "Valor Penali", "Fecha Generacion", "Pagada", "ID Prestamo"};
        String datos[][] = {};
        this.modeloTabla = new DefaultTableModel(datos, cabecera) {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };
        this.tblPenalizaciones.setModel(this.modeloTabla);
    }

    private void refrescarTabla() {
        this.modeloTabla.setNumRows(0);
        String filaDeTabla[] = new String[6];

        for (Object obj : objAdmPenaliBD.listarTodo()) {
            penalizacionprestamos objPenali = (penalizacionprestamos) obj;
            filaDeTabla[0] = Integer.toString(objPenali.getId());
            filaDeTabla[1] = Integer.toString(objPenali.getDias_retraso());
            filaDeTabla[2] = Double.toString(objPenali.getValor_penali());
            filaDeTabla[3] = objPenali.getFecha_generacion();
            filaDeTabla[4] = Integer.toString(objPenali.getPagada());
            filaDeTabla[5] = Integer.toString(objPenali.getPRESTAMOS_ACTIVO_PERSONA_id());
            this.modeloTabla.addRow(filaDeTabla);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPenalizaciones = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administrar Penalizaciones");

        jScrollPane1.setViewportView(tblPenalizaciones);

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    }// </editor-fold>

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {
        penalizacionprestamos objPenali = new penalizacionprestamos();
        FrmDiagAdminPenalizacionesAgregar objFrm = new FrmDiagAdminPenalizacionesAgregar((javax.swing.JFrame) null, true, objPenali);
        objFrm.setLocationRelativeTo(null);
        objFrm.setVisible(true);
        objAdmPenaliBD.insertar(objPenali);
        this.refrescarTabla();
    }

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {
        if (this.tblPenalizaciones.getSelectedRow() >= 0) {
            penalizacionprestamos objPenali = new penalizacionprestamos();
            int id = Integer.parseInt(this.tblPenalizaciones.getValueAt(this.tblPenalizaciones.getSelectedRow(), 0).toString());
            objPenali.setId(id);
            objPenali = (penalizacionprestamos) objAdmPenaliBD.listarUno(objPenali);

            FrmDiagAdminPenalizacionesModificar objFrm = new FrmDiagAdminPenalizacionesModificar((javax.swing.JFrame) null, true, objPenali);
            objFrm.setLocationRelativeTo(null);
            objFrm.setVisible(true);

            objAdmPenaliBD.actualizar(objPenali);
            this.refrescarTabla();
        } else {
            JOptionPane.showMessageDialog(this, "!!! Por favor, seleccione una Penalización !!!");
        }
    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {
        if (this.tblPenalizaciones.getSelectedRow() >= 0) {
            int respuesta = JOptionPane.showConfirmDialog(this, "¿Está seguro que quiere eliminar esta penalización?", "Eliminar", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                penalizacionprestamos objPenali = new penalizacionprestamos();
                int id = Integer.parseInt(this.tblPenalizaciones.getValueAt(this.tblPenalizaciones.getSelectedRow(), 0).toString());
                objPenali.setId(id);
                if (objAdmPenaliBD.eliminar(objPenali)) {
                    JOptionPane.showMessageDialog(this, "!!! La penalización se eliminó exitosamente !!!");
                } else {
                    JOptionPane.showMessageDialog(this, "!!! No se pudo eliminar la penalización !!!");
                }
                this.refrescarTabla();
            }
        } else {
            JOptionPane.showMessageDialog(this, "!!! Por favor, seleccione una Penalización !!!");
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
    private javax.swing.JTable tblPenalizaciones;
    // End of variables declaration
}