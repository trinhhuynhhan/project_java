/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contronter;

import Class.SanPham;
import Model.QuanLySanPhamModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import view.QuanLySanPhamView;

/**
 *
 * @author Administrator
 */
public class QuanLyDienThoaiContronter {

    private final QuanLySanPhamModel model;
    private final QuanLySanPhamView view;
    
    private QuanLyDienThoaiContronter(QuanLySanPhamModel model, QuanLySanPhamView view) {
        this.model = model;
        this.view = view;
        
        inti();
        view.setVisible(true);
    }
    
    public void getDuLieu() {
        ArrayList<SanPham> dsSP = new ArrayList<SanPham>();
        dsSP = model.layDSSanPham();
        DefaultTableModel tableModel = (DefaultTableModel) view.getGetTableSP().getModel();
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
        tableModel.addColumn("Mã Sản Phảm");
        tableModel.addColumn("Tên Sản Phảm");
        tableModel.addColumn("Giá Sản Phảm");
        tableModel.addColumn("Số Lượng");
        tableModel.addColumn("Mã Loại");
        
        for (SanPham sp : dsSP) {
            tableModel.addRow(new Object[]{sp.getMaSP(), sp.getTenSP(), sp.getGiaSP(), sp.getSoLuong(), sp.getMaLoai()});
            view.getGetTableSP().setModel(tableModel);
        }
    }
    
    public void showDaTa() {
        ArrayList<SanPham> dsSP = new ArrayList<SanPham>();
        dsSP = model.layDSSanPham();
        DefaultTableModel tableModel = (DefaultTableModel) view.getGetTableSP().getModel();
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
        tableModel.addColumn("Mã Sản Phảm");
        tableModel.addColumn("Tên Sản Phảm");
        tableModel.addColumn("Giá Sản Phảm");
        tableModel.addColumn("Số Lượng");
        tableModel.addColumn("Mã Loại");
        
        for (SanPham sp : dsSP) {
            tableModel.addRow(new Object[]{sp.getMaSP(), sp.getTenSP(), sp.getGiaSP(), sp.getSoLuong(), sp.getMaLoai()});
            view.getGetTableSP().setModel(tableModel);
        }
    }
    
    private void inti() {
        getDuLieu();
        
        view.getBtnThemSP().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SanPham sp = new SanPham();
                sp.setMaSP(view.getTxtMaSP().getText());
                sp.setTenSP(view.getTxtTenSP().getText());
                sp.setGiaSP(Double.parseDouble(view.getTxtGiaSP().getText()));
                sp.setSoLuong(Integer.parseInt(view.getTxtSoLuongSP().getText()));
                sp.setMaLoai(view.getTxtMaLoaiSP().getText());
                model.themSP(sp);
                view.getTxtMaSP().setText("");
                view.getTxtTenSP().setText("");
                view.getTxtGiaSP().setText("");
                view.getTxtSoLuongSP().setText("");
                view.getTxtMaSP().setText("");
                getDuLieu();
                
            }
        });
        view.getBtnSuaSP().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SanPham sp = new SanPham();
                sp.setMaSP(view.getTxtMaSP().getText());
                sp.setTenSP(view.getTxtTenSP().getText());
                sp.setGiaSP(Double.parseDouble(view.getTxtGiaSP().getText()));
                sp.setSoLuong(Integer.parseInt(view.getTxtSoLuongSP().getText()));
                sp.setMaLoai(view.getTxtMaLoaiSP().getText());
                model.themSP(sp);
                view.getTxtMaSP().setText("");
                view.getTxtTenSP().setText("");
                view.getTxtGiaSP().setText("");
                view.getTxtSoLuongSP().setText("");
                view.getTxtMaSP().setText("");
                getDuLieu();
                
            }
        });
        view.getBtnXoaSP().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String maSP = view.getTxtMaSP().getText();
                model.xoaSP(maSP);
                view.getTxtMaSP().setText("");
                view.getTxtTenSP().setText("");
                view.getTxtGiaSP().setText("");
                view.getTxtSoLuongSP().setText("");
                view.getTxtMaSP().setText("");
                getDuLieu();
            }
        });
        
        view.getBtnTimKiemSP().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.getTxtTimKiem().getText().equals("")) {
                    //showDaTa(model.timKiem(view.getTxtTimKiem().getText()));
                   // view.setBtnTimKiemSP("");
                }
            }
        });
        
        view.getBtnThoat().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

//    public ItemListener sapXepListtener(){
//        
//        return new ItemListener() {
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                int sx = view.getGetSapXepSp().setSelectedIndex();
//                switch (sx) {
//                    case 1:
//                        showDaTa(QuanLySanPhamModel.sapXepTangTheoTenSP());
//                        break;
//                        case 2:
//                            showDaTa(model.sapXepGiamTheoTenSP());
//                            case 3:
//                                showDaTa(model.sapXepTheoLoaiRoiTheoTen());
//                    default:
//                        showDaTa(model.layDSSanPham());
//                        break;
//                }
//            }
//
//        }
//        
//    }
}
