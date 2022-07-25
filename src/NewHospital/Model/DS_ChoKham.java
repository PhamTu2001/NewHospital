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
    private String MBN;
    private String loaiXN;
    private Date ngayKham;
    private String  moTa;

    public DS_ChoKham(String MBN, String loaiXN, Date ngayKham, String moTa) {
        this.MBN = MBN;
        this.loaiXN = loaiXN;
        this.ngayKham = ngayKham;
        this.moTa = moTa;
    }

    public String getMBN() {
        return MBN;
    }

    public void setMBN(String MBN) {
        this.MBN = MBN;
    }

    public String getLoaiXN() {
        return loaiXN;
    }

    public void setLoaiXN(String loaiXN) {
        this.loaiXN = loaiXN;
    }

    public Date getNgaykham() {
        return ngayKham;
    }

    public void setNgaykham(Date ngayKham) {
        this.ngayKham = ngayKham;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
    
}
