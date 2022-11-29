package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.Size;
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
public class SizeRepository {
<<<<<<< HEAD
<<<<<<< HEAD
=======

<<<<<<< HEAD
>>>>>>> 5c93c5c1930c7dd9ce1aa21e247c3c42c151f71d
    private Session session = Hibernate_Util.getFACTORY().openSession();
    
    private String fromTable = "From Size";
    
    public List<Size> getAll(){
=======
    private Session session;

    private final String fromTable = "From Size";

    public List<Size> getAll() {
        session = Hibernate_Util.getFACTORY().openSession();
>>>>>>> c1eedf71c5ec4491bd214f2d0abddc5457dbdba4
        Query query = session.createQuery(fromTable, Size.class);
        List<Size> lists = query.getResultList();
        return lists;
    }
<<<<<<< HEAD
    
=======

    private Session session = Hibernate_Util.getFACTORY().openSession();

    private String fromTable = "From Size";

    public List<Size> getAll() {
        Query query = session.createQuery(fromTable, Size.class);
        List<Size> lists = query.getResultList();
        return lists;
    }

>>>>>>> 9505eb7978d0620d16b6c528d11542c7bbe54916
    public Size getOne(Long id) {
=======

<<<<<<< HEAD
    public Size getOne(String id) {
>>>>>>> 5c93c5c1930c7dd9ce1aa21e247c3c42c151f71d
=======
    public Size getOne(UUID id) {
        session = Hibernate_Util.getFACTORY().openSession();
>>>>>>> c1eedf71c5ec4491bd214f2d0abddc5457dbdba4
        String sql = fromTable + " WHERE id = :id";
        Query query = session.createQuery(sql, Size.class);
        query.setParameter("id", id);
        Size size = (Size) query.getSingleResult();
        return size;
    }
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> 9505eb7978d0620d16b6c528d11542c7bbe54916
=======

>>>>>>> 5c93c5c1930c7dd9ce1aa21e247c3c42c151f71d
    public Boolean add(Size size) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(size);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
<<<<<<< HEAD
<<<<<<< HEAD
=======

<<<<<<< HEAD
>>>>>>> 9505eb7978d0620d16b6c528d11542c7bbe54916
=======

>>>>>>> 5c93c5c1930c7dd9ce1aa21e247c3c42c151f71d
    public Boolean update(Size size, Long id) {
=======
    public Boolean update(Size size) {
>>>>>>> c1eedf71c5ec4491bd214f2d0abddc5457dbdba4
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(size);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean delete(Size size) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = session.beginTransaction();
            session.delete(size);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
<<<<<<< HEAD
<<<<<<< HEAD
    public static void main(String[] args) {
        List<Size> list = new SizeRepository().getAll();
        for (Size size : list){
            System.out.println(size.toString());
=======
=======
>>>>>>> 5c93c5c1930c7dd9ce1aa21e247c3c42c151f71d

<<<<<<< HEAD
    public static void main(String[] args) {
        List<Size> list = new SizeRepository().getAll();
        for (Size loaisp : list) {
            System.out.println(loaisp.toString());
<<<<<<< HEAD
>>>>>>> 9505eb7978d0620d16b6c528d11542c7bbe54916
=======
>>>>>>> 5c93c5c1930c7dd9ce1aa21e247c3c42c151f71d
        }
    }
=======
>>>>>>> c1eedf71c5ec4491bd214f2d0abddc5457dbdba4
}
