/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library_app;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ManagementCategory extends javax.swing.JFrame {
Connection conn;
    /**
     * Creates new form ManagementCategory
     */
    public ManagementCategory() {
        initComponents();
        load();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        idEdt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nameEdt = new javax.swing.JTextField();
        LuuBtn = new javax.swing.JButton();
        SuaBtn = new javax.swing.JButton();
        XoaBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        theloaiTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_app/adminIcons/icons8_Exit_26px_2.png"))); // NOI18N
        jLabel1.setText("Quay lại");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Mã thể loại");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 80, -1));

        jLabel11.setBackground(new java.awt.Color(153, 0, 242));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_app/adminIcons/icons8_Books_26px.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 60, 50));

        idEdt.setBackground(new java.awt.Color(102, 102, 255));
        idEdt.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        idEdt.setForeground(new java.awt.Color(255, 255, 255));
        idEdt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        idEdt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        idEdt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                idEdtFocusLost(evt);
            }
        });
        jPanel1.add(idEdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 260, 40));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tên thể loại");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 95, -1));

        jLabel13.setBackground(new java.awt.Color(153, 0, 242));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_app/adminIcons/icons8_Books_26px.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 60, 50));

        nameEdt.setBackground(new java.awt.Color(102, 102, 255));
        nameEdt.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        nameEdt.setForeground(new java.awt.Color(255, 255, 255));
        nameEdt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        nameEdt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(nameEdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 260, 40));

        LuuBtn.setBackground(new java.awt.Color(255, 51, 51));
        LuuBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LuuBtn.setForeground(new java.awt.Color(255, 255, 255));
        LuuBtn.setText("Lưu");
        LuuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuuBtnActionPerformed(evt);
            }
        });
        jPanel1.add(LuuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 100, 50));

        SuaBtn.setBackground(new java.awt.Color(255, 51, 51));
        SuaBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SuaBtn.setForeground(new java.awt.Color(255, 255, 255));
        SuaBtn.setText("Sửa");
        SuaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuaBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SuaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 100, 50));

        XoaBtn.setBackground(new java.awt.Color(255, 51, 51));
        XoaBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        XoaBtn.setForeground(new java.awt.Color(255, 255, 255));
        XoaBtn.setText("Xóa");
        XoaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaBtnActionPerformed(evt);
            }
        });
        jPanel1.add(XoaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 100, 50));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bấm vào đây nếu bạn muốn sang quản lý sách");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 280, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 670));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_app/adminIcons/icons8_Books_26px.png"))); // NOI18N
        jLabel2.setText("Quản lý thể loại");

        theloaiTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        theloaiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã thể loại", "Tên thể loại"
            }
        ));
        theloaiTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                theloaiTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(theloaiTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 99, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 770, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

      private boolean checkDuplicateID(){
      String id=idEdt.getText().toString();
      boolean isExit=false;
       try {
            conn=ConnectDB.KetnoiDB();
            String sql="Select * From theloai Where MaTheLoai='"+id+"'";
            Statement st=conn.createStatement();
            ResultSet s=st.executeQuery(sql);
            
            if (s.next()) {
                isExit=true;
            }else{
                isExit=false;
            }
                    
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isExit;
  }
    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        Home h=new Home();
        h.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jPanel2MouseClicked
   private void deleteTheloai(){
          String id=idEdt.getText().toString();
        String name=nameEdt.getText().toString();

        try {
            conn=ConnectDB.KetnoiDB();
            String sql="Delete From theloai Where MaTheLoai='"+id+"'";
            Statement s=conn.createStatement();
            s.executeUpdate(sql);
            load();
            conn.close();
        } catch (Exception e) {
           e.printStackTrace();
        }
   }
    private void updateTheloai(){
              String id=idEdt.getText().toString();
        String name=nameEdt.getText().toString();

        try {
            conn=ConnectDB.KetnoiDB();
            String sql="Update theloai set TenTheLoai=N'"+name+"' where MaTheLoai=N'"+id+"'";
            Statement s=conn.createStatement();
            s.executeUpdate(sql);
            load();
            conn.close();
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
    private void insertTheloai(){
        String id=idEdt.getText().toString();
        String name=nameEdt.getText().toString();

        try {
            conn=ConnectDB.KetnoiDB();
            String sql="Insert theloai Values ('"+id+"',N'"+name+"')";
            Statement s=conn.createStatement();
            s.executeUpdate(sql);
            load();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void load(){
         theloaiTable.removeAll();
        try {
            conn=ConnectDB.KetnoiDB();
            String sql="Select * From theloai";
            Statement s=conn.createStatement();
            ResultSet rs=s.executeQuery(sql);
            
            String[] arr={"Mã thể loại","Tên thể loại"};
            DefaultTableModel model=new DefaultTableModel(arr,0);
            while (rs.next()) {
                Vector v=new Vector();
                v.add(rs.getString(1).toString());
                v.add(rs.getString(2).toString());
                
                model.addRow(v);
            }
            theloaiTable.setModel(model);
            conn.close();
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
    private void theloaiTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_theloaiTableMouseClicked
        // TODO add your handling code here:
        try {
            int i=theloaiTable.getSelectedRow();
            idEdt.setText(theloaiTable.getValueAt(i, 0).toString());
            nameEdt.setText(theloaiTable.getValueAt(i, 1).toString());
        } catch (Exception e) {
        e.printStackTrace();
        }
    }//GEN-LAST:event_theloaiTableMouseClicked

    private void LuuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuuBtnActionPerformed
        // TODO add your handling code here:
        if(checkDuplicateID()==false){
        insertTheloai();
    }
        
    }//GEN-LAST:event_LuuBtnActionPerformed

    private void SuaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuaBtnActionPerformed
        // TODO add your handling code here:
        updateTheloai();
    }//GEN-LAST:event_SuaBtnActionPerformed

    private void XoaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaBtnActionPerformed
        // TODO add your handling code here:
        deleteTheloai();
    }//GEN-LAST:event_XoaBtnActionPerformed

    private void idEdtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idEdtFocusLost
        // TODO add your handling code here:
        if (checkDuplicateID()==true) {
            JOptionPane.showMessageDialog(rootPane, "Đã có ID này rồi");
        }
    }//GEN-LAST:event_idEdtFocusLost

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        ManagementBook book=new ManagementBook();
        book.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(ManagementCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagementCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagementCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagementCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagementCategory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LuuBtn;
    private javax.swing.JButton SuaBtn;
    private javax.swing.JButton XoaBtn;
    private javax.swing.JTextField idEdt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameEdt;
    private javax.swing.JTable theloaiTable;
    // End of variables declaration//GEN-END:variables
}