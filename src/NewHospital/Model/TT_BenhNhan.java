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
public class TT_BenhNhan {
    private String maBN;
    private String hoTen ;
    private boolean gioiTinh;
    private Date ngaySinh ;
    private String SoDT;
    private String email ;
    private String diaChi ;
    private String tinhTrangBenh ;
    private boolean trangThai;
    private boolean loaiBN;

    public TT_BenhNhan(String maBN, String hoTen, boolean gioiTinh, Date ngaySinh, String SDT, String email, String diaChi, String tinhTrangBenh, boolean trangThai, boolean loaiBN) {
        this.maBN = maBN;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.SoDT = SDT;
        this.email = email;
        this.diaChi = diaChi;
        this.tinhTrangBenh = tinhTrangBenh;
        this.trangThai = trangThai;
        this.loaiBN = loaiBN;
    }

    public TT_BenhNhan() {
    }

    public String getMaBN() {
        return maBN;
    }

    public void setMaBN(String maBN) {
        this.maBN = maBN;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SDT) {
        this.SoDT = SoDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTinhTrangBenh() {
        return tinhTrangBenh;
    }

    public void setTinhTrangBenh(String tinhTrangBenh) {
        this.tinhTrangBenh = tinhTrangBenh;
    }

    public boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public boolean getLoaiBN() {
        return loaiBN;
    }

    public void setLoaiBN(boolean loaiBN) {
        this.loaiBN = loaiBN;
    }
    
    
    
}
