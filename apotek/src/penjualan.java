
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
public class penjualan extends javax.swing.JFrame {
    private final DefaultTableModel model;

    /**
     * Creates new form penjualan
     */
    public penjualan() {
        initComponents();
        model = new DefaultTableModel();
       tabelpenjualan.setModel(model);
        model.addColumn("KODE_PENJUALAN");
        model.addColumn("ID_PEGAWAI");
        model.addColumn("KODE_OBAT");
        model.addColumn("TANGGAL_PENJUALAN");
        model.addColumn("OBAT_TERJUAL");
       
     loadData();
    
    }
        public void loadData() {

        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        try {
            Connection c = (Connection) KoneksiDatabase.getKoneksi();
            Statement s = (Statement) c.createStatement();

            String sql = "SELECT * FROM penjualan";
            ResultSet r = s.executeQuery(sql);
            while (r.next()) {
                Object[] o = new Object[5];
                o[0] = r.getString("KODE_PENJUALAN");
                o[1] = r.getString("ID_PEGAWAI");
                o[2] = r.getString("KODE_OBAT");
                o[3] = r.getString("TANGGAL_PENJUALAN");
                o[4] = r.getString("OBAT_TERJUAL");
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
        jLabel6 = new javax.swing.JLabel();
        inputkdpenjualan = new javax.swing.JTextField();
        inputidpegawai = new javax.swing.JTextField();
        inputkdobat = new javax.swing.JTextField();
        inputtglpenjualan = new javax.swing.JTextField();
        inputobatterjual = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelpenjualan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PENJUALAN");

        jLabel2.setText("KODE PENJUALAN");

        jLabel3.setText("ID PEGAWAI");

        jLabel4.setText("KODE OBAT");

        jLabel5.setText("TANGGAL PENJUALAN");

        jLabel6.setText("OBAT TERJUAL");

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

        tabelpenjualan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "KODE PENJUALAN", "ID PEGAWAI", "KODE OBAT", "TANGGAL PENJUALAN", "OBAT TERJUAL"
            }
        ));
        tabelpenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelpenjualanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelpenjualan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputkdpenjualan)
                            .addComponent(inputidpegawai)
                            .addComponent(inputkdobat)
                            .addComponent(inputtglpenjualan)
                            .addComponent(inputobatterjual, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(54, 54, 54)
                        .addComponent(jButton2)
                        .addGap(53, 53, 53)
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
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputkdpenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputidpegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputkdobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inputtglpenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(inputobatterjual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String KODE_PENJUALAN = inputkdpenjualan.getText();
        String ID_PEGAWAI = inputidpegawai.getText();
        String KODE_OBAT = inputkdobat.getText();
        String TANGGAL_PENJUALAN = inputtglpenjualan.getText();
        String OBAT_TERJUAL = inputobatterjual.getText();
        
        try {
            Connection c = (Connection) KoneksiDatabase.getKoneksi();

            String sql = "INSERT INTO penjualan VALUES (?, ?, ?, ?, ?)";
            PreparedStatement p = (PreparedStatement) c.prepareStatement(sql);

            p.setString(1, KODE_PENJUALAN);
            p.setString(2, ID_PEGAWAI);
            p.setString(3, KODE_OBAT);
            p.setString(4, TANGGAL_PENJUALAN);
            p.setString(5, OBAT_TERJUAL);
           
            

            p.executeUpdate();
            p.close();
        } catch (SQLException e) {
            System.out.println("Terjadi Error");
        } finally {
            loadData();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
int i = tabelpenjualan.getSelectedRow();
        if (i == -1) {
            return;
        
        }
        String KODE_PENJUALAN = (String) model.getValueAt(i, 0);
        String ID_PEGAWAI = inputidpegawai.getText();
        String KODE_OBAT = inputkdobat.getText();
        String TANGGAL_PENJUALAN = inputtglpenjualan.getText();
        String OBAT_TERJUAL = inputobatterjual.getText();
        
        try {
            Connection c = (Connection) KoneksiDatabase.getKoneksi();
            String sql = "UPDATE penjualan SET ID_PEGAWAI = ?, KODE_OBAT = ?, TANGGAL_PENJUALAN = ?, OBAT_TERJUAL= ?WHERE KODE_PENJUALAN= ?";
            
            PreparedStatement p = (PreparedStatement) c.prepareStatement(sql);

            
            p.setString(1, KODE_PENJUALAN);
            p.setString(2, ID_PEGAWAI);
            p.setObject(3, KODE_OBAT);
            p.setString(4, TANGGAL_PENJUALAN);
            p.setString(5, OBAT_TERJUAL);
             p.executeUpdate();
            p.close();
        } catch (SQLException e) {
            System.out.println("Terjadi Error");

        } finally {
            loadData();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
int i = tabelpenjualan.getSelectedRow();
        if (i == -1) {
            return;
        }
        String KODE_PENJUALAN = (String) tabelpenjualan.getValueAt(i, 0);
        try {
            Connection c = (Connection) KoneksiDatabase.getKoneksi();
            String sql = "DELETE FROM penjualan WHERE KODE_PENJUALAN = ?";
            PreparedStatement p = (PreparedStatement) c.prepareStatement(sql);

            p.setString(1, KODE_PENJUALAN);

            p.executeUpdate();
            p.close();
        } catch (SQLException e) {
            System.err.println("Terjadi Error");
        } finally {
            loadData();
        }  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tabelpenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelpenjualanMouseClicked
int i = tabelpenjualan.getSelectedRow();
        if(i == -1){
            return;}
        String KODE_PENJUALAN = (String) model.getValueAt(i, 0);
        inputkdpenjualan.setText(KODE_PENJUALAN);
        
        String ID_PEGAWAI = (String) model.getValueAt(i, 1);
        inputidpegawai.setText(ID_PEGAWAI);
        
        String KODE_OBAT = (String)model.getValueAt(i, 2);
        inputkdobat.setText(KODE_OBAT);
               
        String TANGGAL_PENJUALAN = (String)model.getValueAt(i, 3);
        inputtglpenjualan.setText(TANGGAL_PENJUALAN);
               
        String OBAT_TERJUAL = (String)model.getValueAt(i, 4);
        inputobatterjual.setText(OBAT_TERJUAL);
    }//GEN-LAST:event_tabelpenjualanMouseClicked

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
            java.util.logging.Logger.getLogger(penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new penjualan().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputidpegawai;
    private javax.swing.JTextField inputkdobat;
    private javax.swing.JTextField inputkdpenjualan;
    private javax.swing.JTextField inputobatterjual;
    private javax.swing.JTextField inputtglpenjualan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelpenjualan;
    // End of variables declaration//GEN-END:variables
}