/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.response;

import com.poly.it17323.group6.domainmodel.NguoiDung;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Admin
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class QLNguoiDungResponse {

    private UUID idND;
    
    private String maND, hoTen, gioiTinh, tinhTrang, ngayTao;

    private String tenTK, matKhau, tenCV;
//    private String tenTK, matKhau, tenCV;

    private String email, sdt, diaChi, cmt_cccd;

    private String maCV, newPass, conFirm, ngaySinh, ngaySua;

    public QLNguoiDungResponse(NguoiDung nguoiDung) {
        this.idND = nguoiDung.getIdND();
        this.maND = nguoiDung.getMaND();
        this.tenTK = nguoiDung.getTenTK();
        this.matKhau = nguoiDung.getMatKhau();
        this.hoTen = nguoiDung.getHoTen();
        this.gioiTinh = nguoiDung.getGioiTinh();
        this.ngaySinh = nguoiDung.getNgaySinh() + "";
        this.email = nguoiDung.getEmail();
        this.sdt = nguoiDung.getSdt();
        this.diaChi = nguoiDung.getDiaChi();
        this.cmt_cccd = nguoiDung.getCccd();
        this.tinhTrang = nguoiDung.getTinhTrang() + "";
        this.ngayTao = nguoiDung.getNgayTao() + "";
        this.ngaySua = nguoiDung.getNgaySua() + "";
        this.maCV = nguoiDung.getChucVu().getMaCV();
        this.tenCV = nguoiDung.getChucVu().getTenCV();
    }

    public QLNguoiDungResponse(String email) {
        this.email = email;
    }

    public QLNguoiDungResponse(String tenTK, String matKhau, String tenCV) {
        this.tenTK = tenTK;
        this.matKhau = matKhau;
        this.tenCV = tenCV;
    }

//    public static String getMaND() {
//        return maND;
//    }
//
//    public static void setMaND(String maND) {
//        QLNguoiDungResponse.maND = maND;
//    }
//
//    public static String getHoTen() {
//        return hoTen;
//    }
//
//    public static void setHoTen(String hoTen) {
//        QLNguoiDungResponse.hoTen = hoTen;
//    }
//
//    public static String getGioiTinh() {
//        return gioiTinh;
//    }
//
//    public static void setGioiTinh(String gioiTinh) {
//        QLNguoiDungResponse.gioiTinh = gioiTinh;
//    }
//
//    public static String getTinhTrang() {
//        return tinhTrang;
//    }
//
//    public static void setTinhTrang(String tinhTrang) {
//        QLNguoiDungResponse.tinhTrang = tinhTrang;
//    }
//
//    public static String getNgayTao() {
//        return ngayTao;
//    }
//
//    public static void setNgayTao(String ngayTao) {
//        QLNguoiDungResponse.ngayTao = ngayTao;
//    }
//
//    public static String getTenTK() {
//        return tenTK;
//    }
//
//    public static void setTenTK(String tenTK) {
//        QLNguoiDungResponse.tenTK = tenTK;
//    }
//
//    public static String getMatKhau() {
//        return matKhau;
//    }
//
//    public static void setMatKhau(String matKhau) {
//        QLNguoiDungResponse.matKhau = matKhau;
//    }
//
//    public static String getTenCV() {
//        return tenCV;
//    }
//
//    public static void setTenCV(String tenCV) {
//        QLNguoiDungResponse.tenCV = tenCV;
//    }
//
//    public static String getEmail() {
//        return email;
//    }
//
//    public static void setEmail(String email) {
//        QLNguoiDungResponse.email = email;
//    }
//
//    public static String getSdt() {
//        return sdt;
//    }
//
//    public static void setSdt(String sdt) {
//        QLNguoiDungResponse.sdt = sdt;
//    }
//
//    public static String getDiaChi() {
//        return diaChi;
//    }
//
//    public static void setDiaChi(String diaChi) {
//        QLNguoiDungResponse.diaChi = diaChi;
//    }
//
//    public static String getCmt_cccd() {
//        return cmt_cccd;
//    }
//
//    public static void setCmt_cccd(String cmt_cccd) {
//        QLNguoiDungResponse.cmt_cccd = cmt_cccd;
//    }
//
//    public static String getMaCV() {
//        return maCV;
//    }
//
//    public static void setMaCV(String maCV) {
//        QLNguoiDungResponse.maCV = maCV;
//    }
//
//    public static String getNewPass() {
//        return newPass;
//    }
//
//    public static void setNewPass(String newPass) {
//        QLNguoiDungResponse.newPass = newPass;
//    }
//
//    public static String getConFirm() {
//        return conFirm;
//    }
//
//    public static void setConFirm(String conFirm) {
//        QLNguoiDungResponse.conFirm = conFirm;
//    }
//
//    public static String getNgaySinh() {
//        return ngaySinh;
//    }
//
//    public static void setNgaySinh(String ngaySinh) {
//        QLNguoiDungResponse.ngaySinh = ngaySinh;
//    }
//
//    public static String getNgaySua() {
//        return ngaySua;
//    }
//
//    public static void setNgaySua(String ngaySua) {
//        QLNguoiDungResponse.ngaySua = ngaySua;
//    }
}
