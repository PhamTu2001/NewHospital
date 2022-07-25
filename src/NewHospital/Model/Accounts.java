/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewHospital.Model;

/**
 *
 * @author ASUS
 */
public class Accounts {
        private String userName;
        private String passWord;
        private String hoTen;
        private String soDT;
        private boolean vaiTro;

    public Accounts() {
    }

    public Accounts(String userName, String passWord, String hoTen, String soDT, boolean vaiTro) {
        this.userName = userName;
        this.passWord = passWord;
        this.hoTen = hoTen;
        this.soDT = soDT;
        this.vaiTro = vaiTro;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getSoDT() {
        return soDT;
    }

    public boolean isVaiTro() {
        return vaiTro;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }
        
    
  

    
        
    
}
