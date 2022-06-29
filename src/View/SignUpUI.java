package View;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author theCodeMonster
 */
public class SignUpUI extends javax.swing.JFrame {


    /**
     * Creates new form SignUpUI
     */
    public SignUpUI() {
        initComponents();
        instance();
        jPanel1.setBackground(new Color(0f, 0f, 0f, 0.8f));

//        Date date = dateChooserPanel1.getDate();
    }

//===================================================Functions===================================================
    public String displayUsername() {
        String id = txtID.getText();
        String name = txtName.getText();
        String job = slctJob.getSelectedItem().toString();

        return "";
    }

    public String getDob() {
        String dob = slctYear.getSelectedItem().toString() + "-" + slctMonth.getSelectedItem().toString() + "-" + slctDay.getSelectedItem().toString();
        return dob;
    }

    public void instance() {
        lblDob.setText("Click this Button -->");
        slctYear.setSelectedIndex(100);

    }

    public void clearField() {
        txtID.setText("");
        txtName.setText("");
        lblDob.setText("");
        slctJob.setSelectedIndex(0);
        txtPhone.setText("");
        txtMail.setText("");
        txtPass.setText("");
        txtPass2.setText("");

    }

//===================================================End Functions===============================================
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        menu1 = new java.awt.Menu();
        menuItem1 = new java.awt.MenuItem();
        menuItem2 = new java.awt.MenuItem();
        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        jDateComponentFactory1 = new org.jdatepicker.JDateComponentFactory();
        jDatePickerUtil1 = new org.jdatepicker.util.JDatePickerUtil();
        utilCalendarModel1 = new org.jdatepicker.impl.UtilCalendarModel();
        utilDateModel1 = new org.jdatepicker.impl.UtilDateModel();
        jPanel1 = new javax.swing.JPanel();
        passlbl = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        txtPhone = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        slctJob = new javax.swing.JComboBox<>();
        slctYear = new javax.swing.JComboBox<>();
        slctMonth = new javax.swing.JComboBox<>();
        slctDay = new javax.swing.JComboBox<>();
        lblDob = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        kButton2 = new com.k33ptoo.components.KButton();
        txtPass2 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        jLabel7 = new javax.swing.JLabel();
        mailComboBox = new javax.swing.JComboBox<>();
        backgroundLbl = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        menu1.setLabel("menu1");

        menuItem1.setLabel("menuItem1");
        menu1.add(menuItem1);

        menuItem2.setLabel("menuItem2");
        menu1.add(menuItem2);

        popupMenu1.add(menu1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MCH");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passlbl.setFont(new java.awt.Font("Heiti TC", 2, 16)); // NOI18N
        passlbl.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(passlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 550, 30));

