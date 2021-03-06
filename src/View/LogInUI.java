package View;


import java.awt.Color;
import java.sql.*;
import java.net.URL;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author theCodeMonster
 */
public class LogInUI extends javax.swing.JFrame {


    /**
     * Creates new form LogInUI
     */
    public LogInUI() {
        initComponents();
        jPanel1.setBackground(new Color(0f, 0f, 0f, 0.9f));
    }
    
    public void exitUI(){
        this.setVisible(false);
    }
//==========================================Functions================================================================
    
    
//==========================================End Functions============================================================
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        empIDBox = new javax.swing.JTextField();
        passBox = new javax.swing.JPasswordField();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();
        lbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Kannada MN", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LogIn");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 150, 70));

        jLabel3.setFont(new java.awt.Font("Khmer MN", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 160, 30));

        jLabel4.setFont(new java.awt.Font("Khmer MN", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Employee ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 160, 30));

        empIDBox.setBackground(new java.awt.Color(0, 0, 0));
        empIDBox.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        empIDBox.setForeground(new java.awt.Color(255, 255, 255));
        empIDBox.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(empIDBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 210, 32));

        passBox.setBackground(new java.awt.Color(0, 0, 0));
        passBox.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        passBox.setForeground(new java.awt.Color(255, 255, 255));
        passBox.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(passBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 210, 32));

        kButton1.setBackground(new java.awt.Color(0, 0, 0));
        kButton1.setText("LogIn");
        kButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        kButton1.setkBorderRadius(50);
        kButton1.setkEndColor(new java.awt.Color(255, 153, 0));
        kButton1.setkHoverEndColor(new java.awt.Color(255, 255, 102));
        kButton1.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverStartColor(new java.awt.Color(255, 102, 102));
        kButton1.setkPressedColor(new java.awt.Color(0, 153, 153));
        kButton1.setkStartColor(new java.awt.Color(255, 51, 0));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 135, 50));

        kButton2.setBackground(new java.awt.Color(0, 0, 0));
        kButton2.setText("SignUp");
        kButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        kButton2.setkBorderRadius(50);
        kButton2.setkEndColor(new java.awt.Color(255, 153, 0));
        kButton2.setkHoverEndColor(new java.awt.Color(255, 255, 102));
        kButton2.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton2.setkHoverStartColor(new java.awt.Color(255, 102, 102));
        kButton2.setkPressedColor(new java.awt.Color(0, 153, 153));
        kButton2.setkStartColor(new java.awt.Color(255, 51, 0));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 135, 50));

        lbl.setFont(new java.awt.Font("Malayalam MN", 2, 18)); // NOI18N
        lbl.setForeground(new java.awt.Color(255, 0, 102));
        jPanel1.add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 330, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 420, 370));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed

        String strID = empIDBox.getText();
        int id = Integer.parseInt(strID);
        String pass = passBox.getText();
        
        
        
        try {
                if (strID.isEmpty()||strID.isBlank()){
                    id = 0;
                }
                Connection conn;
                Statement st = null;
                int updateQuery = 0;
                ResultSet rs = null;
                // create our mysql database connection
                conn = DriverManager.getConnection("jdbc:mysql://localhost/mch", "root", "");
                Class.forName("com.mysql.cj.jdbc.Driver");

                // our SQL SELECT query.
                String query = "SELECT * FROM createUser WHERE id="+id+" and password LIKE '"+pass+"';";
                // create the java statement
                st = conn.prepareStatement(query);

                // execute the query, and get a java resultset
//                updateQuery = st.executeUpdate(query);
                rs = (ResultSet) st.executeQuery(query);
                jTable1.setModel(DbUtils.resultSetToTableModel((ResultSet) rs));
                Object get = jTable1.getValueAt(0, 3);
                
//                switch (get.toString()){
//                    case "Admin": 
//                        MainUI main = new MainUI();
//                        main.setVisible(true);
////                        exitUI();
//                        break;
//                    case "Salesman":
//                        Invoice invoice = new Invoice();
//                        invoice.setVisible(true);
////                        exitUI();
//                        break;
//                    case "":
//                       lbl.setText("Incorrect Password or ID");
//                       break;
//                    
//                }
                
                
                
                if (get.toString().equals("Admin")){
                    MainUI main = new MainUI();
                    main.setVisible(true);
                    this.setVisible(false);
                } else if (get.toString().equals("Salesman")){
                    Invoice invc = new Invoice();
                    invc.setVisible(true);
                    this.setVisible(false);
                } else if (get.toString().isEmpty()){
                    lbl.setText("Incorrect Password or ID");
                }
                
//                JOptionPane.showMessageDialog(rootPane, get+"\tSuccess", "Success", 1);
                System.out.println("Connection Successfull...2\n");

                st.close();
                conn.close();

//            } catch (Exception e) {
//                System.err.println("Got an exception! ");
//                System.err.println(e);
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e5){
                lbl.setText("Incorrect Password or ID");
            } catch (SQLException e3){
                System.err.println("SQL Exception\n"+e3);
            } catch (ClassNotFoundException e4){
                
            } 
//            clearField();
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        SignUpUI signup = new SignUpUI();
        signup.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(LogInUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField empIDBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private javax.swing.JLabel lbl;
    private javax.swing.JPasswordField passBox;
    // End of variables declaration//GEN-END:variables
}
