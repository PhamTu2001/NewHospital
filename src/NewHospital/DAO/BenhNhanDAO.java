/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewHospital.DAO;

import ConnectData.JDBC;
import NewHospital.Model.KhoDuoc;
import NewHospital.Model.TT_BenhNhan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class BenhNhanDAO {
    protected List<TT_BenhNhan> selectBySql(String sql, Object...args){
        List<TT_BenhNhan> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBC.executeQuery(sql, args);
                while(rs.next()){
                    TT_BenhNhan entity=new TT_BenhNhan();
                    entity.setMaBN(rs.getString("MaBN"));
                    entity.setHoTen(rs.getString("HoTen"));
                    entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                    entity.setNgaySinh(rs.getDate("NgaySinh"));
                    entity.setSoDT(rs.getString("SoDT"));
                    entity.setEmail(rs.getString("Email"));
                    entity.setCmnd(rs.getString("CMND"));
                    entity.setDiaChi(rs.getString("DiaChi"));
                    list.add(entity);
                }
            } 
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }
    
    public List<TT_BenhNhan> selectAll(){
        String sql="SELECT * FROM BenhNhan";
        return selectBySql(sql);
    }
}
