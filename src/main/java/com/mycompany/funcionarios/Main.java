/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.funcionarios;

import controller.FuncionarioController;
import domain.Funcionario;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ANGELA
 */
public class Main extends javax.swing.JFrame {

    private final FuncionarioController funcionarioController;
    private final static String[] COLUMNS = {"ID", "IDENTIFICACION", "NOMBRE", "APELLIDO", "GENERO", "DIRECCION", "TELEFONO",
        "F. NACIMIENRO", "F. CREACION", "F. ACTUALIZACION", "ESTADO CIVIL", "TIPO DOCUMENTO"};
    private final static String SELECCIONE = "--SELECCIONE--";

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        txtideEdit.setEditable(false);
        funcionarioController = new FuncionarioController();
        listOfficial();
        addListener();
    }

    private void listOfficial() {

        cbxFuncion.removeAllItems();
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNombres(SELECCIONE);
        funcionario1.setApellidos("");
        cbxFuncion.addItem(funcionario1);
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        for (String COLUMN : COLUMNS) {
            defaultTableModel.addColumn(COLUMN);
        }

        TableFuncionarios.setModel(defaultTableModel);
        try {
            List<Funcionario> funcionarios = funcionarioController.obtenerFuncionarios();
            if (funcionarios.isEmpty()) {
                return;
            }
            defaultTableModel.setRowCount((funcionarios.size()));
            int row = 0;
            for (Funcionario funcionario : funcionarios) {
                defaultTableModel.setValueAt(funcionario.getFuncionario_id(), row, 0);
                defaultTableModel.setValueAt(funcionario.getNumero_identificacion(), row, 1);
                defaultTableModel.setValueAt(funcionario.getNombres(), row, 2);
                defaultTableModel.setValueAt(funcionario.getApellidos(), row, 3);
                defaultTableModel.setValueAt(funcionario.getGenero(), row, 4);
                defaultTableModel.setValueAt(funcionario.getDireccion(), row, 5);
                defaultTableModel.setValueAt(funcionario.getTelefono(), row, 6);
                defaultTableModel.setValueAt(funcionario.getFecha_nacimiento(), row, 7);
                defaultTableModel.setValueAt(funcionario.getFecha_creacion(), row, 8);
                defaultTableModel.setValueAt(funcionario.getFecha_actualizacion(), row, 9);
                defaultTableModel.setValueAt(funcionario.getEstado_civil_id(), row, 10);
                defaultTableModel.setValueAt(funcionario.getTipo_documento_id(), row, 11);
                row++;

                cbxFuncion.addItem(funcionario);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }

    private void addListener() {
        cbxFuncion.addItemListener(event -> {
            Funcionario selectedFun = (Funcionario) event.getItem();
            if (selectedFun.getNombres().equals(SELECCIONE)) {
                txtideEdit.setText("");
                txtFuncionarioEdit.setText("");
                txtnombreEdit.setText("");
                txtapellidoEdit.setText("");
                txtgeneEdit.setText("");
                txtdireccionEdit.setText("");
                txtteleEdit.setText("");
                txtnaciEdit.setText("");
                txtcreaEdit.setText("");
                txtactualEdit.setText("");
                txtcivilEdit.setText("");
                txttipoEdit.setText("");

            } else {
                txtideEdit.setText(String.valueOf(selectedFun.getFuncionario_id()));
                txtFuncionarioEdit.setText(String.valueOf(selectedFun.getNumero_identificacion()));
                txtnombreEdit.setText(selectedFun.getNombres());
                txtapellidoEdit.setText(selectedFun.getApellidos());
                txtgeneEdit.setText(selectedFun.getGenero());
                txtdireccionEdit.setText(selectedFun.getDireccion());
                txtteleEdit.setText(String.valueOf(selectedFun.getTelefono()));
                txtnaciEdit.setText(String.valueOf(selectedFun.getFecha_nacimiento()));
                txtcreaEdit.setText(String.valueOf(selectedFun.getFecha_creacion()));
                txtactualEdit.setText(String.valueOf(selectedFun.getFecha_actualizacion()));
                txtcivilEdit.setText(String.valueOf(selectedFun.getEstado_civil_id()));
                txttipoEdit.setText(String.valueOf(selectedFun.getTipo_documento_id()));
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanes = new javax.swing.JTabbedPane();
        jPFun1 = new javax.swing.JPanel();
        jpFun3 = new javax.swing.JPanel();
        lblide = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblapellido = new javax.swing.JLabel();
        lblgene = new javax.swing.JLabel();
        lbldireccion = new javax.swing.JLabel();
        lbltele = new javax.swing.JLabel();
        lblnaci = new javax.swing.JLabel();
        txtFuncionarop = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtgene = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txttele = new javax.swing.JTextField();
        txtnaci = new javax.swing.JTextField();
        lblcrea = new javax.swing.JLabel();
        lblactua = new javax.swing.JLabel();
        lblcivil = new javax.swing.JLabel();
        lbltipo = new javax.swing.JLabel();
        txtcrea = new javax.swing.JTextField();
        txtactua = new javax.swing.JTextField();
        txtcivil = new javax.swing.JTextField();
        txttipo = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtide = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableFuncionarios = new javax.swing.JTable();
        jPFun2 = new javax.swing.JPanel();
        jPFun3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbxFuncion = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFuncionarioEdit = new javax.swing.JTextField();
        txtnombreEdit = new javax.swing.JTextField();
        txtgeneEdit = new javax.swing.JTextField();
        txtapellidoEdit = new javax.swing.JTextField();
        txtdireccionEdit = new javax.swing.JTextField();
        txtteleEdit = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtnaciEdit = new javax.swing.JTextField();
        txtcreaEdit = new javax.swing.JTextField();
        txtactualEdit = new javax.swing.JTextField();
        txtcivilEdit = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txttipoEdit = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtideEdit = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("FUNCIONARIOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 120, -1));

        jpFun3.setBorder(javax.swing.BorderFactory.createTitledBorder("Digite los siguientes campos"));

        lblide.setText("N. Identificacion");

        lblnombre.setText("Nombres");

        lblapellido.setText("Apellidos");

        lblgene.setText("Genero");

        lbldireccion.setText("Direccion");

        lbltele.setText("Telefono");

        lblnaci.setText("F. Nacimiento");

        lblcrea.setText("F. Creacion");

        lblactua.setText("F. Actualizacion");

        lblcivil.setText("Estado Civil");

        lbltipo.setText("Tipo Documento");

        btnCrear.setText("Guardar");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jLabel14.setText("ID");

        javax.swing.GroupLayout jpFun3Layout = new javax.swing.GroupLayout(jpFun3);
        jpFun3.setLayout(jpFun3Layout);
        jpFun3Layout.setHorizontalGroup(
            jpFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFun3Layout.createSequentialGroup()
                .addGroup(jpFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpFun3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel14))
                    .addGroup(jpFun3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbltele))
                    .addComponent(txttele, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(txtide))
                .addGroup(jpFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFun3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jpFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpFun3Layout.createSequentialGroup()
                                .addGroup(jpFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnaci)
                                    .addComponent(txtnaci, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcrea, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblcrea))
                                .addGap(31, 31, 31)
                                .addGroup(jpFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblactua)
                                    .addComponent(txtactua, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jpFun3Layout.createSequentialGroup()
                                .addGroup(jpFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFuncionarop, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblide))
                                .addGap(28, 28, 28)
                                .addGroup(jpFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnombre)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jpFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE))))
                    .addGroup(jpFun3Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(btnCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jpFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jpFun3Layout.createSequentialGroup()
                        .addGroup(jpFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblgene, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcivil, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jpFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttipo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpFun3Layout.createSequentialGroup()
                        .addGroup(jpFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFun3Layout.createSequentialGroup()
                                .addComponent(lblcivil, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))
                            .addGroup(jpFun3Layout.createSequentialGroup()
                                .addComponent(txtgene, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)))
                        .addGroup(jpFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltipo))))
                .addContainerGap())
        );
        jpFun3Layout.setVerticalGroup(
            jpFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFun3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jpFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblide)
                    .addComponent(lblnombre)
                    .addComponent(lblapellido)
                    .addComponent(lblgene)
                    .addComponent(lbldireccion)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFuncionarop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtgene, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnaci)
                    .addComponent(lblcrea)
                    .addComponent(lblactua)
                    .addComponent(lblcivil)
                    .addComponent(lbltipo)
                    .addComponent(lbltele))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcrea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtactua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCrear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TableFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TableFuncionarios);

        javax.swing.GroupLayout jPFun1Layout = new javax.swing.GroupLayout(jPFun1);
        jPFun1.setLayout(jPFun1Layout);
        jPFun1Layout.setHorizontalGroup(
            jPFun1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPFun1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPFun1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPFun1Layout.createSequentialGroup()
                        .addComponent(jpFun3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPFun1Layout.setVerticalGroup(
            jPFun1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFun1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jpFun3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanes.addTab("Crear Funcionario", jPFun1);

        jPFun3.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificar Datos"));

        jLabel2.setText("FUNCIONARIOS");

        jLabel3.setText("N. Identificacion");

        jLabel4.setText("Nombres");

        jLabel5.setText("Apellidos");

        jLabel6.setText("Genero");

        jLabel7.setText("Direccion");

        jLabel8.setText("Telefono");

        jLabel9.setText("F. Nacimiento");

        jLabel10.setText("F. Creacion");

        jLabel11.setText("F. Actualizacion");

        jLabel12.setText("Estado Civil");

        jLabel13.setText("Tipo Documento");

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel15.setText("ID");

        javax.swing.GroupLayout jPFun3Layout = new javax.swing.GroupLayout(jPFun3);
        jPFun3.setLayout(jPFun3Layout);
        jPFun3Layout.setHorizontalGroup(
            jPFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFun3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cbxFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPFun3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPFun3Layout.createSequentialGroup()
                        .addGroup(jPFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPFun3Layout.createSequentialGroup()
                                .addComponent(txtideEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFuncionarioEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPFun3Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addGap(29, 29, 29))
                    .addGroup(jPFun3Layout.createSequentialGroup()
                        .addGroup(jPFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPFun3Layout.createSequentialGroup()
                                .addGroup(jPFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(txtteleEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addGroup(jPFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtnaciEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPFun3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnActualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)))
                .addGroup(jPFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPFun3Layout.createSequentialGroup()
                        .addGroup(jPFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPFun3Layout.createSequentialGroup()
                                .addGroup(jPFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel11)))
                            .addGroup(jPFun3Layout.createSequentialGroup()
                                .addGroup(jPFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtnombreEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcreaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(txtactualEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(jPFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12)
                            .addComponent(txtcivilEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPFun3Layout.createSequentialGroup()
                        .addComponent(txtapellidoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtgeneEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdireccionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPFun3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txttipoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel7)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPFun3Layout.setVerticalGroup(
            jPFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFun3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel15))
                .addGroup(jPFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPFun3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdireccionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtgeneEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtapellidoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombreEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFuncionarioEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtideEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnaciEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcreaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtactualEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcivilEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttipoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtteleEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 96, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPFun3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPFun3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnActualizar)
                            .addComponent(btnEliminar))
                        .addGap(30, 30, 30))))
        );

        javax.swing.GroupLayout jPFun2Layout = new javax.swing.GroupLayout(jPFun2);
        jPFun2.setLayout(jPFun2Layout);
        jPFun2Layout.setHorizontalGroup(
            jPFun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFun2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPFun3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPFun2Layout.setVerticalGroup(
            jPFun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFun2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPFun3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanes.addTab("Editar Funcionario", jPFun2);

        getContentPane().add(jPanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 660, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (txtideEdit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un funcionario de la lista");
            txtideEdit.requestFocus();
            return;
        }
        int opt = JOptionPane.showConfirmDialog(null, "Está seguro de eliminar este registro",
                "Confirmar salida",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opt == 0) {
            try {

                funcionarioController.eliminarFuncionario(Integer.parseInt(txtideEdit.getText()));
                txtideEdit.setText("");
                txtnombreEdit.setText("");
                txtapellidoEdit.setText("");
                txtgeneEdit.setText("");
                txtdireccionEdit.setText("");
                txtteleEdit.setText("");
                txtnaciEdit.setText("");
                txtcreaEdit.setText("");
                txtactualEdit.setText("");
                txtcivilEdit.setText("");
                txttipoEdit.setText("");
                listOfficial();

            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro");
    }//GEN-LAST:event_btnEliminarActionPerformed
    }
    }
        
    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        if (txtnombre.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el nombre");
            txtnombre.requestFocus();
            return;
        }

        if (txtapellido.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el apellido");
            txtapellido.requestFocus();
            return;
        }

        if (txtgene.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el género");
            txtgene.requestFocus();
            return;
        }

        if (txtdireccion.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite la dirección");
            txtdireccion.requestFocus();
            return;
        }

        if (txttele.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el teléfono");
            txttele.requestFocus();
            return;
        }

        if (txtnaci.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite la fecha de nacimiento");
            txtnaci.requestFocus();
            return;
        }

//        if (txtcrea.getText().trim().length() == 0) {
//            JOptionPane.showMessageDialog(null, "Digite la fecha de creación");
//            txtcrea.requestFocus();
//            return;
//        }
//
//        if (txtactua.getText().trim().length() == 0) {
//            JOptionPane.showMessageDialog(null, "Digite la fecha de actualización");
//            txtactua.requestFocus();
//            return;
//        }
        if (txtcivil.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el estado civil");
            txtcivil.requestFocus();
            return;
        }

        if (txttipo.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el tipo de documento");
            txttipo.requestFocus();
            return;
        }

        try {

            Funcionario funcionario = new Funcionario();
            funcionario.setNumero_identificacion(Integer.parseInt(txtFuncionarop.getText().trim()));
            funcionario.setNombres(txtnombre.getText().trim());
            funcionario.setApellidos(txtapellido.getText().trim());
            funcionario.setGenero(txtgene.getText().trim());
            funcionario.setDireccion(txtdireccion.getText().trim());
            funcionario.setTelefono(Long.parseLong(txttele.getText().trim()));

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            try {
                java.util.Date parsedDate = dateFormat.parse(txtnaci.getText().trim());
                java.sql.Date sqlDate = new java.sql.Date(parsedDate.getTime());
                funcionario.setFecha_nacimiento(sqlDate);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese una fecha de nacimiento válida (formato: dd/MM/yyyy)");
                txtnaci.requestFocus();
                return;
            }

            funcionario.setEstado_civil_id(Integer.parseInt(txtcivil.getText().trim()));
            funcionario.setTipo_documento_id(Integer.parseInt(txttipo.getText().trim()));

            funcionarioController.crear(funcionario);

            txtFuncionarop.setText("");
            txtnombre.setText("");
            txtapellido.setText("");
            txtgene.setText("");
            txtdireccion.setText("");
            txttele.setText("");
            txtnaci.setText("");
            txtcrea.setText("");
            txtactua.setText("");
            txtcivil.setText("");
            txttipo.setText("");

            listOfficial();
            JOptionPane.showMessageDialog(null, "El funcionario se ha creado con éxito");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        if (txtideEdit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un funcionario de la lista");
            txtideEdit.requestFocus();
            return;
        }
        if (txtnombreEdit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el nombre");
            txtnombreEdit.requestFocus();
            return;
        }

        if (txtapellidoEdit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el apellido");
            txtapellidoEdit.requestFocus();
            return;
        }

        if (txtgeneEdit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el género");
            txtgeneEdit.requestFocus();
            return;
        }

        if (txtdireccionEdit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite la dirección");
            txtdireccionEdit.requestFocus();
            return;
        }

        if (txtteleEdit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el teléfono");
            txtteleEdit.requestFocus();
            return;
        }

        if (txtnaciEdit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite la fecha de nacimiento");
            txtnaciEdit.requestFocus();
            return;
        }

        if (txtcreaEdit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite la fecha de creación");
            txtcreaEdit.requestFocus();
            return;
        }

        if (txtactualEdit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite la fecha de actualización");
            txtactualEdit.requestFocus();
            return;
        }
        if (txtcivilEdit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el estado civil");
            txtcivilEdit.requestFocus();
            return;
        }

        if (txttipoEdit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el tipo de documento");
            txttipoEdit.requestFocus();
            return;
        }

        Funcionario funcionario = new Funcionario();
        funcionario.setNumero_identificacion(Integer.parseInt(txtFuncionarioEdit.getText().trim()));
        funcionario.setNombres(txtnombreEdit.getText().trim());
        funcionario.setApellidos(txtapellidoEdit.getText().trim());
        funcionario.setGenero(txtgeneEdit.getText().trim());
        funcionario.setDireccion(txtdireccionEdit.getText().trim());
        funcionario.setTelefono(Long.parseLong(txtteleEdit.getText().trim()));

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            java.util.Date parsedDate = dateFormat.parse(txtnaciEdit.getText().trim());
            java.sql.Date sqlDate = new java.sql.Date(parsedDate.getTime());
            funcionario.setFecha_nacimiento(sqlDate);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese una fecha de nacimiento válida (formato: dd/MM/yyyy)");
            txtnaciEdit.requestFocus();
            return;
        }

        funcionario.setEstado_civil_id(Integer.parseInt(txtcivilEdit.getText().trim()));
        funcionario.setTipo_documento_id(Integer.parseInt(txttipoEdit.getText().trim()));

        int opt = JOptionPane.showConfirmDialog(null, "Desea actualizar el funcionario", "Confirmar salida",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (opt == 0) {

            try {

                funcionarioController.actualizarFuncionario(Integer.parseInt(txtideEdit.getText()), funcionario);

                txtideEdit.setText("");
                txtnombreEdit.setText("");
                txtapellidoEdit.setText("");
                txtgeneEdit.setText("");
                txtdireccionEdit.setText("");
                txtteleEdit.setText("");
                txtnaciEdit.setText("");
                txtcreaEdit.setText("");
                txtactualEdit.setText("");
                txtcivilEdit.setText("");
                txttipoEdit.setText("");

                listOfficial();
                JOptionPane.showMessageDialog(null, "El funcionario se ha actualizado con éxito");

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableFuncionarios;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<Funcionario> cbxFuncion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPFun1;
    private javax.swing.JPanel jPFun2;
    private javax.swing.JPanel jPFun3;
    private javax.swing.JTabbedPane jPanes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpFun3;
    private javax.swing.JLabel lblactua;
    private javax.swing.JLabel lblapellido;
    private javax.swing.JLabel lblcivil;
    private javax.swing.JLabel lblcrea;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lblgene;
    private javax.swing.JLabel lblide;
    private javax.swing.JLabel lblnaci;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lbltele;
    private javax.swing.JLabel lbltipo;
    private javax.swing.JTextField txtFuncionarioEdit;
    private javax.swing.JTextField txtFuncionarop;
    private javax.swing.JTextField txtactua;
    private javax.swing.JTextField txtactualEdit;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtapellidoEdit;
    private javax.swing.JTextField txtcivil;
    private javax.swing.JTextField txtcivilEdit;
    private javax.swing.JTextField txtcrea;
    private javax.swing.JTextField txtcreaEdit;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdireccionEdit;
    private javax.swing.JTextField txtgene;
    private javax.swing.JTextField txtgeneEdit;
    private javax.swing.JTextField txtide;
    private javax.swing.JTextField txtideEdit;
    private javax.swing.JTextField txtnaci;
    private javax.swing.JTextField txtnaciEdit;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnombreEdit;
    private javax.swing.JTextField txttele;
    private javax.swing.JTextField txtteleEdit;
    private javax.swing.JTextField txttipo;
    private javax.swing.JTextField txttipoEdit;
    // End of variables declaration//GEN-END:variables
}
