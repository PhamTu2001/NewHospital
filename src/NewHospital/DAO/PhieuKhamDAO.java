/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewHospital.DAO;

import ConnectData.JDBC;
import NewHospital.Model.PhieuKham;

/**
 *
 * @author MSI GAMING
 */
public class PhieuKhamDAO {
    
    public void insert(PhieuKham entity) {
        String sql="INSERT INTO PhieuKham ( NgayLap, GhiChu, ChuanDoan, KetLuan, MaBN, MaNV,SttDat, TinhTrang, TrangThai, LoaiBN) VALUES (?,?, ?, ?, ?, ?, ?, ?, ?, ?)";
         JDBC.executeUpdate(sql,
             entity.getNgayLap(),
             entity.getGhiChu(),         
             entity.getChuanDoan(),
             entity.getKetLuan(),
             entity.getMaBN(),
             entity.getMaNV(),
             entity.getsTT(),
             entity.getTinhTrang(),
             entity.isTrangThai(),
             entity.isLoaiBN());
    }
}
