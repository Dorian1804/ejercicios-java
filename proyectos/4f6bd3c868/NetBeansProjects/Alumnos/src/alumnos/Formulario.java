/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package alumnos;

/**
 *
 * @author doria
 */
public class Formulario extends javax.swing.JFrame {

    public String aprobados;
    public String reprobados;
    private ArrayList<String[]> records;  // ArrayList para almacenar los registros

    public Formulario() {
        initComponents();
        this.getContentPane().setBackground(Color.pink);
        records = new ArrayList<>();  // Inicialización del ArrayList
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbogrupos = new javax.swing.JComboBox<>();
        txtaprobados = new javax.swing.JTextField();
        txtreprobados = new javax.swing.JTextField();
        btnaceptar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24));
        jLabel1.setText("Total");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24));
        jLabel2.setText("Fecha");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24));
        jLabel3.setText("Grupo");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24));
        jLabel4.setText("Calificaciones");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24));
        jLabel5.setText("Aprobado");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24));
        jLabel6.setText("Reprobado");

        cbogrupos.setFont(new java.awt.Font("Segoe UI", 0, 18));
        cbogrupos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3A1", "3B1", "3C1", "3E1" }));

        txtaprobados.setFont(new java.awt.Font("Segoe UI", 0, 24));
        txtaprobados.setText("0");

        txtreprobados.setFont(new java.awt.Font("Segoe UI", 0, 24));
        txtreprobados.setText("0");

        btnaceptar.setFont(new java.awt.Font("Segoe UI", 0, 24));
        btnaceptar.setText("Aceptar");
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });

        btnlimpiar.setFont(new java.awt.Font("Segoe UI", 0, 24));
        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btnsalir.setFont(new java.awt.Font("Segoe UI", 0, 24));
        btnsalir.setText("Salir");
        btnsalir.addActionListener(evt -> System.exit(0));

        lblTotal.setFont(new java.awt.Font("Segoe UI", 0, 24));
        lblTotal.setText("0");

        // Layout code
        // ...

        pack();
    }

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        txtaprobados.setText("0");
        txtreprobados.setText("0");
        cbogrupos.setSelectedIndex(0);
        lblTotal.setText("0");  // Reset total label
    }

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int aprobados = Integer.parseInt(txtaprobados.getText());
            int reprobados = Integer.parseInt(txtreprobados.getText());
            int total = aprobados + reprobados;
            lblTotal.setText(String.valueOf(total));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese números válidos para aprobados y reprobados.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Formulario().setVisible(true);
        });
    }

    // Variables declaration
    private javax.swing.JButton btnaceptar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cbogrupos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtaprobados;
    private javax.swing.JTextField txtreprobados;
    // End of variables declaration
}


    /**
     * Creates new form Formulario
     */
    public Formulario() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
