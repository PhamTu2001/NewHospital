package NewHospital.DAO;

import ConnectData.JDBC;
import NewHospital.Model.Accounts;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class AccountsDAO {
        //đọc 1 nhân viên từ 1 bản ghi (1 ResultSet)
        public Accounts readForm(ResultSet rs) throws SQLException{
                Accounts model = new Accounts();
                model.setId(rs.getInt("ID"));
                model.setUserName(rs.getString("TaiKhoan"));
                model.setPassWord(rs.getString("MatKhau"));
                model.setHoTen(rs.getString("HoTen"));
                model.setSoDT(rs.getString("SoDT"));
                model.setVaiTro(rs.getBoolean("Role"));
                return model;
        }
        //thực hiện truy vấn lấy về 1 tập ResultSet
        public List<Accounts> selects(String sql,Object...args){
        List<Accounts> list=new ArrayList<>();
        try {
            ResultSet rs=null;
            try{
                rs=JDBC.executeQuery(sql, args);
                while(rs.next()){
                    list.add(readForm(rs));
                }
            }finally{
                rs.getStatement().getConnection().close();      //đóng kết nối từ resultSet
            }
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
        return list;
        }
        // Add vào CSDL
        public void insert(Accounts entity){
            String sql = "Insert into Accounts(TaiKhoan, MatKhau, HoTen, SoDT, Role) values (?,?,?,?,?)";
            JDBC.executeUpdate(sql,
                    entity.getUserName(),
                    entity.getPassWord(),
                    entity.getHoTen(),
                    entity.getSoDT(),
                    entity.isVaiTro()
            );
        }
        // Capnhat vào CSDL
        public void update(Accounts entity){
            String sql = "Update Accounts SET  MatKhau = ?, HoTen=?,SoDT = ?, VaiTro = ? WHERE TaiKhoan = ?";
            JDBC.executeUpdate(sql,
                    entity.getPassWord(),
                    entity.getHoTen(),
                    entity.getSoDT(),
                    entity.isVaiTro(),
                    entity.getUserName()
            );
        }
        // Xóa bảng ghi ra khỏi CSDL
        public void delete(String tk){
            String sql="DELETE FROM Accounts WHERE TaiKhoan=?";
            JDBC.executeUpdate(sql, tk);
        }
        // Truy vấn show database bảng NhânViên
        public List<Accounts> selects() {
        String sql="SELECT * FROM Accounts";
        return selects(sql);      //trong 1 class có thể có 2 method trùng tên (nhưng param khác nhau)
        }
        // Tìm nhânViên theo TaiKhoan (TaiKhoan)
        public Accounts FindIdNV(String id){
            String sql = "SELECT * FROM Accounts WHERE TaiKhoan = ?";
            List<Accounts> list=selects(sql, id);
            return list.size()>0?list.get(0):null;   //có thể trả về là null
        }
}
