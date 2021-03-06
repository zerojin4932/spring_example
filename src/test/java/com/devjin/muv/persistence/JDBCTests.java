package com.devjin.muv.persistence;

import lombok.extern.log4j.Log4j;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

@Log4j
public class JDBCTests {
    static {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConnection() {
        try(Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:XE",
                "book_ex_2",
                "book_ex"
        )) {
            log.info(con);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
