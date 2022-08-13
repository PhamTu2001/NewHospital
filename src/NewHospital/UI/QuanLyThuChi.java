
package NewHospital.UI;

import NewHospital.DAO.ThuChiDAO;
import NewHospital.Helper.XDate;
import NewHospital.Helper.checked;
import NewHospital.Helper.dialogHelper;
import NewHospital.Model.ThuChi;
import java.awt.Desktop;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class QuanLyThuChi extends javax.swing.JInternalFrame {

    
    public QuanLyThuChi() {
        initComponents();
        init();
    }
    
    int row = -1;
    ThuChiDAO TCdao = new ThuChiDAO();

    public void init() {
        fillTable();
    }

    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblQuanLyThuChi.getModel();
        model.setRowCount(0);
        try {
            List<ThuChi> list = TCdao.selectAll();
            for (ThuChi tc : list) {
                Object[] row = {
                 tc.getMaGD(),
                 tc.getNoiDung(),
                 XDate.toString(tc.getNgayThucHien()),
                 tc.getMaNV(),
                 tc.getSoTien(),
                 tc.isLoai() ? "Thu" : "Chi",  
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    
    
    void setForm(ThuChi tc) {
        txtMaGiaoDich.setText(tc.getMaGD());
        txtNgayThucHien.setText(XDate.toString(tc.getNgayThucHien(),"dd/MM/yyyy"));
        txtMaNV.setText(tc.getMaNV());
        txtNoiDungGiaoDich.setText(tc.getNoiDung());
        txtSoTienGiaoDich.setText(String.valueOf(tc.getSoTien()));
        if (tc.isLoai()) {
            rdoThu.setSelected(true);
        } else {
            rdoChi.setSelected(true);
        }
    }

        ThuChi getModel() {
        ThuChi model = new ThuChi();
        model.setMaGD(txtMaGiaoDich.getText());
        model.setNoiDung(txtNoiDungGiaoDich.getText());
        model.setNgayThucHien(XDate.toDate(txtNgayThucHien.getText(),"dd/MM/yyyy"));
        model.setSoTien(Float.valueOf(txtSoTienGiaoDich.getText()));
        model.setLoai(rdoThu.isSelected());
        model.setMaNV(txtMaNV.getText());
        return model;
    }
    
    void insert() {
        ThuChi nh = getModel();
        try {
            TCdao.insert(nh);
            this.fillTable();
            this.clearForm();
            dialogHelper.alert(this, "Insert successfully");
        } catch (Exception e) {
            dialogHelper.alert(this, "Insert unsucessfully!");
        }
    }
    void update(){
        ThuChi tc = getModel();
        try{
            TCdao.update(tc);
            this.fillTable();
            this.clearForm();
            dialogHelper.alert(this, "Update successfully");
        }
        catch(Exception e){
            dialogHelper.alert(this, "Update unsucessfully!");
        }
    }
    void delete() {
            String magd = (String) txtMaGiaoDich.getText();
            if (dialogHelper.confirm(this, "Do you want to delete this?")) {
                try {
                    TCdao.delete(magd);
                    this.fillTable();
                    this.clearForm();
                    dialogHelper.alert(this, "Delete sucessfully!");
                } catch (Exception e) {
                    dialogHelper.alert(this, "Delete unsucessfully!");
                }
            }
        }
    
    void clearForm() {
//        ThuChi nh = new ThuChi();
//        this.setForm(nh);
//        this.row = -1;
//        this.updateStatus();
          this.setForm(new ThuChi());
          this.setStatus(true);
    }
    
    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblQuanLyThuChi.getRowCount() - 1);
        //Form state
        txtMaNV.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnXoa.setEnabled(!edit);
        btnSua.setEnabled(!edit);
    }
    //2 chế độ như các form trước
    void setStatus(boolean insertable) {
        btnThem.setEnabled(insertable);
        btnSua.setEnabled(!insertable);
        btnXoa.setEnabled(!insertable);
        boolean first = this.row > 0;
        boolean last = this.row < tblQuanLyThuChi.getRowCount() - 1;
        btnFirst.setEnabled(!insertable && first);
        btnPrew.setEnabled(!insertable && first);
        btnLast.setEnabled(!insertable && last);
        btnNext.setEnabled(!insertable && last);
    }
    
    void edit(){
        try {
            String magd = (String) tblQuanLyThuChi.getValueAt(this.row, 0);
            ThuChi model = TCdao.selectById(magd);
            if (model != null) {
                this.setForm(model);
                this.setStatus(false);
            }
            jTabbedPane4.setSelectedIndex(1);
        } catch (Exception e) {
            dialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    public void openFile(String file){
        try{
            File path = new File(file);
            Desktop.getDesktop().open(path);
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnThuChi = new javax.swing.ButtonGroup();
        PanelThongTin = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQuanLyThuChi = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txtMaGiaoDich = new javax.swing.JTextField();
        txtSoTienGiaoDich = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtNoiDungGiaoDich = new javax.swing.JTextArea();
        txtNgayThucHien = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rdoThu = new javax.swing.JRadioButton();
        rdoChi = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnIn = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrew = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Quản lý Thu chi");

        jTabbedPane4.setToolTipText("");
        jTabbedPane4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        tblQuanLyThuChi.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        tblQuanLyThuChi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã GD", "Nội Dung", "Ngày Thực hiện", "Người thực hiện", "Số tiền", "Loại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblQuanLyThuChi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQuanLyThuChiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblQuanLyThuChi);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/printer.png"))); // NOI18N
        jButton2.setText("In danh sách");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/printer.png"))); // NOI18N
        jButton3.setText("Xuất Excel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Danh sách", jPanel3);

        txtMaGiaoDich.setForeground(new java.awt.Color(0, 153, 153));
        txtMaGiaoDich.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMaGiaoDich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaGiaoDichActionPerformed(evt);
            }
        });

        txtSoTienGiaoDich.setForeground(new java.awt.Color(0, 153, 153));
        txtSoTienGiaoDich.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txtNoiDungGiaoDich.setColumns(20);
        txtNoiDungGiaoDich.setForeground(new java.awt.Color(0, 153, 153));
        txtNoiDungGiaoDich.setRows(5);
        txtNoiDungGiaoDich.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(txtNoiDungGiaoDich);

        txtNgayThucHien.setForeground(new java.awt.Color(0, 153, 153));
        txtNgayThucHien.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNgayThucHien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayThucHienActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/Flow block.png"))); // NOI18N
        jLabel1.setText("Phân Loại:");

        btnThuChi.add(rdoThu);
        rdoThu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdoThu.setForeground(new java.awt.Color(153, 153, 0));
        rdoThu.setText("Thu");

        btnThuChi.add(rdoChi);
        rdoChi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdoChi.setForeground(new java.awt.Color(153, 153, 0));
        rdoChi.setText("Chi");

        btnThem.setBackground(new java.awt.Color(204, 255, 204));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/plus.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 204, 204));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(102, 204, 255));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/update.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnIn.setBackground(new java.awt.Color(204, 204, 204));
        btnIn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/printer.png"))); // NOI18N
        btnIn.setText("In");
        btnIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInActionPerformed(evt);
            }
        });

        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/dau.png"))); // NOI18N
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/lui.png"))); // NOI18N
        btnPrew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrewActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFirst)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnPrew)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(btnNext)
                        .addGap(30, 30, 30)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLast)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnIn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnPrew, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnLast, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/Info.png"))); // NOI18N
        jLabel2.setText("Mã giao dịch:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/Calendar.png"))); // NOI18N
        jLabel3.setText("Ngày thực hiện:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/Notes.png"))); // NOI18N
        jLabel4.setText("Nội dung:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/Money.png"))); // NOI18N
        jLabel5.setText("Số tiền:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Lưu ý: Vui lòng kiểm tra thông tin chính xác trước khi thực hiện thao tác tiếp theo..!");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewHospital/Icons/User.png"))); // NOI18N
        jLabel8.setText("Người thực hiện:");

        txtMaNV.setForeground(new java.awt.Color(0, 153, 153));
        txtMaNV.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(rdoThu, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rdoChi, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoTienGiaoDich, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                                .addComponent(txtMaGiaoDich, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtNgayThucHien, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaGiaoDich)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNgayThucHien, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoTienGiaoDich, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoThu)
                    .addComponent(rdoChi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Phiếu Thu - Chi ");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        jTabbedPane4.addTab("Thông Tin", jPanel4);

        javax.swing.GroupLayout PanelThongTinLayout = new javax.swing.GroupLayout(PanelThongTin);
        PanelThongTin.setLayout(PanelThongTinLayout);
        PanelThongTinLayout.setHorizontalGroup(
            PanelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );
        PanelThongTinLayout.setVerticalGroup(
            PanelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(PanelThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            Boolean print = tblQuanLyThuChi.print();
            if (print) {
                JOptionPane.showMessageDialog(this, "Done !", "Information", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Error !", "Printer", JOptionPane.ERROR_MESSAGE);
            }
        } catch (PrinterException ex) {
//            Logger.getLogger(ThuChi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtMaGiaoDichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaGiaoDichActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaGiaoDichActionPerformed

    private void txtNgayThucHienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayThucHienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayThucHienActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if(checked.checkNullText(txtMaGiaoDich)&&
           checked.checkNullText(txtNgayThucHien)&&
           checked.checkNullText(txtMaNV) &&
           checked.checkNullText(txtSoTienGiaoDich)){
           if(checked.checkDate(txtNgayThucHien)){
              if(rdoThu.isSelected() == false & rdoChi.isSelected() == false){
                  dialogHelper.alert(this, "Vui lòng chọn loại giao dịch !");
              }
              else{
                  update(); 
              }
           } 
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnInActionPerformed

    private void txtMaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNVActionPerformed

    private void tblQuanLyThuChiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuanLyThuChiMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.row = tblQuanLyThuChi.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblQuanLyThuChiMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if(checked.checkNullText(txtMaGiaoDich)&&
           checked.checkNullText(txtNgayThucHien)&&
           checked.checkNullText(txtMaNV) &&
           checked.checkNullText(txtSoTienGiaoDich)){
           if(checked.checkDate(txtNgayThucHien)){
              if(rdoThu.isSelected() == false & rdoChi.isSelected() == false){
                  dialogHelper.alert(this, "Vui lòng chọn loại giao dịch !");
              }
              else{
                  insert(); 
              }
           } 
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        this.row = 0;
        this.edit();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrewActionPerformed
        this.row--;
        this.edit();
    }//GEN-LAST:event_btnPrewActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
       this.row++;
       this.edit();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        this.row = tblQuanLyThuChi.getRowCount() - 1;
            this.edit(); 
    }//GEN-LAST:event_btnLastActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
           JFileChooser jFileChooser = new JFileChooser();
           jFileChooser.showSaveDialog(this);
           File saveFile = jFileChooser.getSelectedFile();
           
           if(saveFile != null){
               saveFile = new File(saveFile.toString()+".xlsx");
               Workbook wb = new XSSFWorkbook();
               Sheet sheet = wb.createSheet("customer");
               
               Row rowCol = sheet.createRow(0);
               for(int i=0;i<tblQuanLyThuChi.getColumnCount();i++){
                   Cell cell = rowCol.createCell(i);
                   cell.setCellValue(tblQuanLyThuChi.getColumnName(i));
               }
               
               for(int j=0;j<tblQuanLyThuChi.getRowCount();j++){
                   Row row = sheet.createRow(j+1);
                   for(int k=0;k<tblQuanLyThuChi.getColumnCount();k++){
                       Cell cell = row.createCell(k);
                       if(tblQuanLyThuChi.getValueAt(j, k)!=null){
                           cell.setCellValue(tblQuanLyThuChi.getValueAt(j, k).toString());
                       }
                   }
               }
               FileOutputStream out = new FileOutputStream(new File(saveFile.toString()));
               wb.write(out);
               wb.close();
               out.close();
               openFile(saveFile.toString());
           }else{
               JOptionPane.showMessageDialog(null,"Error al generar archivo");
           }
       }catch(FileNotFoundException e){
           System.out.println(e);
       }catch(IOException io){
           System.out.println(io);
       }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelThongTin;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnIn;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrew;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.ButtonGroup btnThuChi;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JRadioButton rdoChi;
    private javax.swing.JRadioButton rdoThu;
    private javax.swing.JTable tblQuanLyThuChi;
    private javax.swing.JTextField txtMaGiaoDich;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgayThucHien;
    private javax.swing.JTextArea txtNoiDungGiaoDich;
    private javax.swing.JTextField txtSoTienGiaoDich;
    // End of variables declaration//GEN-END:variables
}
