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
public class ThuChi {
    private String maGD;
    private String noiDung;
    private Date ngayThucHien;
    private float soTien;
    private boolean loai;
    private String nguoiThucHien ;
    private String maNV;

    public ThuChi(String maGD, String noiDung, Date ngayThucHien, float soTien, boolean loai, String nguoiThucHien, String maNV) {
        this.maGD = maGD;
        this.noiDung = noiDung;
        this.ngayThucHien = ngayThucHien;
        this.soTien = soTien;
        this.loai = loai;
        this.nguoiThucHien = nguoiThucHien;
        this.maNV = maNV;
    }

    public ThuChi() {
    }

    
    public String getMaGD() {
        return maGD;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public Date getNgayThucHien() {
        return ngayThucHien;
    }

    public void setNgayThucHien(Date ngayThucHien) {
        this.ngayThucHien = ngayThucHien;
    }

    public float getSoTien() {
        return soTien;
    }

    public void setSoTien(float soTien) {
        this.soTien = soTien;
    }

    public boolean isLoai() {
        return loai;
    }

    public void setLoai(boolean loai) {
        this.loai = loai;
    }

    public String getNguoiThucHien() {
        return nguoiThucHien;
    }

    public void setNguoiThucHien(String nguoiThucHien) {
        this.nguoiThucHien = nguoiThucHien;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
    
    
}
