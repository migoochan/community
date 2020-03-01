package com.example.springboot_data_jpa.controller;

import com.example.springboot_data_jpa.bean.Customers;
import com.example.springboot_data_jpa.mapper.CustomersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomersController {

    @Autowired
    private CustomersMapper customersMapper;

    @RequestMapping("customers/queryById/{cust_id}")
    public Customers queryById(@PathVariable("cust_id") String cust_id) {
        System.out.println("[CustomersController]-[queryById]" + cust_id);
        return customersMapper.getById(cust_id);
    }

    @PostMapping("/customers")
    public Customers insertCust(@RequestBody Customers customers) {
        customersMapper.insertCust(customers);
        return customers;
    }

    @DeleteMapping("/deleteCust/{cust_id}")
    public int deleteCust(@PathVariable("cust_id") String cust_id) {
        return customersMapper.deleteById(cust_id);
    }

}
