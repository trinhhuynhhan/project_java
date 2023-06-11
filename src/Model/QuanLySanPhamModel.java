/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Class.SanPham;
import DAO.SanPhamDAO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Administrator
 */
public class QuanLySanPhamModel {

    private ArrayList<SanPham> dsSP;

    public ArrayList<SanPham> getDsSP() {
        return dsSP;
    }

    public void setDsSP(ArrayList<SanPham> dsSP) {
        this.dsSP = dsSP;
    }
    
    public  static  ArrayList<SanPham> layDSSanPham(){
        return SanPhamDAO.layDSSanPham();
    }

    public static boolean themSP(SanPham sp) {
        return SanPhamDAO.themSP(sp);
    }

    public static boolean xoaSP(String maSP) {
        return SanPhamDAO.xoaSP(maSP);
    }

    public static boolean suaSP(SanPham sp) {
        return SanPhamDAO.suaSP(sp);
    }
    

    public static ArrayList<SanPham> timKiem(String tuKhoa) {
        return SanPhamDAO.timKiem(tuKhoa);
    }

    public static ArrayList<SanPham> sapXepTangTheoTenSP() {
        try {
            ArrayList<SanPham> dsSP = SanPhamDAO.layDSSanPham();
            Collections.sort(dsSP, new Comparator<SanPham>() {
                @Override
                public int compare(SanPham o1, SanPham o2) {
                    return o1.getTenSP().compareTo(o2.getTenSP());
                }
            });
            return dsSP;
        } catch (Exception e) {
            return null;
        }
    }


    public static ArrayList<SanPham> sapXepTheoLoaiRoiTheoTen() {
        try {
            ArrayList<SanPham> dsSP = SanPhamDAO.layDSSanPham();
            Collections.sort(dsSP, new Comparator<SanPham>() {
                @Override
                public int compare(SanPham o1, SanPham o2) {
                    if (o1.getMaLoai() == o2.getMaLoai()) {
                        return o1.getTenSP().compareTo(o2.getTenSP());
                    }
                    return o1.getMaLoai() .compareTo(o2.getMaLoai());

                }

            });
            return dsSP;
        } catch (Exception e) {
            return null;
        }
    }
}
