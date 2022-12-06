/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poly.it17323.group6.service;

import com.poly.it17323.group6.domainmodel.NguoiDung;
import com.poly.it17323.group6.response.NguoiDungReponse;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Admin
 */
public interface INguoiDungService {

    List<NguoiDung> getAll();

    NguoiDung getOne(UUID id);

    boolean add(NguoiDungReponse ND);

    boolean update(NguoiDungReponse ND);

    boolean delete(NguoiDungReponse ND);

    List<NguoiDung> getByName(String name);

    String checkEmailXacNhan(NguoiDungReponse ND);

    String emaiFals(NguoiDungReponse ndr);

    String checkMa(String maXn);
    
    String guiTkMk(NguoiDungReponse ndr);
}
