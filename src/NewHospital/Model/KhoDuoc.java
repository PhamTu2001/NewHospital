/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewHospital.Model;

import java.util.Date;

/**
 *
 * @author yukth
 */
public class KhoDuoc {
    private String maThuoc;
    private String tenThuoc ;
    private Date hanSuDung ;
    private Date ngayNhap;
    private Date ngayXuat ;
    private int soLuong;
    private String ghiChu ;

    public KhoDuoc(String maThuoc, String tenThuoc, Date hanSuDung, Date ngayNhap, Date ngayXuat, int soLuong, String ghiChu) {
        this.maThuoc = maThuoc;
        this.tenThuoc = tenThuoc;
        this.hanSuDung = hanSuDung;
        this.ngayNhap = ngayNhap;
        this.ngayXuat = ngayXuat;
        this.soLuong = soLuong;
        this.ghiChu = ghiChu;
    }

    public KhoDuoc() {
    }

    
    
    
    public String getMaThuoc() {
        return maThuoc;
    }

    public void setMaThuoc(String maThuoc) {
        this.maThuoc = maThuoc;
    }

    public String getTenThuoc() {
        return tenThuoc;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public Date getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(Date hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public Date getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(Date ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    
    
}
