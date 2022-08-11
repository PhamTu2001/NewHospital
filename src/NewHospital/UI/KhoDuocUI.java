/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package NewHospital.UI;

import NewHospital.DAO.DatThuocDAO;
import NewHospital.DAO.KhoDuocDAO;
import NewHospital.Helper.XDate;
import NewHospital.Helper.checked;
import NewHospital.Model.DatThuoc;
import NewHospital.Model.KhoDuoc;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSI GAMING
 */
public class KhoDuocUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form KhoDuoc1
     */
    public KhoDuocUI() {
        initComponents();
        init();
    }
        int row = -1;
        KhoDuocDAO KDdao = new KhoDuocDAO();
        DatThuocDAO DTdao = new DatThuocDAO();

    void checkTrungMaThuoc(){
        boolean check = true;
        String mathuoc = txtMaThuoc2.getText();
        List<KhoDuoc> list = (List<KhoDuoc>) KDdao.selectAll();
        for(int i = 0; i < list.size();i++){
            if(list.get(i).getMaThuoc().equalsIgnoreCase(mathuoc)){
                JOptionPane.showMessageDialog(this, "Mã thuốc này tồn tại !");
                check = false;
            }
        }
        if(check == true){
            them();
        }
    }
    void checkDatThuoc(){
        boolean check = true;
        String mathuoc = txtTenThuoc1.getText();
        List<KhoDuoc> list = (List<KhoDuoc>) KDdao.selectAll();
        for(int i = 0; i < list.size();i++){
            if(list.get(i).getMaThuoc().equalsIgnoreCase(mathuoc)){
                check = false;
            }
        }
        if(check == false){
            dat();
        }
        else{
                JOptionPane.showMessageDialog(this, "Mã thuốc không có trong Kho Dược !");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelThongTin = new javax.swing.JPanel();
        tabs = new javax.swing.JTabbedPane();
        pnlDanhSach = new javax.swing.JPanel();
        pnlDatThuoc = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTenThuoc1 = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        btnDat = new javax.swing.JButton();
        pnlDSDatThuoc = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSachDatThuoc = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblKhoDuoc = new javax.swing.JTable();
        pnlFormThongTIn = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btnLamMoi = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMaThuoc2 = new javax.swing.JTextField();
        txtTenThuoc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNgayNhap = new javax.swing.JTextField();
        txtNgayXuat = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtHSD = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtSoLuong2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtGhiChu2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Kho dược");

        PanelThongTin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabs.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/Info.png"))); // NOI18N
        jLabel5.setText("Mã thuốc");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/Numbered list.png"))); // NOI18N
        jLabel6.setText("Số Lượng");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/Notes.png"))); // NOI18N
        jLabel7.setText("Ghi Chú");

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane2.setViewportView(txtGhiChu);

        btnDat.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnDat.setForeground(new java.awt.Color(0, 0, 204));
        btnDat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/Add to basket.png"))); // NOI18N
        btnDat.setText("Đặt ngay");
        btnDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDatThuocLayout = new javax.swing.GroupLayout(pnlDatThuoc);
        pnlDatThuoc.setLayout(pnlDatThuocLayout);
        pnlDatThuocLayout.setHorizontalGroup(
            pnlDatThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatThuocLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatThuocLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenThuoc1))
                    .addGroup(pnlDatThuocLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(pnlDatThuocLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnlDatThuocLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(btnDat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDatThuocLayout.setVerticalGroup(
            pnlDatThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatThuocLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDatThuocLayout.createSequentialGroup()
                        .addComponent(txtTenThuoc1)
                        .addGap(8, 8, 8)))
                .addGroup(pnlDatThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        tblDanhSachDatThuoc.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        tblDanhSachDatThuoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Thuốc", "Số Lượng", "Ghi Chú"
            }
        ));
        jScrollPane1.setViewportView(tblDanhSachDatThuoc);

        javax.swing.GroupLayout pnlDSDatThuocLayout = new javax.swing.GroupLayout(pnlDSDatThuoc);
        pnlDSDatThuoc.setLayout(pnlDSDatThuocLayout);
        pnlDSDatThuocLayout.setHorizontalGroup(
            pnlDSDatThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDSDatThuocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDSDatThuocLayout.setVerticalGroup(
            pnlDSDatThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDSDatThuocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Đặt Thuốc");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Danh Sách Thuốc Đang Đặt :");

        tblKhoDuoc.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        tblKhoDuoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Thuốc", "Tên Thuốc", "HSD", "Ngày Nhập ", "Ngày Xuất", "Số Lượng", "Ghi Chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhoDuoc.setFocusable(false);
        tblKhoDuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhoDuocMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblKhoDuoc);

        javax.swing.GroupLayout pnlDanhSachLayout = new javax.swing.GroupLayout(pnlDanhSach);
        pnlDanhSach.setLayout(pnlDanhSachLayout);
        pnlDanhSachLayout.setHorizontalGroup(
            pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDanhSachLayout.createSequentialGroup()
                        .addGroup(pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlDatThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlDSDatThuoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlDanhSachLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlDanhSachLayout.setVerticalGroup(
            pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlDatThuoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDSDatThuoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabs.addTab("Danh sách", pnlDanhSach);

        btnLamMoi.setBackground(new java.awt.Color(204, 204, 255));
        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnLamMoi.setForeground(new java.awt.Color(102, 102, 255));
        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/refresh.png"))); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 153, 153));
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
        btnSua.setForeground(new java.awt.Color(0, 51, 204));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/update.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/dau.png"))); // NOI18N
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/lui.png"))); // NOI18N
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/tien.png"))); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/cuoi.png"))); // NOI18N
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(153, 255, 153));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnThem.setForeground(new java.awt.Color(0, 153, 0));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(btnLamMoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnFirst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
            .addComponent(btnPrevious, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLast, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLamMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/Info.png"))); // NOI18N
        jLabel1.setText("Mã Thuốc");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/Heart.png"))); // NOI18N
        jLabel8.setText("Tên Thuốc");

        txtTenThuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenThuocActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 204));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/Date.png"))); // NOI18N
        jLabel9.setText("Ngày nhập");

        txtNgayNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayNhapActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 204));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/Date.png"))); // NOI18N
        jLabel10.setText("Ngày xuất");

        txtHSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHSDActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 204));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/Calendar.png"))); // NOI18N
        jLabel11.setText("Hạn sử dụng");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 204));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/Numbered list.png"))); // NOI18N
        jLabel12.setText("Số Lượng");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 204));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/Notes.png"))); // NOI18N
        jLabel13.setText("Ghi chú ");

        txtGhiChu2.setColumns(20);
        txtGhiChu2.setRows(5);
        jScrollPane4.setViewportView(txtGhiChu2);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenThuoc, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(txtNgayNhap)
                            .addComponent(txtMaThuoc2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoLuong2)
                            .addComponent(txtHSD)
                            .addComponent(txtNgayXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 647, Short.MAX_VALUE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaThuoc2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSoLuong2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHSD, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNgayXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("THÔNG TIN DƯỢC PHẨM");

        javax.swing.GroupLayout pnlFormThongTInLayout = new javax.swing.GroupLayout(pnlFormThongTIn);
        pnlFormThongTIn.setLayout(pnlFormThongTInLayout);
        pnlFormThongTInLayout.setHorizontalGroup(
            pnlFormThongTInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormThongTInLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormThongTInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlFormThongTInLayout.setVerticalGroup(
            pnlFormThongTInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormThongTInLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabs.addTab("Thông Tin", pnlFormThongTIn);

        javax.swing.GroupLayout PanelThongTinLayout = new javax.swing.GroupLayout(PanelThongTin);
        PanelThongTin.setLayout(PanelThongTinLayout);
        PanelThongTinLayout.setHorizontalGroup(
            PanelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
        );
        PanelThongTinLayout.setVerticalGroup(
            PanelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelThongTinLayout.createSequentialGroup()
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelThongTin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNgayNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayNhapActionPerformed

    private void txtTenThuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenThuocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenThuocActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
xoa();    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void tblKhoDuocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhoDuocMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.row = tblKhoDuoc.getSelectedRow();
            //JOptionPane.showMessageDialog(this, "double click");
            this.edit();
        }
    }//GEN-LAST:event_tblKhoDuocMouseClicked

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void txtHSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHSDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHSDActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        previous();
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if(checked.checkNullText(txtMaThuoc2) &&
               checked.checkNullText(txtSoLuong2) &&
               checked.checkNullText(txtTenThuoc) &&
               checked.checkNullText(txtHSD) &&
               checked.checkNullText(txtNgayNhap) &&
               checked.checkMoTaCD(txtGhiChu2)){
               if(checked.checkMaThuoc(txtMaThuoc2) &&
                  checked.checkSoLuong(txtSoLuong2) &&
                  checked.checkName(txtTenThuoc) &&
                  checked.checkDate(txtHSD) &&
                  checked.checkDate(txtNgayNhap)){
                  checkTrungMaThuoc();
               }
            }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
       if(checked.checkNullText(txtMaThuoc2) &&
               checked.checkNullText(txtSoLuong2) &&
               checked.checkNullText(txtTenThuoc) &&
               checked.checkNullText(txtHSD) &&
               checked.checkNullText(txtNgayNhap) &&
               checked.checkMoTaCD(txtGhiChu2)){
               if(checked.checkMaThuoc(txtMaThuoc2) &&
                  checked.checkSoLuong(txtSoLuong2) &&
                  checked.checkName(txtTenThuoc) &&
                  checked.checkDate(txtHSD) &&
                  checked.checkDate(txtNgayNhap)){
                  sua();
               }
            }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnDatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatActionPerformed
        if(checked.checkNullText(txtTenThuoc1) &&
           checked.checkNullText(txtSoLuong)){
          if(checked.checkMaThuoc(txtTenThuoc1) &&
             checked.checkSoLuong(txtSoLuong)){
             checkDatThuoc();
          }
        }
    }//GEN-LAST:event_btnDatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelThongTin;
    private javax.swing.JButton btnDat;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel pnlDSDatThuoc;
    private javax.swing.JPanel pnlDanhSach;
    private javax.swing.JPanel pnlDatThuoc;
    private javax.swing.JPanel pnlFormThongTIn;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblDanhSachDatThuoc;
    private javax.swing.JTable tblKhoDuoc;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextArea txtGhiChu2;
    private javax.swing.JTextField txtHSD;
    private javax.swing.JTextField txtMaThuoc2;
    private javax.swing.JTextField txtNgayNhap;
    private javax.swing.JTextField txtNgayXuat;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtSoLuong2;
    private javax.swing.JTextField txtTenThuoc;
    private javax.swing.JTextField txtTenThuoc1;
    // End of variables declaration//GEN-END:variables


    public void init() {
        this.fillTable();
        this.row = -1;
        this.fillTable1();

        this.updateStatus();
    }

    //đổ dữ liệu lên table
    public void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblKhoDuoc.getModel();
        model.setRowCount(0);
        try {
            List<KhoDuoc> list = KDdao.selectAll();
            for (KhoDuoc kd : list) {
                Object[] row = {
                    kd.getMaThuoc(),
                    kd.getTenThuoc(),
                    kd.getHanSuDung(),
                    kd.getNgayNhap(),
                    kd.getNgayXuat(),
                    kd.getSoLuong(),
                    kd.getGhiChu()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    //đổ dữ liệu lên form
    void edit() {
        String maThuoc = (String) tblKhoDuoc.getValueAt(this.row, 0);
        KhoDuoc kd = KDdao.selectById(maThuoc);
        this.setForm(kd);
        this.updateStatus();
        tabs.setSelectedIndex(1);
    }

    void setForm(KhoDuoc kd) {
        txtMaThuoc2.setText(kd.getMaThuoc());
        txtTenThuoc.setText(kd.getTenThuoc());
        txtSoLuong2.setText(String.valueOf(kd.getSoLuong()));
        txtHSD.setText(XDate.toString(kd.getHanSuDung(), "dd/MM/yyyy"));
        txtNgayNhap.setText(XDate.toString(kd.getNgayNhap(), "dd/MM/yyyy"));
        txtNgayXuat.setText(XDate.toString(kd.getNgayXuat(), "dd/MM/yyyy"));
        txtGhiChu2.setText(kd.getGhiChu());
    }

    //lấy dữ liệu từ form
    KhoDuoc getForm() {
        KhoDuoc kd = new KhoDuoc();
        kd.setMaThuoc(txtMaThuoc2.getText());
        kd.setTenThuoc(txtTenThuoc.getText());
        kd.setSoLuong(Integer.valueOf(txtSoLuong2.getText()));
        kd.setHanSuDung(XDate.toDate(txtHSD.getText(), "dd/MM/yyyy"));
        kd.setNgayNhap(XDate.toDate(txtNgayNhap.getText(), "dd/MM/yyyy"));
        kd.setNgayXuat(XDate.toDate(txtNgayXuat.getText(), "dd/MM/yyyy"));
        kd.setGhiChu(txtGhiChu2.getText());
        return kd;
    }

    public void fillTable1() {
        DefaultTableModel model = (DefaultTableModel) tblDanhSachDatThuoc.getModel();
        model.setRowCount(0);
        try {
            List<DatThuoc> list = DTdao.selectAll();
            for (DatThuoc kd : list) {
                Object[] row = {
                    kd.getTenThuoc(),
                    kd.getSoLuong(),
                    kd.getGhiChu()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    DatThuoc getForm1() {
        DatThuoc dt = new DatThuoc();
        dt.setTenThuoc(txtTenThuoc1.getText());
        dt.setSoLuong(Integer.valueOf(txtSoLuong.getText()));
        dt.setGhiChu(txtGhiChu.getText());
        return dt;
    }

    //nút điều hướng table
    void first() {
        this.row = 0;
        this.edit();
    }

    void previous() {
        if (this.row > 0) {
            this.row--;
            this.edit();
        }
    }

    void next() {
        if (this.row < tblKhoDuoc.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
    }

    void last() {
        this.row = tblKhoDuoc.getRowCount() - 1;
        this.edit();
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblKhoDuoc.getRowCount() - 1);
        // Trạng thái form
        txtMaThuoc2.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);

        // Trạng thái điều hướng
        btnFirst.setEnabled(edit && !first);
        btnPrevious.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);
    }

    public void clearForm() {
        txtMaThuoc2.setText("");
        txtMaThuoc2.setEditable(true);
        txtSoLuong2.setText("");
        txtHSD.setText("");
        txtNgayNhap.setText("");
        txtNgayXuat.setText("");
        txtTenThuoc.setText("");
        txtGhiChu2.setText("");
        btnThem.setEnabled(true);
        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
    }

    public void xoa() {
        String mathuoc = txtMaThuoc2.getText();
        try {
            KDdao.delete(mathuoc);
            this.fillTable();
            this.clearForm();
            JOptionPane.showMessageDialog(this, "Xóa thành công !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Xóa thất bại !");
        }
    }

    public void them() {
        KhoDuoc kd = getForm();
        try {
            KDdao.insert(kd);
            this.fillTable();
            this.clearForm();
            JOptionPane.showMessageDialog(this, "Thêm mới thành công !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
            JOptionPane.showMessageDialog(this, "Thêm mới thất bại !");
        }
    }

    public void sua() {
        KhoDuoc kd = getForm();
        String mathuoc = txtMaThuoc2.getText();
        try {
            KDdao.update(kd, mathuoc);
            this.fillTable();
            JOptionPane.showMessageDialog(this, "Cập nhật thành công !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }

    public void dat() {
        DatThuoc dt = getForm1();
        try {
            DTdao.insert(dt);
            this.fillTable1();
            txtTenThuoc1.setText("");
            txtSoLuong.setText("");
            txtGhiChu.setText("");
            JOptionPane.showMessageDialog(this, "Đặt thuốc thành công !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
            JOptionPane.showMessageDialog(this, "Đặt thuốc thất bại !");
        }
    }
}
