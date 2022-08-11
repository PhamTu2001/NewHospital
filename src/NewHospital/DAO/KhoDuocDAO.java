/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewHospital.DAO;

import ConnectData.JDBC;
import NewHospital.Model.KhoDuoc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class KhoDuocDAO {
    protected List<KhoDuoc> selectBySql(String sql, Object...args){
        List<KhoDuoc> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBC.executeQuery(sql, args);
                while(rs.next()){
                    KhoDuoc entity=new KhoDuoc();
                    entity.setMaThuoc(rs.getString("MaThuoc"));
                    entity.setTenThuoc(rs.getString("TenThuoc"));
                    entity.setHanSuDung(rs.getDate("HanSuDung"));
                    entity.setNgayNhap(rs.getDate("NgayNhap"));
                    entity.setNgayXuat(rs.getDate("NgayXuat"));
                    entity.setSoLuong(rs.getInt("SoLuong"));
                    entity.setGhiChu(rs.getString("GhiChu"));
                    list.add(entity);
                }
            }
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            throw new RuntimeException(ex);
            
        }
        return list;
    }
    
    public List<KhoDuoc> selectAll(){
        String sql="SELECT * FROM KhoDuoc";
        return selectBySql(sql);
    }
    
    public KhoDuoc selectById(String maThuoc){
        String sql="SELECT * FROM KhoDuoc WHERE MaThuoc=?";
        List<KhoDuoc> list = selectBySql(sql, maThuoc);
        return list.size() > 0 ? list.get(0) : null;
    }
     public void insert(KhoDuoc model) {
        String sql = "INSERT INTO KhoDuoc (MaThuoc, TenThuoc, HanSuDung, NgayNhap, NgayXuat, Soluong, GhiChu) VALUES (?, ?, ?, ?, ?, ?, ?)";
        JDBC.executeUpdate(sql,
                model.getMaThuoc(),
                model.getTenThuoc(),
                new java.sql.Date(model.getHanSuDung().getTime()),
                new java.sql.Date(model.getNgayNhap().getTime()),
                new java.sql.Date(model.getNgayXuat().getTime()),
                model.getSoLuong(),
                model.getGhiChu());
    }

    public void update(KhoDuoc model,String mathuoc) {
        String sql = "UPDATE KhoDuoc SET TenThuoc=?, HanSuDung=?, NgayNhap=?, NgayXuat=?, Soluong=?, GhiChu=? where MaThuoc=?";
        JDBC.executeUpdate(sql,
                model.getTenThuoc(),
                new java.sql.Date(model.getHanSuDung().getTime()),
                new java.sql.Date(model.getNgayNhap().getTime()),
                new java.sql.Date(model.getNgayXuat().getTime()),
                model.getSoLuong(),
                model.getGhiChu(),
                mathuoc);
    }

    public void delete(String MaThuoc) {
        String sql = "DELETE FROM KhoDuoc WHERE MaThuoc=?";
        JDBC.executeUpdate(sql, MaThuoc);
    }
}
