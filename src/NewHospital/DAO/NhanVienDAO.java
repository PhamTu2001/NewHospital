/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewHospital.DAO;

import ConnectData.JDBC;
import NewHospital.Model.TT_NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhanVienDAO {

    protected List<TT_NhanVien> selectBySql(String sql, Object... args) {
        List<TT_NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBC.executeQuery(sql, args);
                while (rs.next()) {
                    TT_NhanVien entity = new TT_NhanVien();
                    entity.setMaNV(rs.getString("MaNV"));
                    entity.setHoTen(rs.getString("HoTen"));
                    entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                    entity.setNgaySinh(rs.getDate("NgaySinh"));
                    entity.setSoDT(rs.getString("SoDT"));
                    entity.setEmail(rs.getString("Email"));
                    entity.setDiaChi(rs.getString("DiaChi"));
                    entity.setChucVu(rs.getBoolean("ChucVu"));
//                    entity.setHinh(rs.getString("Hinh"));
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }
    
        public void insert(TT_NhanVien entity) {
        String sql="INSERT INTO NhanVien (MaNV, HoTen, GioiTinh, NgaySinh, SoDT, Email, DiaChi, Hinh, ChucVu) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
         JDBC.executeUpdate(sql,
             entity.getMaNV(),
             entity.getHoTen(),
             entity.isGioiTinh(),         
             entity.getNgaySinh(),
             entity.getSoDT(),
             entity.getEmail(),
             entity.getDiaChi(),
             entity.getHinh(),
//             entity.getHinh(),
             entity.isChucVu());
    }
        
        public void update(TT_NhanVien model) {
        String sql="UPDATE NhanVien SET HoTen=?, GioiTinh=?, NgaySinh=?, SoDT=?, Email=?, DiaChi=?, Hinh=?, ChucVu=? WHERE MaNV=?";
        JDBC.executeUpdate(sql,            
                 model.getHoTen(),
                 model.isGioiTinh(),
                 model.getNgaySinh(),
                 model.getSoDT(),
                 model.getEmail(),
                 model.getDiaChi(),
                 model.getHinh(),
                 model.isChucVu(),
                 model.getMaNV());
    }
            
        public void delete(String id) {
        String sql="DELETE FROM NhanVien WHERE MaNV=?";
        JDBC.executeUpdate(sql, id);
    }
    
    
    
    public List<TT_NhanVien> selectByKeyword(String keyword) {
        String sql="SELECT * FROM NhanVien WHERE HoTen LIKE ?";
        return selectBySql(sql, "%"+keyword+"%");
    }

    public List<TT_NhanVien> selectAll() {
        String sql = "SELECT * FROM NhanVien";
        return selectBySql(sql);
    }

    public TT_NhanVien selectById(String maNV) {
        String sql = "SELECT * FROM NhanVien WHERE MaNV=?";
        List<TT_NhanVien> list = selectBySql(sql, maNV);
        return list.size() > 0 ? list.get(0) : null;
    }
}
