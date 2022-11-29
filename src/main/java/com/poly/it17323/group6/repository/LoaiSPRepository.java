package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.LoaiSP;
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
public class LoaiSPRepository {

    private Session session;

    private String fromTable = "From LoaiSP";

    public List<LoaiSP> getAll() {
        session = Hibernate_Util.getFACTORY().openSession();
        Query query = session.createQuery(fromTable, LoaiSP.class);
        List<LoaiSP> lists = query.getResultList();
        return lists;
    }
<<<<<<< HEAD
    
<<<<<<< HEAD
    public LoaiSP getOne(Long id) {
=======
    public LoaiSP getOne(String id) {
>>>>>>> 5c93c5c1930c7dd9ce1aa21e247c3c42c151f71d
=======

    public LoaiSP getOne(UUID id) {
        session = Hibernate_Util.getFACTORY().openSession();
>>>>>>> c1eedf71c5ec4491bd214f2d0abddc5457dbdba4
        String sql = fromTable + " WHERE id = :id";
        Query query = session.createQuery(sql, LoaiSP.class);
        query.setParameter("id", id);
        LoaiSP loaisp = (LoaiSP) query.getSingleResult();
        return loaisp;
    }

    public Boolean add(LoaiSP loaisp) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(loaisp);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(LoaiSP loaisp) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(loaisp);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean delete(LoaiSP loaisp) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.delete(loaisp);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

}
