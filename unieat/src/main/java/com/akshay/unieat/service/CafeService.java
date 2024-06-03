package com.akshay.unieat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.akshay.unieat.dao.CafeDao;
import com.akshay.unieat.model.Cafe;

import java.util.ArrayList;
import java.util.List;

@Service
public class CafeService {
    @Autowired
    CafeDao cafeDao;

    public ResponseEntity<List<Cafe>> getAllCafes() {
        try {
            return new ResponseEntity<>(cafeDao.findAll(), HttpStatus.OK);
        } catch (Exception e){
            e.printStackTrace();
        }

        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> addCafe(Cafe cafe) {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<>("failure", HttpStatus.BAD_REQUEST);
    }
}
