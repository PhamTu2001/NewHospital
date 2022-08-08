/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package NewHospital.UI;

import NewHospital.DAO.DanhSachKhamDAO;
import NewHospital.Helper.XDate;
import NewHospital.Helper.dialogHelper;
import NewHospital.Model.DS_ChoKham;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSI GAMING
 */
public class DanhSachKham extends javax.swing.JInternalFrame {

    /**
     * Creates new form DanhSachKham1
     */
    public DanhSachKham() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgHinhThucKham = new javax.swing.ButtonGroup();
        PanelThongTIn = new javax.swing.JPanel();
        tabs = new javax.swing.JTabbedPane();
        pnlDanhSach = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhamBenh = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JToggleButton();
        btnKham = new javax.swing.JButton();
        pnlThongTin = new javax.swing.JPanel();
        txtHoTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSTT = new javax.swing.JTextField();
        txtCmnd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSoDT = new javax.swing.JTextField();
        cboLoaiKham = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTrieuChung = new javax.swing.JTextArea();
        rdoDatLichTruoc = new javax.swing.JRadioButton();
        rdoKhamTrucTiep = new javax.swing.JRadioButton();
        txtNgayKham = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JToggleButton();
        btnSua = new javax.swing.JToggleButton();
        txtMaBN = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Danh sách chờ khám");

        PanelThongTIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        pnlDanhSach.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tblKhamBenh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblKhamBenh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Họ tên", "CMND/CCCD", "Số điện thoại", "Loại khám", "Lịch khám", "Triệu Chứng", "Hình thức", "Mã BN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhamBenh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhamBenhMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhamBenh);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(530, 55));

        txtTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/search.png"))); // NOI18N
        btnTimKiem.setText("Tìm kiếm");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnKham.setBackground(new java.awt.Color(255, 255, 255));
        btnKham.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnKham.setForeground(new java.awt.Color(255, 51, 51));
        btnKham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/Heart.png"))); // NOI18N
        btnKham.setText("Thực hiện khám");
        btnKham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDanhSachLayout = new javax.swing.GroupLayout(pnlDanhSach);
        pnlDanhSach.setLayout(pnlDanhSachLayout);
        pnlDanhSachLayout.setHorizontalGroup(
            pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhSachLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
            .addGroup(pnlDanhSachLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnKham)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDanhSachLayout.setVerticalGroup(
            pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKham, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabs.addTab("Danh sách", pnlDanhSach);

        pnlThongTin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtHoTen.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtHoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoTenActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/Clien list.png"))); // NOI18N
        jLabel4.setText("Họ tên:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/Numbered list.png"))); // NOI18N
        jLabel5.setText("STT");

        txtSTT.setEditable(false);
        txtSTT.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        txtCmnd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/Calendar.png"))); // NOI18N
        jLabel6.setText("CMND/CCCD");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/Call.png"))); // NOI18N
        jLabel7.setText("SĐT:");

        txtSoDT.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        cboLoaiKham.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cboLoaiKham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Khám tổng quát", "Khám cột sống", "Khám tay, chân" }));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/Application form.png"))); // NOI18N
        jLabel9.setText("Loại khám bệnh:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/Date.png"))); // NOI18N
        jLabel10.setText("Lịch khám:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/List.png"))); // NOI18N
        jLabel11.setText("Triệu chứng bệnh:");

        txtTrieuChung.setColumns(20);
        txtTrieuChung.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtTrieuChung.setRows(5);
        jScrollPane2.setViewportView(txtTrieuChung);

        btgHinhThucKham.add(rdoDatLichTruoc);
        rdoDatLichTruoc.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        rdoDatLichTruoc.setForeground(new java.awt.Color(0, 153, 102));
        rdoDatLichTruoc.setText("Đặt lịch trước");

        btgHinhThucKham.add(rdoKhamTrucTiep);
        rdoKhamTrucTiep.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        rdoKhamTrucTiep.setForeground(new java.awt.Color(0, 153, 102));
        rdoKhamTrucTiep.setText("Khám trực tiếp");
        rdoKhamTrucTiep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoKhamTrucTiepActionPerformed(evt);
            }
        });

        txtNgayKham.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNgayKham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayKhamActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/User group.png"))); // NOI18N
        jLabel2.setText("Mã bệnh nhân");

        btnXoa.setBackground(new java.awt.Color(255, 204, 204));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 0, 0));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(102, 204, 255));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnSua.setForeground(new java.awt.Color(0, 153, 153));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/update.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        txtMaBN.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/Telephone.png"))); // NOI18N
        jLabel12.setText("Hình thức:");

        javax.swing.GroupLayout pnlThongTinLayout = new javax.swing.GroupLayout(pnlThongTin);
        pnlThongTin.setLayout(pnlThongTinLayout);
        pnlThongTinLayout.setHorizontalGroup(
            pnlThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboLoaiKham, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlThongTinLayout.createSequentialGroup()
                .addGroup(pnlThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(pnlThongTinLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlThongTinLayout.createSequentialGroup()
                        .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSTT, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlThongTinLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlThongTinLayout.createSequentialGroup()
                        .addComponent(rdoDatLichTruoc, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdoKhamTrucTiep)
                        .addGap(55, 339, Short.MAX_VALUE))
                    .addGroup(pnlThongTinLayout.createSequentialGroup()
                        .addGroup(pnlThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlThongTinLayout.createSequentialGroup()
                                .addComponent(btnXoa)
                                .addGap(18, 18, 18)
                                .addComponent(btnSua))
                            .addComponent(txtNgayKham, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCmnd, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaBN, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlThongTinLayout.setVerticalGroup(
            pnlThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtSTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCmnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMaBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cboLoaiKham))
                .addGap(15, 15, 15)
                .addGroup(pnlThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtNgayKham))
                .addGap(11, 11, 11)
                .addGroup(pnlThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoDatLichTruoc)
                    .addComponent(jLabel12)
                    .addComponent(rdoKhamTrucTiep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        tabs.addTab("Thông tin", pnlThongTin);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Danh sách chờ khám bệnh");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout PanelThongTInLayout = new javax.swing.GroupLayout(PanelThongTIn);
        PanelThongTIn.setLayout(PanelThongTInLayout);
        PanelThongTInLayout.setHorizontalGroup(
            PanelThongTInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
            .addGroup(PanelThongTInLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelThongTInLayout.setVerticalGroup(
            PanelThongTInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelThongTInLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tabs)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelThongTIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelThongTIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoTenActionPerformed

    private void rdoKhamTrucTiepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoKhamTrucTiepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoKhamTrucTiepActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnKhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhamActionPerformed
        
        PhieuKham phieuKham2 = new PhieuKham();
        getParent().add(phieuKham2);
        phieuKham2.show();
    }//GEN-LAST:event_btnKhamActionPerformed

    private void txtNgayKhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayKhamActionPerformed
        // TODO add your handling code here:
        //JInternalFrame phieuKham = new JInternalFrame();
    }//GEN-LAST:event_txtNgayKhamActionPerformed

    private void tblKhamBenhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhamBenhMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.row = tblKhamBenh.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblKhamBenhMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnSuaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelThongTIn;
    private javax.swing.ButtonGroup btgHinhThucKham;
    private javax.swing.JButton btnKham;
    private javax.swing.JToggleButton btnSua;
    private javax.swing.JToggleButton btnTimKiem;
    private javax.swing.JToggleButton btnXoa;
    private javax.swing.JComboBox<String> cboLoaiKham;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlDanhSach;
    private javax.swing.JPanel pnlThongTin;
    private javax.swing.JRadioButton rdoDatLichTruoc;
    private javax.swing.JRadioButton rdoKhamTrucTiep;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblKhamBenh;
    private javax.swing.JTextField txtCmnd;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaBN;
    private javax.swing.JTextField txtNgayKham;
    private javax.swing.JTextField txtSTT;
    private javax.swing.JTextField txtSoDT;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextArea txtTrieuChung;
    // End of variables declaration//GEN-END:variables

    int row = -1;
    DanhSachKhamDAO DSKhamdao = new DanhSachKhamDAO();

    public void init() {
        this.fillTable();

    }

    private void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblKhamBenh.getModel();
        model.setRowCount(0);
        try {
            List<DS_ChoKham> list = DSKhamdao.selectAll();
            for (DS_ChoKham dsk : list) {
                Object[] row = {
                    dsk.getSTT(),
                    dsk.getHoTen(),
                    dsk.getCmnd(),
                    dsk.getSoDT(),
                    dsk.getLoaiKhamBenh(),
                    dsk.getLichKham(),
                    dsk.getTrieuChung(),
                    dsk.isHinhThuc() ? "Đặt lịch trước" : "Khám trực tiếp",
                    dsk.getMaBN()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    //đổ dữ liệu lên form
    void edit() {
        String cmnd = (String) tblKhamBenh.getValueAt(this.row, 2);
        DS_ChoKham dsk = DSKhamdao.selectById(cmnd);
        this.setForm(dsk);
        //this.updateStatus();
        tabs.setSelectedIndex(1);
    }

    private void setForm(DS_ChoKham dsk) {
        txtHoTen.setText(dsk.getHoTen());
        txtSTT.setText(String.valueOf(dsk.getSTT()));
        txtCmnd.setText(dsk.getCmnd());
        txtSoDT.setText(dsk.getSoDT());
        txtMaBN.setText(dsk.getMaBN());
        cboLoaiKham.getModel().setSelectedItem(dsk.getLoaiKhamBenh());
        txtNgayKham.setText(XDate.toString(dsk.getLichKham(), "dd/MM/yyyy"));
        txtTrieuChung.setText(dsk.getTrieuChung());
        if (dsk.isHinhThuc()) {
            rdoDatLichTruoc.setSelected(true);
        } else {
            rdoKhamTrucTiep.setSelected(true);
        }
    }
    
    //lấy dữ liệu trên Form
    DS_ChoKham getForm(){ 
        DS_ChoKham dskham = new DS_ChoKham();
        //STT là int tự tăng +1
        dskham.setHoTen(txtHoTen.getText());
        dskham.setCmnd(txtCmnd.getText());
        dskham.setSoDT(txtSoDT.getText());
        dskham.setLoaiKhamBenh((String) cboLoaiKham.getSelectedItem());
        dskham.setLichKham(XDate.toDate(txtNgayKham.getText(), "dd/MM/yyyy"));
        dskham.setTrieuChung(txtTrieuChung.getText());
        dskham.setHinhThuc(rdoDatLichTruoc.isSelected());
        dskham.setMaBN(txtMaBN.getText());
        return dskham;
    }
    
    void update(){
        DS_ChoKham DSKmodel = this.getForm();
        try {
            DSKhamdao.update(DSKmodel);
            this.fillTable();
            dialogHelper.alert(this, "Cập nhật thành công!");
            tabs.setSelectedIndex(0);
        } 
        catch (Exception e) {
            dialogHelper.alert(this, "Cập nhật thất bại!");
        }
    }

    void delete(){
//        if(!Auth.isManager()){
//            MsgBox.alert(this, "Bạn không có quyền xóa khóa học!");
//        }
//        else{
            int stt = Integer.valueOf(txtSTT.getText());
            if(dialogHelper.confirm(this, "Bạn thực sự muốn xóa khóa học này?")){
                try {
                    DSKhamdao.delete(stt);
                    this.fillTable();
                    this.clearForm();
                    dialogHelper.alert(this, "Xóa thành công!");
                    tabs.setSelectedIndex(0);
                } 
                catch (Exception e) {
                    dialogHelper.alert(this, "Xóa thất bại!");
                }
            }
//        }
    }

    private void clearForm() {
        txtHoTen.setText("");
        txtSTT.setText("");
        txtMaBN.setText("");
        txtCmnd.setText("");
        txtNgayKham.setText("");
        txtSoDT.setText("");
        txtTrieuChung.setText("");
        cboLoaiKham.setSelectedIndex(-1);
        btgHinhThucKham.clearSelection();
    }
}
