/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class JDBC {
    public static String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"; 
    public static String dburl="jdbc:sqlserver://localhost:8801;databaseName=DataBenhVien;";
    public static String username="sa";
    public static String password="Ngoctu263";
    //nạp driver
    static{
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //nạp truyền giá trị đối số vào prepareStatement
    //có thể statment không có đối số
    public static PreparedStatement preparedStatement(String sql,Object...args)throws SQLException{
        Connection con=DriverManager.getConnection(dburl, username, password);
        PreparedStatement pstmt=null;
        if(sql.startsWith("{"))pstmt=con.prepareCall(sql);    //có thể gán biến kiểu PreparedStatement là prepareCall (CallableStatement)
        else pstmt=con.prepareStatement(sql);
        for(int i=0; i<args.length;i++){
            pstmt.setObject(i+1, args[i]);
        }
        return pstmt;
    }
    ////thao tác (INSERT, UPDATE, DELETE)
    public static void executeUpdate(String sql,Object...args){
        try {
            PreparedStatement pstmt= preparedStatement(sql, args);
            try{
                pstmt.executeUpdate();
            }finally{
                pstmt.getConnection().close();            //đóng Connection từ statement
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    //thao tác truy vấn (SELECT)
    public static ResultSet executeQuery(String sql, Object...args){
        try {
            PreparedStatement pstmt=preparedStatement(sql, args);
            try{
                return pstmt.executeQuery();
            }finally{
                //pstmt.getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);         //throw các lỗi khi chạy CT, VD không có return khi try bị lỗi
        }
    }
}
