/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demosinhvien;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SinhVien {
    String HoTen;
    int Maso;
    int NamSinh;
    public SinhVien()
    {
        HoTen = "Minh";
        Maso = 233;
        NamSinh = 2000;
    }
    
    public SinhVien(int ms, String ht, int ns)
    {
        Maso = ms;
        HoTen = ht;
        NamSinh = ns;
    }
    public void NhapTTSV()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma so:");
        Maso = Integer.parseInt(sc.nextLine());
        
        System.out.println("Nhap ho ten:");
        HoTen = sc.nextLine();   
        System.out.println("Nhap nam sinh");
        NamSinh = Integer.parseInt(sc.nextLine());
        
        
    }
    
    public int TinhTuoi()
    {
        return 2023 - NamSinh;
    }
    public void XuatTTSV()
    {
        System.out.println(Maso + "\t" + HoTen + "\t" + TinhTuoi());
    }
}
