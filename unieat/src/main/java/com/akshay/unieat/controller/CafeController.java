package com.akshay.unieat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akshay.unieat.model.Cafe;
import com.akshay.unieat.service.CafeService;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/cafe")
public class CafeController {
    
    @Autowired
    CafeService cafeService;

    @GetMapping("/getAllCafe")
    public ResponseEntity<List<Cafe>> getAllCafes() {
        return cafeService.getAllCafes();
    }


    @PostMapping("/addCafe")
    public ResponseEntity<String> addCafe(@RequestBody Cafe cafe) {
        
        return cafeService.addCafe(cafe);
    }
    
}
