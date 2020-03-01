package com.example.springboot_data_jpa.mapper;

import com.example.springboot_data_jpa.bean.Customers;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * cust_id      char(10)  NOT NULL ,
 *   cust_name    char(50)  NOT NULL ,
 *   cust_address char(50)  NULL ,
 *   cust_city    char(50)  NULL ,
 *   cust_state   char(5)   NULL ,
 *   cust_zip     char(10)  NULL ,
 *   cust_country char(50)  NULL ,
 *   cust_contact char(50)  NULL ,
 *   cust_email   char(255) NULL
 */
@Mapper
public interface CustomersMapper {
    @Select("SELECT * FROM Customers WHERE cust_id = #{custId}")
    public Customers getById(String cust_id);

    @Delete("DELETE FROM Customers WHERE cust_id = #{custId}")
    public int deleteById(String cust_id);

    @Insert("INSERT INTO Customers (cust_id,cust_name,cust_address,cust_city,cust_state,cust_zip,cust_country,cust_contact,cust_email) VALUES(" +
            "#{custId},#{custName},#{custAddress},#{custCity},#{custState},#{custZip},#{custCountry},#{custContact},#{custEmail})")
    public int insertCust(Customers customers);

    @Update("UPDATE Customers SET cust_name=#{cust_name},cust_address=#{cust_address} WHERE cust_id=#{cust_id}")
    public int updateCust(Customers customers);
}
