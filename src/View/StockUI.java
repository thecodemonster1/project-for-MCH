package View;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import View.ModStockUI;

/**
 *
 * @author theCodeMonster
 */
public class StockUI extends javax.swing.JFrame {

    public String[] header = new String[]{"Item ID", "Item Name", "Quantity", "Price", "Net Price", "Supplier"};
    DefaultTableModel dtm;
    int row, col;
    ModStockUI modStock;
    
    /**
     * Creates new form StockUI
     */
    public StockUI() {
        initComponents();
        showDetails();
        
        modStock = new ModStockUI();
        
        

    }

//================================================Functions======================================================
    public void showDetails() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mch", "root", "");

            Statement st = null;
            // sql query
            String query = "SELECT * FROM stocktable";
            st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery(query);
            jTable1.setModel(DbUtils.resultSetToTableModel((ResultSet) rs));
            System.out.println("Connection Successfull...4\n");

        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
//================================================End Functions==================================================

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kButton1 = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();
        kButton3 = new com.k33ptoo.components.KButton();
        kButton4 = new com.k33ptoo.components.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kButton1.setBorder(null);
        kButton1.setText("Back");
        kButton1.setBorderPainted(false);
        kButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        kButton1.setkBorderRadius(50);
        kButton1.setkEndColor(new java.awt.Color(255, 0, 102));
        kButton1.setkHoverEndColor(new java.awt.Color(0, 255, 204));
        kButton1.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverStartColor(new java.awt.Color(0, 255, 102));
        kButton1.setkStartColor(new java.awt.Color(204, 0, 255));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 560, 100, 40));

        kButton2.setBorder(null);
        kButton2.setText("Update");
        kButton2.setBorderPainted(false);
        kButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        kButton2.setkBorderRadius(50);
        kButton2.setkEndColor(new java.awt.Color(255, 102, 0));
        kButton2.setkHoverEndColor(new java.awt.Color(102, 255, 153));
        kButton2.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton2.setkHoverStartColor(new java.awt.Color(51, 255, 255));
        kButton2.setkStartColor(new java.awt.Color(204, 51, 0));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 120, 40));

        kButton3.setBorder(null);
        kButton3.setText("Delete");
        kButton3.setBorderPainted(false);
        kButton3.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        kButton3.setkBorderRadius(50);
        kButton3.setkEndColor(new java.awt.Color(255, 102, 0));
        kButton3.setkHoverEndColor(new java.awt.Color(102, 255, 153));
        kButton3.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton3.setkHoverStartColor(new java.awt.Color(51, 255, 255));
        kButton3.setkStartColor(new java.awt.Color(204, 51, 0));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 120, 40));

        kButton4.setBorder(null);
        kButton4.setText("Search");
        kButton4.setBorderPainted(false);
        kButton4.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        kButton4.setkBorderRadius(50);
        kButton4.setkEndColor(new java.awt.Color(255, 102, 0));
        kButton4.setkHoverEndColor(new java.awt.Color(102, 255, 153));
        kButton4.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton4.setkHoverStartColor(new java.awt.Color(51, 255, 255));
        kButton4.setkStartColor(new java.awt.Color(204, 51, 0));
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(kButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, 120, 40));

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 1114, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        ModStockUI modUI = new ModStockUI();
        modUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        ModStockUI mod = new ModStockUI();
        mod.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kButton2ActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        ModStockUI modUI = new ModStockUI();
        modUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kButton3ActionPerformed

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        searchUI search = new searchUI();
        search.setVisible(true);
        
    }//GEN-LAST:event_kButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        row = jTable1.getSelectedRow();
        System.out.println("Row = "+row);
        modStock.idBox.setText(dtm.getValueAt(row, 0).toString());
        modStock.nameBox.setText(dtm.getValueAt(row, 1).toString());
        modStock.quantityBox.setText(dtm.getValueAt(row, 2).toString());
        modStock.priceBox.setText(dtm.getValueAt(row, 3).toString());
        modStock.npriceBox.setText(dtm.getValueAt(row, 4).toString());
        modStock.suppBox.setText(dtm.getValueAt(row, 5).toString());
        
        
        
//        spIDBox.setText(dtm.getValueAt(row, 0).toString());
//        spNameBox.setText(dtm.getValueAt(row, 1).toString());
//        String category = dtm.getValueAt(row, 2).toString();
//        spBrandBox.setText(dtm.getValueAt(row, 3).toString());
//        spQuantityBox.setText(dtm.getValueAt(row, 4).toString());
//        for (int i = 0; i < (spCategoryBox.getItemCount()); i++) {
//            if (spCategoryBox.getItemAt(i).equalsIgnoreCase(category)) {
//                spCategoryBox.setSelectedIndex(i);
//            }
//        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(StockUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StockUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StockUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StockUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KButton kButton4;
    // End of variables declaration//GEN-END:variables
}
