/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library_app;

import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class Login extends javax.swing.JFrame {
Connection conn;


   

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocale(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        userEdt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LoginBtn = new javax.swing.JButton();
        signupBtn = new javax.swing.JButton();
        remember = new javax.swing.JCheckBox();
        pass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setSize(new java.awt.Dimension(880, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_app/icons/library-3.png.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 131, 650, 526));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 29, 330, 52));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Login to your account");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 320, 42));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 93, 26));

        jLabel7.setBackground(new java.awt.Color(153, 0, 242));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_app/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 54, -1));

        userEdt.setBackground(new java.awt.Color(102, 102, 255));
        userEdt.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        userEdt.setForeground(new java.awt.Color(255, 255, 255));
        userEdt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        userEdt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        userEdt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userEdtMouseClicked(evt);
            }
        });
        jPanel2.add(userEdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 267, 50));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Password");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 83, 26));

        jLabel8.setBackground(new java.awt.Color(153, 0, 242));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_app/icons/icons8_Forgot_Password_50px_4.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 54, -1));

        LoginBtn.setBackground(new java.awt.Color(255, 102, 102));
        LoginBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        LoginBtn.setText("Login");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        jPanel2.add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 291, 52));

        signupBtn.setBackground(new java.awt.Color(102, 153, 255));
        signupBtn.setText("Signup");
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });
        jPanel2.add(signupBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 291, 50));

        remember.setText("Hiện mật khẩu");
        remember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rememberActionPerformed(evt);
            }
        });
        jPanel2.add(remember, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 136, 40));

        pass.setBackground(new java.awt.Color(102, 102, 255));
        pass.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 255, 255));
        pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 270, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 460, 810));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Welcome To");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 25, 498, 39));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 51, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Management Library");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 70, 498, 49));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void userEdtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userEdtMouseClicked
        // TODO add your handling code here:
//        userEdt.setText("");
    }//GEN-LAST:event_userEdtMouseClicked

    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        // TODO add your handling code here:
        Signup s=new Signup();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_signupBtnActionPerformed

//    private boolean validateLogin(){
//        String user=userEdt.getText().toString().trim();
//        String password=pass.getText().toString().trim();
//        if (user.equals("") || !user.matches("[a-z0-9_-]{6,12}$")) {
//            JOptionPane.showMessageDialog(rootPane, "Hãy nhập username!");
//            return false;
//        }
//        if (!password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$")) {
//            JOptionPane.showMessageDialog(rootPane, "Hãy nhập password");
//            return false;
//        }
//        return true;
//    }
    private void loginUS(){
           String user=userEdt.getText().toString().trim();
        String password=pass.getText().toString().trim();
        try {

                conn=ConnectDB.KetnoiDB();
            String sql="Select * From user Where username=? and password=? ";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, password);

            ResultSet rs=ps.executeQuery();
              
            if (rs.next()) {
                   
                Home h=new Home();
              
                h.setVisible(true);
                dispose();
                
                
            }else{
                JOptionPane.showMessageDialog(rootPane, "Tài khoản này chưa có!");
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    private void loginAD(){
//           String user=userEdt.getText().toString().trim();
//        String password=pass.getText().toString().trim();
//        try {
//
//                conn=ConnectDB.KetnoiDB();
//            String sql="Select username,password From user Where username=? and password=? and quyen=?";
//            PreparedStatement ps=conn.prepareStatement(sql);
//            ps.setString(1, user);
//            ps.setString(2, password);
//            ps.setString(3, "1");
//            ResultSet rs=ps.executeQuery();
//              
//            if (rs.next()) {
//                Home h1=new Home();
//                h1.setVisible(true);
//                dispose();
//
//                
//            }else{
//                JOptionPane.showMessageDialog(rootPane, "Tài khoản này chưa có!");
//            }
//            
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        // TODO add your handling code here:
//        loginAD();
        loginUS();
        
     
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void rememberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rememberActionPerformed
        // TODO add your handling code here:
        if(remember.isSelected()){
             pass.setEchoChar((char)0);
        }else{
            pass.setEchoChar('*');
        }
    }//GEN-LAST:event_rememberActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pass;
    private javax.swing.JCheckBox remember;
    private javax.swing.JButton signupBtn;
    private javax.swing.JTextField userEdt;
    // End of variables declaration//GEN-END:variables
}
