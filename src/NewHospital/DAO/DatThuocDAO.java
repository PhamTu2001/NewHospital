/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewHospital.DAO;

import ConnectData.JDBC;
import NewHospital.Model.DatThuoc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MSI GAMING
 */
public class DatThuocDAO {
    protected List<DatThuoc> selectBySql(String sql, Object... args) {
        List<DatThuoc> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBC.executeQuery(sql, args);
                while (rs.next()) {
                    DatThuoc entity = new DatThuoc();
                    entity.setTenThuoc(rs.getString("TenThuoc"));
                    entity.setSoLuong(rs.getInt("Soluong"));
                    entity.setGhiChu(rs.getString("GhiChu"));
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);

        }
        return list;
    }

    public List<DatThuoc> selectAll() {
        String sql = "SELECT * FROM DatThuoc";
        return selectBySql(sql);
    }
    
    public void insert(DatThuoc model) {
        String sql = "INSERT INTO DatThuoc (TenThuoc, Soluong, GhiChu) VALUES (?, ?, ?)";
        JDBC.executeUpdate(sql,
                model.getTenThuoc(),
                model.getSoLuong(),
                model.getGhiChu());
    }
}
