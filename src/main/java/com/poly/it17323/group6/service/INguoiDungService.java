/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poly.it17323.group6.service;

import com.poly.it17323.group6.domainmodel.NguoiDung;
<<<<<<< HEAD
import com.poly.it17323.group6.repository.NguoiDungRepository;
=======
import com.poly.it17323.group6.response.NguoiDungReponse;
>>>>>>> d80b3f63236c83afc48c81977e475a8987660557
import java.util.List;

/**
 *
 * @author Admin
 */
public interface INguoiDungService {

    List<NguoiDung> getAll();

    boolean Login(String tenTk, String pass, String role);

<<<<<<< HEAD
    boolean add(NguoiDung ND);
    
=======
    boolean add(NguoiDungReponse ND);
>>>>>>> d80b3f63236c83afc48c81977e475a8987660557

    boolean update(NguoiDungReponse ND);

    boolean delete(NguoiDungReponse ND);
}
