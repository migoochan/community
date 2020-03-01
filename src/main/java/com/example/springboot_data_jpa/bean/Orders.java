package com.example.springboot_data_jpa.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
public class Orders {
    @Id
    @Column(name = "order_num")
    private Integer orderNum;

    @Column(name = "order_date")
    private Date orderDate;
}
