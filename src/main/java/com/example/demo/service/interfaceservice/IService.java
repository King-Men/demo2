package com.example.demo.service.interfaceservice;

import com.example.demo.control.model.oss;

import java.util.List;

public interface IService {
    /**
     * @return List<oss>
     */
    List<oss> findd();

    oss getbyid(int id);

    boolean save(oss x);

    void delet(int id);

    Void modifier(oss oss);


}
