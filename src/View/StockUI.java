package View;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author theCodeMonster
 */
public class StockUI extends javax.swing.JFrame {

    public String[] header = new String[]{"ItemID", "Item Name", "Quantity", "Price", "Net Price", "Suppliers"};
    DefaultTableModel dtm;
    public int row, col;

    /**
     * Creates new form StockUI
     */
    public StockUI() {
        initComponents();
        

        dtm = new DefaultTableModel(header, 0);
        showData();

        jTable1.setModel(dtm);
        this.setLocationRelativeTo(null);
    }

//==========================================Functions================================================================
    public void showData() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mch", "root", "");

            Statement st = conn.createStatement();
            // sql query
            String query = "SELECT * FROM stocktable";
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                String itemID = String.valueOf(rs.getInt("ItemID"));
                String itemName = rs.getString("Item Name");
                String quantity = String.valueOf(rs.getInt("Quantity"));
                String price = String.valueOf(rs.getDouble("Price"));
                String netPrice = String.valueOf(rs.getDouble("Net Price"));
                String supplier = rs.getString("Supplier");

                String[] tbData = {itemID, itemName, quantity, price, netPrice, supplier};
                DefaultTableModel dtm2 = (DefaultTableModel) jTable1.getModel();
                dtm2.addRow(tbData);

            }

        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

//==========================================End Functions============================================================
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 72, 1099, 563));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

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
    // End of variables declaration//GEN-END:variables

}
