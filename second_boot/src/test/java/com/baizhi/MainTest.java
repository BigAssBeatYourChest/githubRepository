package com.baizhi;

import org.junit.Test;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Create by 杨宁
 * On 2019/2/19.
 */
public class MainTest {
    @Test
    public void test1() throws SQLException, ClassNotFoundException {
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Class.forName("oracle.jdbc.driver.OracleDriver");
        System.setProperty("jdbc.drivers","oracle.jdbc.driver.OracleDriver");
        ArrayList<Object> list = new ArrayList<>();
        Collections.addAll(list,1,2,3);
    }
    @Test
    public void test2(){
        String a = null;
        String b = new String(a);
    }
}
