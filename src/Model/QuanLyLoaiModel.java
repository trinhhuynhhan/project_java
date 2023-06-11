/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Class.Loai;
import DAO.LoaiDAO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Administrator
 */
public class QuanLyLoaiModel {

    private ArrayList<Loai> dsloai;

    public static boolean themLoai(Loai loai) {
        return LoaiDAO.themLoai(loai);
    }

    public static boolean xoaLoai(String maLoai) {
        return LoaiDAO.xoaLoai(maLoai);
    }

    public static boolean suaLoai(Loai loai) {
        return LoaiDAO.suaLoai(loai);
    }

    public static ArrayList<Loai> timKiem(String tuKhoa) {
        return LoaiDAO.timKiem(tuKhoa);
    }

    public static ArrayList<Loai> layDSLoai() {
        return LoaiDAO.layDSLoai();
    }

    public static ArrayList<Loai> sapXepTangTheoTenLoai() {
        try {
            ArrayList<Loai> dsLoai = LoaiDAO.layDSLoai();
          Collections.sort(dsLoai, new Comparator<Loai>() {
                @Override
                public int compare(Loai o1, Loai o2) {
                   return o1.getTenLoai().compareTo(o2.getTenLoai());

                }
            });
            return dsLoai;
        } catch (Exception e) {
            return null;
        }
    }

//    public static  ArrayList<Loai> sapXepGiamTheoTenSP() {
//         try {
//            ArrayList<Loai> dsLoai = LoaiDAO.layDSLoai();
//            Collections.sort(dsLoai, new Comparator<Loai>() {
//                @Override
//                public int compare(Loai o1, Loai o2) {
//                   return o1.getTenLoai().compareTo(o2.getTenLoai());
//
//                }
//            });
//            return dsLoai;
//        } catch (Exception e) {
//             System.out.println("aaaaa");
//        }
//          return null;
//    }

    public static ArrayList<Loai> sapXepTheoMaLoaiRoiTheoTenLoai() {
        try {
            ArrayList<Loai> dsLoai = LoaiDAO.layDSLoai();
            Collections.sort(dsLoai, new Comparator<Loai>() {
                @Override
                public int compare(Loai o1, Loai o2) {
                    if (o1.getMaLoai() == o2.getMaLoai()) {
                        return o1.getTenLoai().compareTo(o2.getTenLoai());
                    }
                    return o1.getMaLoai().compareTo(o2.getMaLoai());

                }

            });

            return dsLoai;
        } catch (Exception e) {
            return null;
        }
    }
}
