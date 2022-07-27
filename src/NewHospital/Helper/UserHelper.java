/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewHospital.Helper;

import NewHospital.Model.Accounts;




public class UserHelper {

/**
 * Đối tượng này chứa thông tin người sử dụng sau khi đăng nhnập
 */
 public static Accounts USER = null;
 /**
 * Xóa thông tin của người sử dụng khi có yêu cầu đăng xuất
 */
 public static void logoff() {
    UserHelper.USER = null;
 }
 /**
 * Kiểm tra xem đăng nhập hay chưa
 * @return đăng nhập hay chưa
 */
 public static boolean authenticated() {
    return UserHelper.USER != null;
 }
 
 
}

