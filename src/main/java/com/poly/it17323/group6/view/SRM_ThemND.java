/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.poly.it17323.group6.view;

import com.poly.it17323.group6.domainmodel.ChucVu;
import com.poly.it17323.group6.response.NguoiDungReponse;
import com.poly.it17323.group6.service.IChucVuService;
import com.poly.it17323.group6.service.INguoiDungService;
import com.poly.it17323.group6.service.ipml.ChucVuService;
import com.poly.it17323.group6.service.ipml.NguoiDungService;
import java.text.SimpleDateFormat;
import java.util.UUID;
import javax.swing.JOptionPane;

/**
 *
 * @author LE BAO NGOC
 */
public class SRM_ThemND extends javax.swing.JFrame {
    
    private final IChucVuService icvs = new ChucVuService();
    private final INguoiDungService inds = new NguoiDungService();

    /**
     * Creates new form SRM_ThemND
     */
    public SRM_ThemND() {
        initComponents();
        setLocationRelativeTo(this);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    private NguoiDungReponse getFromMoi() {
        NguoiDungReponse ndr = new NguoiDungReponse();
        ndr.setMaND(txt_nd_MaND.getText().trim());
        ndr.setTenTK(txt_nd_TenTK.getText().trim());
        ndr.setMatKhau(txt_nd_MatKhau.getText().trim());
        ndr.setHoVaTen(txt_nd_HovaTen.getText().trim());
        ndr.setGioiTinh(rdo_nd_Nam.isSelected() ? "Nam" : "Nữ");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String ngay = sdf.format(Jdate_nd_ngaySinh.getDate());
        ndr.setNgaySinh(ngay);
        ndr.setSdt(txt_nd_Sdt.getText());
        ndr.setDiaChi(txt_nd_DiaChi.getText());
        ndr.setCccd(txt_nd_CCCD.getText());
        ndr.setTinhTrang(1);
        String ngayTao = sdf.format(Jdate_nd_ngayTao.getDate());
        ndr.setNgayTao(ngayTao);
        String ngaySua = sdf.format(Jdate_nd_ngaySua.getDate());
        ndr.setNgaySua(ngaySua);
//        ChucVu cv = icvs.getAll().get(0);
//        //getId
//        ndr.setIdCV(cv.getIdCV());
        return ndr;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jdate_nd_ngaySinh = new com.toedter.calendar.JDateChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        cbb_nd_ChucVu = new javax.swing.JComboBox<>();
        txt_nd_TenTK = new javax.swing.JTextField();
        txt_nd_MaND = new javax.swing.JTextField();
        txt_nd_MatKhau = new javax.swing.JTextField();
        txt_nd_HovaTen = new javax.swing.JTextField();
        txt_nd_Sdt = new javax.swing.JTextField();
        txt_nd_CCCD = new javax.swing.JTextField();
        rdo_nd_Nu = new javax.swing.JRadioButton();
        rdo_nd_Nam = new javax.swing.JRadioButton();
        txt_nd_DiaChi = new javax.swing.JTextField();
        btn_nd_Them = new javax.swing.JButton();
        Jdate_nd_ngaySinh1 = new com.toedter.calendar.JDateChooser();
        Jdate_nd_ngayTao = new com.toedter.calendar.JDateChooser();
        Jdate_nd_ngaySua = new com.toedter.calendar.JDateChooser();

        Jdate_nd_ngaySinh.setDateFormatString("yyyy-MM-dd");
        Jdate_nd_ngaySinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jdate_nd_ngaySinhMouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );

        jPanel16.setBackground(new java.awt.Color(232, 211, 227));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin người dùng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel51.setText("Mã người dùng : ");

        jLabel52.setText("Tên tài khoản :");

        jLabel53.setText("Mật khẩu :");

        jLabel54.setText("Họ và tên :");

        jLabel55.setText("Giới tính :");

        jLabel56.setText("Ngày sinh :");

        jLabel58.setText("Sđt :");

        jLabel59.setText("Địa chỉ :");

        jLabel60.setText("CCCD/CMT : ");

        jLabel62.setText("Ngày Tạo : ");

        jLabel63.setText("Ngày Sửa : ");

        jLabel64.setText("Chức vụ : ");

        cbb_nd_ChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân viên" }));

        buttonGroup1.add(rdo_nd_Nu);
        rdo_nd_Nu.setText("Nữ");

        buttonGroup1.add(rdo_nd_Nam);
        rdo_nd_Nam.setText("Nam");

        btn_nd_Them.setText("Thêm");
        btn_nd_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nd_ThemActionPerformed(evt);
            }
        });

        Jdate_nd_ngaySinh1.setDateFormatString("yyyy-MM-dd");
        Jdate_nd_ngaySinh1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jdate_nd_ngaySinh1MouseClicked(evt);
            }
        });

        Jdate_nd_ngayTao.setDateFormatString("yyyy-MM-dd");
        Jdate_nd_ngayTao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jdate_nd_ngayTaoMouseClicked(evt);
            }
        });

        Jdate_nd_ngaySua.setDateFormatString("yyyy-MM-dd");
        Jdate_nd_ngaySua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jdate_nd_ngaySuaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53)
                            .addComponent(jLabel52)
                            .addComponent(jLabel64)
                            .addComponent(jLabel51)
                            .addComponent(jLabel54))
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_nd_MatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                                    .addComponent(txt_nd_MaND, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbb_nd_ChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nd_TenTK)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(txt_nd_HovaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addGap(60, 60, 60)
                        .addComponent(rdo_nd_Nam)
                        .addGap(27, 27, 27)
                        .addComponent(rdo_nd_Nu)))
                .addGap(29, 29, 29)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel62)
                        .addGap(400, 400, 400))
                    .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addComponent(jLabel56)
                            .addGap(402, 402, 402))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                                    .addComponent(jLabel58)
                                    .addGap(57, 57, 57)
                                    .addComponent(txt_nd_Sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel16Layout.createSequentialGroup()
                                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel60)
                                        .addComponent(jLabel59))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_nd_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Jdate_nd_ngaySinh1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(Jdate_nd_ngaySua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Jdate_nd_ngayTao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(txt_nd_CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(52, 52, 52)
                            .addComponent(btn_nd_Them))))
                .addContainerGap(282, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51)
                            .addComponent(txt_nd_MaND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel64)
                            .addComponent(cbb_nd_ChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52)
                            .addComponent(txt_nd_TenTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel53)
                            .addComponent(txt_nd_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel54)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdo_nd_Nu)
                                    .addComponent(rdo_nd_Nam)
                                    .addComponent(jLabel55)))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(txt_nd_HovaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nd_Sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59)
                            .addComponent(txt_nd_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_nd_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nd_CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56)
                            .addComponent(Jdate_nd_ngaySinh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel62)
                            .addComponent(Jdate_nd_ngayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel63)
                            .addComponent(Jdate_nd_ngaySua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nd_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nd_ThemActionPerformed
        if(check()){
            
       
        NguoiDungReponse ndr = getFromMoi();
//        String email = JOptionPane.showInputDialog("Nhập email để xác nhận thêm");
        //        nd.setEmail(email);
        //        if (inds.checkEmailXacNhan(nd) != null) {
        //            JOptionPane.showMessageDialog(this, inds.checkEmailXacNhan(nd));
        //            try {
        //                String ma = JOptionPane.showInputDialog("Nhập mã xác nhận");
        //                JOptionPane.showMessageDialog(this, inds.checkMa(ma));
        if(inds.add(ndr) == true){
            JOptionPane.showMessageDialog(this, "THÊM THÀNH CÔNG!");
            inds.guiTkMk(ndr);
            this.dispose();
            new SRM_Login().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "THÊM THẤT BẠI!");
        }

        //                listND = inds.getAll();
        //                loadND(inds.getAll());
        
        //            } catch (Exception ex) {
        //                ex.printStackTrace(System.out);
        //            }
        //        } else {
        //            JOptionPane.showMessageDialog(this, inds.emaiFals(nd));
        //            return;
        //        }
         }
    }//GEN-LAST:event_btn_nd_ThemActionPerformed

    private void Jdate_nd_ngaySinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jdate_nd_ngaySinhMouseClicked

    }//GEN-LAST:event_Jdate_nd_ngaySinhMouseClicked

    private void Jdate_nd_ngaySinh1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jdate_nd_ngaySinh1MouseClicked

    }//GEN-LAST:event_Jdate_nd_ngaySinh1MouseClicked

    private void Jdate_nd_ngayTaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jdate_nd_ngayTaoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Jdate_nd_ngayTaoMouseClicked

    private void Jdate_nd_ngaySuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jdate_nd_ngaySuaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Jdate_nd_ngaySuaMouseClicked

    public boolean check() {
        if (txt_nd_MaND.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập Mã");
            return false;
        }
        if (txt_nd_TenTK.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập tên tài khoản");
            return false;
        }
        if (txt_nd_MatKhau.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập mật khẩu");
            return false;
        }
        if (txt_nd_HovaTen.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập họ và tên");
            return false;
        }
        if (Jdate_nd_ngaySinh.getDateFormatString().isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập ngày sinh");
            return false;
        }
        if (txt_nd_Sdt.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập Sdt");
            return false;
        }
        if (txt_nd_DiaChi.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập địa chỉ");
            return false;
        }
        if (txt_nd_CCCD.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập CCCD/CMND");
            return false;
        }
        if (Jdate_nd_ngayTao.getDateFormatString().isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập ngày tạo");
            return false;
        }
        if (Jdate_nd_ngaySua.getDateFormatString().isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập ngày sửa");
            return false;
        }
        return true;
    }
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
            java.util.logging.Logger.getLogger(SRM_ThemND.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SRM_ThemND.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SRM_ThemND.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SRM_ThemND.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SRM_ThemND().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Jdate_nd_ngaySinh;
    private com.toedter.calendar.JDateChooser Jdate_nd_ngaySinh1;
    private com.toedter.calendar.JDateChooser Jdate_nd_ngaySua;
    private com.toedter.calendar.JDateChooser Jdate_nd_ngayTao;
    private javax.swing.JButton btn_nd_Them;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbb_nd_ChucVu;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JRadioButton rdo_nd_Nam;
    private javax.swing.JRadioButton rdo_nd_Nu;
    private javax.swing.JTextField txt_nd_CCCD;
    private javax.swing.JTextField txt_nd_DiaChi;
    private javax.swing.JTextField txt_nd_HovaTen;
    private javax.swing.JTextField txt_nd_MaND;
    private javax.swing.JTextField txt_nd_MatKhau;
    private javax.swing.JTextField txt_nd_Sdt;
    private javax.swing.JTextField txt_nd_TenTK;
    // End of variables declaration//GEN-END:variables
}
