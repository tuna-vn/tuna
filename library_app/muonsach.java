/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library_app;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class muonsach extends javax.swing.JFrame {
Connection conn;
    /**
     * Creates new form muonsach
     */
    public muonsach() {
        initComponents();

        loaddocgialayphieu();
        loadsach();
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
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        soluongEdt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tendocgiaEdt = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        tensachEdt = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        them = new javax.swing.JButton();
        sua = new javax.swing.JButton();
        xoa = new javax.swing.JButton();
        BackBtn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablechitiet = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tên độc giả:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 80, 30));

        soluongEdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soluongEdtActionPerformed(evt);
            }
        });
        soluongEdt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                soluongEdtKeyReleased(evt);
            }
        });
        jPanel3.add(soluongEdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 200, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Số lượng:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 80, 30));

        jPanel3.add(tendocgiaEdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 200, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tên sách:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 80, 30));

        jPanel3.add(tensachEdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 200, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Thêm sách vào phiếu mượn");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 290, 30));

        them.setBackground(new java.awt.Color(255, 51, 51));
        them.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        them.setForeground(new java.awt.Color(255, 255, 255));
        them.setText("Thêm sách vào phiếu");
        them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themActionPerformed(evt);
            }
        });
        jPanel3.add(them, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, 190, 40));

        sua.setBackground(new java.awt.Color(255, 51, 51));
        sua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sua.setForeground(new java.awt.Color(255, 255, 255));
        sua.setText("Sửa lại số lượng sách");
        sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaActionPerformed(evt);
            }
        });
        jPanel3.add(sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 190, 40));

        xoa.setBackground(new java.awt.Color(255, 51, 51));
        xoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        xoa.setForeground(new java.awt.Color(255, 255, 255));
        xoa.setText("Xóa sách trong phiếu");
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });
        jPanel3.add(xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 190, 40));

        BackBtn.setBackground(new java.awt.Color(255, 51, 51));
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_app/adminIcons/icons8_Exit_26px_2.png"))); // NOI18N
        jLabel1.setText("Quay lại");

        javax.swing.GroupLayout BackBtnLayout = new javax.swing.GroupLayout(BackBtn);
        BackBtn.setLayout(BackBtnLayout);
        BackBtnLayout.setHorizontalGroup(
            BackBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BackBtnLayout.setVerticalGroup(
            BackBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel3.add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bấm vào đây để tạo phiếu hoặc gia hạn thêm");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 250, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 280));

        tablechitiet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablechitiet.setModel(new javax.swing.table.DefaultTableModel(
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
        tablechitiet.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tablechitiet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablechitietMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablechitiet);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 1110, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   private void  updatecountbookPlus(int sl){
//         int sl=Integer.parseInt(soluongEdt.getText().toString());
      try {
      conn=ConnectDB.KetnoiDB();
      String sql="Update sach set SoLuong= SoLuong+? Where MaSach=?";
      PreparedStatement ps=conn.prepareStatement(sql);
      ps.setInt(1, sl);
      ps.setString(2, getsach());
      int count =ps.executeUpdate();
          load();
          if (count<0) {
              JOptionPane.showMessageDialog(rootPane, "Số lượng sách đã hết");
              return;
          }
      } catch (Exception e) {
    e.printStackTrace();
      }
   }
    private void updatecountbookMinus(int sl){
//         int sl=Integer.parseInt(soluongEdt.getText().toString());
      try {
      conn=ConnectDB.KetnoiDB();
      String sql="Update sach set SoLuong= SoLuong-? Where MaSach=?";
      PreparedStatement ps=conn.prepareStatement(sql);
      ps.setInt(1, sl);
      ps.setString(2, getsach());
      int count =ps.executeUpdate();
          load();
          if (count<0) {
              JOptionPane.showMessageDialog(rootPane, "Số lượng sách đã hết");
              return;
          }
      } catch (Exception e) {
    e.printStackTrace();
      }
    }
    // check xem có còn sách trong kho hay ko
    private boolean isAlreadyIssued(){
      boolean isExit=false;
      try {
          conn=ConnectDB.KetnoiDB();
          String sql="SELECT sach.soluong FROM sach where sach.masach=?";
          PreparedStatement ps=conn.prepareStatement(sql);
          ps.setString(1, getsach());
          ResultSet rs=ps.executeQuery();
           if (rs.next()) {
               int sl=rs.getInt("sach.soluong");
               if (sl>0) {
                   isExit=  true;
               }else{
                   isExit=false;
               }
              
          }
           
      } catch (Exception e) {
     e.printStackTrace();
      }
      return isExit;
  }
    // check xem là độc giả đã mượn sách này chưa
    private boolean checkduplicate(){
        Boolean isExit=false;
        try {
            conn=ConnectDB.KetnoiDB();
            String sql="select *from chitietmuon where mapm=? and masach=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, gettendocgia());
            ps.setString(2, getsach());
            ResultSet rs=ps.executeQuery();
            
            if (rs.next()) {
                isExit=true;
            }else{
                isExit=false;
            }
            
           
        } catch (Exception e) {
        e.printStackTrace();
        }
        return isExit;
   }
    private void deletePMS(){
       try {
           conn=ConnectDB.KetnoiDB();
           String sql="delete from chitietmuon where mapm=? and masach=?";
           PreparedStatement ps=conn.prepareStatement(sql);
           ps.setString(1,gettendocgia());
           ps.setString(2, getsach());
           ps.executeUpdate();
           load();
           JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
       } catch (Exception e) {
       e.printStackTrace();
       }
   }
    private void updatePMS(){
     int sl=Integer.parseInt(soluongEdt.getText().toString());
       try {
           conn=ConnectDB.KetnoiDB();
           String sql= "update chitietmuon set soluong=? where mapm=? and masach=?";
           PreparedStatement ps=conn.prepareStatement(sql);
           ps.setInt(1, sl);
           ps.setString(2, gettendocgia());
           ps.setString(3, getsach());
           
           ps.executeUpdate();
           load();
           JOptionPane.showMessageDialog(rootPane, "Đã sửa lại số lượng sách thành công");
       } catch (Exception e) {
       e.printStackTrace();
       }
   }
    private void load(){
           tablechitiet.removeAll();
        try {
            conn=ConnectDB.KetnoiDB();
                String sql="SELECT chitietmuon.mapm,docgia.tendg,docgia.sdt,sach.TenSach,tacgia.TenTacGia,phieumuon.ngaydangky,phieumuon.ngayhethan,phieumuon.trangthai,chitietmuon.soluong from chitietmuon join sach on chitietmuon.masach=sach.MaSach join tacgia on sach.MaTacGia=tacgia.MaTacGia join phieumuon on chitietmuon.mapm=phieumuon.mapm JOIN docgia on phieumuon.madg=docgia.madg where trangthai=?";
           PreparedStatement ps=conn.prepareStatement(sql);
           ps.setString(1, "Đang mượn");
            ResultSet rs=ps.executeQuery();
            
            String[] arr={"Mã phiếu","Tên độc giả","Số dt","Tên sách","Tên tác giả","Ngày đăng kí","Ngày hết hạn","Trạng thái","Số lượng"};
            DefaultTableModel model=new DefaultTableModel(arr,0);
            while (rs.next()) {
                Vector v=new Vector();
                v.add(rs.getString(1).toString());
                v.add(rs.getString(2).toString());
                v.add(rs.getString(3).toString());
                v.add(rs.getString(4).toString()); 
                v.add(rs.getString(5).toString()); 
                v.add(rs.getString(6).toString()); 
                v.add(rs.getString(7).toString()); 
                v.add(rs.getString(8).toString()); 
                v.add(rs.getString(9).toString()); 
           
                model.addRow(v);
            }
            tablechitiet.setModel(model);
            conn.close();
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
    private void insertPMS(){
        String sl=soluongEdt.getText().toString();
        try {
            conn=ConnectDB.KetnoiDB();
            String sql="insert chitietmuon values(?,?,?)";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, gettendocgia());
            ps.setString(2, getsach());
            ps.setString(3, sl);
            ps.executeUpdate();
            load();
            JOptionPane.showMessageDialog(rootPane, "mượn thành công");
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
// lấy dl  từ combobox tên sách ở phiếu mượn sách
    private String getsach() throws SQLException{
         String id = null;
       String name=tensachEdt.getSelectedItem().toString().trim();
           conn=ConnectDB.KetnoiDB();
           String sql="select masach from sach where tensach= ?";
           PreparedStatement ps=conn.prepareStatement(sql);
           ps.setString(1, name);
           ResultSet rs=ps.executeQuery();
             if (rs.next()) {                 
                 id=rs.getString("sach.masach");
             }
       
      return id;
   }

// lấy dữ liệu từ combobox độc giả trong phiếu mượn sách
    private String gettendocgia() throws SQLException{
         String id = null;
       String selectItem=tendocgiaEdt.getSelectedItem().toString();// lấy cái đã chọn trong combobox
         String[] part=selectItem.split("--");// tách phần -- ra khỏi chuỗi
         String name=part[1].trim();    // lấy phần tử đầu tiên cũng như là phần tên dg ra
           conn=ConnectDB.KetnoiDB();
           String sql="select mapm from phieumuon join docgia on phieumuon.madg=docgia.madg where docgia.tendg=? and phieumuon.trangthai=?";
           PreparedStatement ps=conn.prepareStatement(sql);
           ps.setString(1, name);
           ps.setString(2, "Đang mượn");
           ResultSet rs=ps.executeQuery();
             if(rs.next()) {                 
                 id=rs.getString("phieumuon.mapm");
             }
       
      return id;
   }
    // đổ dl vào tên sách
    private void loadsach(){
        
     try {
            conn=ConnectDB.KetnoiDB();
            String sql="select tensach from sach";
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                tensachEdt.addItem(rs.getString("tensach"));
            }
        } catch (Exception e) {
        e.printStackTrace();
        }
   }
    // đổ dl vào tên độc giả ở phần mượn sách
    private void loaddocgialayphieu(){
        tendocgiaEdt.removeAllItems();
         try {
            conn=ConnectDB.KetnoiDB();
            String sql="select phieumuon.mapm,docgia.tendg,docgia.sdt from docgia join phieumuon on docgia.madg=phieumuon.madg where phieumuon.trangthai=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, "Đang mượn");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                tendocgiaEdt.addItem(rs.getString("phieumuon.mapm")+"--"+rs.getString("tendg")+"--"+rs.getString("sdt"));
            }
        } catch (Exception e) {
        e.printStackTrace();
        }
   }
    // lấy dữ liệu từ combobox trong tạo phiếu
//    private String getIDDG() throws SQLException{
//          String id = null;
//       String name=docgia.getSelectedItem().toString();
//           conn=ConnectDB.KetnoiDB();
//           String sql="select madg From docgia Where Tendg=?";
//           PreparedStatement ps=conn.prepareStatement(sql);
//           ps.setString(1, name);
//           ResultSet rs=ps.executeQuery();
//             if(rs.next()) {                 
//                 id=rs.getString("madg");
//             }
//       
//      return id;
//    }
//    // đổ dữ liệu lên combobox trong tạo phiếu
//    private void loaddocgiapm(){
//        try {
//            conn=ConnectDB.KetnoiDB();
//            String sql="select Tendg From docgia";
//            PreparedStatement ps=conn.prepareStatement(sql);
//            ResultSet rs=ps.executeQuery();
//            while(rs.next()){
//                docgia.addItem(rs.getString("tendg"));
//            }
//        } catch (Exception e) {
//        e.printStackTrace();
//        }
//    }
//    private void insertphieumuon(){
//        String tendocgia=docgia.getSelectedItem().toString();
//        String ngaydangki=this.ngaydangki.getText().toString();
//        String ngayhethan=this.ngayhethan.getText().toString();
//        try {
//            conn=ConnectDB.KetnoiDB();
//            String sql="insert phieumuon values (mapm,?,?,?)";
//            PreparedStatement ps=conn.prepareStatement(sql);
//            ps.setString(1, getIDDG());
//            ps.setString(2, ngaydangki);
//            ps.setString(3, ngayhethan);
//            ps.executeUpdate();
//            JOptionPane.showMessageDialog(rootPane, "thành công r");
//        } catch (Exception e) {
//        e.printStackTrace();
//        }
//    }
    private void soluongEdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soluongEdtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soluongEdtActionPerformed

    private void suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaActionPerformed
        // TODO add your handling code here:
        int i=tablechitiet.getSelectedRow();
        int sl=Integer.parseInt(tablechitiet.getValueAt(i, 8).toString());
        int sledt=Integer.parseInt(soluongEdt.getText().toString());
        int minus=sledt-sl;
        int plus=sl-sledt;
        if (sledt>sl) {
            updatePMS();
            updatecountbookMinus(minus);
        }else{
            updatePMS();
            updatecountbookPlus(plus);
        }
        
        
    }//GEN-LAST:event_suaActionPerformed

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed
        // TODO add your handling code here:
        int i=Integer.parseInt(soluongEdt.getText().toString());
        
            if (checkduplicate()==false && isAlreadyIssued()==true) {
            insertPMS();
            updatecountbookMinus(i);
        }else{
                JOptionPane.showMessageDialog(rootPane, "Bạn độc giả này đã mượn sách này rồi");
            }

    }//GEN-LAST:event_themActionPerformed

    private void tablechitietMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablechitietMouseClicked
        // TODO add your handling code here:
        
        int i=tablechitiet.getSelectedRow();
        String  id=tablechitiet.getValueAt(i, 0).toString();
        String dg=tablechitiet.getValueAt(i,1).toString();
        String sdt=tablechitiet.getValueAt(i,2).toString();
        String tendg=id+"--"+dg+"--"+sdt;
        tendocgiaEdt.setSelectedItem(tendg);
        tensachEdt.setSelectedItem(tablechitiet.getValueAt(i, 3).toString());
        soluongEdt.setText(tablechitiet.getValueAt(i, 8).toString());
    }//GEN-LAST:event_tablechitietMouseClicked

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
        // TODO add your handling code here:
        int i=Integer.parseInt(soluongEdt.getText().toString());
        deletePMS();
        updatecountbookMinus(i);
    }//GEN-LAST:event_xoaActionPerformed

    private void soluongEdtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_soluongEdtKeyReleased

         if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
    // Cho phép nhập số và xóa ký tự
        } else {
     JOptionPane.showMessageDialog(rootPane, "Hãy nhập số ko nhập dc chữ");
            String quantityString=soluongEdt.getText().toString();
            soluongEdt.setText(quantityString.substring(0, quantityString.length()-1));
              }
    }//GEN-LAST:event_soluongEdtKeyReleased

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        // TODO add your handling code here:
        Home h=new Home();
        h.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackBtnMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        taovagiahanphieu t=new taovagiahanphieu();
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(muonsach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(muonsach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(muonsach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(muonsach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new muonsach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField soluongEdt;
    private javax.swing.JButton sua;
    private javax.swing.JTable tablechitiet;
    private javax.swing.JComboBox<String> tendocgiaEdt;
    private javax.swing.JComboBox<String> tensachEdt;
    private javax.swing.JButton them;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables
}