        jLabel14.setFont(new java.awt.Font("Heiti TC", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Phone");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 120, 30));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SignUp");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        txtMail.setBackground(new java.awt.Color(0, 0, 0));
        txtMail.setFont(new java.awt.Font("Publico Text", 0, 20)); // NOI18N
        txtMail.setForeground(new java.awt.Color(255, 255, 255));
        txtMail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtMail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMail.setName(""); // NOI18N
        jPanel1.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 299, 30));

        txtID.setBackground(new java.awt.Color(0, 0, 0));
        txtID.setFont(new java.awt.Font("Publico Text", 0, 20)); // NOI18N
        txtID.setForeground(new java.awt.Color(255, 255, 255));
        txtID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtID.setName(""); // NOI18N
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 299, 30));

        txtName.setBackground(new java.awt.Color(0, 0, 0));
        txtName.setFont(new java.awt.Font("Publico Text", 0, 20)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtName.setName(""); // NOI18N
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 299, 30));

        jLabel2.setFont(new java.awt.Font("Heiti TC", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EmployeeID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 98, 154, -1));

        txtPass.setBackground(new java.awt.Color(0, 0, 0));
        txtPass.setFont(new java.awt.Font("Publico Text", 0, 20)); // NOI18N
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setToolTipText("");
        txtPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtPass.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 298, 30));

        txtPhone.setBackground(new java.awt.Color(0, 0, 0));
        txtPhone.setFont(new java.awt.Font("Publico Text", 0, 20)); // NOI18N
        txtPhone.setForeground(new java.awt.Color(255, 255, 255));
        txtPhone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtPhone.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPhone.setName(""); // NOI18N
        jPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 299, 30));

        jLabel15.setFont(new java.awt.Font("Heiti TC", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Job Role");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 120, 20));

        jLabel6.setFont(new java.awt.Font("Heiti TC", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mail");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 120, 30));

        jLabel5.setFont(new java.awt.Font("Heiti TC", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 152, 120, -1));

        jLabel13.setFont(new java.awt.Font("Heiti TC", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("DOB");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 202, 120, -1));

        jLabel3.setFont(new java.awt.Font("Heiti TC", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Confirm Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 230, 30));

        slctJob.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        slctJob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Cashier", "Salesman", "Manager" }));
        jPanel1.add(slctJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 300, 30));

        slctYear.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        slctYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022" }));
        jPanel1.add(slctYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 90, 30));

        slctMonth.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        slctMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", " " }));
        jPanel1.add(slctMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 130, 30));

        slctDay.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        slctDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(slctDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, 70, 30));

        lblDob.setFont(new java.awt.Font("Lao Sangam MN", 0, 20)); // NOI18N
        lblDob.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 220, 30));

        jLabel4.setFont(new java.awt.Font("Lao Sangam MN", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Day");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, 70, 30));

        jLabel9.setFont(new java.awt.Font("Lao Sangam MN", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Year");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 70, 30));

        jLabel10.setFont(new java.awt.Font("Lao Sangam MN", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Month");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 70, 30));

        kButton2.setText("Get Date");
        kButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        kButton2.setkBorderRadius(30);
        kButton2.setkEndColor(new java.awt.Color(51, 255, 51));
        kButton2.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton2.setkHoverEndColor(new java.awt.Color(204, 0, 0));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(204, 0, 204));
        kButton2.setkPressedColor(new java.awt.Color(204, 204, 0));
        kButton2.setkStartColor(new java.awt.Color(51, 204, 0));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 90, 30));

        txtPass2.setBackground(new java.awt.Color(0, 0, 0));
        txtPass2.setFont(new java.awt.Font("Publico Text", 0, 20)); // NOI18N
        txtPass2.setForeground(new java.awt.Color(255, 255, 255));
        txtPass2.setToolTipText("");
        txtPass2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtPass2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 298, 30));

        jLabel11.setFont(new java.awt.Font("Heiti TC", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Password");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 121, 30));

        kButton1.setBackground(new java.awt.Color(0, 0, 0));
        kButton1.setText("Register");
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
        jPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 510, 135, 50));

        jLabel7.setFont(new java.awt.Font("Heiti TC", 2, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 255, 51));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 350, 40));

        mailComboBox.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        mailComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@gmail.com", "@yahoomail.com", "@outlook.com", "@icloud.com", "@my.sliit.lk", " " }));
        jPanel1.add(mailComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 170, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 980, 580));

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/background.png"))); // NOI18N
        getContentPane().add(backgroundLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed

        String strId = txtID.getText();
        String name = txtName.getText();
        String job = slctJob.getSelectedItem().toString();
        String strPhone = txtPhone.getText();
        String mail = txtMail.getText() + mailComboBox.getSelectedItem().toString();
        String pass = txtPass.getText();
        String pass2 = txtPass2.getText();

        if (((pass.equals(pass2)) && ((!pass.equals("")) || (!pass.isBlank()) || (!pass.isEmpty())))
                && ((!strId.equals("")) || (!strId.isBlank()) || (!strId.isEmpty()))
                && ((!name.equals("")) || (!name.isBlank()) || (!name.isEmpty()))
                && ((!getDob().equals("")) || (!getDob().isBlank()) || (!getDob().isEmpty()))
                && ((!strPhone.equals("")) || (!strPhone.isBlank() || (!strPhone.isEmpty())))
                && ((!mail.equals("")) || (!mail.isBlank() || (!mail.isEmpty())))) {

           
            try {
                int id = Integer.parseInt(strId);
                int phone = Integer.parseInt(txtPhone.getText());
                Connection conn;
                Statement st = null;
                int updateQuery = 0;
                // create our mysql database connection
                conn = DriverManager.getConnection("jdbc:mysql://localhost/mch", "root", "");
                Class.forName("com.mysql.cj.jdbc.Driver");

                // our SQL SELECT query. 
//            INSERT INTO createUser VALUES (10001, 'amhar', '2001-01-17', 'Admin'
//                    , 0776482727, 'amhar@gmail.com', 'amhar123');
                String query = "INSERT INTO createUser VALUES (" + id + ", '" + name + "', '" + getDob() + "', '" + job
                        + "', " + phone + ", '" + mail + "', '" + pass + "');";
                // create the java statement
                st = conn.createStatement();

                // execute the query, and get a java resultset
                updateQuery = st.executeUpdate(query);
//                JOptionPane.showMessageDialog(rootPane, "You Successfully Registered", "Success", 1);
                System.out.println("Connection Successfull...");

                passlbl.setText("");
                jLabel7.setText("You Successfully Registered");

                st.close();
                conn.close();

            } catch (Exception e) {
                System.err.println("Got an exception! ");
                System.err.println(e);
            }
            clearField();

            LogInUI login = new LogInUI();
            login.setVisible(true);
            this.setVisible(false);

        } else if (((pass.equals("")) || (pass.isEmpty()) || (pass2.equals("")) || (pass2.isEmpty()))
                && ((!strId.equals("")) || (!strId.isBlank()) || (!strId.isEmpty()))
                && ((!name.equals("")) || (!name.isBlank()) || (!name.isEmpty()))
                && ((!getDob().equals("")) || (!getDob().isBlank()) || (!getDob().isEmpty()))
                && ((!strPhone.equals("")) || (!strPhone.isBlank() || (!strPhone.isEmpty())))
                && ((!mail.equals("")) || (!mail.isBlank() || (!mail.isEmpty())))) {
            passlbl.setText("Password is cannot be empty");
//            txtPass2.setText("");
        } else if (!pass.equals(pass2)) {
            passlbl.setText("Password Doesn't Matched - ReEnter Password");
            txtPass2.setText("");
        } else if (((pass.equals("")) || (pass.isEmpty()) || (pass2.equals("")) || (pass2.isEmpty()))
                && ((strId.equals("")) || (strId.isBlank()) || (strId.isEmpty()))
                && ((name.equals("")) || (name.isBlank()) || (name.isEmpty()))
                && ((getDob().equals("")) || (getDob().isBlank()) || (getDob().isEmpty()))
                && ((strPhone.equals("")) || (strPhone.isBlank() || (strPhone.isEmpty())))
                && ((mail.equals("")) || (mail.isBlank() || (mail.isEmpty())))) {
            passlbl.setText("You must fill the all the fields");

        }

    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        lblDob.setText(getDob());
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
            java.util.logging.Logger.getLogger(SignUpUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLbl;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private org.jdatepicker.JDateComponentFactory jDateComponentFactory1;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private javax.swing.JLabel lblDob;
    private javax.swing.JComboBox<String> mailComboBox;
    private java.awt.Menu menu1;
    private java.awt.MenuItem menuItem1;
    private java.awt.MenuItem menuItem2;
    private javax.swing.JLabel passlbl;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JComboBox<String> slctDay;
    private javax.swing.JComboBox<String> slctJob;
    private javax.swing.JComboBox<String> slctMonth;
    private javax.swing.JComboBox<String> slctYear;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtPass2;
    private javax.swing.JTextField txtPhone;
    private org.jdatepicker.impl.UtilCalendarModel utilCalendarModel1;
    private org.jdatepicker.impl.UtilDateModel utilDateModel1;
    // End of variables declaration//GEN-END:variables
}

//========Date in SQL (myTry)======
//        Calendar s = dateChooserPanel1.getMinDate();
//        txtDob.setText(s.getTime().toString());
//        String dob = txtDob.getText();
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
//        Date dob = format.parse(("2001-01-17");
//        Date sqlDob = new Date( dob.getTime() );
//============SQL Query in JDBC===========
//try {
//                Connection conn;
//                Statement st = null;
//                int updateQuery = 0;
//
//                // create our mysql database connection
//                conn = DriverManager.getConnection("jdbc:mysql://localhost/mch", "root", "");
//                Class.forName("com.mysql.cj.jdbc.Driver");
//
//                // our SQL SELECT query. 
//                String query = "INSERT INTO createUser VALUES (" + id + ", '" + name + "', '" + getDob() + "', '" + job
//                        + "', " + phone + ", '" + mail + "', '" + pass + "');";
//
//                // create the java statement
//                st = conn.createStatement();
//
//                // execute the query, and get a java resultset
//                updateQuery = st.executeUpdate(query);
////                JOptionPane.showMessageDialog(rootPane, "You Successfully Registered", "Success", 1);
//                System.out.println("Connection Successfull...");
//
//                st.close();
//                conn.close();
//
//            } catch (Exception e) {
//                System.err.println("Got an exception! ");
//                JOptionPane.showMessageDialog(rootPane, "Got an exception! ", "Failiure", 0);
//                System.err.println(e);
//            }
//            clearField();
