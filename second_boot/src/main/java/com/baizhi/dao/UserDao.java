package com.baizhi.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Create by 杨宁
 * On 2019/2/18.
 */
@Repository
public interface UserDao {
    List<String> getAll();
    Integer getCount();
}
