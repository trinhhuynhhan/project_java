/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Class.Loai;
import Data.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class LoaiDAO {

    public static ArrayList<Loai> layDSLoai() {
        ArrayList<Loai> listLoai = new ArrayList<>();
        try {

            Connection con = Database.getConnection();
            String sql = "SELECT * FROM loai";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet re = ps.executeQuery(sql);
            while (re.next()) {                
               Loai  loai = new Loai(re.getString(1),re.getString(2));
               listLoai.add(loai);
            }
            re.close();
            ps.close();
            System.out.println("Lay danh sach thanh cong");
        } catch (Exception e) {
            System.out.println("lay danh sach khong thanh cong");
        }
        return listLoai;    
    }

    public static boolean themLoai(Loai loai) {
        try {
            Connection con = Database.getConnection();
            String sql = "INSERT INTO loai VALUES (?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, loai.getMaLoai());
            ps.setString(2, loai.getTenLoai());

            int kp = ps.executeUpdate();
            return (kp == 1);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean xoaLoai(String maLoai) {
        try {

            Connection con = Database.getConnection();
            String sql = "DELETE FROM loai WHERE MaLoai = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, maLoai);

            int kp = ps.executeUpdate();
            return (kp == 1);
        } catch (Exception e) {
            
        }
        return  false;
    }

    public static boolean suaLoai(Loai loai) {
        try {
            Connection con = Database.getConnection();
            String sql = "UPDATE loai SET TenLoai = ? WHERE MaLoai = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(2, loai.getMaLoai());
            ps.setString(1, loai.getTenLoai());
            int kp = ps.executeUpdate();
            return (kp == 1);
        } catch (Exception e) {
            return false;
        }
    }
    
    public static ArrayList<Loai> timKiem(String tuKhoa) {
        ArrayList<Loai> arrLoai = new ArrayList<>();
        try {
            Connection con = Database.getConnection();
            String sql = "SELECT * FROM loai WHERE MaLoai like '%"+tuKhoa+"%' or TenLoai like '%"+tuKhoa+"%' ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet re = ps.executeQuery(sql);
            while (re.next()) {                
                Loai loai = new Loai(re.getString(1),re.getString(2));
                arrLoai.add(loai);
            }
            re.close();
            ps.close();
           
        } catch (Exception e) {
            System.out.println("Khong tim thay " + e);
        }
        return  arrLoai;
    }
    
     public static ArrayList<Loai> layLoaiTheoSanPham(String maLoai) {
        ArrayList<Loai> arrSP = new ArrayList<>();
        try {
            Connection con = Database.getConnection();
            String sql = "SELECT * FROM sanpham,loai WHERE sanpham.MaLoai == loai.MaLoai ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet re = ps.executeQuery(sql);
            while (re.next()) {                
                Loai sp = new Loai(re.getString(1),re.getString(2));
                arrSP.add(sp);
            }
            re.close();
            ps.close();
           
        } catch (Exception e) {
            System.out.println("Khong tim thay " + e);
        }
        return  arrSP;
    }
}
