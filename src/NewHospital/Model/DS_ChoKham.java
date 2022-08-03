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
public class DS_ChoKham {

    private int STT;
    private String hoTen;
    private String cmnd;
    private String soDT;
    private String loaiKhamBenh;
    private Date lichKham;
    private String trieuChung;
    private boolean hinhThuc;
    private String maBN;

    public DS_ChoKham(int STT, String hoTen, String cmnd, String soDT, String loaiKhamBenh, Date lichKham, String trieuChung, boolean hinhThuc, String maBN) {
        this.STT = STT;
        this.hoTen = hoTen;
        this.cmnd = cmnd;
        this.soDT = soDT;
        this.loaiKhamBenh = loaiKhamBenh;
        this.lichKham = lichKham;
        this.trieuChung = trieuChung;
        this.hinhThuc = hinhThuc;
        this.maBN = maBN;
    }

    public DS_ChoKham() {
    }

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getLoaiKhamBenh() {
        return loaiKhamBenh;
    }

    public void setLoaiKhamBenh(String loaiKhamBenh) {
        this.loaiKhamBenh = loaiKhamBenh;
    }

    public String getTrieuChung() {
        return trieuChung;
    }

    public void setTrieuChung(String trieuChung) {
        this.trieuChung = trieuChung;
    }

    public boolean isHinhThuc() {
        return hinhThuc;
    }

    public void setHinhThuc(boolean hinhThuc) {
        this.hinhThuc = hinhThuc;
    }

    public String getMaBN() {
        return maBN;
    }

    public void setMaBN(String maBN) {
        this.maBN = maBN;
    }

    public Date getLichKham() {
        return lichKham;
    }

    public void setLichKham(Date lichKham) {
        this.lichKham = lichKham;
    }

}
