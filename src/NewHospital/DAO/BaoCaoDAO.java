/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewHospital.DAO;

import ConnectData.JDBC;
import NewHospital.Model.BaoCao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class BaoCaoDAO {

    protected List<BaoCao> selectBySql(String sql, Object... args) {
        List<BaoCao> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBC.executeQuery(sql, args);
                while (rs.next()) {
                    BaoCao entity = new BaoCao();
                    entity.setMaBC(rs.getString("MaBC"));
                    entity.setNoiDung(rs.getString("NoiDung"));
                    entity.setNoiLuu(rs.getString("NoiLuu"));
                    entity.setThoiGianLuu(rs.getDate("ThoiGianLuu"));
                    entity.setMaNV(rs.getString("MaNV"));
                    //entity.setHoTen(rs.getString("HoTen"));
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

    public List<BaoCao> selectAll() {
        String sql2 = "select MaBC, NoiDung, NoiLuu, ThoiGianLuu, HoTen from BaoCao\n"
                + "inner join NhanVien on BaoCao.MaNV = NhanVien.MaNV";
        String sql = "select * from BaoCao";
        return selectBySql(sql);
    }

    public BaoCao selectById(String maThuoc) {
        String sql = "SELECT * FROM BaoCao WHERE MaBC=?";
        List<BaoCao> list = selectBySql(sql, maThuoc);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<String> selectPhongBan() {
        String sql = "SELECT DISTINCT NoiLuu from BaoCao";
        List<String> list = new ArrayList<>();
        try {
            ResultSet rs = JDBC.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getString("NoiLuu"));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

//    public BaoCao selectPhongBan2(String phongBan){
//        String sql = "select * from BaoCao where NoiLuu like N'%?%'";
//        List<BaoCao> list = selectBySql(sql, phongBan);
//        return list.size() > 0 ? list.get(0) : null;
//    }
    
    public List<Object[]> getPhongBan(String phongBan) {
        String sql = "Exec selectPhongBan @phongBan = N'%?%'";
        String[] cols = {"MaBC", "NoiDung", "NoiLuu", "ThoiGianLuu", "MaNV"};
        return this.getListOfArray(sql, cols, phongBan);
    }

    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = JDBC.executeQuery(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
