/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewHospital.DAO;

import ConnectData.JDBC;
import NewHospital.Model.DS_ChoKham;
import NewHospital.Model.DS_ChoKham;
import NewHospital.Model.TT_BenhNhan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DanhSachKhamDAO {

    protected List<DS_ChoKham> selectBySql(String sql, Object... args) {
        List<DS_ChoKham> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBC.executeQuery(sql, args);
                while (rs.next()) {
                    DS_ChoKham entity = new DS_ChoKham();
                    entity.setSTT(rs.getInt("STT"));
                    entity.setHoTen(rs.getString("HoTen"));
                    entity.setCmnd(rs.getString("CMND"));
                    entity.setSoDT(rs.getString("SoDT"));
                    entity.setLoaiKhamBenh(rs.getString("LoaiKhamBenh"));
                    entity.setLichKham(rs.getDate("LichKham"));
                    entity.setTrieuChung(rs.getString("TrieuChung"));
                    entity.setHinhThuc(rs.getBoolean("HinhThuc"));
                    entity.setMaBN(rs.getString("MaBN"));
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

    public List<DS_ChoKham> selectAll() {
        String sql = "SELECT * FROM ListChoKham";
        return selectBySql(sql);
    }

    public DS_ChoKham selectById(String cmnd) {
        String sql = "SELECT * FROM ListChoKham WHERE Cmnd=?";
        List<DS_ChoKham> list = selectBySql(sql, cmnd);
        return list.size() > 0 ? list.get(0) : null;
    }
    public void insertBN(TT_BenhNhan model){
            String sql = "INSERT INTO BenhNhan (MaBN, HoTen, GioiTinh, NgaySinh, SoDT, Mail, CMND, DiaChi)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            JDBC.executeUpdate(sql, 
                    model.getMaBN(),
                    model.getHoTen(),
                    model.isGioiTinh(),
                    new java.sql.Date(model.getNgaySinh().getTime()),
                    model.getSoDT(),
                    model.getEmail(),
                    model.getCmnd(),
                    model.getDiaChi()
            );
    }
    public void insert(DS_ChoKham model) {
        String sql = "INSERT INTO ListChoKham (HoTen, CMND, SoDT, LoaiKhamBenh, LichKham, TrieuChung, HinhThuc, MaBN)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        JDBC.executeUpdate(sql,
                model.getHoTen(),
                model.getCmnd(),
                model.getSoDT(),
                model.getLoaiKhamBenh(),
                new java.sql.Date(model.getLichKham().getTime()),
                model.getTrieuChung(),
                model.isHinhThuc(),
                model.getMaBN()
        );
    }
    public void update(DS_ChoKham model){
        String sql= "UPDATE ListChoKham SET HoTen=?, CMND=?, SoDT=?, LoaiKhamBenh=?, LichKham=?, TrieuChung=?, HinhThuc=?, MaBN=?"
                + " Where STT=?";
        JDBC.executeUpdate(sql,
                model.getHoTen(), 
                model.getCmnd(), 
                model.getSoDT(), 
                model.getLoaiKhamBenh(), 
                new java.sql.Date(model.getLichKham().getTime()),
                model.getTrieuChung(),
                model.isHinhThuc(),
                model.getMaBN(),
                model.getSTT()
        );
    }
    
    public void delete(Integer STT){
        String sql="DELETE FROM ListChoKham WHERE STT=?";
        JDBC.executeUpdate(sql, STT);
    }
    

}
