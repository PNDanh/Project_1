/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.HoaDon;
import com.poly.it17323.group6.domainmodel.HoaDonChiTiet;
import com.poly.it17323.group6.hibernateconfig.Hibernate_Util;
import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class HoaDonChiTietRepository {

    private Session session = Hibernate_Util.getFACTORY().openSession();

    private String fromTable = "From HoaDonChiTiet";

    public List<HoaDonChiTiet> getAll() {
        Query query = session.createQuery(fromTable, HoaDonChiTiet.class);
        List<HoaDonChiTiet> lists = query.getResultList();
        return lists;
    }

    public HoaDonChiTiet getOne(UUID id) {
        String sql = fromTable + " WHERE id = :id";
        Query query = session.createQuery(sql, HoaDonChiTiet.class);
        query.setParameter("id", id);
        HoaDonChiTiet hoadonchitiet = (HoaDonChiTiet) query.getSingleResult();
        return hoadonchitiet;
    }

    public List<HoaDonChiTiet> getAllByIDHD(UUID id) {
        String sql = fromTable + " WHERE IdHD = :id";
        Query query = session.createQuery(sql, HoaDonChiTiet.class);
        query.setParameter("id", id);
        List<HoaDonChiTiet> lstDHCT = query.getResultList();
        return lstDHCT;
    }

    public Boolean add(HoaDonChiTiet hoadonchitiet) {
        Transaction transaction = null;
        try ( Session session = Hibernate_Util.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(hoadonchitiet);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(HoaDonChiTiet hoadonchitiet) {
        Transaction transaction = null;
        try ( Session session = Hibernate_Util.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(hoadonchitiet);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean delete(HoaDonChiTiet hoadonchitiet) {
        Transaction transaction = null;
        try ( Session session = Hibernate_Util.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.delete(hoadonchitiet);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public static void main(String[] args) {
        HoaDonRepository repoHD = new HoaDonRepository();
        UUID idHD = repoHD.getAll().get(4).getIdHD();
        System.out.println(""+idHD);
        
        HoaDonChiTietRepository repoHDCT = new HoaDonChiTietRepository();
        for (HoaDonChiTiet x : repoHDCT.getAllByIDHD(idHD)) {
            System.out.println(x.toString());
        }
    }
}
