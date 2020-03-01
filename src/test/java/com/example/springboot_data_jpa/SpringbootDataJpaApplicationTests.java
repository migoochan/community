package com.example.springboot_data_jpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootTest
class SpringbootDataJpaApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Test
    void contextLoads() {

    }

    @Test
    public void test001() throws Exception {
        System.out.println(dataSource.getClass());
        System.out.println("--------------------------------");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
}
