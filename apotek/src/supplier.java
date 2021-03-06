
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ivan
 */
public class supplier extends javax.swing.JFrame {
    private final DefaultTableModel model;

    /**
     * Creates new form supplier
     */
    public supplier() {
        initComponents();
         model = new DefaultTableModel();
       tabelsupplier.setModel(model);
        model.addColumn("NAMA_SUPPLIER");
        model.addColumn("ID_SUPPLIER");
        model.addColumn("NO_TELEPON");
        model.addColumn("ALAMAT");
       
     loadData();
    
    }
        public void loadData() {

        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        try {
            Connection c = (Connection) KoneksiDatabase.getKoneksi();
            Statement s = (Statement) c.createStatement();

            String sql = "SELECT * FROM supplier";
            ResultSet r = s.executeQuery(sql);
            while (r.next()) {
                Object[] o = new Object[4];
                o[0] = r.getString("ID_SUPPLIER");
                o[1] = r.getString("NAMA_SUPPLIER");
                o[2] = r.getString("NO_TELEPON");
                o[3] = r.getString("ALAMAT");
                model.addRow(o);
      }
            r.close();
            s.close();
        } catch (SQLException e) {

        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputidsupplier = new javax.swing.JTextField();
        inputnamasupplier = new javax.swing.JTextField();
        inputnotelp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputalamat = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelsupplier = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SUPPLIER");

        jLabel2.setText("ID SUPPLIER");

        jLabel3.setText("NAMA SUPPLIER");

        jLabel4.setText("NO TELEPON");

        jLabel5.setText("ALAMAT");

        inputalamat.setColumns(20);
        inputalamat.setRows(5);
        jScrollPane1.setViewportView(inputalamat);

        jButton1.setText("SIMPAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("UBAH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("HAPUS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tabelsupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID SUPPLIER", "NAMA SUPPLIER", "NO TELEPON", "ALAMAT"
            }
        ));
        tabelsupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelsupplierMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelsupplier);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jButton1))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addGap(59, 59, 59)
                                        .addComponent(jButton3))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(inputidsupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(inputnamasupplier)
                                        .addComponent(inputnotelp)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(inputidsupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(inputnamasupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addComponent(inputnotelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton2))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String ID_SUPPLIER = inputidsupplier.getText();
        String NAMA_SUPPLIER = inputnamasupplier.getText();
        String NO_TELEPON = inputnotelp.getText();
        String ALAMAT = inputalamat.getText();
       
        
        try {
            Connection c = (Connection) KoneksiDatabase.getKoneksi();

            String sql = "INSERT INTO supplier VALUES (?, ?, ?, ?)";
            PreparedStatement p = (PreparedStatement) c.prepareStatement(sql);

            p.setString(1, ID_SUPPLIER);
            p.setString(2, NAMA_SUPPLIER);
            p.setString(3, NO_TELEPON);
            p.setString(4, ALAMAT);
            

            p.executeUpdate();
            p.close();
        } catch (SQLException e) {
            System.out.println("Terjadi Error");
        } finally {
            loadData();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
int i = tabelsupplier.getSelectedRow();
        if (i == -1) {
            return;
        
        }
        String ID_SUPPLIER = (String) model.getValueAt(i, 0);
        String NAMA_SUPPLIER = inputnamasupplier.getText();
        String NO_TELEPON = inputnotelp.getText();
        String ALAMAT = inputalamat.getText();
        
        try {
            Connection c = (Connection) KoneksiDatabase.getKoneksi();
            String sql = "UPDATE supplier SET NAMA_SUPPLIER = ?, NO_TELEPON = ?, ALAMAT = ?WHERE ID_SUPPLIER= ?";
            
            PreparedStatement p = (PreparedStatement) c.prepareStatement(sql);

            
            p.setString(1, ID_SUPPLIER);
            p.setString(2, NAMA_SUPPLIER);
            p.setObject(3, NO_TELEPON);
            p.setString(4, ALAMAT);
             p.executeUpdate();
            p.close();
        } catch (SQLException e) {
            System.out.println("Terjadi Error");

        } finally {
            loadData();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
int i = tabelsupplier.getSelectedRow();
        if (i == -1) {
            return;
        }
        String ID_SUPPLIER = (String) tabelsupplier.getValueAt(i, 0);
        try {
            Connection c = (Connection) KoneksiDatabase.getKoneksi();
            String sql = "DELETE FROM supplier WHERE ID_SUPPLIER= ?";
            PreparedStatement p = (PreparedStatement) c.prepareStatement(sql);

            p.setString(1, ID_SUPPLIER);

            p.executeUpdate();
            p.close();
        } catch (SQLException e) {
            System.err.println("Terjadi Error");
        } finally {
            loadData();
        }  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tabelsupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelsupplierMouseClicked
int i = tabelsupplier.getSelectedRow();
        if(i == -1){
            return;}
        String ID_SUPPLIER = (String) model.getValueAt(i, 0);
        inputidsupplier.setText(ID_SUPPLIER);
        
        String NAMA_SUPPLIER = (String) model.getValueAt(i, 1);
        inputnamasupplier.setText(NAMA_SUPPLIER);
               
        String NO_TELEPON = (String)model.getValueAt(i, 2);
        inputnotelp.setText(NO_TELEPON);
        
        String ALAMAT = (String)model.getValueAt(i, 3);
        inputalamat.setText(ALAMAT);
    }//GEN-LAST:event_tabelsupplierMouseClicked

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
            java.util.logging.Logger.getLogger(supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new supplier().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea inputalamat;
    private javax.swing.JTextField inputidsupplier;
    private javax.swing.JTextField inputnamasupplier;
    private javax.swing.JTextField inputnotelp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelsupplier;
    // End of variables declaration//GEN-END:variables
}
