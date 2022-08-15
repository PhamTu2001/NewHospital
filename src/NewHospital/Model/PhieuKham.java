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
public class PhieuKham {
   private Date ngayLap;
   private String ghiChu;
   private String chuanDoan;
   private String ketLuan;
   private String maBN;
   private String maNV;
   private int sTT;
   private  String tinhTrang;
   private boolean trangThai;
   private boolean loaiBN;

    public PhieuKham() {
    }

    public PhieuKham( Date ngayLap, String ghiChu, String chuanDoan, String ketLuan, String maBN, String maNV,int sTT, String tinhTrang, boolean trangThai, boolean loaiBN) {
        this.ngayLap = ngayLap;
        this.ghiChu = ghiChu;
        this.chuanDoan = chuanDoan;
        this.ketLuan = ketLuan;
        this.maBN = maBN;
        this.maNV = maNV;
        this.sTT=sTT;
        this.tinhTrang = tinhTrang;
        this.trangThai = trangThai;
        this.loaiBN = loaiBN;
    }


    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getChuanDoan() {
        return chuanDoan;
    }

    public void setChuanDoan(String chuanDoan) {
        this.chuanDoan = chuanDoan;
    }

    public String getKetLuan() {
        return ketLuan;
    }

    public void setKetLuan(String ketLuan) {
        this.ketLuan = ketLuan;
    }

    public String getMaBN() {
        return maBN;
    }

    public void setMaBN(String maBN) {
        this.maBN = maBN;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public int getsTT() {
        return sTT;
    }

    public void setsTT(int sTT) {
        this.sTT = sTT;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public boolean isLoaiBN() {
        return loaiBN;
    }

    public void setLoaiBN(boolean loaiBN) {
        this.loaiBN = loaiBN;
    }
   
   
}
