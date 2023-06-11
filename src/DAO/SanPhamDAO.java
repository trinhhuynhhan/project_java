/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Class.SanPham;
import Data.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class SanPhamDAO {
    
      public static ArrayList<SanPham> layDSSanPham() {
        ArrayList<SanPham> listSp = new ArrayList<>();
        try {

            Connection con = Database.getConnection();
            String sql = "SELECT * FROM sanpham";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet re = ps.executeQuery(sql);
            while (re.next()) {                
               SanPham  sp = new SanPham(re.getString(1),re.getString(2),re.getDouble(3), re.getInt(4),re.getString(5));
               listSp.add(sp);
            }
            re.close();
            ps.close();
            System.out.println("Lay danh sach thanh cong");
        } catch (Exception e) {
            System.out.println("lay danh sach khong thanh cong");
        }
        return listSp;    
    }

    public static boolean themSP(SanPham sp) {
        try {
            Connection con = Database.getConnection();
            String sql = "INSERT INTO sanpham VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, sp.getMaSP());
            ps.setString(2, sp.getTenSP());
            ps.setDouble(3,sp.getGiaSP());
            ps.setInt(4, sp.getSoLuong());
            ps.setString(5, sp.getMaLoai());

            int kp = ps.executeUpdate();
            return (kp == 1);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean xoaSP(String masp) {
        try {

            Connection con = Database.getConnection();
            String sql = "DELETE FROM sanpham WHERE MaSP = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, masp);

            int kp = ps.executeUpdate();
            return (kp == 1);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean suaSP(SanPham sp) {
        try {
            Connection con = Database.getConnection();
            String sql = "UPDATE sanpham SET TenSP = ?, GiaSP= ?, SoLuong= ?, MaLoai= ? WHERE MaSP = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(5, sp.getMaSP());
            ps.setString(1,sp.getTenSP());
            ps.setDouble(2,sp.getGiaSP());
            ps.setInt(3, sp.getSoLuong());
            ps.setString(4, sp.getMaLoai());
            int kp = ps.executeUpdate();
            return (kp == 1);
        } catch (Exception e) {
            return false;
        }
    }
    
    public static ArrayList<SanPham> timKiem(String tuKhoa) {
        ArrayList<SanPham> arrSP = new ArrayList<>();
        try {
            Connection con = Database.getConnection();
            String sql = "SELECT * FROM sanpham WHERE MaSP like '%"+tuKhoa+"%' or TenSP like '%"+tuKhoa+"%' ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet re = ps.executeQuery(sql);
            while (re.next()) {                
                SanPham sp = new SanPham(re.getString(1),re.getString(2), re.getDouble(3),re.getInt(4),re.getString(5));
                arrSP.add(sp);
            }
            re.close();
            ps.close();
           
        } catch (Exception e) {
            System.out.println("Khong tim thay " + e);
        }
        return  arrSP;
    }
    
    public static ArrayList<SanPham> laySanPhamTheoLoai(String maLoai) {
        ArrayList<SanPham> arrSP = new ArrayList<>();
        try {
            Connection con = Database.getConnection();
            String sql = "SELECT * FROM sanpham,loai WHERE sanpham.MaLoai == loai.MaLoai ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet re = ps.executeQuery(sql);
            while (re.next()) {                
                SanPham sp = new SanPham(re.getString(1),re.getString(2), re.getDouble(3),re.getInt(4),re.getString(5));
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
