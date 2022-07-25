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
    private int soHoSo;
    private Date ngayLap;
    private String bsKham;
    private String ghiChu;
    private String chuanDoanBenh;
    private String ketLuan;
    private float tienKham;
    private String maBN;
    private String maNV;

    public PhieuKham(int soHoSo, Date ngayLap, String bsKham, String ghiChu, String chuanDoanBenh, String ketLuan, float tienKham, String maBN, String maNV) {
        this.soHoSo = soHoSo;
        this.ngayLap = ngayLap;
        this.bsKham = bsKham;
        this.ghiChu = ghiChu;
        this.chuanDoanBenh = chuanDoanBenh;
        this.ketLuan = ketLuan;
        this.tienKham = tienKham;
        this.maBN = maBN;
        this.maNV = maNV;
    }

    public PhieuKham() {
        
    }
    
    public int getSoHoSo() {
        return soHoSo;
    }

    public void setSoHoSo(int soHoSo) {
        this.soHoSo = soHoSo;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getBsKham() {
        return bsKham;
    }

    public void setBsKham(String bsKham) {
        this.bsKham = bsKham;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getChuanDoanBenh() {
        return chuanDoanBenh;
    }

    public void setChuanDoanBenh(String chuanDoanBenh) {
        this.chuanDoanBenh = chuanDoanBenh;
    }

    public String getKetLuan() {
        return ketLuan;
    }

    public void setKetLuan(String ketLuan) {
        this.ketLuan = ketLuan;
    }

    public float getTienKham() {
        return tienKham;
    }

    public void setTienKham(float tienKham) {
        this.tienKham = tienKham;
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
    
    
    
}
