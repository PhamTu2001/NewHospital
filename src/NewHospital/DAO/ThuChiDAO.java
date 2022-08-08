/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewHospital.DAO;

import ConnectData.JDBC;
import NewHospital.Model.ThuChi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yukth
 */
public class ThuChiDAO {
        protected List<ThuChi> selectBySql(String sql, Object... args) {
        List<ThuChi> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBC.executeQuery(sql, args);
                while (rs.next()) {
                    ThuChi entity = new ThuChi();
                    entity.setMaGD(rs.getString("MaGD"));
                    entity.setNoiDung(rs.getString("NoiDung"));
                    entity.setNgayThucHien(rs.getDate("NgayThucHien"));
                    entity.setSoTien((float)rs.getDouble("SoTien"));
                    entity.setLoai(rs.getBoolean("Loai"));
                    entity.setMaNV(rs.getString("MaNV"));
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
    
        public void insert(ThuChi entity) {
        String sql="INSERT INTO ThuChi (MaGD, NoiDung, NgayThucHien, SoTien, Loai, MaNV) VALUES (?, ?, ?, ?, ?, ?)";
         JDBC.executeUpdate(sql,
             entity.getMaGD(),
             entity.getNoiDung(),
             new java.sql.Date(entity.getNgayThucHien().getTime()),         
             entity.getSoTien(),
             entity.isLoai(),
             entity.getMaNV());
    }
        
        public void update(ThuChi model) {
        String sql="UPDATE ThuChi SET NoiDung=?, NgayThucHien=?, SoTien=?, Loai=?, MaNV=? WHERE MaGD=?";
        JDBC.executeUpdate(sql,            
                 model.getNoiDung(),
                 new java.sql.Date(model.getNgayThucHien().getTime()),
                 model.getSoTien(),
                 model.isLoai(),
                 model.getMaNV(),
                 model.getMaGD());
    }
            
        public void delete(String id) {
        String sql="DELETE FROM ThuChi WHERE MaGD=?";
        JDBC.executeUpdate(sql, id);
    }
    
    

    public List<ThuChi> selectAll() {
        String sql = "SELECT * FROM ThuChi";
        return selectBySql(sql);
    }

    public ThuChi selectById(String maGD) {
        String sql = "SELECT * FROM ThuChi WHERE MaGD=?";
        List<ThuChi> list = selectBySql(sql, maGD);
        return list.size() > 0 ? list.get(0) : null;
    }
}
