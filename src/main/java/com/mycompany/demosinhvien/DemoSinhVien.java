/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.demosinhvien;

/**
 *
 * @author DELL
 */
public class DemoSinhVien {

    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
               
        
        SinhVien sv2 = new SinhVien(2, "Vuong", 2002);

        
        
        System.out.println("Ma so\tHo ten\tTuoi");
        sv1.XuatTTSV();
        sv2.XuatTTSV();
    }
}
