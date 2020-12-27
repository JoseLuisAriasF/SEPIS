/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.ClsConexion;
import Datos.D_Usuario;
import Entidad.E_Usuario;
import Entidad.PersonaDNI;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
/**
 *
 * @author Administrador
 */
public class frmUsuario extends javax.swing.JPanel {
    
    D_Usuario func = new D_Usuario();
    ClsConexion conect = new ClsConexion();
    Connection cn = conect.conectar();
    private String idUsuario;
    
    public frmUsuario() {
        initComponents();
        actualizar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtdni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtcontraseña = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbcargo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbestado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablalistado = new javax.swing.JTable();
        btneliminar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 36, 170, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DNI:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
        add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 170, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 86, -1, -1));
        add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 196, 170, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 166, -1, -1));
        add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 276, 170, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telefono");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 246, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Usuario:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 6, -1, -1));
        add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 36, 170, 30));
        add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 116, 170, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cargo:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 166, -1, -1));

        cbcargo.setForeground(new java.awt.Color(255, 255, 255));
        cbcargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "TUTOR" }));
        add(cbcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 196, -1, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contraseña:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 86, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Estado:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 246, -1, -1));

        cbestado.setForeground(new java.awt.Color(255, 255, 255));
        cbestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVO", "INACTIVO" }));
        add(cbestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 276, -1, 30));

        Tablalistado.setModel(new javax.swing.table.DefaultTableModel(
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
        Tablalistado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablalistadoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(Tablalistado);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 36, 500, 340));

        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 346, 100, 40));

        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 346, 100, 40));

        btneditar.setText("EDITAR");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });
        add(btneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 346, 100, 40));

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        E_Usuario dts = new E_Usuario();
        D_Usuario func = new D_Usuario();

        //     dts.setIdlibro(idUsuario.getText());
        //      dts.setAutor(txtautor.getText());
        dts.setIdusuario(Integer.parseInt(idUsuario));
        
        JOptionPane.showMessageDialog(null, "Eliminado");
        
        func.eliminar(dts);
        actualizar();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        E_Usuario dts = new E_Usuario();
        D_Usuario func = new D_Usuario();
        
        dts.setDni(txtdni.getText());
        dts.setNombre(txtnombre.getText()+" "+txtapellido.getText());
        dts.setTelefono(txttelefono.getText());
        dts.setUsuario(txtusuario.getText());
        dts.setContraseña(txtcontraseña.getText());
        dts.setCargo(cbcargo.getSelectedItem().toString());
        dts.setEstado(cbestado.getSelectedItem().toString());
        
        JOptionPane.showMessageDialog(null, "Registrado Correctamente");
        func.insertar(dts);
        actualizar();
    }//GEN-LAST:event_btnguardarActionPerformed
    public void actualizar() {
        DefaultTableModel modelo;
        modelo = func.listar();
        Tablalistado.setModel(modelo);
    }
    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        E_Usuario dts = new E_Usuario();
        D_Usuario func = new D_Usuario();
        dts.setIdusuario(Integer.parseInt(idUsuario));
        dts.setDni(txtdni.getText());
        dts.setNombre(txtnombre.getText());
        dts.setTelefono(txttelefono.getText());
        dts.setUsuario(txtusuario.getText());
        dts.setContraseña(txtcontraseña.getText());
        dts.setCargo(cbcargo.getSelectedItem().toString());
        dts.setEstado(cbestado.getSelectedItem().toString());
        JOptionPane.showMessageDialog(null, "MODIFICADO");
        
        func.editar(dts);
        actualizar();
    }//GEN-LAST:event_btneditarActionPerformed

    private void TablalistadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablalistadoMousePressed
        int fila = Tablalistado.rowAtPoint(evt.getPoint());
        idUsuario = (Tablalistado.getValueAt(fila, 0).toString());
        txtdni.setText(Tablalistado.getValueAt(fila, 1).toString());
        txtnombre.setText(Tablalistado.getValueAt(fila, 2).toString());
        txttelefono.setText(Tablalistado.getValueAt(fila, 3).toString());
        txtcontraseña.setText(Tablalistado.getValueAt(fila, 4).toString());
        cbcargo.setSelectedItem(Tablalistado.getValueAt(fila, 5).toString());
        cbestado.setSelectedItem(Tablalistado.getValueAt(fila, 6).toString());
        //  txtApellidos.setText(Tablalistado.getValueAt(fila, 3).toString()); 
    }//GEN-LAST:event_TablalistadoMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
               String url = "https://api.reniec.cloud/dni/"+ txtdni.getText();
		String respuesta = "";
		try {
			respuesta = peticionHttpGet(url);
			//System.out.println("La respuesta es:\n" + respuesta);
                        
                        //JsonParser jp = new JsonParser();
                        Gson gson= new Gson();
                        
                        PersonaDNI per = gson.fromJson(respuesta,PersonaDNI.class);
                        txtnombre.setText(per.getNombres());
                        txtapellido.setText(per.getApellido_paterno()+" "+per.getApellido_materno());
                  //      System.out.println(per.getApellido_paterno());
                       //JsonElement root = jp.parse(new InputStreamReader((Input.Stream)request.getContent()));
                        
		} catch (Exception e) {
			// Manejar excepción
			e.printStackTrace();
		}
    }//GEN-LAST:event_jButton1ActionPerformed
    public static String peticionHttpGet(String urlParaVisitar) throws Exception {
        // Esto es lo que vamos a devolver
        StringBuilder resultado = new StringBuilder();
        // Crear un objeto de tipo URL
        URL url = new URL(urlParaVisitar);

        // Abrir la conexión e indicar que será de tipo GET
        HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
        conexion.setRequestMethod("GET");
        // Búferes para leer
        BufferedReader rd = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
        String linea;
        // Mientras el BufferedReader se pueda leer, agregar contenido a resultado
        while ((linea = rd.readLine()) != null) {
          resultado.append(linea);
        }
        // Cerrar el BufferedReader
        rd.close();
        // Regresar resultado, pero como cadena, no como StringBuilder
        return resultado.toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tablalistado;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JComboBox<String> cbcargo;
    private javax.swing.JComboBox<String> cbestado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcontraseña;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
