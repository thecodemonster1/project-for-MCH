package View;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author theCodeMonster
 */
public class StockUI extends javax.swing.JFrame {
    
    public String[] header = new String[]{"Item ID", "Item Name", "Quantity", "Price", "Net Price", "Supplier"};
    DefaultTableModel dtm;
    public int row, col;

    /**
     * Creates new form StockUI
     */
    public StockUI() {
        initComponents();
        showDetails();
        
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

//            while (rs.next()) {
//
//                String spID = String.valueOf(rs.getInt("SparePartID"));
//                String spName = rs.getString("NameofItem");
//                String spCategory = rs.getString("Category");
//                String spBrand = rs.getString("Brand");
//                String spQuantity = String.valueOf(rs.getInt("Quantity"));
//
//                String[] tbData = {spID, spName, spCategory, spBrand, spQuantity};
//                DefaultTableModel dtm2 = (DefaultTableModel) jTable1.getModel();
//                dtm2.addRow(tbData);
//
//            }

        

        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
//================================================End Functions==================================================
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kButton1 = new com.k33ptoo.components.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kButton1.setText("Back");
        kButton1.setBorderPainted(false);
        kButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
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
        getContentPane().add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 560, 100, 40));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 42, 1114, 571));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        ModStockUI modUI = new ModStockUI();
        modUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kButton1ActionPerformed

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
    // End of variables declaration//GEN-END:variables
}
