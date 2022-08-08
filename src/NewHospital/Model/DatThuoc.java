/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewHospital.Model;

/**
 *
 * @author MSI GAMING
 */
public class DatThuoc {
    private String tenThuoc;
    private int soLuong;
    private String ghiChu;

    public DatThuoc() {
    }

    public DatThuoc(String tenThuoc, int soLuong, String ghiChu) {
        this.tenThuoc = tenThuoc;
        this.soLuong = soLuong;
        this.ghiChu = ghiChu;
    }

    public String getTenThuoc() {
        return tenThuoc;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
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
