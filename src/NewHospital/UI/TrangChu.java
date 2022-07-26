/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NewHospital.UI;

import NewHospital.DAO.AccountsDAO;
import NewHospital.Model.Accounts;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class TrangChu extends javax.swing.JFrame {

    /**
     * Creates new form TrangChu
     */
    public TrangChu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDongHo = new javax.swing.JPanel();
        lblDongHo = new javax.swing.JLabel();
        lblQuangCao = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        PanelHinhNen = new javax.swing.JPanel();
        lblHinhNen = new javax.swing.JLabel();
        PanelMenu = new javax.swing.JPanel();
        btnDatLichKham = new javax.swing.JButton();
        btnDanhSachKham = new javax.swing.JButton();
        btnThongTinBenhNhan = new javax.swing.JButton();
        btnKhoDuoc = new javax.swing.JButton();
        btnQuanLyThuChi = new javax.swing.JButton();
        btnBaoCaoThongKe = new javax.swing.JButton();
        btnThongTinNhanVien = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelDongHo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelDongHo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PanelDongHo.setPreferredSize(new java.awt.Dimension(100, 35));

        lblDongHo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDongHo.setForeground(new java.awt.Color(0, 153, 153));
        lblDongHo.setText("00:00 AM");

        lblQuangCao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQuangCao.setForeground(new java.awt.Color(255, 0, 51));
        lblQuangCao.setText("Hệ thống quản lý bệnh viện NewHospital");

        javax.swing.GroupLayout PanelDongHoLayout = new javax.swing.GroupLayout(PanelDongHo);
        PanelDongHo.setLayout(PanelDongHoLayout);
        PanelDongHoLayout.setHorizontalGroup(
            PanelDongHoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDongHoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDongHo)
                .addGap(29, 29, 29))
            .addGroup(PanelDongHoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelDongHoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblQuangCao, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(703, Short.MAX_VALUE)))
        );
        PanelDongHoLayout.setVerticalGroup(
            PanelDongHoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDongHo, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
            .addGroup(PanelDongHoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblQuangCao, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
        );

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1000, 650));

        PanelHinhNen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblHinhNen.setBackground(new java.awt.Color(255, 255, 255));
        lblHinhNen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinhNen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/BackGround2.png"))); // NOI18N
        lblHinhNen.setToolTipText("");
        lblHinhNen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblHinhNen.setOpaque(true);

        javax.swing.GroupLayout PanelHinhNenLayout = new javax.swing.GroupLayout(PanelHinhNen);
        PanelHinhNen.setLayout(PanelHinhNenLayout);
        PanelHinhNenLayout.setHorizontalGroup(
            PanelHinhNenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelHinhNenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHinhNen, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelHinhNenLayout.setVerticalGroup(
            PanelHinhNenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHinhNenLayout.createSequentialGroup()
                .addComponent(lblHinhNen, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDesktopPane1.setLayer(PanelHinhNen, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(PanelHinhNen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelHinhNen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelMenu.setBackground(new java.awt.Color(153, 204, 255));

        btnDatLichKham.setBackground(new java.awt.Color(0, 102, 0));
        btnDatLichKham.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnDatLichKham.setForeground(new java.awt.Color(255, 255, 255));
        btnDatLichKham.setText("Đặt lịch khám");
        btnDatLichKham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatLichKhamActionPerformed(evt);
            }
        });

        btnDanhSachKham.setBackground(new java.awt.Color(0, 102, 0));
        btnDanhSachKham.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnDanhSachKham.setForeground(new java.awt.Color(255, 255, 255));
        btnDanhSachKham.setText("Danh sách chờ khám");
        btnDanhSachKham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhSachKhamActionPerformed(evt);
            }
        });

        btnThongTinBenhNhan.setBackground(new java.awt.Color(0, 102, 0));
        btnThongTinBenhNhan.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnThongTinBenhNhan.setForeground(new java.awt.Color(255, 255, 255));
        btnThongTinBenhNhan.setText("Thông tin bệnh nhân");
        btnThongTinBenhNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongTinBenhNhanActionPerformed(evt);
            }
        });

        btnKhoDuoc.setBackground(new java.awt.Color(0, 102, 0));
        btnKhoDuoc.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnKhoDuoc.setForeground(new java.awt.Color(255, 255, 255));
        btnKhoDuoc.setText("Kho dược");
        btnKhoDuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoDuocActionPerformed(evt);
            }
        });

        btnQuanLyThuChi.setBackground(new java.awt.Color(0, 102, 0));
        btnQuanLyThuChi.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnQuanLyThuChi.setForeground(new java.awt.Color(255, 255, 255));
        btnQuanLyThuChi.setText("Quản lý thu chi ");
        btnQuanLyThuChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyThuChiActionPerformed(evt);
            }
        });

        btnBaoCaoThongKe.setBackground(new java.awt.Color(0, 102, 0));
        btnBaoCaoThongKe.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnBaoCaoThongKe.setForeground(new java.awt.Color(255, 255, 255));
        btnBaoCaoThongKe.setText("Báo cáo thống kê");
        btnBaoCaoThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaoCaoThongKeActionPerformed(evt);
            }
        });

        btnThongTinNhanVien.setBackground(new java.awt.Color(0, 102, 0));
        btnThongTinNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnThongTinNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        btnThongTinNhanVien.setText("Thông tin nhân viên");
        btnThongTinNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongTinNhanVienActionPerformed(evt);
            }
        });

        btnDangXuat.setBackground(new java.awt.Color(255, 0, 51));
        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        lblLogo.setBackground(new java.awt.Color(204, 204, 204));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/Logo.png"))); // NOI18N
        lblLogo.setOpaque(true);

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDatLichKham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnThongTinBenhNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnKhoDuoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnQuanLyThuChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBaoCaoThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnThongTinNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDanhSachKham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDangXuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDatLichKham, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDanhSachKham, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThongTinBenhNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKhoDuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQuanLyThuChi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBaoCaoThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThongTinNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(PanelDongHo, javax.swing.GroupLayout.DEFAULT_SIZE, 1029, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                    .addComponent(PanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDatLichKhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatLichKhamActionPerformed
        // TODO add your handling code here:
        DatLichKhamNV datLich = new DatLichKhamNV();
        jDesktopPane1.add(datLich);
        datLich.show();
    }//GEN-LAST:event_btnDatLichKhamActionPerformed

    private void btnDanhSachKhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhSachKhamActionPerformed
        // TODO add your handling code here:
        DanhSachKham danhSachKham = new DanhSachKham();
        jDesktopPane1.add(danhSachKham);
        danhSachKham.show();
    }//GEN-LAST:event_btnDanhSachKhamActionPerformed

    private void btnThongTinBenhNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongTinBenhNhanActionPerformed
        // TODO add your handling code here:
        QuanLyBenhNhan benhNhan = new QuanLyBenhNhan();
        jDesktopPane1.add(benhNhan);
        benhNhan.show();
    }//GEN-LAST:event_btnThongTinBenhNhanActionPerformed

    private void btnKhoDuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoDuocActionPerformed
        // TODO add your handling code here:
        KhoDuoc khoDuoc = new KhoDuoc();
        jDesktopPane1.add(khoDuoc);
        khoDuoc.show();
    }//GEN-LAST:event_btnKhoDuocActionPerformed

    private void btnQuanLyThuChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyThuChiActionPerformed
        // TODO add your handling code here:
        QuanLyThuChi thuChi = new QuanLyThuChi();
        jDesktopPane1.add(thuChi);
        thuChi.show();
    }//GEN-LAST:event_btnQuanLyThuChiActionPerformed

    private void btnBaoCaoThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaoCaoThongKeActionPerformed
        // TODO add your handling code here:
        BaoCaoThongKe baoCao = new BaoCaoThongKe();
        jDesktopPane1.add(baoCao);
        baoCao.show();
    }//GEN-LAST:event_btnBaoCaoThongKeActionPerformed

    private void btnThongTinNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongTinNhanVienActionPerformed
        // TODO add your handling code here:
        QuanLyNhanVien nhanVien = new QuanLyNhanVien();
        jDesktopPane1.add(nhanVien);
        nhanVien.show();
    }//GEN-LAST:event_btnThongTinNhanVienActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        dangXuat();
    }//GEN-LAST:event_btnDangXuatActionPerformed

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
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDongHo;
    private javax.swing.JPanel PanelHinhNen;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JButton btnBaoCaoThongKe;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDanhSachKham;
    private javax.swing.JButton btnDatLichKham;
    private javax.swing.JButton btnKhoDuoc;
    private javax.swing.JButton btnQuanLyThuChi;
    private javax.swing.JButton btnThongTinBenhNhan;
    private javax.swing.JButton btnThongTinNhanVien;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblHinhNen;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblQuangCao;
    // End of variables declaration//GEN-END:variables

    public void dangXuat() {
        int dialogResult = JOptionPane.showConfirmDialog(this, "Đăng xuất khỏi chương trình ?",
                "Đăng xuất", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            ChaoMung chaoMung = new ChaoMung();
            chaoMung.setVisible(true);
            this.dispose();
        }
    }

}
