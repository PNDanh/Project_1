
package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.MauSac;
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
public class MauSacRepository {

    private Session session;

    private String fromTable = "From MauSac";

    public List<MauSac> getAll() {
        session = Hibernate_Util.getFACTORY().openSession();
        Query query = session.createQuery(fromTable, MauSac.class);
        List<MauSac> lists = query.getResultList();
        return lists;
    }
<<<<<<< HEAD
    
<<<<<<< HEAD
    public MauSac getOne(Long id) {
=======
    public MauSac getOne(String id) {
>>>>>>> 5c93c5c1930c7dd9ce1aa21e247c3c42c151f71d
=======

    public MauSac getOne(UUID id) {
>>>>>>> c1eedf71c5ec4491bd214f2d0abddc5457dbdba4
        String sql = fromTable + " WHERE id = :id";
        Query query = session.createQuery(sql, MauSac.class);
        query.setParameter("id", id);
        MauSac mausac = (MauSac) query.getSingleResult();
        return mausac;
    }

    public Boolean add(MauSac mausac) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(mausac);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(MauSac mausac) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(mausac);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean delete(MauSac mausac) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.delete(mausac);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
<<<<<<< HEAD
    public static void main(String[] args) {
        List<MauSac> list = new MauSacRepository().getAll();
<<<<<<< HEAD
<<<<<<< HEAD
        for (MauSac mausac : list){
            System.out.println(mausac.toString());
=======
        for (MauSac loaisp : list){
            System.out.println(loaisp.toString());
>>>>>>> 9505eb7978d0620d16b6c528d11542c7bbe54916
=======
        for (MauSac loaisp : list){
            System.out.println(loaisp.toString());
>>>>>>> 5c93c5c1930c7dd9ce1aa21e247c3c42c151f71d
        }
    }
=======

>>>>>>> c1eedf71c5ec4491bd214f2d0abddc5457dbdba4
}
