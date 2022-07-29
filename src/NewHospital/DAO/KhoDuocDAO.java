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
}
