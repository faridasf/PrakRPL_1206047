
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
public class pasien extends javax.swing.JFrame {
    private final DefaultTableModel model;

    /**
     * Creates new form pasien
     */
    public pasien() {
        initComponents();
        model = new DefaultTableModel();
       tabelpasien.setModel(model);
        model.addColumn("ID_PASIEN");
        model.addColumn("NAMA_PASIEN");
        model.addColumn("ALAMAT");
       
     loadData();
    
    }
        public void loadData() {

        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        try {
            Connection c = (Connection) KoneksiDatabase.getKoneksi();
            Statement s = (Statement) c.createStatement();

            String sql = "SELECT * FROM pasien";
            ResultSet r = s.executeQuery(sql);
            while (r.next()) {
                Object[] o = new Object[3];
                o[0] = r.getString("ID_PASIEN");
                o[1] = r.getString("NAMA_PASIEN");
                o[2] = r.getString("ALAMAT");
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
        inputidpasien = new javax.swing.JTextField();
        inputnamapasien = new javax.swing.JTextField();
        inputalamat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelpasien = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PASIEN");

        jLabel2.setText("ID PASIEN");

        jLabel3.setText("NAMA PASIEN");

        jLabel4.setText("ALAMAT");

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

        tabelpasien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID PASIEN", "NAMA PASIEN", "ALAMAT"
            }
        ));
        tabelpasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelpasienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelpasien);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(180, 180, 180))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputidpasien)
                            .addComponent(inputnamapasien)
                            .addComponent(inputalamat, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton1)
                        .addGap(53, 53, 53)
                        .addComponent(jButton2)
                        .addGap(61, 61, 61)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputidpasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputnamapasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String ID_PASIEN = inputidpasien.getText();
        String NAMA_PASIEN = inputnamapasien.getText();
        String ALAMAT = inputalamat.getText();
        
        
        try {
            Connection c = (Connection) KoneksiDatabase.getKoneksi();

            String sql = "INSERT INTO pasien VALUES (?, ?, ?)";
            PreparedStatement p = (PreparedStatement) c.prepareStatement(sql);

            p.setString(1, ID_PASIEN);
            p.setString(2, NAMA_PASIEN);
            p.setString(3, ALAMAT);
                      

            p.executeUpdate();
            p.close();
        } catch (SQLException e) {
            System.out.println("Terjadi Error");
        } finally {
            loadData();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  int i = tabelpasien.getSelectedRow();
        if (i == -1) {
            return;
        
        }
        String ID_PASIEN = (String) model.getValueAt(i, 0);
        String NAMA_PASIEN = inputnamapasien.getText();
        String ALAMAT = inputalamat.getText();
        
        try {
            Connection c = (Connection) KoneksiDatabase.getKoneksi();
            String sql = "UPDATE pasien SET NAMA_PASIEN = ?, ALAMAT = ? WHERE ID_PASIEN= ?";
            
            PreparedStatement p = (PreparedStatement) c.prepareStatement(sql);

            
            p.setString(1, ID_PASIEN);
            p.setString(2, NAMA_PASIEN);
            p.setString(3, ALAMAT);
             p.executeUpdate();
            p.close();
        } catch (SQLException e) {
            System.out.println("Terjadi Error");

        } finally {
            loadData();
        }
                                            

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
int i = tabelpasien.getSelectedRow();
        if (i == -1) {
            return;
        }
        String ID_PASIEN = (String) tabelpasien.getValueAt(i, 0);
        try {
            Connection c = (Connection) KoneksiDatabase.getKoneksi();
            String sql = "DELETE FROM pasien WHERE ID_PASIEN= ?";
            PreparedStatement p = (PreparedStatement) c.prepareStatement(sql);

            p.setString(1, ID_PASIEN);

            p.executeUpdate();
            p.close();
        } catch (SQLException e) {
            System.err.println("Terjadi Error");
        } finally {
            loadData();
        }  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tabelpasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelpasienMouseClicked
int i = tabelpasien.getSelectedRow();
        if(i == -1){
            return;}
        String ID_PASIEN = (String) model.getValueAt(i, 0);
        inputidpasien.setText(ID_PASIEN);
        
        String NAMA_PASIEN = (String) model.getValueAt(i, 1);
        inputnamapasien.setText(NAMA_PASIEN);
               
        String ALAMAT = (String)model.getValueAt(i, 3);
        inputalamat.setText(ALAMAT);
    }//GEN-LAST:event_tabelpasienMouseClicked

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
            java.util.logging.Logger.getLogger(pasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pasien().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputalamat;
    private javax.swing.JTextField inputidpasien;
    private javax.swing.JTextField inputnamapasien;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelpasien;
    // End of variables declaration//GEN-END:variables

    
}
