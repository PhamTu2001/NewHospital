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
public class BaoCao {
    private String maBC;
    private String noiDung;
    private String nguoiLuu;
    private String noiLuu;
    private Date thoiGianLuu;
    private String maNV;

    public BaoCao(String maBC, String noiDung, String nguoiLuu, String noiLuu, Date thoiGianLuu, String maNV) {
        this.maBC = maBC;
        this.noiDung = noiDung;
        this.nguoiLuu = nguoiLuu;
        this.noiLuu = noiLuu;
        this.thoiGianLuu = thoiGianLuu;
        this.maNV = maNV;
    }

    public BaoCao() {
    }

    
    
    
    public String getMaBC() {
        return maBC;
    }

    public void setMaBC(String maBC) {
        this.maBC = maBC;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getNguoiLuu() {
        return nguoiLuu;
    }

    public void setNguoiLuu(String nguoiLuu) {
        this.nguoiLuu = nguoiLuu;
    }

    public String getNoiLuu() {
        return noiLuu;
    }

    public void setNoiLuu(String noiLuu) {
        this.noiLuu = noiLuu;
    }

    public Date getThoiGianLuu() {
        return thoiGianLuu;
    }

    public void setThoiGianLuu(Date thoiGianLuu) {
        this.thoiGianLuu = thoiGianLuu;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
    
    
    
    
}
