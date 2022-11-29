package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.SanPham;
import com.poly.it17323.group6.hibernateconfig.Hibernate_Util;
import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class SanPhamRepository {

    private Session session;

    private final String fromTable = "From SanPham";

    public List<SanPham> getAll() {
        session = Hibernate_Util.getFACTORY().openSession();
        Query query = session.createQuery(fromTable, SanPham.class);
        List<SanPham> lists = query.getResultList();
        return lists;
    }
<<<<<<< HEAD
    
<<<<<<< HEAD
    public SanPham getOne(Long id) {
=======
    public SanPham getOne(String id) {
>>>>>>> 5c93c5c1930c7dd9ce1aa21e247c3c42c151f71d
=======

    public SanPham getOne(UUID id) {
        session = Hibernate_Util.getFACTORY().openSession();
>>>>>>> c1eedf71c5ec4491bd214f2d0abddc5457dbdba4
        String sql = fromTable + " WHERE id = :id";
        Query query = session.createQuery(sql, SanPham.class);
        query.setParameter("id", id);
        SanPham sanpham = (SanPham) query.getSingleResult();
        return sanpham;
    }

    public Boolean add(SanPham sanpham) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try ( Session session = Hibernate_Util.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(sanpham);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(SanPham sanpham) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(sanpham);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean delete(SanPham sanpham) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.delete(sanpham);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
<<<<<<< HEAD
    public static void main(String[] args) {
        List<SanPham> list = new SanPhamRepository().getAll();
<<<<<<< HEAD
<<<<<<< HEAD
        for (SanPham sanpham : list){
            System.out.println(sanpham.toString());
=======
        for (SanPham loaisp : list){
            System.out.println(loaisp.toString());
>>>>>>> 9505eb7978d0620d16b6c528d11542c7bbe54916
=======
        for (SanPham sanpham : list){
            System.out.println(sanpham.toString());

>>>>>>> 5c93c5c1930c7dd9ce1aa21e247c3c42c151f71d
        }
    }
=======

>>>>>>> c1eedf71c5ec4491bd214f2d0abddc5457dbdba4
}
