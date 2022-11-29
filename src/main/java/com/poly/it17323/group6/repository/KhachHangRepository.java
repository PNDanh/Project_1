package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.KhachHang;
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
public class KhachHangRepository {

    private Session session;
    private String fromTable = "From KhachHang";

    public List<KhachHang> getAll() {
        session = Hibernate_Util.getFACTORY().openSession();
        Query query = session.createQuery(fromTable + " order by hoTen asc", KhachHang.class);
        List<KhachHang> lists = query.getResultList();
        return lists;
    }
<<<<<<< HEAD
    
<<<<<<< HEAD
    public KhachHang getOne(Long id) {
=======
    public KhachHang getOne(String id) {
>>>>>>> 5c93c5c1930c7dd9ce1aa21e247c3c42c151f71d
=======

    public KhachHang getOne(UUID id) {
        session = Hibernate_Util.getFACTORY().openSession();
>>>>>>> c1eedf71c5ec4491bd214f2d0abddc5457dbdba4
        String sql = fromTable + " WHERE id = :id";
        Query query = session.createQuery(sql, KhachHang.class);
        query.setParameter("id", id);
        KhachHang khachhang = (KhachHang) query.getSingleResult();
        return khachhang;
    }

    public Boolean add(KhachHang khachhang) {
        Transaction transaction = null;
        try {
            session = Hibernate_Util.getFACTORY().openSession();
            transaction = session.beginTransaction();
            session.save(khachhang);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(KhachHang khachhang) {
        Transaction transaction = null;
        try {
            session = Hibernate_Util.getFACTORY().openSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(khachhang);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean delete(KhachHang khachhang) {
        Transaction transaction = null;
        try {
            session = Hibernate_Util.getFACTORY().openSession();
            transaction = session.beginTransaction();
            session.delete(khachhang);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

}
